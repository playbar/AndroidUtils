/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.sureshjoshi.core;

public class IntVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IntVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        SeePlusPlus_WrapperJNI.delete_IntVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntVector() {
    this(SeePlusPlus_WrapperJNI.new_IntVector__SWIG_0(), true);
  }

  public IntVector(long n) {
    this(SeePlusPlus_WrapperJNI.new_IntVector__SWIG_1(n), true);
  }

  public long size() {
    return SeePlusPlus_WrapperJNI.IntVector_size(swigCPtr, this);
  }

  public long capacity() {
    return SeePlusPlus_WrapperJNI.IntVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    SeePlusPlus_WrapperJNI.IntVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return SeePlusPlus_WrapperJNI.IntVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    SeePlusPlus_WrapperJNI.IntVector_clear(swigCPtr, this);
  }

  public void add(int x) {
    SeePlusPlus_WrapperJNI.IntVector_add(swigCPtr, this, x);
  }

  public int get(int i) {
    return SeePlusPlus_WrapperJNI.IntVector_get(swigCPtr, this, i);
  }

  public void set(int i, int val) {
    SeePlusPlus_WrapperJNI.IntVector_set(swigCPtr, this, i, val);
  }

}
