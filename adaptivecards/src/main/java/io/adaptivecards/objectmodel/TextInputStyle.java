/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public enum TextInputStyle {
  Text(0),
  Tel,
  Url,
  Email;

  public final int swigValue() {
    return swigValue;
  }

  public static TextInputStyle swigToEnum(int swigValue) {
    TextInputStyle[] swigValues = TextInputStyle.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (TextInputStyle swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + TextInputStyle.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private TextInputStyle() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private TextInputStyle(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private TextInputStyle(TextInputStyle swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
