package uz.gita.testappkotlin.repository

import android.util.Log
import uz.gita.testappkotlin.model.TestData

class AppRepository() {

    private val MAX_COUNT: Int = 15
    private var list: MutableList<TestData> = ArrayList()
    var test: MutableList<TestData> = ArrayList()
    private var userAnswers: MutableList<String> = ArrayList()

    init {
        loadTest()
    }

    companion object {
        private lateinit var instance: AppRepository
        fun getInstance(): AppRepository {
            if (!(::instance.isInitialized))
                instance = AppRepository()
            return instance
        }
    }

    private fun loadTest() {
        list.add(
            TestData(
                "What is the correct spelling?",
                "Occasion",
                "Ocassion",
                "Ocasion",
                "Occassion",
                "Occasion"
            )
        )
        list.add(
            TestData(
                "Which word means 'not common'?",
                "Unique",
                "Common",
                "Normal",
                "Ordinary",
                "Unique"
            )
        )
        list.add(
            TestData(
                "What is the opposite of 'increase'?",
                "Decrease",
                "Maintain",
                "Improve",
                "Expand",
                "Decrease"
            )
        )
        list.add(
            TestData(
                "Which of the following is a synonym for 'generous'?",
                "Benevolent",
                "Selfish",
                "Greedy",
                "Stingy",
                "Benevolent"
            )
        )
        list.add(
            TestData(
                "What is the plural form of 'child'?",
                "Children",
                "Childs",
                "Childes",
                "Childies",
                "Children"
            )
        )
        list.add(
            TestData(
                "Which sentence is grammatically correct?",
                "I haven't seen her since yesterday.",
                "I didn't saw her since yesterday.",
                "I haven't saw her since yesterday.",
                "I didn't seen her since yesterday.",
                "I haven't seen her since yesterday."
            )
        )
        list.add(
            TestData(
                "What is the past tense of 'eat'?",
                "Ate",
                "Eated",
                "Eaten",
                "Eatened",
                "Ate"
            )
        )
        list.add(
            TestData(
                "Which word means 'a person who designs buildings'?",
                "Architect",
                "Engineer",
                "Plumber",
                "Electrician",
                "Architect"
            )
        )
        list.add(
            TestData(
                "What is the correct order of adjectives?",
                "Opinion, size, age, shape, color, origin, material, purpose",
                "Size, opinion, age, shape, color, origin, material, purpose",
                "Opinion, size, shape, age, color, origin, purpose, material",
                "Size, opinion, shape, age, color, origin, purpose, material",
                "Opinion, size, age, shape, color, origin, material, purpose"
            )
        )
        list.add(
            TestData(
                "What is the correct form of the verb 'to be' in the present tense?",
                "Am, is, are",
                "Be, been, being",
                "Was, were",
                "Has, have, had",
                "Am, is, are"
            )
        )
        list.add(
            TestData(
                "What is the opposite of 'easy'?",
                "Difficult",
                "Simple",
                "Complicated",
                "Hard",
                "Difficult"
            )
        )
        list.add(
            TestData(
                "Which word means 'to take away'?",
                "Subtract",
                "Add",
                "Multiply",
                "Divide",
                "Subtract"
            )
        )
        list.add(
            TestData(
                "Which sentence is grammatically correct?",
                "I like to read books.",
                "I likes to read books.",
                "I like to reads books.",
                "I liking to read books.",
                "I like to read books."
            )
        )
        list.add(
            TestData(
                "Which word means 'to make less severe or intense'?",
                "Mitigate",
                "Aggravate",
                "Intensify",
                "Escalate",
                "Mitigate"
            )
        )
        list.add(
            TestData(
                "What is the plural form of 'goose'?",
                "Geese",
                "Gooses",
                "Geeses",
                "Goose",
                "Geese"
            )
        )
        list.add(
            TestData(
                "What is the correct form of the verb 'to have' in the past tense?",
                "Had",
                "Has",
                "Have",
                "Having",
                "Had"
            )
        )
        list.add(
            TestData(
                "Which of the following is a synonym for 'enormous'?",
                "Huge",
                "Tiny",
                "Small",
                "Minute",
                "Huge"
            )
        )
        list.add(
            TestData(
                "Which word means 'able to be seen through'?",
                "Transparent",
                "Opaque",
                "Translucent",
                "Solid",
                "Transparent"
            )
        )
        list.add(
            TestData(
                "What is the opposite of 'expand'?",
                "Contract",
                "Expandable",
                "Enlarge",
                "Extend",
                "Contract"
            )
        )
        list.add(
            TestData(
                "Which word means 'something that can be used to achieve a goal or purpose'?",
                "Tool",
                "Weapon",
                "Equipment",
                "Machine",
                "Tool"
            )
        )
        list.add(
            TestData(
                "What is the plural form of 'ox'?",
                "Oxen",
                "Oxes",
                "Oxies",
                "Oxals",
                "Oxen"
            )
        )
        list.add(
            TestData(
                "Which sentence is grammatically correct?",
                "I have been waiting for two hours.",
                "I have been waited for two hours.",
                "I have waited for two hours.",
                "I waited for two hours.",
                "I have been waiting for two hours."
            )
        )
        list.add(
            TestData(
                "What is the past tense of 'speak'?",
                "Spoke",
                "Speak",
                "Spoken",
                "Speaked",
                "Spoke"
            )
        )
        list.add(
            TestData(
                "Which word means 'a person who is not professional in a particular activity'?",
                "Amateur",
                "Expert",
                "Professional",
                "Novice",
                "Amateur"
            )
        )
        list.add(
            TestData(
                "What is the correct form of the verb 'to be' in the past tense?",
                "Was, were",
                "Be, been, being",
                "Am, is, are",
                "Has, have, had",
                "Was, were"
            )
        )
        list.add(
            TestData(
                "What is the correct spelling?",
                "Relevant",
                "Relevent",
                "Relevannt",
                "Relebent",
                "Relevant"
            )
        )
        list.add(
            TestData(
                "Which word means 'a place where plants are grown for sale or display'?",
                "Nursery",
                "Greenhouse",
                "Garden",
                "Park",
                "Nursery"
            )
        )
        list.add(
            TestData(
                "What is the opposite of 'accept'?",
                "Reject",
                "Adopt",
                "Acceptance",
                "Adapt",
                "Reject"
            )
        )
        list.add(
            TestData(
                "Which word means 'to move something from one place to another'?",
                "Transport",
                "Transmit",
                "Transform",
                "Transplant",
                "Transport"
            )
        )
        list.add(
            TestData(
                "Which sentence is grammatically correct?",
                "He is taller than she is.",
                "He is taller than her.",
                "Him is taller than she.",
                "He is taller than she.",
                "He is taller than she is."
            )
        )
        list.add(
            TestData(
                "What is the past tense of 'take'?",
                "Took",
                "Taken",
                "Taked",
                "Take",
                "Took"
            )
        )
        list.add(
            TestData(
                "Which word means 'having an excessive pride in oneself'?",
                "Vain",
                "Modest",
                "Humble",
                "Shy",
                "Vain"
            )
        )
        list.add(
            TestData(
                "Which word means 'to make better'?",
                "Enhance",
                "Worsen",
                "Deteriorate",
                "Hinder",
                "Enhance"
            )
        )
        list.add(
            TestData(
                "What is the correct form of the verb 'to do' in the present tense?",
                "Do, does",
                "Did, done",
                "Doing, done",
                "Does, did",
                "Do, does"
            )
        )
        list.add(
            TestData(
                "Which sentence is grammatically correct?",
                "She is taller than her sister.",
                "She is taller then her sister.",
                "She is taller then her sisters.",
                "She is taller than her sisters.",
                "She is taller than her sister."
            )
        )
        list.add(
            TestData(
                "What is the opposite of 'brave'?",
                "Cowardly",
                "Fearless",
                "Bold",
                "Courageous",
                "Cowardly"
            )
        )
        list.add(
            TestData(
                "What is the past participle of 'see'?",
                "Seen",
                "Saw",
                "Seened",
                "Seeing",
                "Seen"
            )
        )
        list.add(
            TestData(
                "Which word means 'to approve of'?",
                "Endorse",
                "Oppose",
                "Reject",
                "Deny",
                "Endorse"
            )
        )
        list.add(
            TestData(
                "What is the correct form of the verb 'to go' in the past tense?",
                "Went",
                "Goed",
                "Gone",
                "Going",
                "Went"
            )
        )
        list.add(
            TestData(
                "Which sentence is grammatically correct?",
                "The book is on the table.",
                "The table is on the book.",
                "On the table is the book.",
                "On the book is the table.",
                "The book is on the table."
            )
        )
        list.add(
            TestData(
                "What is the correct spelling?",
                "Embarrass",
                "Embarass",
                "Embaras",
                "Embarras",
                "Embarrass"
            )
        )
        list.add(
            TestData(
                "Which word means 'to give up'?",
                "Abandon",
                "Retain",
                "Maintain",
                "Sustain",
                "Abandon"
            )
        )
        list.add(
            TestData(
                "What is the correct form of the verb 'to have' in the present tense?",
                "Have, has",
                "Had, having",
                "Have, had",
                "Has, had",
                "Have, has"
            )
        )
        list.add(
            TestData(
                "What is the opposite of 'begin'?",
                "End",
                "Start",
                "Continue",
                "Finish",
                "End"
            )
        )
        list.add(
            TestData(
                "Which word means 'to make something happen'?",
                "Cause",
                "Prevent",
                "Avoid",
                "Hinder",
                "Cause"
            )
        )
        list.add(
            TestData(
                "What is the plural form of 'mouse'?",
                "Mice",
                "Mouses",
                "Miceys",
                "Mousen",
                "Mice"
            )
        )
        list.add(
            TestData(
                "Which sentence is grammatically correct?",
                "They are eating dinner.",
                "They is eating dinner.",
                "They am eating dinner.",
                "They be eating dinner.",
                "They are eating dinner."
            )
        )
        list.add(
            TestData(
                "What is the correct form of the verb 'to go' in the present tense?",
                "Go, goes",
                "Went, going",
                "Go, going",
                "Goes, went",
                "Go, goes"
            )
        )
        list.add(
            TestData(
                "Which of the following words means 'friendly and cheerful'?",
                "Amiable",
                "Grumpy",
                "Sullen",
                "Morose",
                "Amiable"
            )
        )
        list.add(
            TestData(
                "What is the correct order of the words in this sentence? 'She walked slowly down the street.'",
                "She walked slowly down the street.",
                "She down the street walked slowly.",
                "Slowly she walked down the street.",
                "Down the street slowly she walked.",
                "She walked slowly down the street."
            )
        )
        list.add(
            TestData(
                "What is the past participle of the verb 'go'?",
                "Gone",
                "Went",
                "Going",
                "Goes",
                "Gone"
            )
        )
        list.add(
            TestData(
                "Which of the following is an antonym for 'brave'?",
                "Timid",
                "Fearless",
                "Confident",
                "Courageous",
                "Timid"
            )
        )
        list.add(
            TestData(
                "What is the plural form of 'foot'?",
                "Feet",
                "Foots",
                "Footies",
                "Footes",
                "Feet"
            )
        )
        list.add(
            TestData(
                "Which word means 'able to be believed'?",
                "Credible",
                "Incredible",
                "Unbelievable",
                "Implausible",
                "Credible"
            )
        )
        list.add(
            TestData(
                "Which sentence is grammatically correct?",
                "They are going to the store.",
                "They is going to the store.",
                "They am going to the store.",
                "They be going to the store.",
                "They are going to the store."
            )
        )
        list.add(
            TestData(
                "What is the comparative form of 'happy'?",
                "Happier",
                "Happiest",
                "More happy",
                "Happyer",
                "Happier"
            )
        )
        list.add(
            TestData(
                "Which word means 'to come to a decision'?",
                "Decide",
                "Consider",
                "Procrastinate",
                "Deliberate",
                "Decide"
            )
        )
        list.add(
            TestData(
                "What is the correct form of the verb 'to be' in the future tense?",
                "Will be, shall be",
                "Is, am, are",
                "Be, been, being",
                "Has, have, had",
                "Will be, shall be"
            )
        )
        list.add(
            TestData(
                "What is the superlative form of 'interesting'?",
                "Most interesting",
                "Interestingest",
                "More interesting",
                "Interestinger",
                "Most interesting"
            )
        )
        list.add(
            TestData(
                "What is the correct spelling?",
                "Embarrassment",
                "Embarassment",
                "Embarrasment",
                "Embarasment",
                "Embarrassment"
            )
        )
        list.add(
            TestData(
                "What is the opposite of 'diligent'?",
                "Lazy",
                "Hardworking",
                "Productive",
                "Industrious",
                "Lazy"
            )
        )
        list.add(
            TestData(
                "Which word means 'to make something smaller'?",
                "Reduce",
                "Increase",
                "Magnify",
                "Enlarge",
                "Reduce"
            )
        )
        list.add(
            TestData(
                "Which of the following is a synonym for 'diligent'?",
                "Hardworking",
                "Lazy",
                "Unmotivated",
                "Bored",
                "Hardworking"
            )
        )
        list.add(
            TestData(
                "What is the opposite of 'impressive'?",
                "Unimpressive",
                "Impressive",
                "Inspiring",
                "Remarkable",
                "Unimpressive"
            )
        )
        list.add(
            TestData(
                "Which sentence is grammatically correct?",
                "She is taller than I am.",
                "She is taller than me.",
                "She is taller than I.",
                "She is taller than myself.",
                "She is taller than I am."
            )
        )
        list.add(
            TestData(
                "Which word means 'a place where books are kept'?",
                "Library",
                "Museum",
                "Cinema",
                "Gallery",
                "Library"
            )
        )
        list.add(
            TestData(
                "Which word means 'a sudden increase in something'?",
                "Surge",
                "Decline",
                "Plunge",
                "Dip",
                "Surge"
            )
        )
        list.add(
            TestData(
                "Which of the following is a synonym for 'insightful'?",
                "Perceptive",
                "Unobservant",
                "Narrow-minded",
                "Uninspired",
                "Perceptive"
            )
        )
        list.add(
            TestData(
                "What is the correct spelling?",
                "Convenient",
                "Conveinient",
                "Convinient",
                "Conveneint",
                "Convenient"
            )
        )
        list.add(
            TestData(
                "What is the past tense of the verb 'run'?",
                "runned",
                "runned",
                "ran",
                "runn",
                "ran"
            )
        )
        list.add(
            TestData(
                "What is the plural form of the noun 'child'?",
                "childs",
                "childes",
                "child's",
                "children",
                "children"
            )
        )
        list.add(
            TestData(
                "Which word is an adverb?",
                "quiet",
                "quietly",
                "quietness",
                "quieting",
                "quietly"
            )
        )
        list.add(
            TestData(
                "Which sentence is in the present perfect tense?",
                "I will visit my grandparents tomorrow.",
                "I visited my grandparents yesterday.",
                "I have visited my grandparents twice this year.",
                "I am visiting my grandparents right now.",
                "I have visited my grandparents twice this year."
            )
        )
        list.add(
            TestData(
                "What is the opposite of the adjective 'hot'?",
                "cold",
                "warm",
                "freezing",
                "boiling",
                "cold"
            )
        )
        list.add(
            TestData(
                "Which sentence is grammatically correct?",
                "Me and my friend went to the store.",
                "My friend and I went to the store.",
                "I and my friend went to the store.",
                "My friend and me went to the store.",
                "My friend and I went to the store."
            )
        )
        list.add(TestData("Which word is a pronoun?", "book", "teacher", "she", "classroom", "she"))
        list.add(
            TestData(
                "What is the comparative form of the adjective 'good'?",
                "gooder",
                "more good",
                "better",
                "best",
                "better"
            )
        )
        list.add(
            TestData(
                "Which sentence has a subject-verb agreement error?",
                "The dogs barks loudly.",
                "The dog bark loudly.",
                "The dogs bark loudly.",
                "The dog barks loudly.",
                "The dogs bark loudly."
            )
        )
        list.add(
            TestData(
                "What is the opposite of 'generous'?",
                "Selfish",
                "Friendly",
                "Happy",
                "Smart",
                "Selfish"
            )
        )
        list.add(
            TestData(
                "What is the meaning of 'obscure'?",
                "Clear",
                "Unusual",
                "Mysterious",
                "Fun",
                "Mysterious"
            )
        )
        list.add(
            TestData(
                "Which of the following is not a modal verb?",
                "May",
                "Should",
                "Do",
                "Can",
                "Do"
            )
        )
        list.add(
            TestData(
                "What is the past tense of 'read'?",
                "Read",
                "Red",
                "Rode",
                "Ridden",
                "Read"
            )
        )
        list.add(
            TestData(
                "What is the superlative form of 'happy'?",
                "Happier",
                "Happiest",
                "More happy",
                "Most happy",
                "Happiest"
            )
        )
        list.add(
            TestData(
                "What is the opposite of 'confident'?",
                "Anxious",
                "Proud",
                "Hopeful",
                "Sure",
                "Anxious"
            )
        )
        list.add(
            TestData(
                "What is the correct word order in a question?",
                "Verb + Subject + Object",
                "Object + Subject + Verb",
                "Subject + Object + Verb",
                "Verb + Object + Subject",
                "Subject + Object + Verb"
            )
        )
        list.add(
            TestData(
                "What is the correct preposition to use with 'interested'?",
                "In",
                "On",
                "At",
                "With",
                "In"
            )
        )
        list.add(
            TestData(
                "Which of the following words means 'a sudden desire or change of mind'?",
                "resilient",
                "impulsive",
                "intrepid",
                "stalwart",
                "impulsive"
            )
        )
        list.add(
            TestData(
                "What is the correct way to address a person in a formal letter?",
                "Hey John,",
                "Dear Mr. Smith,",
                "Hi there,",
                "To Whom It May Concern,",
                "Dear Mr. Smith,"
            )
        )
        list.add(
            TestData(
                "Which of the following words means 'the quality of being honest and having strong moral principles'?",
                "ethics",
                "integrity",
                "sincerity",
                "veracity",
                "integrity"
            )
        )
        list.add(
            TestData(
                "Which of the following is a synonym for 'loquacious'?",
                "talkative",
                "silent",
                "reserved",
                "shy",
                "talkative"
            )
        )
        list.add(
            TestData(
                "What is the meaning of the word 'ambivalent'?",
                "Having mixed feelings or contradictory ideas",
                "To be completely certain of something",
                "To have no opinion on something",
                "To be happy and carefree",
                "Having mixed feelings or contradictory ideas"
            )
        )
        list.add(
            TestData(
                "Which of the following is a preposition?",
                "Under",
                "Slowly",
                "Pencil",
                "Mice",
                "Under"
            )
        )
        list.add(
            TestData(
                "Which of the following is an idiom?",
                "Kick the bucket",
                "Greenhouse effect",
                "DNA sequence",
                "Electron microscope",
                "Kick the bucket"
            )
        )
        list.add(
            TestData(
                "What is the meaning of the word 'deliberate'?",
                "careless",
                "intentional",
                "casual",
                "random",
                "intentional"
            )
        )
        list.add(
            TestData(
                "Which of the following is NOT a common English preposition?",
                "on",
                "with",
                "for",
                "during",
                "during"
            )
        )
        list.add(
            TestData(
                "Which sentence is in the passive voice?",
                "The teacher corrected the student's paper.",
                "The student's paper was corrected by the teacher.",
                "The student corrected the teacher's mistake.",
                "The teacher asked the student a question.",
                "The student's paper was corrected by the teacher."
            )
        )
        list.add(
            TestData(
                "Which sentence has a relative clause?",
                "I saw the movie last night.",
                "The book, which I read last week, was very good.",
                "She likes to eat pizza.",
                "He plays the guitar.",
                "The book, which I read last week, was very good."
            )
        )
        list.add(
            TestData(
                "What does the word 'perplexed' mean?",
                "confused",
                "happy",
                "calm",
                "excited",
                "confused"
            )
        )
        list.add(
            TestData(
                "What is the meaning of the idiom 'let the cat out of the bag'?",
                "to reveal a secret",
                "to play with a cat",
                "to buy a cat",
                "to trap a cat",
                "to reveal a secret"
            )
        )
        list.add(
            TestData(
                "What is the meaning of the phrasal verb 'put up with'?",
                "to tolerate",
                "to put away",
                "to put up",
                "to put in",
                "to tolerate"
            )
        )

    }
    private fun shuffle(){
        list.shuffle()
    }
    fun getTotalCount() : Int = MAX_COUNT
    fun getNeededDataByCount(count : Int) : MutableList<TestData> {
        shuffle()
        test = list.subList(0,count)
        return test
    }
    fun createNewList(){
        userAnswers = ArrayList()
    }
    fun saveUserAnswer(userAnswer : String) {
        if (userAnswers.size == 15)
            createNewList()
        userAnswers.add(userAnswer)
    }
    fun getUserAnswers() : MutableList<String> = userAnswers



}