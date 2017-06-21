USE [ACOperation]
GO

/****** Object:  Table [dbo].[Operation] ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Operation](
  [operationID] [int] IDENTITY(1,1) NOT NULL,
	[operationType] [varchar](256) NULL,
	[operationDesc] [varchar](1024) NULL,
 CONSTRAINT [PK_Operation] PRIMARY KEY CLUSTERED
(
	[operationID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
