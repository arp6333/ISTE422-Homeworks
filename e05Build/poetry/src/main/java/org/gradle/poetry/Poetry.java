package org.gradle.poetry;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.binary.Base64;

public class Poetry {
	public List<String> raven() {
		List<String> lines = new ArrayList<String>();
		lines.add("Once upon a midnight dreary,");
		lines.add("while I pondered, weak and weary,");
		lines.add("Over many a quaint and curious");
		lines.add("volume of forgotten lore --");
		lines.add("While I nodded, nearly napping,");
		lines.add("suddenly there came a tapping,");
		lines.add("As of some one gently rapping,");
		lines.add("rapping at my chamber door --");
		lines.add("'Tis some visiter, I muttered,");
		lines.add("tapping at my chamber door --");
		lines.add("Only this and nothing more.");
		return lines;
	}
	public void emit(List<String> lines) {
		for (String line : lines) {
			System.out.println(encode(line));
		}
	}
	public String encode(String text) {
		Base64 codec = new Base64();
		return new String(codec.encode(text.getBytes()));
	}
	public static void main(String[] args) {
		Poetry p = new Poetry();
		p.emit(p.raven());
	}
}

