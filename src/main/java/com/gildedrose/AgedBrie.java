package com.gildedrose;

public class AgedBrie extends Item {
  public AgedBrie(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void upgrade() {
    setSellIn(getSellIn() - 1);
    increaseQuality();
    if (getSellIn() < 0) increaseQuality();
  }
}
