USE [ADUsers]
GO

/****** Object:  Table [dbo].[AD_USER]    Script Date: 2/15/2017 2:37:15 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[PS_Contractor](
  [personID] [varchar](256) NOT NULL,
	[effectiveDate] [date] NULL,
	[firstName] [varchar](256) NULL,
	[middleName] [varchar](256) NULL,
	[lastName] [varchar](256) NULL,
	[status] [varchar](256) NULL,
	[phone] [varchar](256) NULL,
	[address1] [varchar](512) NULL,
	[address2] [varchar](512) NULL,
	[city] [varchar](256) NULL,
	[state] [varchar](256) NULL,
	[postal] [varchar](256) NULL,
	[country] [varchar](256) NULL,
	[managerID] [varchar](256) NULL,
	[managerName] [varchar](256) NULL,
	[departmentID] [varchar](256) NULL,
	[departmentDesc] [varchar](512) NULL,
	[locationID] [varchar](256) NULL,
	[locationDesc] [varchar](512) NULL,
	[emailID] [varchar](256) NULL,
	[purchaseOrder] [varchar](256) NULL,
	[jobTitle] [varchar](256) NULL,
	[contractBeginDate] [date] NULL,
	[contractEndDate] [date] NULL,
	[vendorID] [varchar](256) NULL,
	[vendorName] [varchar](256) NULL,
	[previouslyEmployed] [varchar](256) NULL,
	[ADID] [varchar](256) NULL,
	[createdBy] [varchar](256) NULL,
	[createdDTTM] [datetime] NULL,
	[lastUpdatedBy] [varchar](256) NULL,
	[comment] [varchar](512) NULL,
 CONSTRAINT [PK_PS_Contractor] PRIMARY KEY CLUSTERED
(
	[personID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
