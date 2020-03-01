package com.springinaction.knights;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class BraveKnightTest {
  @Test
  public void knightShouldEmbarkOnQuest() throws QuestException {
    Quest mockQuest = mock(Quest.class);
    Minstrel mockMinstrel = mock(Minstrel.class);

    BraveKnight knight = new BraveKnight(mockQuest, mockMinstrel);
    knight.embarkOnQuest();

    verify(mockQuest, times(1)).embark();
  }
}
