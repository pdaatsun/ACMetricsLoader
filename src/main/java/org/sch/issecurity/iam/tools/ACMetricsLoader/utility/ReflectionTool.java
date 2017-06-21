package org.sch.issecurity.iam.tools.ACMetricsLoader.utility;

import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * Created by XiChen on 6/19/2017.
 */
public class ReflectionTool {

    /**
     * Allow for instance call, avoiding certain class circular dependencies. <br />
     * Calls even private method if java Security allows it.
     * @param aninstance instance on which method is invoked (if null, static call)
     * @param classname name of the class containing the method
     * (can be null - ignored, actually - if instance if provided, must be provided if static call)
     * @param amethodname name of the method to invoke
     * @param parameterTypes array of Classes
     * @param parameters array of Object
     * @return resulting Object
     */
    public static Object reflectionCall(final Object aninstance, final String classname, final String amethodname, final Class[] parameterTypes, final Object[] parameters)
    {
        Object res = null;// = null;
        try {
            Class aclass;// = null;
            if(aninstance == null)
            {
                aclass = Class.forName(classname);
            }
            else
            {
                aclass = aninstance.getClass();
            }
            //Class[] parameterTypes = new Class[]{String[].class};
            final Method amethod = aclass.getDeclaredMethod(amethodname, parameterTypes);
            AccessController.doPrivileged(new PrivilegedAction() {
                public Object run() {
                    amethod.setAccessible(true);
                    return null; // nothing to return
                }
            });
            res = amethod.invoke(aninstance, parameters);
        } catch (final Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
