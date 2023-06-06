@doubleclickdemo
Feature: DoubleClickDemo 
  ETQ utuisateur je souhaite faire un double click sur  un élément
  Scenario: Je souhaite faire un double click sur  un élément
    Given Je me connecte sur l application DoubleClick Demo 
    When je fais double click sur le bouton
    Then un message saffiche  "You have done a double click"



    