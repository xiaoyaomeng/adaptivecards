/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class AdaptiveCardParseWarningVector extends java.util.AbstractList<AdaptiveCardParseWarning> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AdaptiveCardParseWarningVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AdaptiveCardParseWarningVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_AdaptiveCardParseWarningVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AdaptiveCardParseWarningVector(AdaptiveCardParseWarning[] initialElements) {
    this();
    reserve(initialElements.length);

    for (AdaptiveCardParseWarning element : initialElements) {
      add(element);
    }
  }

  public AdaptiveCardParseWarningVector(Iterable<AdaptiveCardParseWarning> initialElements) {
    this();
    for (AdaptiveCardParseWarning element : initialElements) {
      add(element);
    }
  }

  public AdaptiveCardParseWarning get(int index) {
    return doGet(index);
  }

  public AdaptiveCardParseWarning set(int index, AdaptiveCardParseWarning e) {
    return doSet(index, e);
  }

  public boolean add(AdaptiveCardParseWarning e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, AdaptiveCardParseWarning e) {
    modCount++;
    doAdd(index, e);
  }

  public AdaptiveCardParseWarning remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public AdaptiveCardParseWarningVector() {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCardParseWarningVector__SWIG_0(), true);
  }

  public AdaptiveCardParseWarningVector(AdaptiveCardParseWarningVector other) {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCardParseWarningVector__SWIG_1(AdaptiveCardParseWarningVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return AdaptiveCardObjectModelJNI.AdaptiveCardParseWarningVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    AdaptiveCardObjectModelJNI.AdaptiveCardParseWarningVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return AdaptiveCardObjectModelJNI.AdaptiveCardParseWarningVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AdaptiveCardObjectModelJNI.AdaptiveCardParseWarningVector_clear(swigCPtr, this);
  }

  public AdaptiveCardParseWarningVector(int count, AdaptiveCardParseWarning value) {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCardParseWarningVector__SWIG_2(count, AdaptiveCardParseWarning.getCPtr(value), value), true);
  }

  private int doSize() {
    return AdaptiveCardObjectModelJNI.AdaptiveCardParseWarningVector_doSize(swigCPtr, this);
  }

  private void doAdd(AdaptiveCardParseWarning x) {
    AdaptiveCardObjectModelJNI.AdaptiveCardParseWarningVector_doAdd__SWIG_0(swigCPtr, this, AdaptiveCardParseWarning.getCPtr(x), x);
  }

  private void doAdd(int index, AdaptiveCardParseWarning x) {
    AdaptiveCardObjectModelJNI.AdaptiveCardParseWarningVector_doAdd__SWIG_1(swigCPtr, this, index, AdaptiveCardParseWarning.getCPtr(x), x);
  }

  private AdaptiveCardParseWarning doRemove(int index) {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCardParseWarningVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new AdaptiveCardParseWarning(cPtr, true);
  }

  private AdaptiveCardParseWarning doGet(int index) {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCardParseWarningVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new AdaptiveCardParseWarning(cPtr, true);
  }

  private AdaptiveCardParseWarning doSet(int index, AdaptiveCardParseWarning val) {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCardParseWarningVector_doSet(swigCPtr, this, index, AdaptiveCardParseWarning.getCPtr(val), val);
    return (cPtr == 0) ? null : new AdaptiveCardParseWarning(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    AdaptiveCardObjectModelJNI.AdaptiveCardParseWarningVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}