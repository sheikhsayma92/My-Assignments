#### **MANUAL TEST CASE REPORT**

===========================================



##### **Healthcare System**

-----------------------------







###### **Test Case: Verify Add Patient Record**



|Field           | Description                                      |

|----------------|--------------------------------------------------|

|Test Case Id    | TC\_HEALTH\_01                                     |

|Test Case Title | Verify new patient record can be added           |

|Module Name     | Patient Management Module                        |

|Precondition    | 1. User logged in                                |

|                | 2. Patient module accessible                     |

|Test Steps      | 1. Navigate to Add Patient screen                |

|                | 2. Enter patient details                         |

|                | 3. Click Save                                    | 

|Test Data       | Patient Name = "Riya Mehta"                      |

|                | Patient ID = "P001"                              | 

|                | Phone = "9843210217"                             |

|Expected Result | Patient record should be created successfully    |

|Actual Result   | Patient record created                           |

|Status          | Pass / Fail                                      |

|Remarks         | Ensure unique Patient ID is enforced             |







###### **Test Case: Verify Search Patient**



|Field            | Description                             |

|-----------------|-----------------------------------------|

|Test Case Id     | TC\_HEALTH\_02                            |

|Test Case Title  | Verify search by patient ID             |

|Module Name      | Patient Management Module               |

|Precondition     | Patient record exists                   |

|Test Steps       | 1. Navigate to Search Patient           |

|                 | 2. Enter Patient ID                     |

|                 | 3. Click Search                         |

|Test Data        | Patient ID = "P001"                     |

|Expected Result  | Patient details should be displayed     |

|Actual Result    | Patient details displayed               |

|Status           | Pass / Fail                             |

|Remarks          | Ensure search works for valid IDs       |

