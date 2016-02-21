/**
 * ******************************************************************************
 * Copyright (c) 2016 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  *
 * Contributors:
 *     Kiel University - initial API and implementation
 *  ******************************************************************************
 */
package org.eclipse.elk.core.meta.metaData;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Md Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.elk.core.meta.metaData.MdAlgorithm#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.elk.core.meta.metaData.MdAlgorithm#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.elk.core.meta.metaData.MdAlgorithm#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.elk.core.meta.metaData.MdAlgorithm#getPreviewImage <em>Preview Image</em>}</li>
 *   <li>{@link org.eclipse.elk.core.meta.metaData.MdAlgorithm#getSupportedFeatures <em>Supported Features</em>}</li>
 *   <li>{@link org.eclipse.elk.core.meta.metaData.MdAlgorithm#getSupportedOptions <em>Supported Options</em>}</li>
 * </ul>
 *
 * @see org.eclipse.elk.core.meta.metaData.MetaDataPackage#getMdAlgorithm()
 * @model
 * @generated
 */
public interface MdAlgorithm extends MdBundleMember
{
  /**
   * Returns the value of the '<em><b>Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provider</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provider</em>' containment reference.
   * @see #setProvider(JvmTypeReference)
   * @see org.eclipse.elk.core.meta.metaData.MetaDataPackage#getMdAlgorithm_Provider()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getProvider();

  /**
   * Sets the value of the '{@link org.eclipse.elk.core.meta.metaData.MdAlgorithm#getProvider <em>Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provider</em>' containment reference.
   * @see #getProvider()
   * @generated
   */
  void setProvider(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' attribute.
   * @see #setParameter(String)
   * @see org.eclipse.elk.core.meta.metaData.MetaDataPackage#getMdAlgorithm_Parameter()
   * @model
   * @generated
   */
  String getParameter();

  /**
   * Sets the value of the '{@link org.eclipse.elk.core.meta.metaData.MdAlgorithm#getParameter <em>Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' attribute.
   * @see #getParameter()
   * @generated
   */
  void setParameter(String value);

  /**
   * Returns the value of the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' reference.
   * @see #setCategory(MdCategory)
   * @see org.eclipse.elk.core.meta.metaData.MetaDataPackage#getMdAlgorithm_Category()
   * @model
   * @generated
   */
  MdCategory getCategory();

  /**
   * Sets the value of the '{@link org.eclipse.elk.core.meta.metaData.MdAlgorithm#getCategory <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' reference.
   * @see #getCategory()
   * @generated
   */
  void setCategory(MdCategory value);

  /**
   * Returns the value of the '<em><b>Preview Image</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preview Image</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preview Image</em>' attribute.
   * @see #setPreviewImage(String)
   * @see org.eclipse.elk.core.meta.metaData.MetaDataPackage#getMdAlgorithm_PreviewImage()
   * @model
   * @generated
   */
  String getPreviewImage();

  /**
   * Sets the value of the '{@link org.eclipse.elk.core.meta.metaData.MdAlgorithm#getPreviewImage <em>Preview Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preview Image</em>' attribute.
   * @see #getPreviewImage()
   * @generated
   */
  void setPreviewImage(String value);

  /**
   * Returns the value of the '<em><b>Supported Features</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.elk.core.meta.metaData.MdGraphFeature}.
   * The literals are from the enumeration {@link org.eclipse.elk.core.meta.metaData.MdGraphFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supported Features</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supported Features</em>' attribute list.
   * @see org.eclipse.elk.core.meta.metaData.MdGraphFeature
   * @see org.eclipse.elk.core.meta.metaData.MetaDataPackage#getMdAlgorithm_SupportedFeatures()
   * @model unique="false"
   * @generated
   */
  EList<MdGraphFeature> getSupportedFeatures();

  /**
   * Returns the value of the '<em><b>Supported Options</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.elk.core.meta.metaData.MdPropertySupport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supported Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supported Options</em>' containment reference list.
   * @see org.eclipse.elk.core.meta.metaData.MetaDataPackage#getMdAlgorithm_SupportedOptions()
   * @model containment="true"
   * @generated
   */
  EList<MdPropertySupport> getSupportedOptions();

} // MdAlgorithm