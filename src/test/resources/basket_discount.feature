Feature: managing discount on purshased items
  Discount rules is concerning only Apples and Watermelons

  Scenario: manage discount on "apple"
    Given Prepare basket for apple
    When Buy 4 apples
    Then Get "0.4" apple discounted price

#  Scenario: manage discount on "Watermelon"
#    Given Prepare basket for watermelon
#    When Buy 5 watermelons
#    Then Get "3.2" watermelon discounted price
#
#  Scenario: manage discount on "Orange"
#    Given prepare basket for orange
#    When Buy 3 oranges
#    Then Get "1.5" orange price
