#### **MANUAL TEST CASE REPORT**

===========================================



##### **Automated Banking Website**

-----------------------------------------





###### **Test Case: Verify Add New Account**



|Field           | Description                                        |

|----------------|----------------------------------------------------|

|Test Case Id    |  TC\_BANK\_01                                        |

|Test Case Title |  Verify new customer account can be created        |

|Module Name     |  Account Management Module                         |

|Precondition    |  1. User logged in                                 |

|                |  2. Account module accessible                      |

|Test Steps      |  1. Navigate to Add Account screen                 |

|                |  2. Enter customer account details                 |

|                |  3. Click Save                                     |

|Test Data       |  Customer Name = "Rahul Sharma"                    |

|                |  Account ID = "AC001"                              |

|                |  Initial Deposit = "₹10,000"                       |

|Expected Result |  Account record should be created successfully     |

|Actual Result   |  Account record created                            |

|Status          |  Pass / Fail                                       |

|Remarks         |  Ensure unique Account ID is enforced              |







###### **Test Case: Verify Search Account**



|Field            | Description                             |

|-----------------|-----------------------------------------|

|Test Case Id     | TC\_BANK\_02                              |

|Test Case Title  | Verify search by account ID             |

|Module Name      | Account Management Module               |

|Precondition     | Account record exists                   |

|Test Steps       | 1. Navigate to Search Account           |

|                 | 2. Enter Account ID                     |

|                 | 3. Click Search                         |

|Test Data        | Account ID = "AC001"                    |

|Expected Result  | Account details should be displayed     |

|Actual Result    | Account details displayed               |

|Status           | Pass / Fail                             |

|Remarks          | Ensure search works for valid IDs       |







###### **Test Case: Verify Fund Transfer**



|Field            | Description                                        |

|-----------------|----------------------------------------------------|

|Test Case Id     | TC\_BANK\_03                                         |

|Test Case Title  | Verify fund transfer between accounts              |

|Module Name      | Transaction Module                                 |

|Precondition     | Source and destination accounts exist              |

|Test Steps       | 1. Navigate to Fund Transfer screen                |

|                 | 2. Enter source and destination account IDs        |

|                 | 3. Enter transfer amount                           |

|                 | 4. Click Transfer                                  |

|Test Data        | Source Account = "AC001"                           |

|                 | Destination Account = "AC002"                      |

|                 | Amount = "₹5,000"                                  |

|Expected Result  | Funds should be transferred successfully           |

|Actual Result    | Funds transferred                                  |

|Status           | Pass / Fail                                        |

|Remarks          | Ensure sufficient balance validation is enforced   |



