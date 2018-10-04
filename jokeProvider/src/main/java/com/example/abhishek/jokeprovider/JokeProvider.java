package com.example.abhishek.jokeprovider;

import java.util.Random;

public class JokeProvider {
    private final Random random = new Random();
    private String[] jokes = {
            "The more I C.... the less I see.",
            "July 4th is Independence day. And the day Chuck Norris was born. Coincidence? I think not.",
            "Bill Gates thinks he's Chuck Norris. Chuck Norris actually laughed. Once.",
            "In a world without fences and walls... who needs Gates and Windows?",
            "If I wanted a warm fuzzy feeling... Id antialias my graphics!",
            "Microsoft: You've got questions. We've got dancing paperclips.",
            "binary digits are called bits i love ternary digits",
            "To err is human  and to blame it on a computer is even more so.",
            "C://dos  <br>C://dos.run  <br>run.dos.run",
            "Erik Naggum: Microsoft is not the answer. Microsoft is the question. NO is the answer.",
            "There are only 10 types of people in the world: those that understand binary, those that don't, and those that didn't expect a ternary joke.",
            "Computers make very fast and very accurate mistakes.",
            "The beginning of the programmers wisdom is understanding the difference between getting program to run and having a runnable program.",
            "There is no place like 127.0.0.1",
            "I can't access Git. I guess I have... commitment issues",
            "Why is C sad? Because C++ told him \"You have no class\".",
            "My daily Unix command list: unzip; strip; touch; finger; mount; fsck; more; yes; unmount; sleep.",
            "Mac users swear by their Mac and PC users swear at their PC.",
            "Windows isn't a virus, at least viruses do something.",
            "Le gf: I'll dump you.\nLe bf: hex dump or binary dump?"
    };

    public String getJoke() {
        return "A random joke";
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
