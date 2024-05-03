#encoding: iso-8859-1
################################################
########## Scenarios: Automations Tests ################
################################################
@Mentorious_AutomationsTests
Feature: Automation Tests Scenarios

  @001_Mentorious_LoginStudent
  Scenario: Login as Student
    Given Enter the Website for student
    When I log in as a student
    Then I go to the home screen for student

  @002_Mentorious_LoginMentor
  Scenario: Login as Mentor
    Given Enter the Website for student
    When I log in as a mentor
    Then I go to the home screen for mentor