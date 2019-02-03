package
parse
;
import
java
.
util
.
List
;
import
errorMsg
.
*
;
import
syntaxtree
.
*
;
public class MJGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 109; }
public int getNttSym() { return 110; }
private String[] symNameTable = {
"$$start",
"<start>",
"ws*",
"<program>",
"<class decl>+",
"<class decl>",
"`class",
"ID",
"`{",
"<decl in class>*",
"`}",
"<decl in class>",
"<method decl>",
"`public",
"`void",
"`(",
"`)",
"<stmt>*",
"<type>",
"`int",
"`null",
"`boolean",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"`;",
"<local var decl>",
"`break",
"<exp>",
"`=",
"<exp4>",
"`true",
"`false",
"`+",
"<exp3>",
"`-",
"<exp2>",
"`*",
"`/",
"`%",
"`&&",
"<cast exp>",
"<unary exp>",
"<exp1>",
"INTLIT",
"STRINGLIT",
"letter",
"\"a\"",
"\"p\"",
"\"v\"",
"{\"A\"..\"Z\" \"d\"..\"e\" \"g\"..\"h\" \"j\"..\"k\" \"m\" \"q\" \"s\" \"w\"..\"z\"}",
"\"c\"",
"\"f\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"\"b\"",
"\"n\"",
"\"t\"",
"letter128",
"{199..218 231..250}",
"{193..198 225..230}",
"digit",
"{\"1\"..\"9\"}",
"\"0\"",
"digit128",
"{176..185}",
"any",
"\"[\"",
"\"-\"",
"\" \"",
"\"#\"",
"\"&\"",
"\")\"",
"\"]\"",
"\"/\"",
"\";\"",
"\"{\"",
"\"%\"",
"\"(\"",
"\"+\"",
"{0..9 11..31 \"!\" \"$\" \"\'\" \",\" \".\" \":\" \"<\" \">\"..\"?\" \"\\\" \"^\" \"`\" \"|\" \"~\"..127}",
"\"_\"",
"\"=\"",
"\"@\"",
"10",
"\"}\"",
"\'\"\'",
"\"*\"",
"any128",
"{223}",
"{128..175 186..192 219..222 224 251..255}",
"ws",
"idChar*",
"$$0",
"digit*",
"$$1",
"hexDigit*",
"$$2",
"any*",
"$$3",
"idChar",
"idChar128",
"hexDigit",
"hexDigit128",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 111;}
private static final int MIN_REDUCTION = 293;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+0;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, boolean verboseReductions) {
	return new wrangLR.runtime.BaseParser(this,verboseLevel,verboseReductions).parse(is);
}
private class Initter1{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 0
1,217, // <start>
2,284, // ws*
3,137, // <program>
4,55, // <class decl>+
5,202, // <class decl>
6,83, // `class
74,79, // " "
75,176, // "#"
89,25, // {10}
96,253, // ws
  }
,
{ // state 1
  }
,
{ // state 2
23,MIN_REDUCTION+51, // `[
72,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 3
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 4
74,79, // " "
89,25, // {10}
96,35, // ws
110,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 5
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 6
7,125, // ID
15,76, // `(
30,291, // <exp>
32,111, // <exp4>
33,5, // `true
34,106, // `false
36,250, // <exp3>
37,254, // `-
38,195, // <exp2>
43,16, // <cast exp>
44,188, // <unary exp>
45,86, // <exp1>
46,119, // INTLIT
47,112, // STRINGLIT
48,65, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,238, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
67,194, // {"1".."9"}
68,23, // "0"
69,69, // digit128
70,42, // {176..185}
73,147, // "-"
75,43, // "#"
83,8, // "("
88,258, // "@"
91,215, // '"'
  }
,
{ // state 7
51,179, // "v"
55,177, // "i"
60,24, // "b"
61,256, // "n"
  }
,
{ // state 8
2,244, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 9
0x80000000|1, // match move
0x80000000|226, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 10
7,125, // ID
15,76, // `(
30,31, // <exp>
32,111, // <exp4>
33,5, // `true
34,106, // `false
36,250, // <exp3>
37,254, // `-
38,195, // <exp2>
43,16, // <cast exp>
44,188, // <unary exp>
45,86, // <exp1>
46,119, // INTLIT
47,112, // STRINGLIT
48,65, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,238, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
67,194, // {"1".."9"}
68,23, // "0"
69,69, // digit128
70,42, // {176..185}
73,147, // "-"
75,43, // "#"
83,8, // "("
88,258, // "@"
91,215, // '"'
  }
,
{ // state 11
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 12
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 13
0x80000000|1, // match move
0x80000000|164, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 14
49,38, // "a"
50,38, // "p"
51,38, // "v"
52,38, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,38, // "c"
54,38, // "f"
55,38, // "i"
56,38, // "l"
57,38, // "o"
58,38, // "r"
59,38, // "u"
60,38, // "b"
61,38, // "n"
62,38, // "t"
64,289, // {199..218 231..250}
65,289, // {193..198 225..230}
67,38, // {"1".."9"}
68,38, // "0"
70,289, // {176..185}
71,3, // any
72,38, // "["
73,38, // "-"
74,38, // " "
75,38, // "#"
76,38, // "&"
77,38, // ")"
78,38, // "]"
79,38, // "/"
80,38, // ";"
81,38, // "{"
82,38, // "%"
83,38, // "("
84,38, // "+"
85,38, // {0..9 11..31 "!" "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
86,38, // "_"
87,38, // "="
88,38, // "@"
89,38, // {10}
90,38, // "}"
91,38, // '"'
92,38, // "*"
93,110, // any128
94,289, // {223}
95,289, // {128..175 186..192 219..222 224 251..255}
104,279, // $$3
  }
,
{ // state 15
23,MIN_REDUCTION+50, // `[
72,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 17
24,102, // `]
78,286, // "]"
  }
,
{ // state 18
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 19
7,125, // ID
15,76, // `(
37,254, // `-
38,66, // <exp2>
43,16, // <cast exp>
44,188, // <unary exp>
45,86, // <exp1>
46,119, // INTLIT
47,112, // STRINGLIT
48,65, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,238, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
67,194, // {"1".."9"}
68,23, // "0"
69,69, // digit128
70,42, // {176..185}
73,147, // "-"
83,8, // "("
88,258, // "@"
91,215, // '"'
  }
,
{ // state 20
23,MIN_REDUCTION+102, // `[
72,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 21
59,59, // "u"
  }
,
{ // state 22
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 23
49,51, // "a"
50,51, // "p"
51,51, // "v"
52,51, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,51, // "c"
54,51, // "f"
55,51, // "i"
56,51, // "l"
57,51, // "o"
58,51, // "r"
59,51, // "u"
60,51, // "b"
61,51, // "n"
62,51, // "t"
65,116, // {193..198 225..230}
67,51, // {"1".."9"}
68,51, // "0"
70,116, // {176..185}
101,270, // hexDigit*
102,29, // $$2
107,133, // hexDigit
108,128, // hexDigit128
  }
,
{ // state 24
57,278, // "o"
  }
,
{ // state 25
110,MIN_REDUCTION+51, // $NT
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 26
2,124, // ws*
  }
,
{ // state 27
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 28
2,288, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 29
0x80000000|1, // match move
0x80000000|77, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 30
2,41, // ws*
23,MIN_REDUCTION+99, // `[
72,MIN_REDUCTION+99, // "["
74,47, // " "
89,224, // {10}
96,166, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 31
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 32
0x80000000|148, // match move
0x80000000|172, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 33
23,MIN_REDUCTION+43, // `[
72,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 34
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 35
110,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 36
0x80000000|1, // match move
0x80000000|209, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 37
0x80000000|136, // match move
0x80000000|168, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 38
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 39
2,218, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 40
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 41
0x80000000|158, // match move
0x80000000|153, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 42
0x80000000|263, // match move
0x80000000|178, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 43
54,53, // "f"
62,122, // "t"
  }
,
{ // state 44
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 45
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 46
57,278, // "o"
58,243, // "r"
  }
,
{ // state 47
0x80000000|237, // match move
0x80000000|15, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 48
2,189, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 49
23,MIN_REDUCTION+108, // `[
72,MIN_REDUCTION+108, // "["
74,47, // " "
89,224, // {10}
96,186, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 50
23,MIN_REDUCTION+41, // `[
72,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 52
16,103, // `)
22,211, // <empty bracket pair>
23,17, // `[
72,126, // "["
77,48, // ")"
  }
,
{ // state 53
49,229, // "a"
  }
,
{ // state 54
23,MIN_REDUCTION+135, // `[
72,MIN_REDUCTION+135, // "["
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 55
5,259, // <class decl>
6,83, // `class
75,176, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 58
51,179, // "v"
54,53, // "f"
55,177, // "i"
60,46, // "b"
61,256, // "n"
62,122, // "t"
  }
,
{ // state 59
2,210, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 60
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 61
0x80000000|247, // match move
0x80000000|94, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 62
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 63
7,125, // ID
15,76, // `(
36,84, // <exp3>
37,254, // `-
38,195, // <exp2>
43,16, // <cast exp>
44,188, // <unary exp>
45,86, // <exp1>
46,119, // INTLIT
47,112, // STRINGLIT
48,65, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,238, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
67,194, // {"1".."9"}
68,23, // "0"
69,69, // digit128
70,42, // {176..185}
73,147, // "-"
83,8, // "("
88,258, // "@"
91,215, // '"'
  }
,
{ // state 64
2,138, // ws*
23,MIN_REDUCTION+141, // `[
72,MIN_REDUCTION+141, // "["
74,47, // " "
89,224, // {10}
96,166, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 65
48,174, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,181, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
66,225, // digit
67,269, // {"1".."9"}
68,269, // "0"
69,161, // digit128
70,42, // {176..185}
86,11, // "_"
94,61, // {223}
97,81, // idChar*
98,37, // $$0
105,88, // idChar
106,227, // idChar128
  }
,
{ // state 66
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 67
2,36, // ws*
  }
,
{ // state 68
23,MIN_REDUCTION+92, // `[
72,MIN_REDUCTION+92, // "["
74,47, // " "
89,224, // {10}
96,186, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 69
0x80000000|67, // match move
0x80000000|152, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 70
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 72
0x80000000|222, // match move
0x80000000|87, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 73
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 75
2,62, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 76
7,257, // ID
14,95, // `void
18,52, // <type>
19,57, // `int
20,287, // `null
21,131, // `boolean
48,251, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,167, // letter128
64,154, // {199..218 231..250}
65,154, // {193..198 225..230}
75,7, // "#"
  }
,
{ // state 77
23,MIN_REDUCTION+107, // `[
72,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 78
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 79
110,MIN_REDUCTION+50, // $NT
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 80
2,9, // ws*
  }
,
{ // state 81
48,174, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,181, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
66,225, // digit
67,269, // {"1".."9"}
68,269, // "0"
69,161, // digit128
70,42, // {176..185}
86,11, // "_"
94,61, // {223}
98,149, // $$0
105,285, // idChar
106,227, // idChar128
  }
,
{ // state 82
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 83
7,104, // ID
48,251, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,167, // letter128
64,154, // {199..218 231..250}
65,154, // {193..198 225..230}
  }
,
{ // state 84
37,212, // `-
39,248, // `*
40,150, // `/
41,163, // `%
42,19, // `&&
73,147, // "-"
79,252, // "/"
82,198, // "%"
88,190, // "@"
92,262, // "*"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 85
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 86
0x80000000|1, // match move
0x80000000|283, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 87
23,MIN_REDUCTION+136, // `[
72,MIN_REDUCTION+136, // "["
74,47, // " "
89,224, // {10}
96,186, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 88
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 89
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 90
0x80000000|1, // match move
0x80000000|20, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 91
2,45, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 92
7,120, // ID
8,92, // `{
10,18, // `}
14,95, // `void
15,76, // `(
17,101, // <stmt>*
18,196, // <type>
19,57, // `int
20,287, // `null
21,131, // `boolean
25,204, // <stmt>
26,114, // <assign>
28,216, // <local var decl>
29,71, // `break
30,281, // <exp>
32,111, // <exp4>
33,5, // `true
34,106, // `false
36,250, // <exp3>
37,254, // `-
38,195, // <exp2>
43,16, // <cast exp>
44,188, // <unary exp>
45,86, // <exp1>
46,119, // INTLIT
47,112, // STRINGLIT
48,65, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,238, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
67,194, // {"1".."9"}
68,23, // "0"
69,69, // digit128
70,42, // {176..185}
73,147, // "-"
75,58, // "#"
81,228, // "{"
83,8, // "("
88,258, // "@"
90,142, // "}"
91,215, // '"'
  }
,
{ // state 93
23,MIN_REDUCTION+119, // `[
72,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 94
23,MIN_REDUCTION+117, // `[
72,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 95
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 96
23,MIN_REDUCTION+116, // `[
72,MIN_REDUCTION+116, // "["
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 97
0x80000000|1, // match move
0x80000000|49, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 98
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 99
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 100
2,124, // ws*
23,MIN_REDUCTION+143, // `[
72,MIN_REDUCTION+143, // "["
74,47, // " "
89,224, // {10}
96,166, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 101
7,120, // ID
8,92, // `{
10,130, // `}
14,95, // `void
15,76, // `(
18,196, // <type>
19,57, // `int
20,287, // `null
21,131, // `boolean
25,82, // <stmt>
26,114, // <assign>
28,216, // <local var decl>
29,71, // `break
30,281, // <exp>
32,111, // <exp4>
33,5, // `true
34,106, // `false
36,250, // <exp3>
37,254, // `-
38,195, // <exp2>
43,16, // <cast exp>
44,188, // <unary exp>
45,86, // <exp1>
46,119, // INTLIT
47,112, // STRINGLIT
48,65, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,238, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
67,194, // {"1".."9"}
68,23, // "0"
69,69, // digit128
70,42, // {176..185}
73,147, // "-"
75,58, // "#"
81,228, // "{"
83,8, // "("
88,258, // "@"
90,142, // "}"
91,215, // '"'
  }
,
{ // state 102
110,MIN_REDUCTION+15, // $NT
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 103
7,125, // ID
15,76, // `(
43,89, // <cast exp>
45,13, // <exp1>
46,119, // INTLIT
47,112, // STRINGLIT
48,65, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,238, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
67,194, // {"1".."9"}
68,23, // "0"
69,69, // digit128
70,42, // {176..185}
83,8, // "("
88,258, // "@"
91,215, // '"'
  }
,
{ // state 104
8,146, // `{
81,228, // "{"
  }
,
{ // state 105
2,134, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 106
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 107
2,162, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 108
48,174, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,193, // letter128
64,154, // {199..218 231..250}
65,154, // {193..198 225..230}
66,225, // digit
67,269, // {"1".."9"}
68,269, // "0"
69,99, // digit128
70,140, // {176..185}
86,11, // "_"
94,232, // {223}
98,70, // $$0
105,285, // idChar
106,28, // idChar128
  }
,
{ // state 109
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 110
0x80000000|26, // match move
0x80000000|100, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 111
35,63, // `+
84,208, // "+"
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 112
0x80000000|1, // match move
0x80000000|33, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 113
2,41, // ws*
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 114
27,34, // `;
80,265, // ";"
  }
,
{ // state 115
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 116
0x80000000|121, // match move
0x80000000|93, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 117
66,60, // digit
67,269, // {"1".."9"}
68,269, // "0"
69,277, // digit128
70,42, // {176..185}
100,90, // $$1
  }
,
{ // state 118
0x80000000|1, // match move
0x80000000|50, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 119
0x80000000|1, // match move
0x80000000|264, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 120
0x80000000|290, // match move
0x80000000|221, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 122
58,39, // "r"
  }
,
{ // state 123
2,138, // ws*
  }
,
{ // state 124
0x80000000|1, // match move
0x80000000|159, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 125
0x80000000|1, // match move
0x80000000|249, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 126
2,44, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 127
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 128
0x80000000|123, // match move
0x80000000|64, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 129
23,17, // `[
72,126, // "["
  }
,
{ // state 130
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 131
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 132
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 133
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 134
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 138
0x80000000|1, // match move
0x80000000|187, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 139
56,105, // "l"
  }
,
{ // state 140
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 142
2,180, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 143
16,192, // `)
77,48, // ")"
  }
,
{ // state 144
2,9, // ws*
23,MIN_REDUCTION+139, // `[
72,MIN_REDUCTION+139, // "["
74,47, // " "
89,224, // {10}
96,166, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 145
23,MIN_REDUCTION+111, // `[
72,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 146
9,169, // <decl in class>*
10,73, // `}
11,240, // <decl in class>
12,230, // <method decl>
13,261, // `public
75,260, // "#"
90,142, // "}"
  }
,
{ // state 147
2,40, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 148
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 149
0x80000000|109, // match move
0x80000000|157, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 150
7,125, // ID
15,76, // `(
37,254, // `-
38,135, // <exp2>
43,16, // <cast exp>
44,188, // <unary exp>
45,86, // <exp1>
46,119, // INTLIT
47,112, // STRINGLIT
48,65, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,238, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
67,194, // {"1".."9"}
68,23, // "0"
69,69, // digit128
70,42, // {176..185}
73,147, // "-"
83,8, // "("
88,258, // "@"
91,215, // '"'
  }
,
{ // state 151
23,MIN_REDUCTION+134, // `[
72,MIN_REDUCTION+134, // "["
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 152
2,36, // ws*
23,MIN_REDUCTION+105, // `[
72,MIN_REDUCTION+105, // "["
74,47, // " "
89,224, // {10}
96,166, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 153
23,MIN_REDUCTION+98, // `[
72,MIN_REDUCTION+98, // "["
74,47, // " "
89,224, // {10}
96,186, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 154
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 155
2,239, // ws*
23,MIN_REDUCTION+93, // `[
72,MIN_REDUCTION+93, // "["
74,47, // " "
89,224, // {10}
96,166, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 156
31,6, // `=
87,107, // "="
  }
,
{ // state 157
23,MIN_REDUCTION+100, // `[
72,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 158
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 159
23,MIN_REDUCTION+142, // `[
72,MIN_REDUCTION+142, // "["
74,47, // " "
89,224, // {10}
96,186, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 160
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 161
0x80000000|56, // match move
0x80000000|96, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 162
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 163
7,125, // ID
15,76, // `(
37,254, // `-
38,173, // <exp2>
43,16, // <cast exp>
44,188, // <unary exp>
45,86, // <exp1>
46,119, // INTLIT
47,112, // STRINGLIT
48,65, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,238, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
67,194, // {"1".."9"}
68,23, // "0"
69,69, // digit128
70,42, // {176..185}
73,147, // "-"
83,8, // "("
88,258, // "@"
91,215, // '"'
  }
,
{ // state 164
23,171, // `[
72,126, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 165
0x80000000|1, // match move
0x80000000|145, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 166
0x80000000|22, // match move
0x80000000|54, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 167
2,160, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 168
23,MIN_REDUCTION+101, // `[
72,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 169
10,27, // `}
11,267, // <decl in class>
12,230, // <method decl>
13,261, // `public
75,260, // "#"
90,142, // "}"
  }
,
{ // state 170
15,143, // `(
83,8, // "("
  }
,
{ // state 171
7,125, // ID
15,76, // `(
30,220, // <exp>
32,111, // <exp4>
33,5, // `true
34,106, // `false
36,250, // <exp3>
37,254, // `-
38,195, // <exp2>
43,16, // <cast exp>
44,188, // <unary exp>
45,86, // <exp1>
46,119, // INTLIT
47,112, // STRINGLIT
48,65, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,238, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
67,194, // {"1".."9"}
68,23, // "0"
69,69, // digit128
70,42, // {176..185}
73,147, // "-"
75,43, // "#"
83,8, // "("
88,258, // "@"
91,215, // '"'
  }
,
{ // state 172
23,MIN_REDUCTION+45, // `[
72,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 173
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 174
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 175
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 176
53,139, // "c"
  }
,
{ // state 177
62,75, // "t"
  }
,
{ // state 178
23,MIN_REDUCTION+47, // `[
72,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 179
57,274, // "o"
  }
,
{ // state 180
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 181
0x80000000|74, // match move
0x80000000|280, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 182
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 183
0x80000000|207, // match move
0x80000000|155, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 184
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 185
23,MIN_REDUCTION+110, // `[
72,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 186
0x80000000|236, // match move
0x80000000|151, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 187
23,MIN_REDUCTION+140, // `[
72,MIN_REDUCTION+140, // "["
74,47, // " "
89,224, // {10}
96,186, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 189
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 190
76,91, // "&"
  }
,
{ // state 191
2,182, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 192
8,246, // `{
81,228, // "{"
  }
,
{ // state 193
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 194
66,231, // digit
67,269, // {"1".."9"}
68,269, // "0"
69,277, // digit128
70,42, // {176..185}
99,117, // digit*
100,201, // $$1
  }
,
{ // state 195
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 196
7,156, // ID
22,211, // <empty bracket pair>
23,17, // `[
48,251, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,167, // letter128
64,154, // {199..218 231..250}
65,154, // {193..198 225..230}
72,126, // "["
  }
,
{ // state 197
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 198
2,184, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 199
23,MIN_REDUCTION+103, // `[
72,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 200
51,179, // "v"
  }
,
{ // state 201
0x80000000|1, // match move
0x80000000|199, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 202
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 203
0x80000000|1, // match move
0x80000000|219, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 204
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 205
2,97, // ws*
23,MIN_REDUCTION+109, // `[
72,MIN_REDUCTION+109, // "["
74,47, // " "
89,224, // {10}
96,166, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 206
0x80000000|271, // match move
0x80000000|205, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 207
2,239, // ws*
  }
,
{ // state 208
2,127, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 209
23,MIN_REDUCTION+104, // `[
72,MIN_REDUCTION+104, // "["
74,47, // " "
89,224, // {10}
96,186, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 210
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 211
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 212
7,125, // ID
15,76, // `(
37,254, // `-
38,241, // <exp2>
43,16, // <cast exp>
44,188, // <unary exp>
45,86, // <exp1>
46,119, // INTLIT
47,112, // STRINGLIT
48,65, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,238, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
67,194, // {"1".."9"}
68,23, // "0"
69,69, // digit128
70,42, // {176..185}
73,147, // "-"
83,8, // "("
88,258, // "@"
91,215, // '"'
  }
,
{ // state 213
2,72, // ws*
23,MIN_REDUCTION+137, // `[
72,MIN_REDUCTION+137, // "["
74,47, // " "
89,224, // {10}
96,166, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 214
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 215
49,38, // "a"
50,38, // "p"
51,38, // "v"
52,38, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,38, // "c"
54,38, // "f"
55,38, // "i"
56,38, // "l"
57,38, // "o"
58,38, // "r"
59,38, // "u"
60,38, // "b"
61,38, // "n"
62,38, // "t"
64,289, // {199..218 231..250}
65,289, // {193..198 225..230}
67,38, // {"1".."9"}
68,38, // "0"
70,289, // {176..185}
71,141, // any
72,38, // "["
73,38, // "-"
74,38, // " "
75,38, // "#"
76,38, // "&"
77,38, // ")"
78,38, // "]"
79,38, // "/"
80,38, // ";"
81,38, // "{"
82,38, // "%"
83,38, // "("
84,38, // "+"
85,38, // {0..9 11..31 "!" "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
86,38, // "_"
87,38, // "="
88,38, // "@"
89,38, // {10}
90,38, // "}"
91,38, // '"'
92,38, // "*"
93,110, // any128
94,289, // {223}
95,289, // {128..175 186..192 219..222 224 251..255}
103,14, // any*
104,165, // $$3
  }
,
{ // state 216
27,272, // `;
80,265, // ";"
  }
,
{ // state 217
109,MIN_REDUCTION+0, // $
  }
,
{ // state 218
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 219
23,MIN_REDUCTION+106, // `[
72,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 220
24,118, // `]
78,183, // "]"
  }
,
{ // state 221
23,MIN_REDUCTION+40, // `[
31,MIN_REDUCTION+40, // `=
35,MIN_REDUCTION+40, // `+
37,MIN_REDUCTION+40, // `-
39,MIN_REDUCTION+40, // `*
40,MIN_REDUCTION+40, // `/
41,MIN_REDUCTION+40, // `%
42,MIN_REDUCTION+40, // `&&
72,MIN_REDUCTION+40, // "["
73,MIN_REDUCTION+40, // "-"
79,MIN_REDUCTION+40, // "/"
82,MIN_REDUCTION+40, // "%"
84,MIN_REDUCTION+40, // "+"
87,MIN_REDUCTION+40, // "="
88,MIN_REDUCTION+40, // "@"
92,MIN_REDUCTION+40, // "*"
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 222
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 223
7,170, // ID
48,251, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,167, // letter128
64,154, // {199..218 231..250}
65,154, // {193..198 225..230}
  }
,
{ // state 224
0x80000000|242, // match move
0x80000000|2, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 225
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 226
23,MIN_REDUCTION+138, // `[
72,MIN_REDUCTION+138, // "["
74,47, // " "
89,224, // {10}
96,186, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 227
0x80000000|245, // match move
0x80000000|213, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 228
2,273, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 229
2,214, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 230
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 231
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 232
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 233
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 234
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 235
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 236
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 238
0x80000000|113, // match move
0x80000000|30, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 239
0x80000000|1, // match move
0x80000000|68, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 240
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 242
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 243
2,233, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 244
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 245
2,72, // ws*
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 246
7,120, // ID
8,92, // `{
10,175, // `}
14,95, // `void
15,76, // `(
17,276, // <stmt>*
18,196, // <type>
19,57, // `int
20,287, // `null
21,131, // `boolean
25,204, // <stmt>
26,114, // <assign>
28,216, // <local var decl>
29,71, // `break
30,281, // <exp>
32,111, // <exp4>
33,5, // `true
34,106, // `false
36,250, // <exp3>
37,254, // `-
38,195, // <exp2>
43,16, // <cast exp>
44,188, // <unary exp>
45,86, // <exp1>
46,119, // INTLIT
47,112, // STRINGLIT
48,65, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,238, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
67,194, // {"1".."9"}
68,23, // "0"
69,69, // digit128
70,42, // {176..185}
73,147, // "-"
75,58, // "#"
81,228, // "{"
83,8, // "("
88,258, // "@"
90,142, // "}"
91,215, // '"'
  }
,
{ // state 247
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 248
7,125, // ID
15,76, // `(
37,254, // `-
38,275, // <exp2>
43,16, // <cast exp>
44,188, // <unary exp>
45,86, // <exp1>
46,119, // INTLIT
47,112, // STRINGLIT
48,65, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,238, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
67,194, // {"1".."9"}
68,23, // "0"
69,69, // digit128
70,42, // {176..185}
73,147, // "-"
83,8, // "("
88,258, // "@"
91,215, // '"'
  }
,
{ // state 249
23,MIN_REDUCTION+40, // `[
72,MIN_REDUCTION+40, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 250
37,212, // `-
39,248, // `*
40,150, // `/
41,163, // `%
42,19, // `&&
73,147, // "-"
79,252, // "/"
82,198, // "%"
88,190, // "@"
92,262, // "*"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 251
48,174, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,193, // letter128
64,154, // {199..218 231..250}
65,154, // {193..198 225..230}
66,225, // digit
67,269, // {"1".."9"}
68,269, // "0"
69,99, // digit128
70,140, // {176..185}
86,11, // "_"
94,232, // {223}
97,108, // idChar*
98,282, // $$0
105,88, // idChar
106,28, // idChar128
  }
,
{ // state 252
2,12, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 253
110,MIN_REDUCTION+135, // $NT
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 254
7,125, // ID
37,254, // `-
44,234, // <unary exp>
45,86, // <exp1>
46,119, // INTLIT
47,112, // STRINGLIT
48,65, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,238, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
67,194, // {"1".."9"}
68,23, // "0"
69,69, // digit128
70,42, // {176..185}
73,147, // "-"
88,258, // "@"
91,215, // '"'
  }
,
{ // state 255
23,MIN_REDUCTION+49, // `[
72,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 256
59,191, // "u"
  }
,
{ // state 257
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 258
91,206, // '"'
  }
,
{ // state 259
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 260
50,21, // "p"
  }
,
{ // state 261
14,223, // `void
75,200, // "#"
  }
,
{ // state 262
2,98, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 263
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 264
23,MIN_REDUCTION+42, // `[
72,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 265
2,132, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 266
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 267
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 268
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 269
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 270
49,51, // "a"
50,51, // "p"
51,51, // "v"
52,51, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,51, // "c"
54,51, // "f"
55,51, // "i"
56,51, // "l"
57,51, // "o"
58,51, // "r"
59,51, // "u"
60,51, // "b"
61,51, // "n"
62,51, // "t"
65,116, // {193..198 225..230}
67,51, // {"1".."9"}
68,51, // "0"
70,116, // {176..185}
102,203, // $$2
107,266, // hexDigit
108,128, // hexDigit128
  }
,
{ // state 271
2,97, // ws*
  }
,
{ // state 272
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 273
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 274
2,268, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 275
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 276
7,120, // ID
8,92, // `{
10,235, // `}
14,95, // `void
15,76, // `(
18,196, // <type>
19,57, // `int
20,287, // `null
21,131, // `boolean
25,82, // <stmt>
26,114, // <assign>
28,216, // <local var decl>
29,71, // `break
30,281, // <exp>
32,111, // <exp4>
33,5, // `true
34,106, // `false
36,250, // <exp3>
37,254, // `-
38,195, // <exp2>
43,16, // <cast exp>
44,188, // <unary exp>
45,86, // <exp1>
46,119, // INTLIT
47,112, // STRINGLIT
48,65, // letter
49,115, // "a"
50,115, // "p"
51,115, // "v"
52,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
53,115, // "c"
54,115, // "f"
55,115, // "i"
56,115, // "l"
57,115, // "o"
58,115, // "r"
59,115, // "u"
60,115, // "b"
61,115, // "n"
62,115, // "t"
63,238, // letter128
64,32, // {199..218 231..250}
65,32, // {193..198 225..230}
67,194, // {"1".."9"}
68,23, // "0"
69,69, // digit128
70,42, // {176..185}
73,147, // "-"
75,58, // "#"
81,228, // "{"
83,8, // "("
88,258, // "@"
90,142, // "}"
91,215, // '"'
  }
,
{ // state 277
0x80000000|80, // match move
0x80000000|144, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 278
2,78, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 279
0x80000000|1, // match move
0x80000000|185, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 280
23,MIN_REDUCTION+115, // `[
72,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 281
31,10, // `=
87,107, // "="
  }
,
{ // state 282
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 283
23,171, // `[
72,126, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 284
3,197, // <program>
4,55, // <class decl>+
5,202, // <class decl>
6,83, // `class
74,79, // " "
75,176, // "#"
89,25, // {10}
96,35, // ws
  }
,
{ // state 285
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 286
2,4, // ws*
74,79, // " "
89,25, // {10}
96,253, // ws
110,MIN_REDUCTION+93, // $NT
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 287
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 288
74,79, // " "
89,25, // {10}
96,35, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 289
0x80000000|85, // match move
0x80000000|255, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 290
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 291
MIN_REDUCTION+22, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[292][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= <start>
(0<<16)+1,
// <start> ::= ws* <program>
(1<<16)+2,
// <start> ::= <program>
(1<<16)+1,
// <program> ::= <class decl>+
(3<<16)+1,
// <class decl> ::= `class ID `{ <decl in class>* `}
(5<<16)+5,
// <class decl> ::= `class ID `{ `}
(5<<16)+4,
// <decl in class> ::= <method decl>
(11<<16)+1,
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(12<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(12<<16)+7,
// <type> ::= `int
(18<<16)+1,
// <type> ::= `null
(18<<16)+1,
// <type> ::= `void
(18<<16)+1,
// <type> ::= `boolean
(18<<16)+1,
// <type> ::= ID
(18<<16)+1,
// <type> ::= <type> <empty bracket pair>
(18<<16)+2,
// <empty bracket pair> ::= `[ `]
(22<<16)+2,
// <stmt> ::= <assign> `;
(25<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(25<<16)+3,
// <stmt> ::= `{ `}
(25<<16)+2,
// <stmt> ::= <local var decl> `;
(25<<16)+2,
// <stmt> ::= `break
(25<<16)+1,
// <assign> ::= <exp> `= <exp>
(26<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(28<<16)+4,
// <exp> ::= <exp4>
(30<<16)+1,
// <exp4> ::= `true
(32<<16)+1,
// <exp4> ::= `false
(32<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(32<<16)+3,
// <exp3> ::= <exp3> `- <exp2>
(36<<16)+3,
// <exp4> ::= <exp3>
(32<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(36<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(36<<16)+3,
// <exp3> ::= <exp3> `% <exp2>
(36<<16)+3,
// <exp3> ::= <exp3> `&& <exp2>
(36<<16)+3,
// <exp3> ::= <exp2>
(36<<16)+1,
// <exp2> ::= <cast exp>
(38<<16)+1,
// <exp2> ::= <unary exp>
(38<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(43<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(43<<16)+4,
// <unary exp> ::= `- <unary exp>
(44<<16)+2,
// <unary exp> ::= <exp1>
(44<<16)+1,
// <exp1> ::= ID
(45<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(45<<16)+4,
// <exp1> ::= INTLIT
(45<<16)+1,
// <exp1> ::= STRINGLIT
(45<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(48<<16)+1,
// letter128 ::= {193..218 225..250}
(63<<16)+1,
// digit ::= {"0".."9"}
(66<<16)+1,
// digit128 ::= {176..185}
(69<<16)+1,
// any ::= {0..127}
(71<<16)+1,
// any128 ::= {128..255}
(93<<16)+1,
// ws ::= " "
(96<<16)+1,
// ws ::= {10}
(96<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(21<<16)+4,
// `boolean ::= "#" "b" "o"
(21<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `void ::= "#" "v" "o" ws*
(14<<16)+4,
// `void ::= "#" "v" "o"
(14<<16)+3,
// `int ::= "#" "i" "t" ws*
(19<<16)+4,
// `int ::= "#" "i" "t"
(19<<16)+3,
// `break ::= "#" "b" "r" ws*
(29<<16)+4,
// `break ::= "#" "b" "r"
(29<<16)+3,
// `false ::= "#" "f" "a" ws*
(34<<16)+4,
// `false ::= "#" "f" "a"
(34<<16)+3,
// `true ::= "#" "t" "r" ws*
(33<<16)+4,
// `true ::= "#" "t" "r"
(33<<16)+3,
// `null ::= "#" "n" "u" ws*
(20<<16)+4,
// `null ::= "#" "n" "u"
(20<<16)+3,
// `public ::= "#" "p" "u" ws*
(13<<16)+4,
// `public ::= "#" "p" "u"
(13<<16)+3,
// `% ::= "%" ws*
(41<<16)+2,
// `% ::= "%"
(41<<16)+1,
// `&& ::= "@" "&" ws*
(42<<16)+3,
// `&& ::= "@" "&"
(42<<16)+2,
// `* ::= "*" ws*
(39<<16)+2,
// `* ::= "*"
(39<<16)+1,
// `( ::= "(" ws*
(15<<16)+2,
// `( ::= "("
(15<<16)+1,
// `) ::= ")" ws*
(16<<16)+2,
// `) ::= ")"
(16<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(37<<16)+2,
// `- ::= "-"
(37<<16)+1,
// `+ ::= "+" ws*
(35<<16)+2,
// `+ ::= "+"
(35<<16)+1,
// `= ::= "=" ws*
(31<<16)+2,
// `= ::= "="
(31<<16)+1,
// `[ ::= "[" ws*
(23<<16)+2,
// `[ ::= "["
(23<<16)+1,
// `] ::= "]" ws*
(24<<16)+2,
// `] ::= "]"
(24<<16)+1,
// `; ::= ";" ws*
(27<<16)+2,
// `; ::= ";"
(27<<16)+1,
// `/ ::= "/" ws*
(40<<16)+2,
// `/ ::= "/"
(40<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(46<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(46<<16)+2,
// INTLIT ::= digit128 ws*
(46<<16)+2,
// INTLIT ::= digit128
(46<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(46<<16)+3,
// INTLIT ::= "0" $$2
(46<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(47<<16)+3,
// STRINGLIT ::= "@" '"'
(47<<16)+2,
// STRINGLIT ::= '"' any* $$3
(47<<16)+3,
// STRINGLIT ::= '"' $$3
(47<<16)+2,
// idChar ::= letter
(105<<16)+1,
// idChar ::= digit
(105<<16)+1,
// idChar ::= "_"
(105<<16)+1,
// idChar128 ::= letter128
(106<<16)+1,
// idChar128 ::= digit128
(106<<16)+1,
// idChar128 ::= {223}
(106<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(107<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(108<<16)+1,
// digit* ::= digit* digit
(99<<16)+2,
// digit* ::= digit
(99<<16)+1,
// any* ::= any* any
(103<<16)+2,
// any* ::= any
(103<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(101<<16)+2,
// hexDigit* ::= hexDigit
(101<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(17<<16)+2,
// <stmt>* ::= <stmt>
(17<<16)+1,
// idChar* ::= idChar* idChar
(97<<16)+2,
// idChar* ::= idChar
(97<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(98<<16)+2,
// $$0 ::= idChar128
(98<<16)+1,
// $$1 ::= digit128 ws*
(100<<16)+2,
// $$1 ::= digit128
(100<<16)+1,
// $$2 ::= hexDigit128 ws*
(102<<16)+2,
// $$2 ::= hexDigit128
(102<<16)+1,
// $$3 ::= any128 ws*
(104<<16)+2,
// $$3 ::= any128
(104<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
85, // 0
85, // 1
85, // 2
85, // 3
85, // 4
85, // 5
85, // 6
85, // 7
85, // 8
85, // 9
89, // 10
85, // 11
85, // 12
85, // 13
85, // 14
85, // 15
85, // 16
85, // 17
85, // 18
85, // 19
85, // 20
85, // 21
85, // 22
85, // 23
85, // 24
85, // 25
85, // 26
85, // 27
85, // 28
85, // 29
85, // 30
85, // 31
74, // " "
85, // "!"
91, // '"'
75, // "#"
85, // "$"
82, // "%"
76, // "&"
85, // "'"
83, // "("
77, // ")"
92, // "*"
84, // "+"
85, // ","
73, // "-"
85, // "."
79, // "/"
68, // "0"
67, // "1"
67, // "2"
67, // "3"
67, // "4"
67, // "5"
67, // "6"
67, // "7"
67, // "8"
67, // "9"
85, // ":"
80, // ";"
85, // "<"
87, // "="
85, // ">"
85, // "?"
88, // "@"
52, // "A"
52, // "B"
52, // "C"
52, // "D"
52, // "E"
52, // "F"
52, // "G"
52, // "H"
52, // "I"
52, // "J"
52, // "K"
52, // "L"
52, // "M"
52, // "N"
52, // "O"
52, // "P"
52, // "Q"
52, // "R"
52, // "S"
52, // "T"
52, // "U"
52, // "V"
52, // "W"
52, // "X"
52, // "Y"
52, // "Z"
72, // "["
85, // "\"
78, // "]"
85, // "^"
86, // "_"
85, // "`"
49, // "a"
60, // "b"
53, // "c"
52, // "d"
52, // "e"
54, // "f"
52, // "g"
52, // "h"
55, // "i"
52, // "j"
52, // "k"
56, // "l"
52, // "m"
61, // "n"
57, // "o"
50, // "p"
52, // "q"
58, // "r"
52, // "s"
62, // "t"
59, // "u"
51, // "v"
52, // "w"
52, // "x"
52, // "y"
52, // "z"
81, // "{"
85, // "|"
90, // "}"
85, // "~"
85, // 127
95, // 128
95, // 129
95, // 130
95, // 131
95, // 132
95, // 133
95, // 134
95, // 135
95, // 136
95, // 137
95, // 138
95, // 139
95, // 140
95, // 141
95, // 142
95, // 143
95, // 144
95, // 145
95, // 146
95, // 147
95, // 148
95, // 149
95, // 150
95, // 151
95, // 152
95, // 153
95, // 154
95, // 155
95, // 156
95, // 157
95, // 158
95, // 159
95, // 160
95, // 161
95, // 162
95, // 163
95, // 164
95, // 165
95, // 166
95, // 167
95, // 168
95, // 169
95, // 170
95, // 171
95, // 172
95, // 173
95, // 174
95, // 175
70, // 176
70, // 177
70, // 178
70, // 179
70, // 180
70, // 181
70, // 182
70, // 183
70, // 184
70, // 185
95, // 186
95, // 187
95, // 188
95, // 189
95, // 190
95, // 191
95, // 192
65, // 193
65, // 194
65, // 195
65, // 196
65, // 197
65, // 198
64, // 199
64, // 200
64, // 201
64, // 202
64, // 203
64, // 204
64, // 205
64, // 206
64, // 207
64, // 208
64, // 209
64, // 210
64, // 211
64, // 212
64, // 213
64, // 214
64, // 215
64, // 216
64, // 217
64, // 218
95, // 219
95, // 220
95, // 221
95, // 222
94, // 223
95, // 224
65, // 225
65, // 226
65, // 227
65, // 228
65, // 229
65, // 230
64, // 231
64, // 232
64, // 233
64, // 234
64, // 235
64, // 236
64, // 237
64, // 238
64, // 239
64, // 240
64, // 241
64, // 242
64, // 243
64, // 244
64, // 245
64, // 246
64, // 247
64, // 248
64, // 249
64, // 250
95, // 251
95, // 252
95, // 253
95, // 254
95, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"<start> ::= ws* <program>", // 1
"<start> ::= ws* <program>", // 2
"<program> ::= # <class decl>+", // 3
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 4
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 5
"<decl in class> ::= <method decl>", // 6
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 7
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 8
"<type> ::= # `int", // 9
"<type> ::= # `null", // 10
"<type> ::= # `void", // 11
"<type> ::= # `boolean", // 12
"<type> ::= # ID", // 13
"<type> ::= # <type> <empty bracket pair>", // 14
"<empty bracket pair> ::= `[ `]", // 15
"<stmt> ::= <assign> `;", // 16
"<stmt> ::= # `{ <stmt>* `}", // 17
"<stmt> ::= # `{ <stmt>* `}", // 18
"<stmt> ::= <local var decl> `;", // 19
"<stmt> ::= # `break", // 20
"<assign> ::= <exp> # `= <exp>", // 21
"<local var decl> ::= <type> # ID `= <exp>", // 22
"<exp> ::= <exp4>", // 23
"<exp4> ::= # `true", // 24
"<exp4> ::= # `false", // 25
"<exp4> ::= <exp4> # `+ <exp3>", // 26
"<exp3> ::= <exp3> # `- <exp2>", // 27
"<exp4> ::= <exp3>", // 28
"<exp3> ::= <exp3> # `* <exp2>", // 29
"<exp3> ::= <exp3> # `/ <exp2>", // 30
"<exp3> ::= <exp3> # `% <exp2>", // 31
"<exp3> ::= <exp3> # `&& <exp2>", // 32
"<exp3> ::= <exp2>", // 33
"<exp2> ::= <cast exp>", // 34
"<exp2> ::= <unary exp>", // 35
"<cast exp> ::= # `( <type> `) <cast exp>", // 36
"<cast exp> ::= # `( <type> `) <exp1>", // 37
"<unary exp> ::= # `- <unary exp>", // 38
"<unary exp> ::= <exp1>", // 39
"<exp1> ::= # ID", // 40
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 41
"<exp1> ::= # INTLIT", // 42
"<exp1> ::= # STRINGLIT", // 43
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 44
"letter128 ::= {193..218 225..250}", // 45
"digit ::= {\"0\"..\"9\"}", // 46
"digit128 ::= {176..185}", // 47
"any ::= {0..127}", // 48
"any128 ::= {128..255}", // 49
"ws ::= \" \"", // 50
"ws ::= {10} registerNewline", // 51
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 52
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 53
"`class ::= \"#\" \"c\" \"l\" ws*", // 54
"`class ::= \"#\" \"c\" \"l\" ws*", // 55
"`void ::= \"#\" \"v\" \"o\" ws*", // 56
"`void ::= \"#\" \"v\" \"o\" ws*", // 57
"`int ::= \"#\" \"i\" \"t\" ws*", // 58
"`int ::= \"#\" \"i\" \"t\" ws*", // 59
"`break ::= \"#\" \"b\" \"r\" ws*", // 60
"`break ::= \"#\" \"b\" \"r\" ws*", // 61
"`false ::= \"#\" \"f\" \"a\" ws*", // 62
"`false ::= \"#\" \"f\" \"a\" ws*", // 63
"`true ::= \"#\" \"t\" \"r\" ws*", // 64
"`true ::= \"#\" \"t\" \"r\" ws*", // 65
"`null ::= \"#\" \"n\" \"u\" ws*", // 66
"`null ::= \"#\" \"n\" \"u\" ws*", // 67
"`public ::= \"#\" \"p\" \"u\" ws*", // 68
"`public ::= \"#\" \"p\" \"u\" ws*", // 69
"`% ::= \"%\" ws*", // 70
"`% ::= \"%\" ws*", // 71
"`&& ::= \"@\" \"&\" ws*", // 72
"`&& ::= \"@\" \"&\" ws*", // 73
"`* ::= \"*\" ws*", // 74
"`* ::= \"*\" ws*", // 75
"`( ::= \"(\" ws*", // 76
"`( ::= \"(\" ws*", // 77
"`) ::= \")\" ws*", // 78
"`) ::= \")\" ws*", // 79
"`{ ::= \"{\" ws*", // 80
"`{ ::= \"{\" ws*", // 81
"`} ::= \"}\" ws*", // 82
"`} ::= \"}\" ws*", // 83
"`- ::= \"-\" ws*", // 84
"`- ::= \"-\" ws*", // 85
"`+ ::= \"+\" ws*", // 86
"`+ ::= \"+\" ws*", // 87
"`= ::= \"=\" ws*", // 88
"`= ::= \"=\" ws*", // 89
"`[ ::= \"[\" ws*", // 90
"`[ ::= \"[\" ws*", // 91
"`] ::= \"]\" ws*", // 92
"`] ::= \"]\" ws*", // 93
"`; ::= \";\" ws*", // 94
"`; ::= \";\" ws*", // 95
"`/ ::= \"/\" ws*", // 96
"`/ ::= \"/\" ws*", // 97
"ID ::= letter128 ws*", // 98
"ID ::= letter128 ws*", // 99
"ID ::= letter idChar* idChar128 ws*", // 100
"ID ::= letter idChar* idChar128 ws*", // 101
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 102
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 103
"INTLIT ::= digit128 ws*", // 104
"INTLIT ::= digit128 ws*", // 105
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 106
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 107
"STRINGLIT ::= \"@\" \'\"\' ws*", // 108
"STRINGLIT ::= \"@\" \'\"\' ws*", // 109
"STRINGLIT ::= \'\"\' any* any128 ws*", // 110
"STRINGLIT ::= \'\"\' any* any128 ws*", // 111
"idChar ::= letter", // 112
"idChar ::= digit", // 113
"idChar ::= \"_\"", // 114
"idChar128 ::= letter128", // 115
"idChar128 ::= digit128", // 116
"idChar128 ::= {223}", // 117
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 118
"hexDigit128 ::= {176..185 193..198 225..230}", // 119
"digit* ::= digit* digit", // 120
"digit* ::= digit* digit", // 121
"any* ::= any* any", // 122
"any* ::= any* any", // 123
"<decl in class>* ::= <decl in class>* <decl in class>", // 124
"<decl in class>* ::= <decl in class>* <decl in class>", // 125
"hexDigit* ::= hexDigit* hexDigit", // 126
"hexDigit* ::= hexDigit* hexDigit", // 127
"<stmt>* ::= <stmt>* <stmt>", // 128
"<stmt>* ::= <stmt>* <stmt>", // 129
"idChar* ::= idChar* idChar", // 130
"idChar* ::= idChar* idChar", // 131
"<class decl>+ ::= <class decl>", // 132
"<class decl>+ ::= <class decl>+ <class decl>", // 133
"ws* ::= ws* ws", // 134
"ws* ::= ws* ws", // 135
"", // 136
"", // 137
"", // 138
"", // 139
"", // 140
"", // 141
"", // 142
"", // 143
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= <start> @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: <start> ::= ws* <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 2: <start> ::= [ws*] <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 6: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 7: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <type> ::= [#] `null @nullType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: <type> ::= [#] `void @voidType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 16: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 17: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 18: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 19: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 20: <stmt> ::= [#] `break @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 21: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 22: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 23: <exp> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 24: <exp4> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 25: <exp4> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 26: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 27: <exp3> ::= <exp3> [#] `- <exp2> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 28: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 30: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 31: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 32: <exp3> ::= <exp3> [#] `&& <exp2> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 33: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 34: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 36: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 37: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 38: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 39: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 40: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 41: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 42: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 43: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 44: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 45: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 46: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 47: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 48: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 49: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 50: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 51: ws ::= {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 52: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 53: `boolean ::= "#" "b" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 55: `class ::= "#" "c" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 56: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `void ::= "#" "v" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 58: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 59: `int ::= "#" "i" "t" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 60: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `break ::= "#" "b" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 62: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 63: `false ::= "#" "f" "a" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 64: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 65: `true ::= "#" "t" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 66: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `null ::= "#" "n" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 68: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 69: `public ::= "#" "p" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 70: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: `% ::= "%" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 73: `&& ::= "@" "&" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 74: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `* ::= "*" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 77: `( ::= "(" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `) ::= ")" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: `{ ::= "{" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: `} ::= "}" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: `- ::= "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 86: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 87: `+ ::= "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 88: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 89: `= ::= "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 90: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 91: `[ ::= "[" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 92: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 93: `] ::= "]" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 94: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 95: `; ::= ";" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 96: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 97: `/ ::= "/" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 98: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 99: ID ::= letter128 [ws*] @text
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 100: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 101: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 102: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 103: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 104: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 105: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 106: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 107: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 108: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 109: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 110: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 111: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 112: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 113: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 114: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 115: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 116: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 117: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 118: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 119: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 120: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 121: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 122: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 123: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 124: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 125: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 126: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 127: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 128: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 129: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 130: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 131: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 132: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 133: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 134: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 135: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 136: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 137: $$0 ::= idChar128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 138: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 139: $$1 ::= digit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 140: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 141: $$2 ::= hexDigit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 142: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 143: $$3 ::= any128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "any* ::=", // any*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "idChar* ::=", // idChar*
    "digit* ::=", // digit*
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // hexDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <stmt>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // any*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <decl in class>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // ws*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // digit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      Program parm0 = (Program)si.popPb();
      actionObject.topLevel(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      List<ClassDecl> parm1 = (List<ClassDecl>)si.popPb();
      Program result = actionObject.createProgram(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Decl> parm2 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createClassDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.nullType(parm0);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.voidType(parm0);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 12: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 25: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 28: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 29: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 30: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 31: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 32: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 33: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 34: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void topLevel(Program)",
"Program createProgram(int,List<ClassDecl>)",
"ClassDecl createClassDecl(int,String,List<Decl>)",
"Decl createMethodDeclVoid(int,String,List<Statement>)",
"Type intType(int)",
"Type nullType(int)",
"Type voidType(int)",
"Type booleanType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"Statement newBlock(int,List<Statement>)",
"Statement newBreak(int)",
"Statement assign(Exp,int,Exp)",
"Statement localVarDecl(Type,int,String,Exp)",
"Exp newTrue(int)",
"Exp newFalse(int)",
"Exp newPlus(Exp,int,Exp)",
"Exp newMinus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newDivide(Exp,int,Exp)",
"Exp newRemainder(Exp,int,Exp)",
"Exp newAnd(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newIntegerLiteral(int,int)",
"Exp newStringLiteral(int,String)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
"String emptyString(char,char)",
"String string(char,List<Character>,char)",
"char underscore(char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
2,1,
3,1,
3,1,
1,1,
1,1,
1,1,
1,1,
2,1,
3,1,
2,1,
1,1,
3,1,
4,1,
1,1,
1,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
2,1,
2,1,
3,1,
2,1,
2,1,
1,1,
3,1,
1,1,
3,1,
2,1,
3,1,
1,1,
1,0,
};
public int[] getSigCountTable() {
  return sigCountTable;
}
public int[] getSymbolSizeTable() { return symbolSizeTable; }
private int[] symbolSizeTable = {
    0,
    0,
    0,
    1,
    1,
    1,
    0,
    1,
    0,
    1,
    0,
    1,
    1,
    0,
    0,
    0,
    0,
    1,
    1,
    0,
    0,
    0,
    1,
    0,
    0,
    1,
    1,
    0,
    1,
    0,
    1,
    0,
    1,
    0,
    0,
    0,
    1,
    0,
    1,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    -1,
    -1,
    0,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.Vector<Object> vec) {
  switch (vec.size()) {
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
