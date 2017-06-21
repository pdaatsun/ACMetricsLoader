USE [ACOperation]
GO

/****** Object:  Table [dbo].[Analyst] ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Analyst](
  [analystID] [int] IDENTITY(1,1) NOT NULL,
	[firstName] [varchar](256) NULL,
	[lastName] [varchar](256) NULL,
	[employeeID] [varchar](128) NULL,
	[email] [varchar](128) NULL,
	[status] [varchar](128) NULL,
 CONSTRAINT [PK_Analyst] PRIMARY KEY CLUSTERED
(
	[analystID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
