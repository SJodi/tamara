@MasterEvent
  Feature: Master event

    @ME1
    Scenario Outline: Succes create maseter event
      Given admin login into tamara
      When user create new master event
      And user fill field "<eventName>" "<eventType>" "<image>" "<passing grade>" "<coin>" "<xp>" "<journey>" "<prerequisition>" "<certificate>" "<descriptions>"
      And Submit data
      Examples:
      |eventName|eventType|image|passing grade|coin|xp|journey|prerequisition|certificate|descriptions|
