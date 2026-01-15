#### **MANUAL TEST CASE REPORT**

**===========================================**



##### **Customer Relationship Management (CRM) System**

**--------------------------------------------------------------------------**



###### **1. Introduction**

Manual testing is performed to validate the functionality of the Customer Relationship Management (CRM) system without using automation tools. The testing ensures that modules such as login, customer management, sales tracking, support, and reporting work as expected and meet user requirements.



###### **2. Objective**

The objectives of manual testing are:

\- To verify that all CRM features function correctly

\- To identify and document defects in the system

\- To ensure proper handling of customer and sales data

\- To validate usability, reliability, and performance of the CRM system



###### **3. Scope of Testing**

The following CRM modules are tested:

\- User Login

\- Customer Management

\- Sales Management

\- Customer Support

\- Reports and Dashboard



###### **4. Test Environment**



| Component        | Description    |

| ---------------- | -------------- |

| Operating System | Windows 11     |

| Browser          | Google Chrome  |

| Database         | MySQL          |

| CRM Version      | 2.0            |

| Testing Type     | Manual Testing |



###### **5. Test Scenarios**

\- Verify login with valid and invalid credentials

\- Add, edit, delete, and view customer details

\- Track and update sales records

\- Create, update, and close support tickets

\- Generate and view reports



###### **6. Manual Test Cases**



| Test Case ID | Test Case Description          | Test Steps                                        | Expected Result                | Actual Result    | Status |

| ------------ | ------------------------------ | ------------------------------------------------- | ------------------------------ | ---------------- | ------ |

| TC01         | Login with valid credentials   | Enter valid username and password and click login | User should login successfully | Login successful | Pass   |

| TC02         | Login with invalid credentials | Enter wrong username/password                     | Error message should be shown  | Error displayed  | Pass   |

| TC03         | Add new customer               | Enter customer details and click save             | Customer should be added       | Customer added   | Pass   |

| TC04         | Edit customer details          | Modify customer data and save                     | Data should be updated         | Updated          | Pass   |

| TC05         | Delete customer                | Click delete on a customer                        | Customer should be removed     | Deleted          | Pass   |

| TC06         | View sales records             | Open sales module                                 | Sales data displayed           | Displayed        | Pass   |

| TC07         | Create support ticket          | Enter issue and submit                            | Ticket created                 | Ticket created   | Pass   |

| TC08         | Close support ticket           | Change status to closed                           | Ticket should close            | Closed           | Pass   |

| TC09         | Generate report                | Click generate report                             | Report displayed               | Displayed        | Pass   |

| TC10         | Logout                         | Click logout                                      | User logged out                | Logged out       | Pass   |



###### **7. Test Results Summary**



| Total Test Cases | Passed | Failed |

| ---------------- | ------ | ------ |

| 10               | 10     | 0      |



All test cases passed successfully.



###### **8. Defect Report**

No major defects were found during manual testing. Minor UI alignment issues were identified and resolved.



###### **9. Conclusion**

The CRM system was tested manually, and all critical functionalities such as login, customer management, sales tracking, support, and reporting worked correctly. The system is stable, reliable, and ready for deployment.



