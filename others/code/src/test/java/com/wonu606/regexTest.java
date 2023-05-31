package com.wonu606;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;

public class regexTest {

    String PHONE_NUMBER_REGEX = "\\d{2,3}[- .]\\d{3}[- .]\\d{4}";
    String EMAIL_REGEX = "[a-zA-Z0-9._+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9.]+";
    String YOUTUBE_ADDRESS_REGEX = "(https?:\\/\\/)?(www\\.)?youtu.be\\/([a-zA-Z0-9-]{11})";

    Pattern PHONE_NUMBER_PATTERN = Pattern.compile(PHONE_NUMBER_REGEX);
    Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    Pattern YOUTUBE_ADDRESS_PATTERN = Pattern.compile(YOUTUBE_ADDRESS_REGEX);

    @Test
    void normalizeDots() {
        String input = "This....is.....a......test....";
        String output = input.replaceAll("\\.{2,}", ".");
        assertThat(output).isEqualTo("This.is.a.test.");
    }

    @Test
    void matchText() {
        String text = "This is a test string.";

        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
        Matcher matcher = pattern.matcher(text);

        assertThat(matcher.matches()).isFalse();
    }

    @Test
    void matchPhoneNumber() {
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("010-898-0893");
        phoneNumbers.add("010 898 0893");
        phoneNumbers.add("010.898.0893");
        phoneNumbers.add("010-405-3412");
        phoneNumbers.add("02-878-8888");

        for (String phoneNumber : phoneNumbers) {
            assertThat(PHONE_NUMBER_PATTERN.matcher(phoneNumber).matches()).isTrue();
        }
    }

    @Test
    void matchEMAIL() {
        List<String> emails = new ArrayList<>();
        emails.add("dream.coder.ellie@gmail.com");
        emails.add("hello@daum.net");
        emails.add("hello@daum.co.kr");

        for (String email : emails) {
            assertThat(EMAIL_PATTERN.matcher(email).matches()).isTrue();
        }
    }

    @Test
    void matchYouTubeAddress() {
        List<String> addresses = new ArrayList<>();
        addresses.add("http://www.youtu.be/-ZClicWm0zM");
        addresses.add("https://www.youtu.be/-ZClicWm0zM");
        addresses.add("https://youtu.be/-ZClicWm0zM");
        addresses.add("youtu.be/-ZClicWm0zM");

        for (String address : addresses) {
            assertThat(YOUTUBE_ADDRESS_PATTERN.matcher(address).matches()).isTrue();
        }
    }
}
