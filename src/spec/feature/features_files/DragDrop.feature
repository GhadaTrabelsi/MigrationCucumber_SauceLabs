@dragdrop
Feature: Drag and Drop Demo 
  ETQ utuisateur je souhaite Déplacer et déposer un élément
  Scenario: Je souhaite Déplacer et déposer un élément
    Given Je me connecte sur l application Drag and Drop
    When je fais glisser et depose lelement
    Then le texte de lemplacement de  destination doit être "Dropped!"



    