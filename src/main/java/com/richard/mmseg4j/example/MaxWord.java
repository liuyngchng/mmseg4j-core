package com.richard.mmseg4j.example;

import java.io.IOException;

import com.richard.mmseg4j.MaxWordSeg;
import com.richard.mmseg4j.Seg;

public class MaxWord extends Complex {

	protected Seg getSeg() {

		return new MaxWordSeg(dic);
	}

	public static void main(String[] args) throws IOException {
		new MaxWord().run(args);
	}
}
