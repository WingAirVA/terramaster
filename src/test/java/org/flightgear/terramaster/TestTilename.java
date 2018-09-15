package org.flightgear.terramaster;

import static org.junit.Assert.assertEquals;

import org.flightgear.terramaster.TileName;
import org.junit.Test;

/**
 * FIXME The coordinates are the switched
 * @author keith.paterson
 *
 */

public class TestTilename {

  @Test
  public void test1() {
    java.awt.geom.Point2D.Double d = new java.awt.geom.Point2D.Double(7.5, -50);
    int result = TileName.getTileIndex(d);
    assertEquals(3072770, result);
  }

  @Test
  public void test2() {
    java.awt.geom.Point2D.Double d = new java.awt.geom.Point2D.Double(-7.5, 50);
    int result = TileName.getTileIndex(d);
    assertEquals(2820610, result);
  }

  @Test
  public void test3() {
    java.awt.geom.Point2D.Double d = new java.awt.geom.Point2D.Double(-5.74110808, -57.2786546);
    int result = TileName.getTileIndex(d);
    assertEquals(2860241, result);
  }

}