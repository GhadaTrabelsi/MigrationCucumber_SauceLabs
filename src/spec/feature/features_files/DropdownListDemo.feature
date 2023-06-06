@dropdownlistDemo

Feature:  
  ETQ utuisateur je souhaite sélectionner des options dans une liste déroulante
@selectByIndex

  Scenario: Je souhaite sélectionner des options dans une liste déroulante
    Given Je me connecte sur l application DropDownListDemo
    When je sélectionne une option par son index
    Then l option correspondante est sélectionnée

@selectByValue
  Scenario: Je souhaite sélectionner des options dans une liste déroulante
    Given Je me connecte sur l application DropDownListDemo
    When je sélectionne une option par sa valeur
    Then l option correspondante est sélectionnée

   @selectByVisibleText
  Scenario: Je souhaite sélectionner des options dans une liste déroulante
    Given Je me connecte sur l application DropDownListDemo
    When je sélectionne une option par son visibleText
    Then l option correspondante est sélectionnée 
    