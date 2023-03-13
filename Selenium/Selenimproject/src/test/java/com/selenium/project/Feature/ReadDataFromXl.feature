Feature:
Scenario Outline: Login With Valid credentials
Given  User is on NopCommerce
When  User enters excel as "<SheetName>" and password as '<RowNumber>'
  Examples:
    | SheetName | RowNumber |
    | Readdata  | 0         |
  |Readdata   |1          |
