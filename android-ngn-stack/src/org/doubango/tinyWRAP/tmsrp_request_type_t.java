/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.39
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public enum tmsrp_request_type_t {
  tmsrp_NONE(0),
  tmsrp_SEND,
  tmsrp_REPORT,
  tmsrp_AUTH;

  public final int swigValue() {
    return swigValue;
  }

  public static tmsrp_request_type_t swigToEnum(int swigValue) {
    tmsrp_request_type_t[] swigValues = tmsrp_request_type_t.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (tmsrp_request_type_t swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + tmsrp_request_type_t.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private tmsrp_request_type_t() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private tmsrp_request_type_t(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private tmsrp_request_type_t(tmsrp_request_type_t swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

