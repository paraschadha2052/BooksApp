package com.example.android.booksapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final String SAMPLE_JSON = "{\n" +
            " \"kind\": \"books#volumes\",\n" +
            " \"totalItems\": 115,\n" +
            " \"items\": [\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"pIs9Em38dAoC\",\n" +
            "   \"etag\": \"OSXSh+WazoA\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/pIs9Em38dAoC\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"The Play of Daniel Keyes' Flowers for Algernon\",\n" +
            "    \"authors\": [\n" +
            "     \"Bert Coules\",\n" +
            "     \"Daniel Keyes\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Heinemann\",\n" +
            "    \"publishedDate\": \"1993\",\n" +
            "    \"description\": \"The Heinemann Plays series offers contemporary drama and classic plays in durable classroom editions. Many have large casts and an equal mix of boy and girl parts. This play is a dramatization of Daniel Keyes's story about a retarded adult who desperately wants to be able to read and write.\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"0435232932\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9780435232931\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": false,\n" +
            "     \"image\": true\n" +
            "    },\n" +
            "    \"pageCount\": 128,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"English drama\"\n" +
            "    ],\n" +
            "    \"averageRating\": 4.5,\n" +
            "    \"ratingsCount\": 3,\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"preview-1.0.0\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=pIs9Em38dAoC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=pIs9Em38dAoC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.co.in/books?id=pIs9Em38dAoC&pg=PP12&dq=flowers+inauthor:keyes&hl=&cd=1&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.co.in/books?id=pIs9Em38dAoC&dq=flowers+inauthor:keyes&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"http://books.google.co.in/books/about/The_Play_of_Daniel_Keyes_Flowers_for_Alg.html?hl=&id=pIs9Em38dAoC\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"viewability\": \"PARTIAL\",\n" +
            "    \"embeddable\": true,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://books.google.co.in/books/reader?id=pIs9Em38dAoC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"SAMPLE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"\\u003cb\\u003eFlowers\\u003c/b\\u003e for Algernon Daniel Keyes writes: &#39;The idea for \\u003cb\\u003eFlowers\\u003c/b\\u003e for Algernon \\u003cbr\\u003e\\ncame to me many years before I wrote the story or the novel. &#39;What would happen \\u003cbr\\u003e\\nif it were possible to increase human intelligence artificially?&#39; Charlie Gordon is \\u003cbr\\u003e\\nnot&nbsp;...\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"gK98gXR8onwC\",\n" +
            "   \"etag\": \"WyAw7i28CR8\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/gK98gXR8onwC\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"Flowers for Algernon\",\n" +
            "    \"subtitle\": \"One Act\",\n" +
            "    \"authors\": [\n" +
            "     \"David Rogers\",\n" +
            "     \"Daniel Keyes\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Dramatic Publishing\",\n" +
            "    \"publishedDate\": \"1969\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"0871293870\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9780871293879\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": false,\n" +
            "     \"image\": true\n" +
            "    },\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"0.0.1.0.preview.1\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=gK98gXR8onwC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=gK98gXR8onwC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.co.in/books?id=gK98gXR8onwC&pg=PA3&dq=flowers+inauthor:keyes&hl=&cd=2&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.co.in/books?id=gK98gXR8onwC&dq=flowers+inauthor:keyes&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"http://books.google.co.in/books/about/Flowers_for_Algernon.html?hl=&id=gK98gXR8onwC\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"viewability\": \"PARTIAL\",\n" +
            "    \"embeddable\": true,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://books.google.co.in/books/reader?id=gK98gXR8onwC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"SAMPLE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"\\u003cb\\u003eFLOWERS\\u003c/b\\u003e. FOR. ALGERNON. A One-act Play For Four Men And One Woman* \\u003cbr\\u003e\\nCHARACTERS DR. STRAUSS a young neurosurgeon PROFESSOR NEMUR his \\u003cbr\\u003e\\nolder colleague ALICE KINNIAN a young, dedicated teacher BURT SELDON a&nbsp;...\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"8Pr_kLFxciYC\",\n" +
            "   \"etag\": \"xbYU78dQ+tM\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/8Pr_kLFxciYC\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"Flowers For Algernon\",\n" +
            "    \"authors\": [\n" +
            "     \"Daniel Keyes\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Hachette UK\",\n" +
            "    \"publishedDate\": \"2012-11-15\",\n" +
            "    \"description\": \"The classic novel about a daring experiment in human intelligence Charlie Gordon, IQ 68, is a floor sweeper and the gentle butt of everyone's jokes - until an experiment in the enhancement of human intelligence turns him into a genius. But then Algernon, the mouse whose triumphal experimental transformation preceded his, fades and dies, and Charlie has to face the possibility that his salvation was only temporary.\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9780575088498\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"0575088494\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": true,\n" +
            "     \"image\": false\n" +
            "    },\n" +
            "    \"pageCount\": 224,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Fiction\"\n" +
            "    ],\n" +
            "    \"averageRating\": 4.5,\n" +
            "    \"ratingsCount\": 11,\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": true,\n" +
            "    \"contentVersion\": \"0.7.8.0.preview.2\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=8Pr_kLFxciYC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=8Pr_kLFxciYC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.co.in/books?id=8Pr_kLFxciYC&pg=PT173&dq=flowers+inauthor:keyes&hl=&cd=3&source=gbs_api\",\n" +
            "    \"infoLink\": \"https://play.google.com/store/books/details?id=8Pr_kLFxciYC&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-8Pr_kLFxciYC\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"saleability\": \"FOR_SALE\",\n" +
            "    \"isEbook\": true,\n" +
            "    \"listPrice\": {\n" +
            "     \"amount\": 505.0,\n" +
            "     \"currencyCode\": \"INR\"\n" +
            "    },\n" +
            "    \"retailPrice\": {\n" +
            "     \"amount\": 252.5,\n" +
            "     \"currencyCode\": \"INR\"\n" +
            "    },\n" +
            "    \"buyLink\": \"https://play.google.com/store/books/details?id=8Pr_kLFxciYC&rdid=book-8Pr_kLFxciYC&rdot=1&source=gbs_api\",\n" +
            "    \"offers\": [\n" +
            "     {\n" +
            "      \"finskyOfferType\": 1,\n" +
            "      \"listPrice\": {\n" +
            "       \"amountInMicros\": 5.05E8,\n" +
            "       \"currencyCode\": \"INR\"\n" +
            "      },\n" +
            "      \"retailPrice\": {\n" +
            "       \"amountInMicros\": 2.525E8,\n" +
            "       \"currencyCode\": \"INR\"\n" +
            "      }\n" +
            "     }\n" +
            "    ]\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"viewability\": \"PARTIAL\",\n" +
            "    \"embeddable\": true,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED_FOR_ACCESSIBILITY\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": true,\n" +
            "     \"acsTokenLink\": \"http://books.google.co.in/books/download/Flowers_For_Algernon-sample-epub.acsm?id=8Pr_kLFxciYC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://books.google.co.in/books/reader?id=8Pr_kLFxciYC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"SAMPLE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"Charlie is drawing me down into myself. I stare inward in the center of my \\u003cbr\\u003e\\nunseeing eye at the red spot that transforms itself into a multipetaled \\u003cb\\u003eflower\\u003c/b\\u003e – the \\u003cbr\\u003e\\nshimmering, swirling, luminescent \\u003cb\\u003eflower\\u003c/b\\u003e that lies deep in the core of my \\u003cbr\\u003e\\nunconscious.\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"LRlCAAAAYAAJ\",\n" +
            "   \"etag\": \"2EYFUPgW/Qk\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/LRlCAAAAYAAJ\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"Some Environmental Factors Influencing Bud Formation, Abscission and Flower Production of Gardenias\",\n" +
            "    \"authors\": [\n" +
            "     \"Curtis Gilbert Keyes\"\n" +
            "    ],\n" +
            "    \"publishedDate\": \"1946\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"OTHER\",\n" +
            "      \"identifier\": \"CORNELL:31924002987646\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": false,\n" +
            "     \"image\": false\n" +
            "    },\n" +
            "    \"pageCount\": 190,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Gardenia\"\n" +
            "    ],\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"preview-1.0.0\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=LRlCAAAAYAAJ&printsec=frontcover&img=1&zoom=5&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=LRlCAAAAYAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.co.in/books?id=LRlCAAAAYAAJ&q=flowers+inauthor:keyes&dq=flowers+inauthor:keyes&hl=&cd=4&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.co.in/books?id=LRlCAAAAYAAJ&dq=flowers+inauthor:keyes&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"http://books.google.co.in/books/about/Some_Environmental_Factors_Influencing_B.html?hl=&id=LRlCAAAAYAAJ\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"viewability\": \"NO_PAGES\",\n" +
            "    \"embeddable\": false,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://books.google.co.in/books/reader?id=LRlCAAAAYAAJ&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"NONE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"jQxIAQAAMAAJ\",\n" +
            "   \"etag\": \"nUzgZXZMlVQ\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/jQxIAQAAMAAJ\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"The Five Senses\",\n" +
            "    \"authors\": [\n" +
            "     \"Angela Mary Keyes\"\n" +
            "    ],\n" +
            "    \"publishedDate\": \"1911\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"OTHER\",\n" +
            "      \"identifier\": \"IOWA:31858006011708\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": false,\n" +
            "     \"image\": false\n" +
            "    },\n" +
            "    \"pageCount\": 252,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Senses and sensation\"\n" +
            "    ],\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"preview-1.0.0\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=jQxIAQAAMAAJ&printsec=frontcover&img=1&zoom=5&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=jQxIAQAAMAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.co.in/books?id=jQxIAQAAMAAJ&q=flowers+inauthor:keyes&dq=flowers+inauthor:keyes&hl=&cd=5&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.co.in/books?id=jQxIAQAAMAAJ&dq=flowers+inauthor:keyes&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"http://books.google.co.in/books/about/The_Five_Senses.html?hl=&id=jQxIAQAAMAAJ\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"viewability\": \"NO_PAGES\",\n" +
            "    \"embeddable\": false,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://books.google.co.in/books/reader?id=jQxIAQAAMAAJ&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"NONE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"In field and garden the \\u003cb\\u003eflowers\\u003c/b\\u003e no longer stood forth gaily in their brightest colors. \\u003cbr\\u003e\\nButtercups and daisies bent on their slender stalks and drew themselves together\\u003cbr\\u003e\\n. The pansies drooped and shrank and pulled together their velvet gowns.\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"oUwZAAAAYAAJ\",\n" +
            "   \"etag\": \"BckS6eAhEVY\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/oUwZAAAAYAAJ\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"Stories and Story-telling\",\n" +
            "    \"authors\": [\n" +
            "     \"Angela Mary Keyes\"\n" +
            "    ],\n" +
            "    \"publishedDate\": \"1911\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"OTHER\",\n" +
            "      \"identifier\": \"HARVARD:HN1R5W\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": false,\n" +
            "     \"image\": false\n" +
            "    },\n" +
            "    \"pageCount\": 286,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Children's stories\"\n" +
            "    ],\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"0.1.1.0.preview.0\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=oUwZAAAAYAAJ&printsec=frontcover&img=1&zoom=5&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=oUwZAAAAYAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.co.in/books?id=oUwZAAAAYAAJ&pg=PA100&dq=flowers+inauthor:keyes&hl=&cd=6&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.co.in/books?id=oUwZAAAAYAAJ&dq=flowers+inauthor:keyes&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"http://books.google.co.in/books/about/Stories_and_Story_telling.html?hl=&id=oUwZAAAAYAAJ\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"viewability\": \"NO_PAGES\",\n" +
            "    \"embeddable\": false,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": true\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://books.google.co.in/books/reader?id=oUwZAAAAYAAJ&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"NONE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"PDTD2hPNcjAC\",\n" +
            "   \"etag\": \"yyfNp10fy/A\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/PDTD2hPNcjAC\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"Algernon, Charlie, and I\",\n" +
            "    \"subtitle\": \"A Writer's Journey\",\n" +
            "    \"authors\": [\n" +
            "     \"Daniel Keyes\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Houghton Mifflin Harcourt\",\n" +
            "    \"publishedDate\": \"2004-09-01\",\n" +
            "    \"description\": \"In Flowers for Algernon, Daniel Keyes created an unlikely duo-a laboratory mouse and a man-who captured the hearts of millions of readers around the world. Now, in Algernon, Charlie, and I, Keyes reveals his methods of creating fiction as well as the heartbreaks and joys of being published. With admirable insight he shares with readers, writers, teachers, and students the creative life behind his classic novel, included here in its original short-story form. All those who love stories, storytelling, and the remarkable characters of Charlie and Algernon will delight in accompanying their creator on this inspirational voyage of discovery.\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9780547564081\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"0547564082\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": true,\n" +
            "     \"image\": true\n" +
            "    },\n" +
            "    \"pageCount\": 228,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Biography & Autobiography\"\n" +
            "    ],\n" +
            "    \"averageRating\": 4.5,\n" +
            "    \"ratingsCount\": 2,\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": true,\n" +
            "    \"contentVersion\": \"1.7.7.0.preview.3\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=PDTD2hPNcjAC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=PDTD2hPNcjAC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.co.in/books?id=PDTD2hPNcjAC&printsec=frontcover&dq=flowers+inauthor:keyes&hl=&cd=7&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.co.in/books?id=PDTD2hPNcjAC&dq=flowers+inauthor:keyes&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"http://books.google.co.in/books/about/Algernon_Charlie_and_I.html?hl=&id=PDTD2hPNcjAC\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"viewability\": \"PARTIAL\",\n" +
            "    \"embeddable\": true,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": true,\n" +
            "     \"acsTokenLink\": \"http://books.google.co.in/books/download/Algernon_Charlie_and_I-sample-epub.acsm?id=PDTD2hPNcjAC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": true,\n" +
            "     \"acsTokenLink\": \"http://books.google.co.in/books/download/Algernon_Charlie_and_I-sample-pdf.acsm?id=PDTD2hPNcjAC&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://books.google.co.in/books/reader?id=PDTD2hPNcjAC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"SAMPLE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"Now, in Algernon, Charlie, and I, Keyes reveals his methods of creating fiction as well as the heartbreaks and joys of being published.\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"OQUrbQ_CoAMC\",\n" +
            "   \"etag\": \"IgXjShqA6Tk\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/OQUrbQ_CoAMC\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"The Mystery of Sex\",\n" +
            "    \"subtitle\": \"A Book about Love\",\n" +
            "    \"authors\": [\n" +
            "     \"Elizabeth Keyes\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Gentle Living Publications\",\n" +
            "    \"publishedDate\": \"1975\",\n" +
            "    \"description\": \"What causes men and women to have almost opposite concepts of the word ?love?? Why do men feel superior to women? Why do women find it easier to use intuition than logic? Why can men fight, shake hands and forget it, but women who fight never forget it? Why the importance given virginity in women but not in men? Why have women revolted against their natural role of motherhood? Why homosexuality? Are we missing greater experiences by confining sex to a physical level?These and other questions are answered in this book, from sources of ancient and modern wisdom, gathered by the author over many years of study and research.Sex is one of the most dominating subjects of our time. It is substituted for love; it is used with love and without love. People are confused about it. Some do not know which sex they are. It is the most misunderstood, misused and commercialized force in our culture. Polarity exists on every level, and is essential to the creation of all life. An understanding of this principle brings harmony out of conflict; cooperation instead of competition.\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"0979039169\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9780979039164\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": false,\n" +
            "     \"image\": true\n" +
            "    },\n" +
            "    \"pageCount\": 115,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Love\"\n" +
            "    ],\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"preview-1.0.0\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=OQUrbQ_CoAMC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=OQUrbQ_CoAMC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.co.in/books?id=OQUrbQ_CoAMC&pg=PA51&dq=flowers+inauthor:keyes&hl=&cd=8&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.co.in/books?id=OQUrbQ_CoAMC&dq=flowers+inauthor:keyes&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"http://books.google.co.in/books/about/The_Mystery_of_Sex.html?hl=&id=OQUrbQ_CoAMC\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"viewability\": \"PARTIAL\",\n" +
            "    \"embeddable\": true,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://books.google.co.in/books/reader?id=OQUrbQ_CoAMC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"SAMPLE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"art, cooking, sewing, \\u003cb\\u003eflowers\\u003c/b\\u003e, making roses out of radishes, rearranging furniture, \\u003cbr\\u003e\\nand redecorating the house — anything which they can change or improve by \\u003cbr\\u003e\\nreleasing their creative energy upon it. Love is an attitude to women. It is the&nbsp;...\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"TkxNSot3eMEC\",\n" +
            "   \"etag\": \"nUzsYr3eaYo\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/TkxNSot3eMEC\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"Anybody Out There\",\n" +
            "    \"authors\": [\n" +
            "     \"Marian Keyes\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Penguin UK\",\n" +
            "    \"publishedDate\": \"2007-02-08\",\n" +
            "    \"description\": \"'I'd lost my place in the universe. It had closed up and there was nowhere for me to be. I was more lost than I had known it was possible for any human being to be . . .' Anna Walsh is covered in bandages and lying in her parents' Good Front Room. She's dreaming of leaving Dublin and returning to New York. To her home. To her job. And most of all to her husband Aiden. Unfortunately, her family have other ideas. She's staying put. And Aiden? Well he's refusing to even take her calls. What has pushed Anna so far from everything that she loves? Is she the only one who can put it all right? And if not, who is? 'Keyes writes brilliantly, as always, about love, grief, jealousy and friendship' Daily Mail 'High-quality entertainment' Marie Claire\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9780141904757\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"0141904755\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": true,\n" +
            "     \"image\": false\n" +
            "    },\n" +
            "    \"pageCount\": 624,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Fiction\"\n" +
            "    ],\n" +
            "    \"averageRating\": 3.5,\n" +
            "    \"ratingsCount\": 4,\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": true,\n" +
            "    \"contentVersion\": \"1.15.14.0.preview.2\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=TkxNSot3eMEC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=TkxNSot3eMEC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.co.in/books?id=TkxNSot3eMEC&pg=PT258&dq=flowers+inauthor:keyes&hl=&cd=9&source=gbs_api\",\n" +
            "    \"infoLink\": \"https://play.google.com/store/books/details?id=TkxNSot3eMEC&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-TkxNSot3eMEC\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"saleability\": \"FOR_SALE\",\n" +
            "    \"isEbook\": true,\n" +
            "    \"listPrice\": {\n" +
            "     \"amount\": 254.15,\n" +
            "     \"currencyCode\": \"INR\"\n" +
            "    },\n" +
            "    \"retailPrice\": {\n" +
            "     \"amount\": 177.9,\n" +
            "     \"currencyCode\": \"INR\"\n" +
            "    },\n" +
            "    \"buyLink\": \"https://play.google.com/store/books/details?id=TkxNSot3eMEC&rdid=book-TkxNSot3eMEC&rdot=1&source=gbs_api\",\n" +
            "    \"offers\": [\n" +
            "     {\n" +
            "      \"finskyOfferType\": 1,\n" +
            "      \"listPrice\": {\n" +
            "       \"amountInMicros\": 2.5415E8,\n" +
            "       \"currencyCode\": \"INR\"\n" +
            "      },\n" +
            "      \"retailPrice\": {\n" +
            "       \"amountInMicros\": 1.779E8,\n" +
            "       \"currencyCode\": \"INR\"\n" +
            "      }\n" +
            "     }\n" +
            "    ]\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"viewability\": \"PARTIAL\",\n" +
            "    \"embeddable\": true,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED_FOR_ACCESSIBILITY\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": true,\n" +
            "     \"acsTokenLink\": \"http://books.google.co.in/books/download/Anybody_Out_There-sample-epub.acsm?id=TkxNSot3eMEC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://books.google.co.in/books/reader?id=TkxNSot3eMEC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"SAMPLE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"Actually, I was still in my work clothes (pink ballerinastyle skirt, pink vest, fishnet \\u003cbr\\u003e\\ncutoffs and ballet slippers embroidered with \\u003cb\\u003eflowers\\u003c/b\\u003e) but as my work clothes \\u003cbr\\u003e\\nlooked more like party clothes than most people&#39;s party clothes, I decided I&#39;d do.\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"Lgb4XG4V8fwC\",\n" +
            "   \"etag\": \"zCPajz7pNIk\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/Lgb4XG4V8fwC\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"Angels\",\n" +
            "    \"authors\": [\n" +
            "     \"Marian Keyes\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Penguin UK\",\n" +
            "    \"publishedDate\": \"2005-03-31\",\n" +
            "    \"description\": \"Marian Keyes' sixth novel is a truly captivating story about a marriage that's gone wrong and a sensible girl who suddenly just wants to let her hair down. \\\"We will shortly be landing at Los Angeles International Airport. Please ensure your seat is in the upright position, that you weigh less than a hundred pounds and that you have excellent teeth.\\\" Maggie Walsh has always done everything right. Sensibly. By the book. Until the day she leaves her husband and runs away to Hollywood, that is. Follow her on a journey of discovery, from suburbia to a suntan - taking in some heartache and lots of martinis along the way - as she discovers what she really wants in life and why she really walked out of her marriage.\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9780141928685\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"0141928689\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": true,\n" +
            "     \"image\": false\n" +
            "    },\n" +
            "    \"pageCount\": 528,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Fiction\"\n" +
            "    ],\n" +
            "    \"averageRating\": 4.0,\n" +
            "    \"ratingsCount\": 2,\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": true,\n" +
            "    \"contentVersion\": \"3.17.12.0.preview.2\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=Lgb4XG4V8fwC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=Lgb4XG4V8fwC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.co.in/books?id=Lgb4XG4V8fwC&pg=PT188&dq=flowers+inauthor:keyes&hl=&cd=10&source=gbs_api\",\n" +
            "    \"infoLink\": \"https://play.google.com/store/books/details?id=Lgb4XG4V8fwC&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-Lgb4XG4V8fwC\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"saleability\": \"FOR_SALE\",\n" +
            "    \"isEbook\": true,\n" +
            "    \"listPrice\": {\n" +
            "     \"amount\": 254.15,\n" +
            "     \"currencyCode\": \"INR\"\n" +
            "    },\n" +
            "    \"retailPrice\": {\n" +
            "     \"amount\": 177.9,\n" +
            "     \"currencyCode\": \"INR\"\n" +
            "    },\n" +
            "    \"buyLink\": \"https://play.google.com/store/books/details?id=Lgb4XG4V8fwC&rdid=book-Lgb4XG4V8fwC&rdot=1&source=gbs_api\",\n" +
            "    \"offers\": [\n" +
            "     {\n" +
            "      \"finskyOfferType\": 1,\n" +
            "      \"listPrice\": {\n" +
            "       \"amountInMicros\": 2.5415E8,\n" +
            "       \"currencyCode\": \"INR\"\n" +
            "      },\n" +
            "      \"retailPrice\": {\n" +
            "       \"amountInMicros\": 1.779E8,\n" +
            "       \"currencyCode\": \"INR\"\n" +
            "      }\n" +
            "     }\n" +
            "    ]\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"IN\",\n" +
            "    \"viewability\": \"PARTIAL\",\n" +
            "    \"embeddable\": true,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED_FOR_ACCESSIBILITY\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": true,\n" +
            "     \"acsTokenLink\": \"http://books.google.co.in/books/download/Angels-sample-epub.acsm?id=Lgb4XG4V8fwC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://books.google.co.in/books/reader?id=Lgb4XG4V8fwC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"SAMPLE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"We stepped out into the sultry night – far hotter than in the airconditioned rooms – \\u003cbr\\u003e\\nthe air dense and musky with the smell of \\u003cb\\u003eflowers\\u003c/b\\u003e. There was a hottub, steaming \\u003cbr\\u003e\\ninto the night. But most impressive was the astonishing view. &#39;No smog tonight,&#39;&nbsp;...\"\n" +
            "   }\n" +
            "  }\n" +
            " ]\n" +
            "}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayList<Book> arr = QueryUtils.extractBooks(SAMPLE_JSON);

        BookAdapter adapter = new BookAdapter(MainActivity.this, arr);
        listView.setAdapter(adapter);
    }
}
