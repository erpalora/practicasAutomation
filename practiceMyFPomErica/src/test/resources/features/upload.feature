Feature: Practice Upload file in demoqa

  @smokeTest
  Scenario: Upload document
    Given The user needs upload a document in demoqa
    When he selected the file to upload
    Then he can see the name of file in the page
