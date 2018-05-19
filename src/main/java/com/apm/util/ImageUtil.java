package com.apm.util;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ImageUtil {

	public static void main(String[] args) throws IOException {
		String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		Thumbnails.of(new File("H:\\spring\\picture\\mountain.jpg")).size(200, 200)
				.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File("H:\\spring\\picture\\watermark.jpg")), 0.25f)
				.outputQuality(0.8f).toFile("H:\\spring\\picture\\mountain6.jpg");
	}

}
