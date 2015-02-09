/*******************************************************************************
 * Copyright (c) 2015 Red Hat, Inc. Distributed under license by Red Hat, Inc.
 * All rights reserved. This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Red Hat, Inc.
 ******************************************************************************/
package com.openshift3.internal.client.model;

import java.util.Map;

import org.jboss.dmr.ModelNode;

import com.openshift3.client.IClient;
import com.openshift3.client.images.DockerImageURI;
import com.openshift3.client.model.BuildTrigger;
import com.openshift3.client.model.IBuildConfig;

public class BuildConfig extends KubernetesResource implements IBuildConfig {

	public BuildConfig(ModelNode node, IClient client, Map<String, String []> propertyKeys) {
		super(node, client, propertyKeys);
		//TODO add check to kind here
	}

	//TODO delete me...require construction through factory
	public BuildConfig() {
		this(new ModelNode(), null, null);
	}

	public String getSourceURI() {
		return asString(BUILDCONFIG_SOURCE_URI);
	}

	public void addTrigger(BuildTrigger type, String secret){
		//FIXME
//		ModelNode trigger = new ModelNode();
//		trigger.get("type").set(type.toString());
//		trigger.get(new String[]{type.toString(),"secret"}).set(secret);
//		getNode().get("triggers").add(trigger);
	}

	public void setSource(String type, String uri){
		//FIXME
//		ModelNode params = getNode().get("parameters");
//		params.get(new String[]{"source","type"}).set(type);
//		params.get(new String[]{"source","git","uri"}).set(uri);
	}
	
	public void setStrategy(String type, String baseImage){
		//FIXME
//		ModelNode strategy = getNode().get(new String []{"parameters","strategy"});
//		strategy.get("type").set(type);	
//		strategy.get(new String[]{"stiStrategy","image"}).set(baseImage);
	}
	
	public void setOutput(DockerImageURI imageUri){
		//FIXME
//		ModelNode output = getNode().get(new String []{"parameters","output"});
//		output.get("imageTag").set(imageUri.getUriWithoutHost());
//		output.get("registry").set(imageUri.getRepositoryHost());
	}

}