USE [ACOperation]
GO

/****** Object:  Table [dbo].[ACMetrics]    Script Date: 6/19/2017 5:33:19 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

DROP TABLE [dbo].[ACMetrics];

CREATE TABLE [dbo].[ACMetrics](
  [acmID] [int] IDENTITY(1,1) NOT NULL,
	[tranDate] [date] NOT NULL,
	[analystID] [int] NOT NULL,
	[SNOWID] [varchar](256) NOT NULL,
	[appID] [int] NOT NULL,
	[operationID] [int] NOT NULL,
	[numOfUsers] [int] NULL,
	[uploadDate] [date] NULL,
 CONSTRAINT [PK_ACMetrics_acmID] PRIMARY KEY CLUSTERED
(
	[acmID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT FK_ACMetrics_acmID_analystID FOREIGN KEY (analystID) REFERENCES Analyst (analystID),
 CONSTRAINT FK_ACMetrics_acmID_appID FOREIGN KEY (appID) REFERENCES Application (appID),
 CONSTRAINT FK_ACMetrics_acmID_operationID FOREIGN KEY (analystID) REFERENCES Operation (operationID),
) ON [PRIMARY]

GO


