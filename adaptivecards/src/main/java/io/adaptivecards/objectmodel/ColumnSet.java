/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ColumnSet extends CollectionTypeElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ColumnSet(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.ColumnSet_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ColumnSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_ColumnSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ColumnSet() {
    this(AdaptiveCardObjectModelJNI.new_ColumnSet__SWIG_0(), true);
  }

  public ColumnSet(ColumnSet arg0) {
    this(AdaptiveCardObjectModelJNI.new_ColumnSet__SWIG_1(ColumnSet.getCPtr(arg0), arg0), true);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.ColumnSet_SerializeToJsonValue(swigCPtr, this), true);
  }

  public void DeserializeChildren(ParseContext context, JsonValue value) {
    AdaptiveCardObjectModelJNI.ColumnSet_DeserializeChildren(swigCPtr, this, ParseContext.getCPtr(context), context, JsonValue.getCPtr(value), value);
  }

  public ColumnVector GetColumns() {
    return new ColumnVector(AdaptiveCardObjectModelJNI.ColumnSet_GetColumns__SWIG_0(swigCPtr, this), false);
  }

  public void GetResourceInformation(RemoteResourceInformationVector resourceInfo) {
    AdaptiveCardObjectModelJNI.ColumnSet_GetResourceInformation(swigCPtr, this, RemoteResourceInformationVector.getCPtr(resourceInfo), resourceInfo);
  }

  public static ColumnSet dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.ColumnSet_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new ColumnSet(cPtr, true);
  }

}