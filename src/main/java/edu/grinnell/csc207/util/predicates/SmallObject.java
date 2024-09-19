package edu.grinnell.csc207.util.predicates;

import edu.grinnell.csc207.util.Predicate;

/**
 * Predicates for small strings.  Uses a form of the Singleton pattern.
 * Clients cannot create SmallString objects; they must reference
 * SmallString.PRED.
 *
 * @author Cade & Nicky
 */
public class SmallObject implements Predicate<Object> {
    // +-----------+---------------------------------------------------
  // | Constants |
  // +-----------+

  /**
   * One copy of this predicate, following the singleton pattern.
   */
  public static final SmallObject PRED = new SmallObject();

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new predicate. Made private to prevent clients from
   * creating new objects (part of the singleton pattern).
   */
  private SmallObject() {
  } // SmallObject()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Determine if val is an odd integer.
   *
   * @param val
   *   The integer we evaluate.
   *
   * @return
   *   true if val is odd and false if val is even.
   */
  public boolean holds(Object val) {
    String objectString = (String) val;
    return objectString.length() < 5;
  } // holds
}
