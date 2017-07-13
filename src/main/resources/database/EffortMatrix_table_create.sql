USE [ACOperation]
GO

/****** Object:  Table [dbo].[EffortMatrix]    Script Date: 6/19/2017 5:33:19 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

DROP TABLE [dbo].[EffortMatrix];

CREATE TABLE [dbo].[EffortMatrix](
	[appID] [int] NOT NULL,
	[operationID] [int] NOT NULL,
	[effortType] [varchar](256) NOT NULL,
	[analystID] [int] NOT NULL,
	[numOfWorkUnits] [int] NULL,
 CONSTRAINT [PK_EffortMatrix] PRIMARY KEY CLUSTERED
(
	[appID] ASC,
	[operationID] ASC,
	[effortType] ASC,
	[analystID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO


