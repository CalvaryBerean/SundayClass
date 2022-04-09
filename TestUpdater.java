package com.verizonmedia.runner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUpdater {

	private static String textToPlayWith = "The Woman, Israel\n" + "\n"
			+ "1A great sign appeared in heaven: a woman clothed with the sun, and the moon under her feet, and on her head a crown of twelve stars; 2and she was pregnant and she *cried out, being in labor and in pain to give birth.\n"
			+ "\n" + "The Red Dragon, Satan\n"
			+ "3Then another sign appeared in heaven: and behold, a great red dragon having seven heads and ten horns, and on his heads were seven crowns. 4And his tail *swept away a third of the stars of heaven and hurled them to the earth. And the dragon stood before the woman who was about to give birth, so that when she gave birth he might devour her Child.\n"
			+ "\n" + "The Male Child, Christ\n"
			+ "5And she gave birth to a Son, a male, who is going to [a]rule all the [b]nations with a rod of iron; and her Child was caught up to God and to His throne. 6Then the woman fled into the wilderness where she *had a place prepared by God, so that there [c]she would be nourished for 1,260 days.\n"
			+ "\n" + "The Angel, Michael\n" + "\n"
			+ "7And there was war in heaven, Michael and his angels waging war with the dragon. The dragon and his angels waged war, 8and they did not prevail, and there was no longer a place found for them in heaven. 9And the great dragon was thrown down, the serpent of old who is called the devil and Satan, who deceives the whole [d]world; he was thrown down to the earth, and his angels were thrown down with him. 10Then I heard a loud voice in heaven, saying,\n"
			+ "\n"
			+ "“Now the salvation, and the power, and the kingdom of our God and the authority of His Christ have come, for the accuser of our brothers and sisters has been thrown down, the one who accuses them before our God day and night. 11And they overcame him because of the blood of the Lamb and because of the word of their testimony, and they did not love their life even [e]when faced with death. 12For this reason, rejoice, you heavens and you who dwell in them. Woe to the earth and the sea, because the devil has come down to you with great wrath, knowing that he has only a short time.”\n"
			+ "\n"
			+ "13And when the dragon saw that he was thrown down to the earth, he persecuted the woman who gave birth to the male Child. 14But the two wings of the great eagle were given to the woman, so that she could fly into the wilderness to her place, where she *was nourished for a time, times, and half a time, away from the presence of the serpent. 15And the serpent hurled water like a river out of his mouth after the woman, so that he might cause her to be swept away with the flood. 16[f]But the earth helped the woman, and the earth opened its mouth and drank up the river which the dragon had hurled out of his mouth. 17So the dragon was enraged with the woman, and went off to make war with the rest of her [g]children, who keep the commandments of God and hold to the testimony of Jesus.";

	public static void main(String[] args) {
		String newString = textToPlayWith;
		for (int i = 60; i > 0; i--) {
			Pattern p = Pattern.compile(String.valueOf(i) + "[a-zA-Z]");
			// get a matcher object
			Matcher m = p.matcher(newString);
			if (m.find()) {
				String x = m.group();
				newString = m.replaceAll("\n\n[**" + i + "**] " + x.charAt(x.length() - 1));
			}
		}
		System.out.println(newString);
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for (int i = 0; i < alphabet.length; i++) {
			String toReplaceWith = "[**(" + alphabet[i] + ")**](https://biblehub.com/nasb_/revelation/12.htm#fn)";
			String searchFor = "[" + alphabet[i] + "]";
			newString = newString.replace(searchFor, toReplaceWith);
		}
		System.out.println(newString);
	}

}
