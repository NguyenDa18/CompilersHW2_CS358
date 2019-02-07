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
public int getEofSym() { return 113; }
public int getNttSym() { return 114; }
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
"`extends",
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
"`instanceof",
"INTLIT",
"STRINGLIT",
"letter",
"\"a\"",
"\"p\"",
"{\"A\"..\"Z\" \"d\" \"g\"..\"h\" \"j\"..\"k\" \"m\" \"q\" \"s\" \"w\" \"y\"..\"z\"}",
"\"v\"",
"\"c\"",
"\"f\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"\"x\"",
"\"b\"",
"\"e\"",
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
public int numSymbols() { return 115;}
private static final int MIN_REDUCTION = 310;
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
1,230, // <start>
2,300, // ws*
3,141, // <program>
4,59, // <class decl>+
5,212, // <class decl>
6,33, // `class
78,82, // " "
79,183, // "#"
93,25, // {10}
100,266, // ws
  }
,
{ // state 1
  }
,
{ // state 2
24,MIN_REDUCTION+54, // `[
76,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 3
64,30, // "e"
  }
,
{ // state 4
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 5
78,82, // " "
93,25, // {10}
100,39, // ws
114,MIN_REDUCTION+99, // $NT
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 6
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 7
7,129, // ID
16,80, // `(
31,308, // <exp>
33,113, // <exp4>
34,6, // `true
35,108, // `false
37,93, // <exp3>
38,268, // `-
39,205, // <exp2>
44,17, // <cast exp>
45,195, // <unary exp>
46,88, // <exp1>
48,121, // INTLIT
49,114, // STRINGLIT
50,301, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,252, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
71,204, // {"1".."9"}
72,24, // "0"
73,73, // digit128
74,45, // {176..185}
77,152, // "-"
79,46, // "#"
87,9, // "("
92,272, // "@"
95,228, // '"'
  }
,
{ // state 8
54,186, // "v"
57,184, // "i"
63,26, // "b"
65,270, // "n"
  }
,
{ // state 9
2,258, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 10
0x80000000|1, // match move
0x80000000|240, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 11
7,129, // ID
16,80, // `(
31,34, // <exp>
33,113, // <exp4>
34,6, // `true
35,108, // `false
37,93, // <exp3>
38,268, // `-
39,205, // <exp2>
44,17, // <cast exp>
45,195, // <unary exp>
46,88, // <exp1>
48,121, // INTLIT
49,114, // STRINGLIT
50,301, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,252, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
71,204, // {"1".."9"}
72,24, // "0"
73,73, // digit128
74,45, // {176..185}
77,152, // "-"
79,46, // "#"
87,9, // "("
92,272, // "@"
95,228, // '"'
  }
,
{ // state 12
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 13
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 14
0x80000000|1, // match move
0x80000000|169, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 15
51,41, // "a"
52,41, // "p"
53,41, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,41, // "v"
55,41, // "c"
56,41, // "f"
57,41, // "i"
58,41, // "l"
59,41, // "o"
60,41, // "r"
61,41, // "u"
62,41, // "x"
63,41, // "b"
64,41, // "e"
65,41, // "n"
66,41, // "t"
68,305, // {199..218 231..250}
69,305, // {193..198 225..230}
71,41, // {"1".."9"}
72,41, // "0"
74,305, // {176..185}
75,4, // any
76,41, // "["
77,41, // "-"
78,41, // " "
79,41, // "#"
80,41, // "&"
81,41, // ")"
82,41, // "]"
83,41, // "/"
84,41, // ";"
85,41, // "{"
86,41, // "%"
87,41, // "("
88,41, // "+"
89,41, // {0..9 11..31 "!" "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
90,41, // "_"
91,41, // "="
92,41, // "@"
93,41, // {10}
94,41, // "}"
95,41, // '"'
96,41, // "*"
97,111, // any128
98,305, // {223}
99,305, // {128..175 186..192 219..222 224 251..255}
108,294, // $$3
  }
,
{ // state 16
24,MIN_REDUCTION+53, // `[
76,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 17
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 18
25,104, // `]
82,303, // "]"
  }
,
{ // state 19
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 20
7,129, // ID
16,80, // `(
38,268, // `-
39,70, // <exp2>
44,17, // <cast exp>
45,195, // <unary exp>
46,88, // <exp1>
48,121, // INTLIT
49,114, // STRINGLIT
50,301, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,252, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
71,204, // {"1".."9"}
72,24, // "0"
73,73, // digit128
74,45, // {176..185}
77,152, // "-"
87,9, // "("
92,272, // "@"
95,228, // '"'
  }
,
{ // state 21
24,MIN_REDUCTION+109, // `[
76,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 22
61,63, // "u"
  }
,
{ // state 23
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 24
51,54, // "a"
52,54, // "p"
53,54, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,54, // "v"
55,54, // "c"
56,54, // "f"
57,54, // "i"
58,54, // "l"
59,54, // "o"
60,54, // "r"
61,54, // "u"
62,54, // "x"
63,54, // "b"
64,54, // "e"
65,54, // "n"
66,54, // "t"
69,118, // {193..198 225..230}
71,54, // {"1".."9"}
72,54, // "0"
74,118, // {176..185}
105,286, // hexDigit*
106,31, // $$2
111,137, // hexDigit
112,132, // hexDigit128
  }
,
{ // state 25
114,MIN_REDUCTION+54, // $NT
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 26
59,296, // "o"
  }
,
{ // state 27
2,128, // ws*
  }
,
{ // state 28
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 29
2,306, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 30
62,218, // "x"
  }
,
{ // state 31
0x80000000|1, // match move
0x80000000|81, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 32
2,44, // ws*
24,MIN_REDUCTION+106, // `[
76,MIN_REDUCTION+106, // "["
78,50, // " "
93,238, // {10}
100,172, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 33
7,55, // ID
50,123, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,175, // letter128
68,159, // {199..218 231..250}
69,159, // {193..198 225..230}
  }
,
{ // state 34
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 35
0x80000000|153, // match move
0x80000000|179, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 36
24,MIN_REDUCTION+46, // `[
76,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 37
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 38
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 39
114,MIN_REDUCTION+141, // $NT
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 40
0x80000000|1, // match move
0x80000000|221, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 41
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 42
2,231, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 43
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 44
0x80000000|163, // match move
0x80000000|158, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 45
0x80000000|279, // match move
0x80000000|185, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 46
56,57, // "f"
66,126, // "t"
  }
,
{ // state 47
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 48
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 49
59,296, // "o"
60,257, // "r"
  }
,
{ // state 50
0x80000000|251, // match move
0x80000000|16, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 51
2,197, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 52
24,MIN_REDUCTION+115, // `[
76,MIN_REDUCTION+115, // "["
78,50, // " "
93,238, // {10}
100,193, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 53
24,MIN_REDUCTION+44, // `[
76,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 54
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 55
8,151, // `{
11,213, // `extends
79,3, // "#"
85,242, // "{"
  }
,
{ // state 56
17,105, // `)
23,223, // <empty bracket pair>
24,18, // `[
76,130, // "["
81,51, // ")"
  }
,
{ // state 57
51,243, // "a"
  }
,
{ // state 58
24,MIN_REDUCTION+142, // `[
76,MIN_REDUCTION+142, // "["
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 59
5,274, // <class decl>
6,33, // `class
79,183, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 60
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 61
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 62
54,186, // "v"
56,57, // "f"
57,184, // "i"
63,49, // "b"
65,270, // "n"
66,126, // "t"
  }
,
{ // state 63
2,222, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 64
0x80000000|196, // match move
0x80000000|107, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 65
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 66
0x80000000|261, // match move
0x80000000|96, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 67
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 68
7,129, // ID
16,80, // `(
37,198, // <exp3>
38,268, // `-
39,205, // <exp2>
44,17, // <cast exp>
45,195, // <unary exp>
46,88, // <exp1>
48,121, // INTLIT
49,114, // STRINGLIT
50,301, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,252, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
71,204, // {"1".."9"}
72,24, // "0"
73,73, // digit128
74,45, // {176..185}
77,152, // "-"
87,9, // "("
92,272, // "@"
95,228, // '"'
  }
,
{ // state 69
2,142, // ws*
24,MIN_REDUCTION+148, // `[
76,MIN_REDUCTION+148, // "["
78,50, // " "
93,238, // {10}
100,172, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 70
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 71
2,40, // ws*
  }
,
{ // state 72
24,MIN_REDUCTION+99, // `[
76,MIN_REDUCTION+99, // "["
78,50, // " "
93,238, // {10}
100,193, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 73
0x80000000|71, // match move
0x80000000|157, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 74
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 75
0x80000000|236, // match move
0x80000000|89, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 76
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 77
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 79
2,67, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 80
7,273, // ID
15,98, // `void
19,56, // <type>
20,61, // `int
21,304, // `null
22,136, // `boolean
50,123, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,175, // letter128
68,159, // {199..218 231..250}
69,159, // {193..198 225..230}
79,8, // "#"
  }
,
{ // state 81
24,MIN_REDUCTION+114, // `[
76,MIN_REDUCTION+114, // "["
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 82
114,MIN_REDUCTION+53, // $NT
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 83
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 84
2,10, // ws*
  }
,
{ // state 85
50,181, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,188, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
70,239, // digit
71,285, // {"1".."9"}
72,285, // "0"
73,166, // digit128
74,45, // {176..185}
90,12, // "_"
98,66, // {223}
102,154, // $$0
109,302, // idChar
110,241, // idChar128
  }
,
{ // state 86
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 87
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 88
0x80000000|1, // match move
0x80000000|299, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 89
24,MIN_REDUCTION+143, // `[
76,MIN_REDUCTION+143, // "["
78,50, // " "
93,238, // {10}
100,193, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 90
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 91
0x80000000|1, // match move
0x80000000|21, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 92
2,48, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 93
38,224, // `-
40,262, // `*
41,155, // `/
42,168, // `%
43,20, // `&&
47,235, // `instanceof
77,152, // "-"
79,174, // "#"
83,264, // "/"
86,208, // "%"
92,200, // "@"
96,278, // "*"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 94
7,124, // ID
8,94, // `{
10,19, // `}
15,98, // `void
16,80, // `(
18,103, // <stmt>*
19,206, // <type>
20,61, // `int
21,304, // `null
22,136, // `boolean
26,215, // <stmt>
27,116, // <assign>
29,229, // <local var decl>
30,199, // `break
31,298, // <exp>
33,113, // <exp4>
34,6, // `true
35,108, // `false
37,93, // <exp3>
38,268, // `-
39,205, // <exp2>
44,17, // <cast exp>
45,195, // <unary exp>
46,88, // <exp1>
48,121, // INTLIT
49,114, // STRINGLIT
50,301, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,252, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
71,204, // {"1".."9"}
72,24, // "0"
73,73, // digit128
74,45, // {176..185}
77,152, // "-"
79,62, // "#"
85,242, // "{"
87,9, // "("
92,272, // "@"
94,146, // "}"
95,228, // '"'
  }
,
{ // state 95
24,MIN_REDUCTION+126, // `[
76,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 96
24,MIN_REDUCTION+124, // `[
76,MIN_REDUCTION+124, // "["
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 97
24,MIN_REDUCTION+123, // `[
76,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 98
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 99
0x80000000|1, // match move
0x80000000|52, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 100
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 101
2,128, // ws*
24,MIN_REDUCTION+150, // `[
76,MIN_REDUCTION+150, // "["
78,50, // " "
93,238, // {10}
100,172, // ws
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 102
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 103
7,124, // ID
8,94, // `{
10,134, // `}
15,98, // `void
16,80, // `(
19,206, // <type>
20,61, // `int
21,304, // `null
22,136, // `boolean
26,86, // <stmt>
27,116, // <assign>
29,229, // <local var decl>
30,199, // `break
31,298, // <exp>
33,113, // <exp4>
34,6, // `true
35,108, // `false
37,93, // <exp3>
38,268, // `-
39,205, // <exp2>
44,17, // <cast exp>
45,195, // <unary exp>
46,88, // <exp1>
48,121, // INTLIT
49,114, // STRINGLIT
50,301, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,252, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
71,204, // {"1".."9"}
72,24, // "0"
73,73, // digit128
74,45, // {176..185}
77,152, // "-"
79,62, // "#"
85,242, // "{"
87,9, // "("
92,272, // "@"
94,146, // "}"
95,228, // '"'
  }
,
{ // state 104
114,MIN_REDUCTION+17, // $NT
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 105
7,129, // ID
16,80, // `(
44,90, // <cast exp>
46,14, // <exp1>
48,121, // INTLIT
49,114, // STRINGLIT
50,301, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,252, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
71,204, // {"1".."9"}
72,24, // "0"
73,73, // digit128
74,45, // {176..185}
87,9, // "("
92,272, // "@"
95,228, // '"'
  }
,
{ // state 106
2,138, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 107
24,MIN_REDUCTION+108, // `[
76,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 108
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 109
2,167, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 111
0x80000000|27, // match move
0x80000000|101, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 112
50,181, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,203, // letter128
68,159, // {199..218 231..250}
69,159, // {193..198 225..230}
70,239, // digit
71,285, // {"1".."9"}
72,285, // "0"
73,102, // digit128
74,144, // {176..185}
90,12, // "_"
98,246, // {223}
102,74, // $$0
109,302, // idChar
110,29, // idChar128
  }
,
{ // state 113
36,68, // `+
88,220, // "+"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 114
0x80000000|1, // match move
0x80000000|36, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 115
2,44, // ws*
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 116
28,37, // `;
84,281, // ";"
  }
,
{ // state 117
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 118
0x80000000|125, // match move
0x80000000|95, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 119
70,65, // digit
71,285, // {"1".."9"}
72,285, // "0"
73,293, // digit128
74,45, // {176..185}
104,91, // $$1
  }
,
{ // state 120
0x80000000|1, // match move
0x80000000|53, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
0x80000000|1, // match move
0x80000000|280, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 122
9,297, // <decl in class>*
10,173, // `}
12,254, // <decl in class>
13,244, // <method decl>
14,277, // `public
79,275, // "#"
94,146, // "}"
  }
,
{ // state 123
50,181, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,203, // letter128
68,159, // {199..218 231..250}
69,159, // {193..198 225..230}
70,239, // digit
71,285, // {"1".."9"}
72,285, // "0"
73,102, // digit128
74,144, // {176..185}
90,12, // "_"
98,246, // {223}
101,112, // idChar*
102,78, // $$0
109,267, // idChar
110,29, // idChar128
  }
,
{ // state 124
0x80000000|307, // match move
0x80000000|234, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 125
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 126
60,42, // "r"
  }
,
{ // state 127
2,142, // ws*
  }
,
{ // state 128
0x80000000|1, // match move
0x80000000|164, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 129
0x80000000|1, // match move
0x80000000|263, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 130
2,47, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 131
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 132
0x80000000|127, // match move
0x80000000|69, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 133
24,18, // `[
76,130, // "["
  }
,
{ // state 134
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 135
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 138
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 139
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 142
0x80000000|1, // match move
0x80000000|194, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 143
58,106, // "l"
  }
,
{ // state 144
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 145
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 146
2,187, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 147
17,202, // `)
81,51, // ")"
  }
,
{ // state 148
2,10, // ws*
24,MIN_REDUCTION+146, // `[
76,MIN_REDUCTION+146, // "["
78,50, // " "
93,238, // {10}
100,172, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 149
65,265, // "n"
  }
,
{ // state 150
24,MIN_REDUCTION+118, // `[
76,MIN_REDUCTION+118, // "["
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 151
9,176, // <decl in class>*
10,76, // `}
12,254, // <decl in class>
13,244, // <method decl>
14,277, // `public
79,275, // "#"
94,146, // "}"
  }
,
{ // state 152
2,43, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 153
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 154
0x80000000|110, // match move
0x80000000|162, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 155
7,129, // ID
16,80, // `(
38,268, // `-
39,139, // <exp2>
44,17, // <cast exp>
45,195, // <unary exp>
46,88, // <exp1>
48,121, // INTLIT
49,114, // STRINGLIT
50,301, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,252, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
71,204, // {"1".."9"}
72,24, // "0"
73,73, // digit128
74,45, // {176..185}
77,152, // "-"
87,9, // "("
92,272, // "@"
95,228, // '"'
  }
,
{ // state 156
24,MIN_REDUCTION+141, // `[
76,MIN_REDUCTION+141, // "["
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 157
2,40, // ws*
24,MIN_REDUCTION+112, // `[
76,MIN_REDUCTION+112, // "["
78,50, // " "
93,238, // {10}
100,172, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 158
24,MIN_REDUCTION+105, // `[
76,MIN_REDUCTION+105, // "["
78,50, // " "
93,238, // {10}
100,193, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 160
2,253, // ws*
24,MIN_REDUCTION+100, // `[
76,MIN_REDUCTION+100, // "["
78,50, // " "
93,238, // {10}
100,172, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 161
32,7, // `=
91,109, // "="
  }
,
{ // state 162
24,MIN_REDUCTION+107, // `[
76,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 163
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 164
24,MIN_REDUCTION+149, // `[
76,MIN_REDUCTION+149, // "["
78,50, // " "
93,238, // {10}
100,193, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 165
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 166
0x80000000|60, // match move
0x80000000|97, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 167
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 168
7,129, // ID
16,80, // `(
38,268, // `-
39,180, // <exp2>
44,17, // <cast exp>
45,195, // <unary exp>
46,88, // <exp1>
48,121, // INTLIT
49,114, // STRINGLIT
50,301, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,252, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
71,204, // {"1".."9"}
72,24, // "0"
73,73, // digit128
74,45, // {176..185}
77,152, // "-"
87,9, // "("
92,272, // "@"
95,228, // '"'
  }
,
{ // state 169
24,178, // `[
76,130, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 170
23,223, // <empty bracket pair>
24,18, // `[
76,130, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 171
0x80000000|1, // match move
0x80000000|150, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 172
0x80000000|23, // match move
0x80000000|58, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 173
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 174
57,149, // "i"
  }
,
{ // state 175
2,165, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 176
10,28, // `}
12,283, // <decl in class>
13,244, // <method decl>
14,277, // `public
79,275, // "#"
94,146, // "}"
  }
,
{ // state 177
16,147, // `(
87,9, // "("
  }
,
{ // state 178
7,129, // ID
16,80, // `(
31,233, // <exp>
33,113, // <exp4>
34,6, // `true
35,108, // `false
37,93, // <exp3>
38,268, // `-
39,205, // <exp2>
44,17, // <cast exp>
45,195, // <unary exp>
46,88, // <exp1>
48,121, // INTLIT
49,114, // STRINGLIT
50,301, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,252, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
71,204, // {"1".."9"}
72,24, // "0"
73,73, // digit128
74,45, // {176..185}
77,152, // "-"
79,46, // "#"
87,9, // "("
92,272, // "@"
95,228, // '"'
  }
,
{ // state 179
24,MIN_REDUCTION+48, // `[
76,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 181
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 182
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 183
55,143, // "c"
  }
,
{ // state 184
66,79, // "t"
  }
,
{ // state 185
24,MIN_REDUCTION+50, // `[
76,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 186
59,290, // "o"
  }
,
{ // state 187
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 188
0x80000000|77, // match move
0x80000000|295, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 189
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 190
0x80000000|219, // match move
0x80000000|160, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 191
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 192
24,MIN_REDUCTION+117, // `[
76,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 193
0x80000000|250, // match move
0x80000000|156, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 194
24,MIN_REDUCTION+147, // `[
76,MIN_REDUCTION+147, // "["
78,50, // " "
93,238, // {10}
100,193, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 196
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 197
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 198
38,224, // `-
40,262, // `*
41,155, // `/
42,168, // `%
43,20, // `&&
47,235, // `instanceof
77,152, // "-"
79,174, // "#"
83,264, // "/"
86,208, // "%"
92,200, // "@"
96,278, // "*"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 199
28,140, // `;
84,281, // ";"
  }
,
{ // state 200
80,92, // "&"
  }
,
{ // state 201
2,189, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 202
8,260, // `{
85,242, // "{"
  }
,
{ // state 203
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 204
70,245, // digit
71,285, // {"1".."9"}
72,285, // "0"
73,293, // digit128
74,45, // {176..185}
103,119, // digit*
104,211, // $$1
  }
,
{ // state 205
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 206
7,161, // ID
23,223, // <empty bracket pair>
24,18, // `[
50,123, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,175, // letter128
68,159, // {199..218 231..250}
69,159, // {193..198 225..230}
76,130, // "["
  }
,
{ // state 207
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 208
2,191, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 209
24,MIN_REDUCTION+110, // `[
76,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 210
54,186, // "v"
  }
,
{ // state 211
0x80000000|1, // match move
0x80000000|209, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 212
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 213
7,276, // ID
50,123, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,175, // letter128
68,159, // {199..218 231..250}
69,159, // {193..198 225..230}
  }
,
{ // state 214
0x80000000|1, // match move
0x80000000|232, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 215
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 216
2,99, // ws*
24,MIN_REDUCTION+116, // `[
76,MIN_REDUCTION+116, // "["
78,50, // " "
93,238, // {10}
100,172, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 217
0x80000000|287, // match move
0x80000000|216, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 218
2,226, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 219
2,253, // ws*
  }
,
{ // state 220
2,131, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 221
24,MIN_REDUCTION+111, // `[
76,MIN_REDUCTION+111, // "["
78,50, // " "
93,238, // {10}
100,193, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 222
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 223
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 224
7,129, // ID
16,80, // `(
38,268, // `-
39,255, // <exp2>
44,17, // <cast exp>
45,195, // <unary exp>
46,88, // <exp1>
48,121, // INTLIT
49,114, // STRINGLIT
50,301, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,252, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
71,204, // {"1".."9"}
72,24, // "0"
73,73, // digit128
74,45, // {176..185}
77,152, // "-"
87,9, // "("
92,272, // "@"
95,228, // '"'
  }
,
{ // state 225
2,75, // ws*
24,MIN_REDUCTION+144, // `[
76,MIN_REDUCTION+144, // "["
78,50, // " "
93,238, // {10}
100,172, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 226
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 227
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 228
51,41, // "a"
52,41, // "p"
53,41, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,41, // "v"
55,41, // "c"
56,41, // "f"
57,41, // "i"
58,41, // "l"
59,41, // "o"
60,41, // "r"
61,41, // "u"
62,41, // "x"
63,41, // "b"
64,41, // "e"
65,41, // "n"
66,41, // "t"
68,305, // {199..218 231..250}
69,305, // {193..198 225..230}
71,41, // {"1".."9"}
72,41, // "0"
74,305, // {176..185}
75,145, // any
76,41, // "["
77,41, // "-"
78,41, // " "
79,41, // "#"
80,41, // "&"
81,41, // ")"
82,41, // "]"
83,41, // "/"
84,41, // ";"
85,41, // "{"
86,41, // "%"
87,41, // "("
88,41, // "+"
89,41, // {0..9 11..31 "!" "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
90,41, // "_"
91,41, // "="
92,41, // "@"
93,41, // {10}
94,41, // "}"
95,41, // '"'
96,41, // "*"
97,111, // any128
98,305, // {223}
99,305, // {128..175 186..192 219..222 224 251..255}
107,15, // any*
108,171, // $$3
  }
,
{ // state 229
28,288, // `;
84,281, // ";"
  }
,
{ // state 230
113,MIN_REDUCTION+0, // $
  }
,
{ // state 231
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 232
24,MIN_REDUCTION+113, // `[
76,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 233
25,120, // `]
82,190, // "]"
  }
,
{ // state 234
24,MIN_REDUCTION+43, // `[
32,MIN_REDUCTION+43, // `=
36,MIN_REDUCTION+43, // `+
38,MIN_REDUCTION+43, // `-
40,MIN_REDUCTION+43, // `*
41,MIN_REDUCTION+43, // `/
42,MIN_REDUCTION+43, // `%
43,MIN_REDUCTION+43, // `&&
47,MIN_REDUCTION+43, // `instanceof
76,MIN_REDUCTION+43, // "["
77,MIN_REDUCTION+43, // "-"
79,MIN_REDUCTION+43, // "#"
83,MIN_REDUCTION+43, // "/"
86,MIN_REDUCTION+43, // "%"
88,MIN_REDUCTION+43, // "+"
91,MIN_REDUCTION+43, // "="
92,MIN_REDUCTION+43, // "@"
96,MIN_REDUCTION+43, // "*"
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 235
7,273, // ID
15,98, // `void
19,170, // <type>
20,61, // `int
21,304, // `null
22,136, // `boolean
50,123, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,175, // letter128
68,159, // {199..218 231..250}
69,159, // {193..198 225..230}
79,8, // "#"
  }
,
{ // state 236
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 237
7,177, // ID
50,123, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,175, // letter128
68,159, // {199..218 231..250}
69,159, // {193..198 225..230}
  }
,
{ // state 238
0x80000000|256, // match move
0x80000000|2, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 239
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 240
24,MIN_REDUCTION+145, // `[
76,MIN_REDUCTION+145, // "["
78,50, // " "
93,238, // {10}
100,193, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 241
0x80000000|259, // match move
0x80000000|225, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 242
2,289, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 243
2,227, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 244
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 245
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 246
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 247
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 248
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 249
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 250
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 251
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 252
0x80000000|115, // match move
0x80000000|32, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 253
0x80000000|1, // match move
0x80000000|72, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 254
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 255
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 256
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 257
2,247, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 258
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 259
2,75, // ws*
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 260
7,124, // ID
8,94, // `{
10,182, // `}
15,98, // `void
16,80, // `(
18,292, // <stmt>*
19,206, // <type>
20,61, // `int
21,304, // `null
22,136, // `boolean
26,215, // <stmt>
27,116, // <assign>
29,229, // <local var decl>
30,199, // `break
31,298, // <exp>
33,113, // <exp4>
34,6, // `true
35,108, // `false
37,93, // <exp3>
38,268, // `-
39,205, // <exp2>
44,17, // <cast exp>
45,195, // <unary exp>
46,88, // <exp1>
48,121, // INTLIT
49,114, // STRINGLIT
50,301, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,252, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
71,204, // {"1".."9"}
72,24, // "0"
73,73, // digit128
74,45, // {176..185}
77,152, // "-"
79,62, // "#"
85,242, // "{"
87,9, // "("
92,272, // "@"
94,146, // "}"
95,228, // '"'
  }
,
{ // state 261
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 262
7,129, // ID
16,80, // `(
38,268, // `-
39,291, // <exp2>
44,17, // <cast exp>
45,195, // <unary exp>
46,88, // <exp1>
48,121, // INTLIT
49,114, // STRINGLIT
50,301, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,252, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
71,204, // {"1".."9"}
72,24, // "0"
73,73, // digit128
74,45, // {176..185}
77,152, // "-"
87,9, // "("
92,272, // "@"
95,228, // '"'
  }
,
{ // state 263
24,MIN_REDUCTION+43, // `[
76,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 264
2,13, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 265
2,38, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 266
114,MIN_REDUCTION+142, // $NT
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 267
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 268
7,129, // ID
38,268, // `-
45,248, // <unary exp>
46,88, // <exp1>
48,121, // INTLIT
49,114, // STRINGLIT
50,301, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,252, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
71,204, // {"1".."9"}
72,24, // "0"
73,73, // digit128
74,45, // {176..185}
77,152, // "-"
92,272, // "@"
95,228, // '"'
  }
,
{ // state 269
24,MIN_REDUCTION+52, // `[
76,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 270
61,201, // "u"
  }
,
{ // state 271
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 272
95,217, // '"'
  }
,
{ // state 273
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 274
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 275
52,22, // "p"
  }
,
{ // state 276
8,122, // `{
85,242, // "{"
  }
,
{ // state 277
15,237, // `void
79,210, // "#"
  }
,
{ // state 278
2,100, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 279
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 280
24,MIN_REDUCTION+45, // `[
76,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 281
2,135, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 282
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 283
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 284
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 285
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 286
51,54, // "a"
52,54, // "p"
53,54, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,54, // "v"
55,54, // "c"
56,54, // "f"
57,54, // "i"
58,54, // "l"
59,54, // "o"
60,54, // "r"
61,54, // "u"
62,54, // "x"
63,54, // "b"
64,54, // "e"
65,54, // "n"
66,54, // "t"
69,118, // {193..198 225..230}
71,54, // {"1".."9"}
72,54, // "0"
74,118, // {176..185}
106,214, // $$2
111,282, // hexDigit
112,132, // hexDigit128
  }
,
{ // state 287
2,99, // ws*
  }
,
{ // state 288
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 289
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 290
2,284, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 291
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 292
7,124, // ID
8,94, // `{
10,249, // `}
15,98, // `void
16,80, // `(
19,206, // <type>
20,61, // `int
21,304, // `null
22,136, // `boolean
26,86, // <stmt>
27,116, // <assign>
29,229, // <local var decl>
30,199, // `break
31,298, // <exp>
33,113, // <exp4>
34,6, // `true
35,108, // `false
37,93, // <exp3>
38,268, // `-
39,205, // <exp2>
44,17, // <cast exp>
45,195, // <unary exp>
46,88, // <exp1>
48,121, // INTLIT
49,114, // STRINGLIT
50,301, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,252, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
71,204, // {"1".."9"}
72,24, // "0"
73,73, // digit128
74,45, // {176..185}
77,152, // "-"
79,62, // "#"
85,242, // "{"
87,9, // "("
92,272, // "@"
94,146, // "}"
95,228, // '"'
  }
,
{ // state 293
0x80000000|84, // match move
0x80000000|148, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 294
0x80000000|1, // match move
0x80000000|192, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 295
24,MIN_REDUCTION+122, // `[
76,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 296
2,83, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 297
10,271, // `}
12,283, // <decl in class>
13,244, // <method decl>
14,277, // `public
79,275, // "#"
94,146, // "}"
  }
,
{ // state 298
32,11, // `=
91,109, // "="
  }
,
{ // state 299
24,178, // `[
76,130, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 300
3,207, // <program>
4,59, // <class decl>+
5,212, // <class decl>
6,33, // `class
78,82, // " "
79,183, // "#"
93,25, // {10}
100,39, // ws
  }
,
{ // state 301
50,181, // letter
51,117, // "a"
52,117, // "p"
53,117, // {"A".."Z" "d" "g".."h" "j".."k" "m" "q" "s" "w" "y".."z"}
54,117, // "v"
55,117, // "c"
56,117, // "f"
57,117, // "i"
58,117, // "l"
59,117, // "o"
60,117, // "r"
61,117, // "u"
62,117, // "x"
63,117, // "b"
64,117, // "e"
65,117, // "n"
66,117, // "t"
67,188, // letter128
68,35, // {199..218 231..250}
69,35, // {193..198 225..230}
70,239, // digit
71,285, // {"1".."9"}
72,285, // "0"
73,166, // digit128
74,45, // {176..185}
90,12, // "_"
98,66, // {223}
101,85, // idChar*
102,64, // $$0
109,267, // idChar
110,241, // idChar128
  }
,
{ // state 302
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 303
2,5, // ws*
78,82, // " "
93,25, // {10}
100,266, // ws
114,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 304
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 305
0x80000000|87, // match move
0x80000000|269, // no-match move
0x80000000|133, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 306
78,82, // " "
93,25, // {10}
100,39, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 307
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 308
MIN_REDUCTION+24, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[309][];
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
// <class decl> ::= `class ID `extends ID `{ <decl in class>* `}
(5<<16)+7,
// <class decl> ::= `class ID `extends ID `{ `}
(5<<16)+6,
// <decl in class> ::= <method decl>
(12<<16)+1,
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(13<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(13<<16)+7,
// <type> ::= `int
(19<<16)+1,
// <type> ::= `null
(19<<16)+1,
// <type> ::= `void
(19<<16)+1,
// <type> ::= `boolean
(19<<16)+1,
// <type> ::= ID
(19<<16)+1,
// <type> ::= <type> <empty bracket pair>
(19<<16)+2,
// <empty bracket pair> ::= `[ `]
(23<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(26<<16)+3,
// <stmt> ::= `{ `}
(26<<16)+2,
// <stmt> ::= <assign> `;
(26<<16)+2,
// <stmt> ::= <local var decl> `;
(26<<16)+2,
// <stmt> ::= `break `;
(26<<16)+2,
// <assign> ::= <exp> `= <exp>
(27<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(29<<16)+4,
// <exp> ::= <exp4>
(31<<16)+1,
// <exp4> ::= `true
(33<<16)+1,
// <exp4> ::= `false
(33<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(33<<16)+3,
// <exp3> ::= <exp3> `- <exp2>
(37<<16)+3,
// <exp4> ::= <exp3>
(33<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(37<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(37<<16)+3,
// <exp3> ::= <exp3> `% <exp2>
(37<<16)+3,
// <exp3> ::= <exp3> `&& <exp2>
(37<<16)+3,
// <exp3> ::= <exp2>
(37<<16)+1,
// <exp2> ::= <cast exp>
(39<<16)+1,
// <exp2> ::= <unary exp>
(39<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(44<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(44<<16)+4,
// <exp3> ::= <exp3> `instanceof <type>
(37<<16)+3,
// <unary exp> ::= `- <unary exp>
(45<<16)+2,
// <unary exp> ::= <exp1>
(45<<16)+1,
// <exp1> ::= ID
(46<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(46<<16)+4,
// <exp1> ::= INTLIT
(46<<16)+1,
// <exp1> ::= STRINGLIT
(46<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(50<<16)+1,
// letter128 ::= {193..218 225..250}
(67<<16)+1,
// digit ::= {"0".."9"}
(70<<16)+1,
// digit128 ::= {176..185}
(73<<16)+1,
// any ::= {0..127}
(75<<16)+1,
// any128 ::= {128..255}
(97<<16)+1,
// ws ::= " "
(100<<16)+1,
// ws ::= {10}
(100<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(22<<16)+4,
// `boolean ::= "#" "b" "o"
(22<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `extends ::= "#" "e" "x" ws*
(11<<16)+4,
// `extends ::= "#" "e" "x"
(11<<16)+3,
// `void ::= "#" "v" "o" ws*
(15<<16)+4,
// `void ::= "#" "v" "o"
(15<<16)+3,
// `int ::= "#" "i" "t" ws*
(20<<16)+4,
// `int ::= "#" "i" "t"
(20<<16)+3,
// `break ::= "#" "b" "r" ws*
(30<<16)+4,
// `break ::= "#" "b" "r"
(30<<16)+3,
// `false ::= "#" "f" "a" ws*
(35<<16)+4,
// `false ::= "#" "f" "a"
(35<<16)+3,
// `true ::= "#" "t" "r" ws*
(34<<16)+4,
// `true ::= "#" "t" "r"
(34<<16)+3,
// `null ::= "#" "n" "u" ws*
(21<<16)+4,
// `null ::= "#" "n" "u"
(21<<16)+3,
// `instanceof ::= "#" "i" "n" ws*
(47<<16)+4,
// `instanceof ::= "#" "i" "n"
(47<<16)+3,
// `public ::= "#" "p" "u" ws*
(14<<16)+4,
// `public ::= "#" "p" "u"
(14<<16)+3,
// `% ::= "%" ws*
(42<<16)+2,
// `% ::= "%"
(42<<16)+1,
// `&& ::= "@" "&" ws*
(43<<16)+3,
// `&& ::= "@" "&"
(43<<16)+2,
// `* ::= "*" ws*
(40<<16)+2,
// `* ::= "*"
(40<<16)+1,
// `( ::= "(" ws*
(16<<16)+2,
// `( ::= "("
(16<<16)+1,
// `) ::= ")" ws*
(17<<16)+2,
// `) ::= ")"
(17<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(38<<16)+2,
// `- ::= "-"
(38<<16)+1,
// `+ ::= "+" ws*
(36<<16)+2,
// `+ ::= "+"
(36<<16)+1,
// `= ::= "=" ws*
(32<<16)+2,
// `= ::= "="
(32<<16)+1,
// `[ ::= "[" ws*
(24<<16)+2,
// `[ ::= "["
(24<<16)+1,
// `] ::= "]" ws*
(25<<16)+2,
// `] ::= "]"
(25<<16)+1,
// `; ::= ";" ws*
(28<<16)+2,
// `; ::= ";"
(28<<16)+1,
// `/ ::= "/" ws*
(41<<16)+2,
// `/ ::= "/"
(41<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(48<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(48<<16)+2,
// INTLIT ::= digit128 ws*
(48<<16)+2,
// INTLIT ::= digit128
(48<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(48<<16)+3,
// INTLIT ::= "0" $$2
(48<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(49<<16)+3,
// STRINGLIT ::= "@" '"'
(49<<16)+2,
// STRINGLIT ::= '"' any* $$3
(49<<16)+3,
// STRINGLIT ::= '"' $$3
(49<<16)+2,
// idChar ::= letter
(109<<16)+1,
// idChar ::= digit
(109<<16)+1,
// idChar ::= "_"
(109<<16)+1,
// idChar128 ::= letter128
(110<<16)+1,
// idChar128 ::= digit128
(110<<16)+1,
// idChar128 ::= {223}
(110<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(111<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(112<<16)+1,
// digit* ::= digit* digit
(103<<16)+2,
// digit* ::= digit
(103<<16)+1,
// any* ::= any* any
(107<<16)+2,
// any* ::= any
(107<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(105<<16)+2,
// hexDigit* ::= hexDigit
(105<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// idChar* ::= idChar* idChar
(101<<16)+2,
// idChar* ::= idChar
(101<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(102<<16)+2,
// $$0 ::= idChar128
(102<<16)+1,
// $$1 ::= digit128 ws*
(104<<16)+2,
// $$1 ::= digit128
(104<<16)+1,
// $$2 ::= hexDigit128 ws*
(106<<16)+2,
// $$2 ::= hexDigit128
(106<<16)+1,
// $$3 ::= any128 ws*
(108<<16)+2,
// $$3 ::= any128
(108<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
89, // 0
89, // 1
89, // 2
89, // 3
89, // 4
89, // 5
89, // 6
89, // 7
89, // 8
89, // 9
93, // 10
89, // 11
89, // 12
89, // 13
89, // 14
89, // 15
89, // 16
89, // 17
89, // 18
89, // 19
89, // 20
89, // 21
89, // 22
89, // 23
89, // 24
89, // 25
89, // 26
89, // 27
89, // 28
89, // 29
89, // 30
89, // 31
78, // " "
89, // "!"
95, // '"'
79, // "#"
89, // "$"
86, // "%"
80, // "&"
89, // "'"
87, // "("
81, // ")"
96, // "*"
88, // "+"
89, // ","
77, // "-"
89, // "."
83, // "/"
72, // "0"
71, // "1"
71, // "2"
71, // "3"
71, // "4"
71, // "5"
71, // "6"
71, // "7"
71, // "8"
71, // "9"
89, // ":"
84, // ";"
89, // "<"
91, // "="
89, // ">"
89, // "?"
92, // "@"
53, // "A"
53, // "B"
53, // "C"
53, // "D"
53, // "E"
53, // "F"
53, // "G"
53, // "H"
53, // "I"
53, // "J"
53, // "K"
53, // "L"
53, // "M"
53, // "N"
53, // "O"
53, // "P"
53, // "Q"
53, // "R"
53, // "S"
53, // "T"
53, // "U"
53, // "V"
53, // "W"
53, // "X"
53, // "Y"
53, // "Z"
76, // "["
89, // "\"
82, // "]"
89, // "^"
90, // "_"
89, // "`"
51, // "a"
63, // "b"
55, // "c"
53, // "d"
64, // "e"
56, // "f"
53, // "g"
53, // "h"
57, // "i"
53, // "j"
53, // "k"
58, // "l"
53, // "m"
65, // "n"
59, // "o"
52, // "p"
53, // "q"
60, // "r"
53, // "s"
66, // "t"
61, // "u"
54, // "v"
53, // "w"
62, // "x"
53, // "y"
53, // "z"
85, // "{"
89, // "|"
94, // "}"
89, // "~"
89, // 127
99, // 128
99, // 129
99, // 130
99, // 131
99, // 132
99, // 133
99, // 134
99, // 135
99, // 136
99, // 137
99, // 138
99, // 139
99, // 140
99, // 141
99, // 142
99, // 143
99, // 144
99, // 145
99, // 146
99, // 147
99, // 148
99, // 149
99, // 150
99, // 151
99, // 152
99, // 153
99, // 154
99, // 155
99, // 156
99, // 157
99, // 158
99, // 159
99, // 160
99, // 161
99, // 162
99, // 163
99, // 164
99, // 165
99, // 166
99, // 167
99, // 168
99, // 169
99, // 170
99, // 171
99, // 172
99, // 173
99, // 174
99, // 175
74, // 176
74, // 177
74, // 178
74, // 179
74, // 180
74, // 181
74, // 182
74, // 183
74, // 184
74, // 185
99, // 186
99, // 187
99, // 188
99, // 189
99, // 190
99, // 191
99, // 192
69, // 193
69, // 194
69, // 195
69, // 196
69, // 197
69, // 198
68, // 199
68, // 200
68, // 201
68, // 202
68, // 203
68, // 204
68, // 205
68, // 206
68, // 207
68, // 208
68, // 209
68, // 210
68, // 211
68, // 212
68, // 213
68, // 214
68, // 215
68, // 216
68, // 217
68, // 218
99, // 219
99, // 220
99, // 221
99, // 222
98, // 223
99, // 224
69, // 225
69, // 226
69, // 227
69, // 228
69, // 229
69, // 230
68, // 231
68, // 232
68, // 233
68, // 234
68, // 235
68, // 236
68, // 237
68, // 238
68, // 239
68, // 240
68, // 241
68, // 242
68, // 243
68, // 244
68, // 245
68, // 246
68, // 247
68, // 248
68, // 249
68, // 250
99, // 251
99, // 252
99, // 253
99, // 254
99, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"<start> ::= ws* <program>", // 1
"<start> ::= ws* <program>", // 2
"<program> ::= # <class decl>+", // 3
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 4
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 5
"<class decl> ::= `class # ID `extends ID `{ <decl in class>* `}", // 6
"<class decl> ::= `class # ID `extends ID `{ <decl in class>* `}", // 7
"<decl in class> ::= <method decl>", // 8
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 9
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 10
"<type> ::= # `int", // 11
"<type> ::= # `null", // 12
"<type> ::= # `void", // 13
"<type> ::= # `boolean", // 14
"<type> ::= # ID", // 15
"<type> ::= # <type> <empty bracket pair>", // 16
"<empty bracket pair> ::= `[ `]", // 17
"<stmt> ::= # `{ <stmt>* `}", // 18
"<stmt> ::= # `{ <stmt>* `}", // 19
"<stmt> ::= <assign> `;", // 20
"<stmt> ::= <local var decl> `;", // 21
"<stmt> ::= # `break `;", // 22
"<assign> ::= <exp> # `= <exp>", // 23
"<local var decl> ::= <type> # ID `= <exp>", // 24
"<exp> ::= <exp4>", // 25
"<exp4> ::= # `true", // 26
"<exp4> ::= # `false", // 27
"<exp4> ::= <exp4> # `+ <exp3>", // 28
"<exp3> ::= <exp3> # `- <exp2>", // 29
"<exp4> ::= <exp3>", // 30
"<exp3> ::= <exp3> # `* <exp2>", // 31
"<exp3> ::= <exp3> # `/ <exp2>", // 32
"<exp3> ::= <exp3> # `% <exp2>", // 33
"<exp3> ::= <exp3> # `&& <exp2>", // 34
"<exp3> ::= <exp2>", // 35
"<exp2> ::= <cast exp>", // 36
"<exp2> ::= <unary exp>", // 37
"<cast exp> ::= # `( <type> `) <cast exp>", // 38
"<cast exp> ::= # `( <type> `) <exp1>", // 39
"<exp3> ::= <exp3> # `instanceof <type>", // 40
"<unary exp> ::= # `- <unary exp>", // 41
"<unary exp> ::= <exp1>", // 42
"<exp1> ::= # ID", // 43
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 44
"<exp1> ::= # INTLIT", // 45
"<exp1> ::= # STRINGLIT", // 46
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 47
"letter128 ::= {193..218 225..250}", // 48
"digit ::= {\"0\"..\"9\"}", // 49
"digit128 ::= {176..185}", // 50
"any ::= {0..127}", // 51
"any128 ::= {128..255}", // 52
"ws ::= \" \"", // 53
"ws ::= {10} registerNewline", // 54
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 55
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 56
"`class ::= \"#\" \"c\" \"l\" ws*", // 57
"`class ::= \"#\" \"c\" \"l\" ws*", // 58
"`extends ::= \"#\" \"e\" \"x\" ws*", // 59
"`extends ::= \"#\" \"e\" \"x\" ws*", // 60
"`void ::= \"#\" \"v\" \"o\" ws*", // 61
"`void ::= \"#\" \"v\" \"o\" ws*", // 62
"`int ::= \"#\" \"i\" \"t\" ws*", // 63
"`int ::= \"#\" \"i\" \"t\" ws*", // 64
"`break ::= \"#\" \"b\" \"r\" ws*", // 65
"`break ::= \"#\" \"b\" \"r\" ws*", // 66
"`false ::= \"#\" \"f\" \"a\" ws*", // 67
"`false ::= \"#\" \"f\" \"a\" ws*", // 68
"`true ::= \"#\" \"t\" \"r\" ws*", // 69
"`true ::= \"#\" \"t\" \"r\" ws*", // 70
"`null ::= \"#\" \"n\" \"u\" ws*", // 71
"`null ::= \"#\" \"n\" \"u\" ws*", // 72
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 73
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 74
"`public ::= \"#\" \"p\" \"u\" ws*", // 75
"`public ::= \"#\" \"p\" \"u\" ws*", // 76
"`% ::= \"%\" ws*", // 77
"`% ::= \"%\" ws*", // 78
"`&& ::= \"@\" \"&\" ws*", // 79
"`&& ::= \"@\" \"&\" ws*", // 80
"`* ::= \"*\" ws*", // 81
"`* ::= \"*\" ws*", // 82
"`( ::= \"(\" ws*", // 83
"`( ::= \"(\" ws*", // 84
"`) ::= \")\" ws*", // 85
"`) ::= \")\" ws*", // 86
"`{ ::= \"{\" ws*", // 87
"`{ ::= \"{\" ws*", // 88
"`} ::= \"}\" ws*", // 89
"`} ::= \"}\" ws*", // 90
"`- ::= \"-\" ws*", // 91
"`- ::= \"-\" ws*", // 92
"`+ ::= \"+\" ws*", // 93
"`+ ::= \"+\" ws*", // 94
"`= ::= \"=\" ws*", // 95
"`= ::= \"=\" ws*", // 96
"`[ ::= \"[\" ws*", // 97
"`[ ::= \"[\" ws*", // 98
"`] ::= \"]\" ws*", // 99
"`] ::= \"]\" ws*", // 100
"`; ::= \";\" ws*", // 101
"`; ::= \";\" ws*", // 102
"`/ ::= \"/\" ws*", // 103
"`/ ::= \"/\" ws*", // 104
"ID ::= letter128 ws*", // 105
"ID ::= letter128 ws*", // 106
"ID ::= letter idChar* idChar128 ws*", // 107
"ID ::= letter idChar* idChar128 ws*", // 108
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 109
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 110
"INTLIT ::= digit128 ws*", // 111
"INTLIT ::= digit128 ws*", // 112
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 113
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 114
"STRINGLIT ::= \"@\" \'\"\' ws*", // 115
"STRINGLIT ::= \"@\" \'\"\' ws*", // 116
"STRINGLIT ::= \'\"\' any* any128 ws*", // 117
"STRINGLIT ::= \'\"\' any* any128 ws*", // 118
"idChar ::= letter", // 119
"idChar ::= digit", // 120
"idChar ::= \"_\"", // 121
"idChar128 ::= letter128", // 122
"idChar128 ::= digit128", // 123
"idChar128 ::= {223}", // 124
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 125
"hexDigit128 ::= {176..185 193..198 225..230}", // 126
"digit* ::= digit* digit", // 127
"digit* ::= digit* digit", // 128
"any* ::= any* any", // 129
"any* ::= any* any", // 130
"<decl in class>* ::= <decl in class>* <decl in class>", // 131
"<decl in class>* ::= <decl in class>* <decl in class>", // 132
"hexDigit* ::= hexDigit* hexDigit", // 133
"hexDigit* ::= hexDigit* hexDigit", // 134
"<stmt>* ::= <stmt>* <stmt>", // 135
"<stmt>* ::= <stmt>* <stmt>", // 136
"idChar* ::= idChar* idChar", // 137
"idChar* ::= idChar* idChar", // 138
"<class decl>+ ::= <class decl>", // 139
"<class decl>+ ::= <class decl>+ <class decl>", // 140
"ws* ::= ws* ws", // 141
"ws* ::= ws* ws", // 142
"", // 143
"", // 144
"", // 145
"", // 146
"", // 147
"", // 148
"", // 149
"", // 150
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
    { // 6: <class decl> ::= `class [#] ID `extends ID `{ <decl in class>* `} @createdExtendsClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 7: <class decl> ::= `class [#] ID `extends ID `{ [<decl in class>*] `} @createdExtendsClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 9: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
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
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
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
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 11: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 12: <type> ::= [#] `null @nullType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 13: <type> ::= [#] `void @voidType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 14: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 15: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 16: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 17: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 18: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 19: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 20: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 21: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 22: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 23: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 24: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 25: <exp> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 26: <exp4> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 27: <exp4> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 28: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 29: <exp3> ::= <exp3> [#] `- <exp2> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 30: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 31: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 32: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 33: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 34: <exp3> ::= <exp3> [#] `&& <exp2> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 35: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 36: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 37: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 38: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 39: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 40: <exp3> ::= <exp3> [#] `instanceof <type> @newInstanceOf(Exp,int,Type)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 41: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 42: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 43: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 44: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 45: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 46: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 47: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 48: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 49: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 50: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 51: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 52: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 53: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 54: ws ::= {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 55: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 56: `boolean ::= "#" "b" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 58: `class ::= "#" "c" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 59: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 60: `extends ::= "#" "e" "x" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 62: `void ::= "#" "v" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 63: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 64: `int ::= "#" "i" "t" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 65: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 66: `break ::= "#" "b" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 68: `false ::= "#" "f" "a" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 69: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 70: `true ::= "#" "t" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 71: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 72: `null ::= "#" "n" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 73: `instanceof ::= "#" "i" "n" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 74: `instanceof ::= "#" "i" "n" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 75: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 76: `public ::= "#" "p" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 77: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `% ::= "%" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 80: `&& ::= "@" "&" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 81: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `* ::= "*" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `( ::= "(" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 86: `) ::= ")" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 87: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 88: `{ ::= "{" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 89: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 90: `} ::= "}" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 91: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 92: `- ::= "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 93: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 94: `+ ::= "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 95: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 96: `= ::= "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 97: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 98: `[ ::= "[" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 100: `] ::= "]" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 101: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 102: `; ::= ";" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 103: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 104: `/ ::= "/" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 105: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 106: ID ::= letter128 [ws*] @text
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 107: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 108: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 109: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 110: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 111: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 112: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 113: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 114: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 115: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 116: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 117: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 118: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 119: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 120: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 121: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 122: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 123: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 124: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 125: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 126: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 127: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 128: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 129: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 130: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 131: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 132: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 133: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 134: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 135: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 136: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 137: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 138: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 139: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 140: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 141: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 142: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 143: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 144: $$0 ::= idChar128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 145: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 146: $$1 ::= digit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 147: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 148: $$2 ::= hexDigit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 149: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 150: $$3 ::= any128 [ws*] @pass
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
      ((37<<5)|0x5)/*methodCall:37*/,
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
      String parm2 = (String)si.popPb();
      List<Decl> parm3 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createdExtendsClassDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.nullType(parm0);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.voidType(parm0);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 13: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 17: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Type parm2 = (Type)si.popPb();
      Exp result = actionObject.newInstanceOf(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 27: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 30: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 31: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 32: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 33: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 34: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 35: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 36: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 37: {
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
"ClassDecl createdExtendsClassDecl(int,String,String,List<Decl>)",
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
"Exp newInstanceOf(Exp,int,Type)",
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
4,1,
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
    0,
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
