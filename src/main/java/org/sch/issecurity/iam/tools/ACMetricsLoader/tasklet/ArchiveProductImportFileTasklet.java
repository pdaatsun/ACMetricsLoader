package org.sch.issecurity.iam.tools.ACMetricsLoader.tasklet;

import org.apache.commons.io.FileUtils;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A tasklet that logs product information
 */
public class ArchiveProductImportFileTasklet implements Tasklet
{
    private String inputFile;

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception
    {
        // Make our destination directory and copy our input file to it
        File archiveDir = new File( "archive" );
        FileUtils.forceMkdir( archiveDir );

        String desFileName = inputFile + "_" + new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        FileUtils.copyFile(new File( inputFile ), new File( desFileName ));

        FileUtils.copyFileToDirectory( new File( desFileName ), archiveDir, true);
        FileUtils.forceDelete(new File( desFileName ));
        return RepeatStatus.FINISHED;
    }

    public String getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }
}
