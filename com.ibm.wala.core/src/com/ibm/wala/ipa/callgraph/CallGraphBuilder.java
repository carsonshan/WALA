/*******************************************************************************
 * Copyright (c) 2002 - 2006 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.wala.ipa.callgraph;

import com.ibm.wala.eclipse.util.CancelException;
import com.ibm.wala.ipa.callgraph.propagation.PointerAnalysis;
import com.ibm.wala.ipa.callgraph.propagation.PointerFlowGraphFactory;


/**
 *
 * Basic interface for an object that can build a call graph.
 * 
 * @author sfink
 */
public interface CallGraphBuilder {
  /**
   * Build a call graph.
   * 
   * @param options an object representing controlling options that the call
   * graph building algorithm needs to know.
   * @return the built call graph
   * @throws CancelException 
   * @throws IllegalArgumentException 
   */
  public CallGraph makeCallGraph(AnalysisOptions options) throws IllegalArgumentException, CancelException;

  /**
   * @return the Pointer Analysis information computed as a side-effect of
   * call graph construction.
   */
  public PointerAnalysis getPointerAnalysis();

  public PointerFlowGraphFactory getPointerFlowGraphFactory();
  
  public AnalysisCache getAnalysisCache();

}
