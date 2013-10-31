package de.fme.alfresco.repo.thumbnails;

import java.util.List;

import org.alfresco.service.cmr.thumbnail.ThumbnailService;

import org.alfresco.repo.thumbnail.ThumbnailDefinition;
import org.alfresco.repo.thumbnail.ThumbnailRegistry;
import org.apache.log4j.Logger;

public class ThumbnailRegistryBootstrap {
	private ThumbnailService thumbnailService;
	private List<ThumbnailDefinition> thumbnailDefinitions;
	
	private Logger logger = Logger.getLogger(ThumbnailRegistryBootstrap.class);
	
	public void init() {
		ThumbnailRegistry thumbnailRegistry = thumbnailService.getThumbnailRegistry();
		for (ThumbnailDefinition thumbDef : thumbnailDefinitions) {
			logger.info("Adding thumbnail definition:" + thumbDef.getName());
			thumbnailRegistry.addThumbnailDefinition(thumbDef);
		}
	}

	public void setThumbnailService(ThumbnailService thumbnailService) {
		this.thumbnailService = thumbnailService;
	}

	public void setThumbnailDefinitions(
			List<ThumbnailDefinition> thumbnailDefinitions) {
		this.thumbnailDefinitions = thumbnailDefinitions;
	}
	
}
