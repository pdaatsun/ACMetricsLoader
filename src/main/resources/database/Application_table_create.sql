USE [ACOperation]
GO

/****** Object:  Table [dbo].[Application] ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Application](
  [appID] [int] IDENTITY(1,1) NOT NULL,
  [appCode] [varchar](256) NULL,
	[appName] [varchar](256) NULL,
	[appDesc] [varchar](1024) NULL,
 CONSTRAINT [PK_Application] PRIMARY KEY CLUSTERED
(
	[appID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
