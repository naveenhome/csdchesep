Feature: Job Portal

 @WIP
  Scenario Outline: Regression Test
    Given Regression user enter name as <Name> and email as <Email>
    When Regression click on <IButton>
    Then Regression Message should be <Message>

    Examples: 
      | Name     | Email         | IButton  | Message   |
      | "Naveen" | "abc@abc.com" | "Submit" | "Success" |
      | "Naveen" | " "           | "Submit" | "Fail"    |
      | "  "     | "abc@abc.com" | "Submit" | "Fail"    |
      | "  "     | "abc@abc" | "Submit" | "Email not in correct format"    |
