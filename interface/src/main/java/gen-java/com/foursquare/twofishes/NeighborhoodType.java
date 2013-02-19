/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.foursquare.twofishes;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum NeighborhoodType implements TEnum {
  MACRO(2),
  NEIGHBORHOOD(3),
  SUB(4);

  private final int value;

  private NeighborhoodType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static NeighborhoodType findByValue(int value) { 
    switch (value) {
      case 2:
        return MACRO;
      case 3:
        return NEIGHBORHOOD;
      case 4:
        return SUB;
      default:
        return null;
    }
  }
}
