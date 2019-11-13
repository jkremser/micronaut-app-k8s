package example.micronaut;

import javax.inject.Singleton;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Singleton
public class QuoteService {


    public Quote randomQuote() {
        return QUOTES.get(new Random().nextInt(QUOTES.size()));
    }

    private static final List<Quote> QUOTES = Arrays.asList(
            // quotes from https://github.com/fortrabbit/quotes
            new Quote(
                    "Always code as if the guy who ends up maintaining your code will be a violent psychopath who knows where you live.",
                    "Martin Golding"
            ),
            new Quote(
                    "All computers wait at the same speed.",
                    "Unknown"
            ),
            new Quote(
                    "A misplaced decimal point will always end up where it will do the greatest damage.",
                    "Unknown"
            ),
            new Quote(
                    "A good programmer looks both ways before crossing a one-way street.",
                    "Unknown"
            ),
            new Quote(
                    "A computer program does what you tell it to do, not what you want it to do.",
                    "Unknown"
            ),
            new Quote(
                    "\"Intel Inside\" is a Government Warning required by Law.",
                    "Unknown"
            ),
            new Quote(
                    "Common sense gets a lot of credit that belongs to cold feet.",
                    "Arthur Godfrey"
            ),
            new Quote(
                    "Chuck Norris doesn’t go hunting. Chuck Norris goes killing.",
                    "Unknown"
            ),
            new Quote(
                    "Chuck Norris counted to infinity... twice.",
                    "Unknown"
            ),
            new Quote(
                    "C is quirky, flawed, and an enormous success.",
                    "Unknown"
            ),
            new Quote(
                    "Beta is Latin for still doesn’t work.",
                    "Unknown"
            ),
            new Quote(
                    "ASCII stupid question, get a stupid ANSI!",
                    "Unknown"
            ),
            new Quote(
                    "Artificial Intelligence usually beats natural stupidity.",
                    "Unknown"
            ),
            new Quote(
                    "Any fool can use a computer. Many do.",
                    "Ted Nelson"
            ),
            new Quote(
                    "Hey! It compiles! Ship it!",
                    "Unknown"
            ),
            new Quote(
                    "Hate cannot drive out hate; only love can do that.",
                    "Martin Luther King Junior"
            ),
            new Quote(
                    "Guns don’t kill people. Chuck Norris kills people.",
                    "Unknown"
            ),
            new Quote(
                    "God is real, unless declared integer.",
                    "Unknown"
            ),
            new Quote(
                    "First, solve the problem. Then, write the code.",
                    "John Johnson"
            ),
            new Quote(
                    "Experience is the name everyone gives to their mistakes.",
                    "Oscar Wilde"
            ),
            new Quote(
                    "Every piece of software written today is likely going to infringe on someone else’s patent.",
                    "Miguel de Icaza"
            ),
            new Quote(
                    "Computers make very fast, very accurate mistakes.",
                    "Unknown"
            ),
            new Quote(
                    "Computers do not solve problems, they execute solutions.",
                    "Unknown"
            ),
            new Quote(
                    "I have NOT lost my mind—I have it backed up on tape somewhere.",
                    "Unknown"
            ),
            new Quote(
                    "If brute force doesn’t solve your problems, then you aren’t using enough.",
                    "Unknown"
            ),
            new Quote(
                    "It works on my machine.",
                    "Unknown"
            ),
            new Quote(
                    "Java is, in many ways, C++??.",
                    "Unknown"
            ),
            new Quote(
                    "Keyboard not found...Press any key to continue.",
                    "Unknown"
            ),
            new Quote(
                    "Life would be so much easier if we only had the source code.",
                    "Unknown"
            ),
            new Quote(
                    "Mac users swear by their Mac, PC users swear at their PC.",
                    "Unknown"
            ),
            new Quote(
                    "Microsoft is not the answer. Microsoft is the question. \"No\" is the answer.",
                    "Unknown"
            ),
            new Quote(
                    "MS-DOS isn’t dead, it just smells that way.",
                    "Unknown"
            ),
            new Quote(
                    "Only half of programming is coding. The other 90% is debugging.",
                    "Unknown"
            ),
            new Quote(
                    "Pasting code from the Internet into production code is like chewing gum found in the street.",
                    "Unknown"
            ),
            new Quote(
                    "Press any key to continue or any other key to quit.",
                    "Unknown"
            ),
            new Quote(
                    "Profanity is the one language all programmers know best.",
                    "Unknown"
            ),
            new Quote(
                    "The best thing about a boolean is even if you are wrong, you are only off by a bit.",
                    "Unknown"
            ),
            new Quote(
                    "The nice thing about standards is that there are so many to choose from.",
                    "Unknown"
            ),
            new Quote(
                    "There are 3 kinds of people: those who can count and those who can’t.",
                    "Unknown"
            ),
            new Quote(
                    "There is no place like 127.0.0.1",
                    "Unknown"
            ),
            new Quote(
                    "There is nothing quite so permanent as a quick fix.",
                    "Unknown"
            ),
            new Quote(
                    "There’s no test like production.",
                    "Unknown"
            ),
            new Quote(
                    "To err is human, but for a real disaster you need a computer.",
                    "Unknown"
            ),
            new Quote(
                    "Ubuntu is an ancient African word, meaning \"can’t configure Debian\"",
                    "Unknown"
            ),
            new Quote(
                    "UNIX is the answer, but only if you phrase the question very carefully.",
                    "Unknown"
            ),
            new Quote(
                    "Usenet is a Mobius strand of spaghetti.",
                    "Unknown"
            ),
            new Quote(
                    "Weeks of coding can save you hours of planning.",
                    "Unknown"
            ),
            new Quote(
                    "When your computer starts falling apart, stop hitting it with a Hammer!",
                    "Unknown"
            ),
            new Quote(
                    "Who is General Failure? And why is he reading my disk?",
                    "Unknown"
            ),
            new Quote(
                    "You can stand on the shoulders of giants OR a big enough pile of dwarfs, works either way.",
                    "Unknown"
            ),
            new Quote(
                    "You start coding. I’ll go find out what they want.",
                    "Unknown"
            ),
            new Quote(
                    "I love deadlines. I like the whooshing sound they make as they fly by.",
                    "Douglas Adams"
            ),
            new Quote(
                    "I think we agree, the past is over.",
                    "George W. Bush"
            ),
            new Quote(
                    "In order to be irreplaceable, one must always be different.",
                    "Coco Chanel"
            ),
            new Quote(
                    "In the future everyone will be famous for fifteen minutes.",
                    "Andy Warhol"
            ),
            new Quote(
                    "In three words I can sum up everything I’ve learned about life: it goes on.",
                    "Robert Frost"
            ),
            new Quote(
                    "It is a mistake to think you can solve any major problems just with potatoes.",
                    "Douglas Adams"
            ),
            new Quote(
                    "It’s kind of fun to do the impossible.",
                    "Walt Disney"
            ),
            new Quote(
                    "Java is to JavaScript what Car is to Carpet.",
                    "Chris Heilmann"
            ),
            new Quote(
                    "Judge a man by his questions rather than by his answers.",
                    "Voltaire"
            ),
            new Quote(
                    "Just don’t create a file called -rf.",
                    "Larry Wall"
            ),
            new Quote(
                    "Knowledge is power.",
                    "Francis Bacon"
            ),
            new Quote(
                    "Let’s call it an accidental feature.",
                    "Larry Wall"
            ),
            new Quote(
                    "Linux is only free if your time has no value.",
                    "Jamie Zawinski"
            ),
            new Quote(
                    "Measuring programming progress by lines of code is like measuring aircraft building progress by weight.",
                    "Bill Gates"
            ),
            new Quote(
                    "Never trust a computer you can’t throw out a window.",
                    "Steve Wozniak"
            ),
            new Quote(
                    "Nobody expects the Spanish inquisition.",
                    "Monty Python"
            ),
            new Quote(
                    "On the Internet, nobody knows you’re a dog.",
                    "Peter Steiner"
            ),
            new Quote(
                    "One man’s constant is another man’s variable.",
                    "Alan J. Perlis"
            ),
            new Quote(
                    "People that hate cats will come back as mice in their next life.",
                    "Faith Resnick"
            ),
            new Quote(
                    "Perl - The only language that looks the same before and after RSA encryption.",
                    "Keith Bostic"
            ),
            new Quote(
                    "PHP – Yeah, you know me.",
                    "PHPaughty by PHPature"
            ),
            new Quote(
                    "The future is here. It is just not evenly distributed yet.",
                    "William Gibson"
            ),
            new Quote(
                    "The greatest performance improvement of all is when a system goes from not-working to working.",
                    "John Ousterhout"
            ),
            new Quote(
                    "Sour, sweet, bitter, pungent, all must be tasted.",
                    "Chinese Proverb"
            ),
            new Quote(
                    "Stay hungry, stay foolish.",
                    "Whole Earth Catalog"
            ),
            new Quote(
                    "The artist belongs to his work, not the work to the artist.",
                    "Novalis"
            ),
            new Quote(
                    "The only \"intuitive\" interface is the nipple. After that it’s all learned.",
                    "Bruce Ediger"
            ),
            new Quote(
                    "The only completely consistent people are the dead.",
                    "Aldous Huxley"
            ),
            new Quote(
                    "The problem with troubleshooting is that trouble shoots back.",
                    "Unknown Author"
            ),
            new Quote(
                    "The three great virtues of a programmer: laziness, impatience, and hubris.",
                    "Larry Wall"
            ),
            new Quote(
                    "Time is an illusion. Lunchtime doubly so.",
                    "Douglas Adams"
            ),
            new Quote(
                    "When debugging, novices insert corrective code; experts remove defective code.",
                    "Richard Pattis"
            ),
            new Quote(
                    "When in doubt, leave it out.",
                    "Joshua Bloch"
            ),
            new Quote(
                    "Walking on water and developing software from a specification are easy if both are frozen.",
                    "Edward V Berard"
            ),
            new Quote(
                    "We cannot learn without pain.",
                    "Aristotle"
            ),
            new Quote(
                    "We have always been shameless about stealing great ideas.",
                    "Steve Jobs"
            ),
            new Quote(
                    "You can kill a man but you can’t kill an idea.",
                    "Medgar Evers"
            ),
            new Quote(
                    "You can never underestimate the stupidity of the general public.",
                    "Scott Adams"
            ),
            new Quote(
                    "You must have chaos in your soul to give birth to a dancing star.",
                    "Friedrich Nietzsche"
            ),
            new Quote(
                    "Without requirements or design, programming is the art of adding bugs to an empty \"text\" file.",
                    "Louis Srygley"
            ),
            new Quote(
                    "Sometimes it pays to stay in bed on Monday, rather than spending the rest of the week debugging Monday’s code.",
                    "Dan Salomon"
            ),
            new Quote(
                    "You miss 100 percent of the shots you never take.",
                    "Wayne Gretzky"
            ),
            new Quote(
                    "One of the biggest problems that software developers face is that technology changes rapidly. It is very hard to stay current.",
                    "Vivek Wadhwa"
            ),
            new Quote(
                    "Ideas want to be ugly.",
                    "Jason Santa Maria"
            ),
            new Quote(
                    "Developer: an organism that turns coffee into code.",
                    "Unknown"
            ),
            new Quote(
                    "One man´s crappy software is another man´s full time job.",
                    "Jessica Gaston"
            ),
            new Quote(
                    "It´s okay to figure out murder mysteries, but you shouldn´t need to figure out code. You should be able to read it.",
                    "Steve McConnell"
            ),
            new Quote(
                    "Programming languages, like pizzas, come in only two sizes: too big and too small.",
                    "Richard Pattis"
            ),
            new Quote(
                    "Programming today is a race between software engineers striving to build bigger and better idiot-proof programs, and the universe trying to produce bigger and better idiots. So far, the universe is winning.",
                    "Rich Cook"
            ),
            new Quote(
                    "Plan to throw one (implementation) away; you will, anyhow.",
                    "Fred Brooks"
            ),
            new Quote(
                    "Every good work of software starts by scratching a developer´s personal itch",
                    "Unknown"
            ),
            new Quote(
                    "Perfection (in design) is achieved not when there is nothing more to add, but rather when there is nothing more to take away.",
                    "Antoine de Saint-Exupery"
            ),
            new Quote(
                    "Prolific programmers contribute to certain disaster.",
                    "Niklaus Wirth"
            ),
            new Quote(
                    "Programming can be fun, so can cryptography; however they should not be combined.",
                    "Kreitzberg and Shneiderman"
            ),
            new Quote(
                    "It´s better to wait for a productive programmer to become available than it is to wait for the first available programmer to become productive.",
                    "Steve McConnell"
            ),
            new Quote(
                    "An organization that treats its programmers as morons will soon have programmers that are willing and able to act like morons only.",
                    "Bjarne Stroustrup"
            ),
            new Quote(
                    "Real programmers can write assembly code in any language.",
                    "Larry Wall"
            ),
            new Quote(
                    "The key to performance is elegance, not battalions of special cases.",
                    "Jon Bentley, Doug McIlroy"
            ),
            new Quote(
                    "Inside every large program, there is a program trying to get out.",
                    "C.A.R. Hoare"
            ),
            new Quote(
                    "Why do we never have time to do it right, but always have time to do it over?",
                    "Unknown"
            ),
            new Quote(
                    "The goal of Computer Science is to build something that will last at least until we´ve finished building it. ",
                    "Unknown"
            ),
            new Quote(
                    "A good way to stay flexible is to write less code.",
                    "Pragmatic Programmer"
            ),
            new Quote(
                    "No matter what the problem is, it´s always a people problem.",
                    "Gerald M. Weinberg"
            ),
            new Quote(
                    "Every big computing disaster has come from taking too many ideas and putting them in one place.",
                    "Gordon Bell"
            ),
            new Quote(
                    "Adding manpower to a late software project makes it later!",
                    "Fred Brooks"
            ),
            new Quote(
                    "The best way to get a project done faster is to start sooner",
                    "Jim Highsmith"
            ),
            new Quote(
                    "Even the best planning is not so omniscient as to get it right the first time.",
                    "Fred Brooks"
            ),
            new Quote(
                    "All you need is love. But a new pair of shoes never hurt anybody.",
                    "Unknown"
            ),
            new Quote(
                    "The best revenge is massive success.",
                    "Frank Sinatra"
            ),
            new Quote(
                    "Reality itself is too obvious to be true.",
                    "Jean Baudrillard"
            ),
            new Quote(
                    "Be yourself; everyone else is already taken.",
                    "Oscar Wilde"
            ),
            new Quote(
                    "Let me just change this one line of code…",
                    "Unknown"
            ),
            new Quote(
                    "Fast, Good, Cheap. Pick two.",
                    "Unknown"
            ),
            new Quote(
                    "Did you know? The collective noun for a group of programmers is a merge-conflict.",
                    "Unknown"
            ),
            new Quote(
                    "If there is no struggle, there is no progress.",
                    "Frederick Douglass"
            ),
            new Quote(
                    "You have to learn the rules of the game. And then you have to play better than anyone else.",
                    "Albert Einstein"
            ),
            new Quote(
                    "Learn from yesterday, live for today, hope for tomorrow. The important thing is not to stop questioning.",
                    "Albert Einstein"
            ),
            new Quote(
                    "Insanity: doing the same thing over and over again and expecting different results.",
                    "Albert Einstein"
            ),
            new Quote(
                    "A person who never made a mistake never tried anything new.",
                    "Albert Einstein"
            ),
            new Quote(
                    "Logic will get you from A to B. Imagination will take you everywhere.",
                    "Albert Einstein"
            ),
            new Quote(
                    "When the solution is simple, God is answering.",
                    "Albert Einstein"
            ),
            new Quote(
                    "If you can´t explain it simply, you don´t understand it well enough.",
                    "Albert Einstein"
            ),
            new Quote(
                    "If the facts don´t fit the theory, change the facts.",
                    "Albert Einstein"
            ),
            new Quote(
                    "It is a miracle that curiosity survives formal education.",
                    "Albert Einstein"
            ),
            new Quote(
                    "I only believe in statistics that I doctored myself.",
                    "Winston S. Churchill?"
            ),
            new Quote(
                    "Men and nations behave wisely when they have exhausted all other resources.",
                    "Abba Eban"
            ),
            new Quote(
                    "If you´re going through hell, keep going.",
                    "Unknown"
            ),
            new Quote(
                    "Success is not forever and failure isn´t fatal.",
                    "Don Shula"
            ),
            new Quote(
                    "I have never let my schooling interfere with my education.",
                    "Mark Twain"
            ),
            new Quote(
                    "The secret of getting ahead is getting started.",
                    "Mark Twain"
            ),
            new Quote(
                    "Get your facts first, then you can distort them as you please.",
                    "Mark Twain"
            ),
            new Quote(
                    "Apparently there is nothing that cannot happen today.",
                    "Mark Twain"
            ),
            new Quote(
                    "Plans are worthless, but planning is everything.",
                    "Dwight D. Eisenhower"
            ),
            new Quote(
                    "Before you marry a person you should first make them use a computer with slow Internet to see who they really are.",
                    "Will Ferrell"
            ),
            new Quote(
                    "I just invent, then wait until man comes around to needing what I´ve invented.",
                    "R. Buckminster Fuller"
            ),
            new Quote(
                    "The best way to make your dreams come true is to wake up.",
                    "Muriel Siebert"
            ),
            new Quote(
                    "If you can't write it down in English, you can't code it.",
                    "Peter Halpern"
            ),
            new Quote(
                    "Suspicion is healthy. It’ll keep you alive.",
                    "Laurell K. Hamilton"
            ),
            new Quote(
                    "People that hate cats will come back as mice in their next life.",
                    "Faith Resnick"
            ),
            new Quote(
                    "If your parents never had children, chances are you won’t, either.",
                    "Dick Cavett"
            ),
            new Quote(
                    "Sometimes I think we´re alone in the universe & sometimes I think we´re not. In either case the idea is quite staggering",
                    "Arthur C. Clarke"
            ),
            new Quote(
                    "Talk is cheap, show me the code!",
                    "Linus Torvalds"
            ),
            new Quote(
                    "They did not know it was impossible, so they did it!",
                    "Mark Twain"
            ),
            new Quote(
                    "You are what you share.",
                    "Charles Leadbeater"
            ),
            new Quote(
                    "You want it in one line? Does it have to fit in 80 columns?",
                    "Larry Wall"
            ),
            new Quote(
                    "The Internet? Is that thing still around?",
                    "Homer Simpson"
            ),
            new Quote(
                    "The journey is the destination.",
                    "Dan Eldon"
            ),
            new Quote(
                    "OO programming offers a sustainable way to write spaghetti code. It lets you accrete programs as a series of patches.",
                    "Paul Graham"
            ),
            new Quote(
                    "Ruby is rubbish! PHP is phpantastic!",
                    "Nikita Popov"
            ),
            new Quote(
                    "So long and thanks for all the fish!",
                    "Douglas Adams"
            ),
            new Quote(
                    "If I had more time, I would have written a shorter letter.",
                    "Cicero"
            ),
            new Quote(
                    "The best reaction to \"this is confusing, where are the docs\" is to rewrite the feature to make it less confusing, not write more docs.",
                    "Jeff Atwood"
            ),
            new Quote(
                    "The older I get, the more I believe that the only way to become a better programmer is by not programming.",
                    "Jeff Atwood"
            ),
            new Quote(
                    "\"That hardly ever happens\" is another way of saying \"it happens\".",
                    "Douglas Crockford"
            ),
            new Quote(
                    "Hello, PHP, my old friend.",
                    "Anna Debenham"
            ),
            new Quote(
                    "Organizations which design systems are constrained to produce designs which are copies of the communication structures of these organizations.",
                    "Melvin Conway"
            ),
            new Quote(
                    "In design, complexity is toxic.",
                    "Melvin Conway"
            ),
            new Quote(
                    "Good is the enemy of great, but great is the enemy of shipped.",
                    "Jeffrey Zeldman"
            ),
            new Quote(
                    "Don't make the user provide information that the system already knows.",
                    "Rick Lemons"
            ),
            new Quote(
                    "You're bound to be unhappy if you optimize everything.",
                    "Donald E. Knuth"
            ),
            new Quote(
                    "If the programmers like each other, they play a game called 'pair programming'. And if not then the game is called 'peer review'.",
                    "Anna Nachesa"
            ),
            new Quote(
                    "Simplicity is prerequisite for reliability.",
                    "Edsger W. Dijkstra"
            ),
            new Quote(
                    "Focus on WHY instead of WHAT in your code will make you a better developer",
                    "Jordi Boggiano"
            ),
            new Quote(
                    "The best engineers I know are artists at heart. The best designers I know are secretly technicians as well.",
                    "Andrei Herasimchuk"
            ),
            new Quote(
                    "Poor management can increase software costs more rapidly than any other factor.",
                    "Barry Boehm"
            ),
            new Quote(
                    "If you can't deploy your services independently then they aren't microservices.",
                    "Daniel Bryant"
            ),
            new Quote(
                    "If you can't deploy your services independently then they aren't microservices.",
                    "Daniel Bryant"
            ),
            new Quote(
                    "No one hates software more than software developers.",
                    "Jeff Atwood"
            ),
            new Quote(
                    "The proper use of comments is to compensate for our failure to express ourself in code.",
                    "Robert C. Martin"
            ),
            new Quote(
                    "Code is like humor. When you have to explain it, it's bad.",
                    "Cory House"
            ),
            new Quote(
                    "Fix the cause, not the symptom.",
                    "Steve Maguire"
            ),
            new Quote(
                    "People will realize that software is not a product; you use it to build a product.",
                    "Linus Torvalds"
            ),
            new Quote(
                    "Design is choosing how you will fail.",
                    "Ron Fein"
            ),
            new Quote(
                    "Focus is saying no to 1000 good ideas.",
                    "Steve Jobs"
            ),
            new Quote(
                    "Code never lies, comments sometimes do.",
                    "Ron Jeffries"
            ),
            new Quote(
                    "Be careful with each other, so you can be dangerous together.",
                    "Unknown"
            ),
            new Quote(
                    "When making a PR to a major project, you have to 'sell' that feature/contribution. You have to be convincing on why it belongs there. The maintainer is going to be the one babysitting that code forever.",
                    "Taylor Otwell"
            ),
            new Quote(
                    "Be the change you wish was made. Share the lessons you wish you'd been taught. Make the sacrifices you wish others had made.",
                    "David Heinemeier Hansson"
            ),
            new Quote(
                    "The only way to achieve flexibility is to make things as simple and easy to change as you can.",
                    "Casey Brant"
            )

    );

}
