package
parse
;
import
java
.
util
.
ArrayList
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
public int getEofSym() { return 136; }
public int getNttSym() { return 137; }
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
"`boolean",
"`null",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"`;",
"<local var decl>",
"`if",
"<exp>",
"`else",
"`for",
"`while",
"`break",
"`=",
"`++",
"`switch",
"<case>*",
"<case>",
"`case",
"<exp5>",
"<exp4>",
"<exp3>",
"<exp2>",
"<exp1>",
"`<",
"`<=",
"`>",
"`+",
"`-",
"`*",
"`/",
"`%",
"`!",
"INTLIT",
"STRINGLIT",
"CHARLIT",
"`.",
"`this",
"`true",
"`false",
"`new",
"<empty bracket pair>**",
"letter",
"\"a\"",
"\"p\"",
"\"s\"",
"\"v\"",
"\"c\"",
"\"f\"",
"{\"A\"..\"Z\" \"d\" \"g\" \"j\"..\"k\" \"m\" \"q\" \"y\"..\"z\"}",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"\"x\"",
"\"b\"",
"\"e\"",
"\"h\"",
"\"n\"",
"\"t\"",
"\"w\"",
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
"\"<\"",
"\" \"",
"\"#\"",
"\")\"",
"\"]\"",
"\"/\"",
"\";\"",
"\">\"",
"\"{\"",
"\"%\"",
"\"(\"",
"\"+\"",
"\".\"",
"\"_\"",
"\"=\"",
"\"@\"",
"10",
"{0..9 11..31 \"$\" \"&\" \",\" \":\" \"?\" \"\\\" \"^\" \"`\" \"|\" \"~\"..127}",
"\"}\"",
"\"!\"",
"\"\'\"",
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
"<empty bracket pair>*",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 138;}
private static final int MIN_REDUCTION = 588;
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
1,518, // <start>
2,285, // ws*
3,223, // <program>
4,68, // <class decl>+
5,506, // <class decl>
6,493, // `class
97,92, // " "
98,143, // "#"
112,32, // {10}
122,130, // ws
  }
,
{ // state 1
  }
,
{ // state 2
24,MIN_REDUCTION+71, // `[
94,MIN_REDUCTION+71, // "["
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 3
97,92, // " "
112,32, // {10}
122,45, // ws
137,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 4
0x80000000|1, // match move
0x80000000|200, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 5
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 6
0x80000000|563, // match move
0x80000000|505, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 7
0x80000000|365, // match move
0x80000000|536, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 8
0x80000000|1, // match move
0x80000000|525, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 9
2,12, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 10
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 11
0x80000000|85, // match move
0x80000000|397, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 13
2,3, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
137,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 14
24,MIN_REDUCTION+70, // `[
94,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 15
0x80000000|1, // match move
0x80000000|378, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 16
0x80000000|263, // match move
0x80000000|317, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 17
0x80000000|1, // match move
0x80000000|267, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 18
32,98, // `else
98,277, // "#"
  }
,
{ // state 19
16,356, // `(
106,211, // "("
  }
,
{ // state 20
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 21
28,109, // `;
102,290, // ";"
  }
,
{ // state 22
96,56, // "<"
  }
,
{ // state 23
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 24
24,MIN_REDUCTION+150, // `[
94,MIN_REDUCTION+150, // "["
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 25
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 26
0x80000000|492, // match move
0x80000000|184, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 27
24,MIN_REDUCTION+151, // `[
94,MIN_REDUCTION+151, // "["
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 28
47,544, // `<
48,94, // `<=
49,73, // `>
96,542, // "<"
103,112, // ">"
111,22, // "@"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 29
83,121, // "t"
  }
,
{ // state 30
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 31
97,575, // " "
112,185, // {10}
122,110, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 32
137,MIN_REDUCTION+71, // $NT
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 33
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 34
0x80000000|1, // match move
0x80000000|225, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 35
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 36
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 37
0x80000000|221, // match move
0x80000000|265, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 38
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 39
0x80000000|538, // match move
0x80000000|580, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 40
28,310, // `;
102,361, // ";"
  }
,
{ // state 41
2,194, // ws*
  }
,
{ // state 42
24,MIN_REDUCTION+54, // `[
94,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 43
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 44
2,527, // ws*
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 45
137,MIN_REDUCTION+187, // $NT
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 46
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 47
2,321, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 48
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 49
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 50
2,330, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 51
0x80000000|459, // match move
0x80000000|455, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 52
7,469, // ID
16,433, // `(
22,4, // `null
27,214, // <assign>
31,283, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 53
0x80000000|268, // match move
0x80000000|193, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 54
24,MIN_REDUCTION+61, // `[
94,MIN_REDUCTION+61, // "["
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 55
10,168, // `}
39,465, // <case>*
40,494, // <case>
41,533, // `case
98,107, // "#"
114,474, // "}"
  }
,
{ // state 56
2,36, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 57
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 58
16,348, // `(
106,211, // "("
  }
,
{ // state 59
2,33, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 60
0x80000000|423, // match move
0x80000000|537, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 61
2,57, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 62
24,MIN_REDUCTION+156, // `[
94,MIN_REDUCTION+156, // "["
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 63
24,MIN_REDUCTION+52, // `[
94,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 64
0x80000000|568, // match move
0x80000000|497, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 65
0x80000000|231, // match move
0x80000000|579, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 66
24,477, // `[
59,251, // `.
94,61, // "["
108,59, // "."
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 67
16,334, // `(
106,211, // "("
  }
,
{ // state 68
5,560, // <class decl>
6,493, // `class
98,143, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 69
77,162, // "u"
  }
,
{ // state 70
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 71
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 72
75,457, // "o"
76,375, // "r"
  }
,
{ // state 73
7,430, // ID
16,433, // `(
22,4, // `null
43,308, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 74
67,372, // "p"
  }
,
{ // state 75
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 76
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 77
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 78
2,385, // ws*
  }
,
{ // state 79
7,430, // ID
16,433, // `(
22,4, // `null
31,510, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 80
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 81
0x80000000|115, // match move
0x80000000|501, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 82
7,430, // ID
16,433, // `(
22,4, // `null
44,238, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 83
17,MIN_REDUCTION+130, // `)
25,MIN_REDUCTION+130, // `]
28,MIN_REDUCTION+130, // `;
64,MIN_REDUCTION+130, // <empty bracket pair>**
97,340, // " "
99,MIN_REDUCTION+130, // ")"
100,MIN_REDUCTION+130, // "]"
102,MIN_REDUCTION+130, // ";"
112,237, // {10}
122,205, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 84
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 85
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 86
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 87
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 88
2,527, // ws*
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 89
2,163, // ws*
97,575, // " "
112,185, // {10}
122,343, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 90
24,MIN_REDUCTION+96, // `[
94,MIN_REDUCTION+96, // "["
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 91
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 92
137,MIN_REDUCTION+70, // $NT
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 93
2,163, // ws*
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 94
7,430, // ID
16,433, // `(
22,4, // `null
43,384, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 95
2,48, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 96
65,187, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,489, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
88,524, // digit
89,273, // {"1".."9"}
90,273, // "0"
91,178, // digit128
92,53, // {176..185}
109,10, // "_"
120,357, // {223}
123,371, // idChar*
124,261, // $$0
131,379, // idChar
132,60, // idChar128
  }
,
{ // state 97
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 98
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
190, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
387, // `void
433, // `(
-1, // `)
-1, // <stmt>*
502, // <type>
352, // `int
149, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
394, // <stmt>
129, // <assign>
86, // `;
517, // <local var decl>
500, // `if
283, // <exp>
-1, // `else
134, // `for
304, // `while
498, // `break
-1, // `=
-1, // `++
67, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
28, // <exp5>
266, // <exp4>
439, // <exp3>
209, // <exp2>
123, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
468, // `+
293, // `-
-1, // `*
-1, // `/
-1, // `%
241, // `!
418, // INTLIT
127, // STRINGLIT
331, // CHARLIT
-1, // `.
253, // `this
15, // `true
255, // `false
368, // `new
-1, // <empty bracket pair>**
96, // letter
413, // "a"
413, // "p"
413, // "s"
413, // "v"
413, // "c"
413, // "f"
413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
413, // "i"
413, // "l"
413, // "o"
413, // "r"
413, // "u"
413, // "x"
413, // "b"
413, // "e"
413, // "h"
413, // "n"
413, // "t"
413, // "w"
136, // letter128
327, // {199..218 231..250}
327, // {193..198 225..230}
-1, // digit
382, // {"1".."9"}
305, // "0"
482, // digit128
53, // {176..185}
-1, // any
-1, // "["
95, // "-"
-1, // "<"
-1, // " "
341, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
361, // ";"
-1, // ">"
254, // "{"
-1, // "%"
211, // "("
553, // "+"
-1, // "."
-1, // "_"
-1, // "="
426, // "@"
-1, // {10}
-1, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "}"
364, // "!"
437, // "'"
312, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 99
0x80000000|215, // match move
0x80000000|557, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 100
24,MIN_REDUCTION+191, // `[
94,MIN_REDUCTION+191, // "["
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 101
0x80000000|545, // match move
0x80000000|322, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 102
8,516, // `{
104,254, // "{"
  }
,
{ // state 103
0x80000000|1, // match move
0x80000000|24, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 104
17,197, // `)
99,432, // ")"
  }
,
{ // state 105
24,MIN_REDUCTION+167, // `[
94,MIN_REDUCTION+167, // "["
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 106
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 107
70,419, // "c"
  }
,
{ // state 108
0x80000000|1, // match move
0x80000000|62, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 109
0x80000000|495, // match move
0x80000000|395, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 110
0x80000000|43, // match move
0x80000000|562, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 111
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 112
0x80000000|1, // match move
0x80000000|50, // no-match move
// T-test match for "=":
110,
  }
,
{ // state 113
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 114
0x80000000|585, // match move
0x80000000|534, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 115
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 116
0x80000000|337, // match move
0x80000000|161, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 117
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
190, // `{
-1, // <decl in class>*
440, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
387, // `void
433, // `(
-1, // `)
-1, // <stmt>*
502, // <type>
352, // `int
149, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
97, // <stmt>
129, // <assign>
86, // `;
517, // <local var decl>
500, // `if
283, // <exp>
-1, // `else
134, // `for
304, // `while
498, // `break
-1, // `=
-1, // `++
67, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
28, // <exp5>
266, // <exp4>
439, // <exp3>
209, // <exp2>
123, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
468, // `+
293, // `-
-1, // `*
-1, // `/
-1, // `%
241, // `!
418, // INTLIT
127, // STRINGLIT
331, // CHARLIT
-1, // `.
253, // `this
15, // `true
255, // `false
368, // `new
-1, // <empty bracket pair>**
96, // letter
413, // "a"
413, // "p"
413, // "s"
413, // "v"
413, // "c"
413, // "f"
413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
413, // "i"
413, // "l"
413, // "o"
413, // "r"
413, // "u"
413, // "x"
413, // "b"
413, // "e"
413, // "h"
413, // "n"
413, // "t"
413, // "w"
136, // letter128
327, // {199..218 231..250}
327, // {193..198 225..230}
-1, // digit
382, // {"1".."9"}
305, // "0"
482, // digit128
53, // {176..185}
-1, // any
-1, // "["
95, // "-"
-1, // "<"
-1, // " "
341, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
361, // ";"
-1, // ">"
254, // "{"
-1, // "%"
211, // "("
553, // "+"
-1, // "."
-1, // "_"
-1, // "="
426, // "@"
-1, // {10}
-1, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
380, // "}"
364, // "!"
437, // "'"
312, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 118
137,MIN_REDUCTION+17, // $NT
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 119
17,284, // `)
99,432, // ")"
  }
,
{ // state 120
0x80000000|585, // match move
0x80000000|313, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
2,80, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 123
0x80000000|1, // match move
0x80000000|126, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 124
2,155, // ws*
24,MIN_REDUCTION+196, // `[
94,MIN_REDUCTION+196, // "["
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 125
2,71, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 126
24,477, // `[
59,251, // `.
94,61, // "["
108,59, // "."
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 127
0x80000000|1, // match move
0x80000000|42, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 128
7,430, // ID
22,4, // `null
46,218, // <exp1>
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
98,393, // "#"
111,426, // "@"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 129
28,329, // `;
102,361, // ";"
  }
,
{ // state 130
137,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 131
0x80000000|77, // match move
0x80000000|146, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 132
28,411, // `;
102,361, // ";"
  }
,
{ // state 133
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 134
16,219, // `(
106,211, // "("
  }
,
{ // state 135
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 136
0x80000000|581, // match move
0x80000000|272, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 137
2,138, // ws*
24,MIN_REDUCTION+198, // `[
94,MIN_REDUCTION+198, // "["
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 138
0x80000000|1, // match move
0x80000000|460, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 139
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 140
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 143
70,399, // "c"
  }
,
{ // state 144
10,549, // `}
39,342, // <case>*
40,494, // <case>
41,533, // `case
98,107, // "#"
114,380, // "}"
  }
,
{ // state 145
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 147
17,401, // `)
99,432, // ")"
  }
,
{ // state 148
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
190, // `{
-1, // <decl in class>*
173, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
387, // `void
433, // `(
-1, // `)
386, // <stmt>*
502, // <type>
352, // `int
149, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
483, // <stmt>
129, // <assign>
86, // `;
517, // <local var decl>
500, // `if
283, // <exp>
-1, // `else
134, // `for
304, // `while
498, // `break
-1, // `=
-1, // `++
67, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
28, // <exp5>
266, // <exp4>
439, // <exp3>
209, // <exp2>
123, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
468, // `+
293, // `-
-1, // `*
-1, // `/
-1, // `%
241, // `!
418, // INTLIT
127, // STRINGLIT
331, // CHARLIT
-1, // `.
253, // `this
15, // `true
255, // `false
368, // `new
-1, // <empty bracket pair>**
96, // letter
413, // "a"
413, // "p"
413, // "s"
413, // "v"
413, // "c"
413, // "f"
413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
413, // "i"
413, // "l"
413, // "o"
413, // "r"
413, // "u"
413, // "x"
413, // "b"
413, // "e"
413, // "h"
413, // "n"
413, // "t"
413, // "w"
136, // letter128
327, // {199..218 231..250}
327, // {193..198 225..230}
-1, // digit
382, // {"1".."9"}
305, // "0"
482, // digit128
53, // {176..185}
-1, // any
-1, // "["
95, // "-"
-1, // "<"
-1, // " "
341, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
361, // ";"
-1, // ">"
254, // "{"
-1, // "%"
211, // "("
553, // "+"
-1, // "."
-1, // "_"
-1, // "="
426, // "@"
-1, // {10}
-1, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
474, // "}"
364, // "!"
437, // "'"
312, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 149
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 150
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 151
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 152
16,79, // `(
106,211, // "("
  }
,
{ // state 153
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 154
2,332, // ws*
24,MIN_REDUCTION+153, // `[
94,MIN_REDUCTION+153, // "["
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 155
0x80000000|1, // match move
0x80000000|496, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 156
17,128, // `)
23,228, // <empty bracket pair>
24,311, // `[
94,61, // "["
99,432, // ")"
  }
,
{ // state 157
2,336, // ws*
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 158
77,162, // "u"
80,288, // "e"
  }
,
{ // state 159
83,434, // "t"
  }
,
{ // state 160
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 162
0x80000000|326, // match move
0x80000000|529, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 163
0x80000000|5, // match move
0x80000000|31, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 164
96,56, // "<"
107,362, // "+"
  }
,
{ // state 165
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 166
2,224, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 167
25,479, // `]
100,39, // "]"
  }
,
{ // state 168
0x80000000|30, // match move
0x80000000|210, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 169
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 170
0x80000000|403, // match move
0x80000000|456, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 171
0x80000000|292, // match move
0x80000000|207, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 172
24,477, // `[
59,251, // `.
94,61, // "["
108,59, // "."
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 173
0x80000000|478, // match move
0x80000000|424, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 174
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 175
36,296, // `=
110,353, // "="
  }
,
{ // state 176
0x80000000|289, // match move
0x80000000|485, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 177
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 178
0x80000000|350, // match move
0x80000000|388, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 179
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 181
24,MIN_REDUCTION+94, // `[
94,MIN_REDUCTION+94, // "["
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 182
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 183
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 184
2,34, // ws*
24,MIN_REDUCTION+161, // `[
94,MIN_REDUCTION+161, // "["
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 185
0x80000000|250, // match move
0x80000000|521, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 186
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 188
24,MIN_REDUCTION+92, // `[
94,MIN_REDUCTION+92, // "["
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 189
7,430, // ID
16,433, // `(
22,4, // `null
31,471, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 190
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
190, // `{
-1, // <decl in class>*
466, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
387, // `void
433, // `(
-1, // `)
117, // <stmt>*
502, // <type>
352, // `int
149, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
483, // <stmt>
129, // <assign>
86, // `;
517, // <local var decl>
500, // `if
283, // <exp>
-1, // `else
134, // `for
304, // `while
498, // `break
-1, // `=
-1, // `++
67, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
28, // <exp5>
266, // <exp4>
439, // <exp3>
209, // <exp2>
123, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
468, // `+
293, // `-
-1, // `*
-1, // `/
-1, // `%
241, // `!
418, // INTLIT
127, // STRINGLIT
331, // CHARLIT
-1, // `.
253, // `this
15, // `true
255, // `false
368, // `new
-1, // <empty bracket pair>**
96, // letter
413, // "a"
413, // "p"
413, // "s"
413, // "v"
413, // "c"
413, // "f"
413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
413, // "i"
413, // "l"
413, // "o"
413, // "r"
413, // "u"
413, // "x"
413, // "b"
413, // "e"
413, // "h"
413, // "n"
413, // "t"
413, // "w"
136, // letter128
327, // {199..218 231..250}
327, // {193..198 225..230}
-1, // digit
382, // {"1".."9"}
305, // "0"
482, // digit128
53, // {176..185}
-1, // any
-1, // "["
95, // "-"
-1, // "<"
-1, // " "
341, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
361, // ";"
-1, // ">"
254, // "{"
-1, // "%"
211, // "("
553, // "+"
-1, // "."
-1, // "_"
-1, // "="
426, // "@"
-1, // {10}
-1, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
380, // "}"
364, // "!"
437, // "'"
312, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 191
7,430, // ID
16,433, // `(
22,4, // `null
31,147, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 192
2,513, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 193
24,MIN_REDUCTION+67, // `[
94,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 194
0x80000000|1, // match move
0x80000000|181, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 195
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 196
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 197
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
148, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
387, // `void
433, // `(
-1, // `)
-1, // <stmt>*
502, // <type>
352, // `int
149, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
176, // <stmt>
233, // <assign>
421, // `;
21, // <local var decl>
152, // `if
283, // <exp>
-1, // `else
222, // `for
58, // `while
480, // `break
-1, // `=
-1, // `++
246, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
28, // <exp5>
266, // <exp4>
439, // <exp3>
209, // <exp2>
123, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
468, // `+
293, // `-
-1, // `*
-1, // `/
-1, // `%
241, // `!
418, // INTLIT
127, // STRINGLIT
331, // CHARLIT
-1, // `.
253, // `this
15, // `true
255, // `false
368, // `new
-1, // <empty bracket pair>**
96, // letter
413, // "a"
413, // "p"
413, // "s"
413, // "v"
413, // "c"
413, // "f"
413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
413, // "i"
413, // "l"
413, // "o"
413, // "r"
413, // "u"
413, // "x"
413, // "b"
413, // "e"
413, // "h"
413, // "n"
413, // "t"
413, // "w"
136, // letter128
327, // {199..218 231..250}
327, // {193..198 225..230}
-1, // digit
382, // {"1".."9"}
305, // "0"
482, // digit128
53, // {176..185}
-1, // any
-1, // "["
95, // "-"
-1, // "<"
-1, // " "
341, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
290, // ";"
-1, // ">"
254, // "{"
-1, // "%"
211, // "("
553, // "+"
-1, // "."
-1, // "_"
-1, // "="
426, // "@"
-1, // {10}
-1, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "}"
364, // "!"
437, // "'"
312, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 198
24,MIN_REDUCTION+149, // `[
94,MIN_REDUCTION+149, // "["
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 199
2,8, // ws*
24,MIN_REDUCTION+194, // `[
94,MIN_REDUCTION+194, // "["
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 200
24,MIN_REDUCTION+60, // `[
94,MIN_REDUCTION+60, // "["
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 201
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 202
0x80000000|41, // match move
0x80000000|508, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 203
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 204
24,MIN_REDUCTION+158, // `[
94,MIN_REDUCTION+158, // "["
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 205
0x80000000|247, // match move
0x80000000|453, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 206
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 207
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 208
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 209
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 210
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 211
2,252, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 212
23,264, // <empty bracket pair>
24,258, // `[
94,61, // "["
  }
,
{ // state 213
0x80000000|1, // match move
0x80000000|54, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 214
17,300, // `)
99,432, // ")"
  }
,
{ // state 215
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 216
0x80000000|1, // match move
0x80000000|520, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 217
69,325, // "v"
73,159, // "i"
79,446, // "b"
82,69, // "n"
  }
,
{ // state 218
0x80000000|1, // match move
0x80000000|303, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 219
7,469, // ID
16,433, // `(
22,4, // `null
27,381, // <assign>
31,283, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 220
24,MIN_REDUCTION+152, // `[
94,MIN_REDUCTION+152, // "["
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 222
16,351, // `(
106,211, // "("
  }
,
{ // state 223
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 224
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 225
24,MIN_REDUCTION+160, // `[
94,MIN_REDUCTION+160, // "["
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 226
0x80000000|428, // match move
0x80000000|142, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 227
0x80000000|201, // match move
0x80000000|355, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 228
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 229
50,82, // `+
51,318, // `-
95,95, // "-"
107,553, // "+"
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 230
97,MIN_REDUCTION+70, // " "
112,MIN_REDUCTION+70, // {10}
122,MIN_REDUCTION+70, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 231
2,392, // ws*
  }
,
{ // state 232
65,187, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,208, // letter128
86,174, // {199..218 231..250}
87,174, // {193..198 225..230}
88,524, // digit
89,273, // {"1".."9"}
90,273, // "0"
91,113, // digit128
92,447, // {176..185}
109,10, // "_"
120,530, // {223}
123,402, // idChar*
124,504, // $$0
131,379, // idChar
132,278, // idChar128
  }
,
{ // state 233
28,16, // `;
102,290, // ";"
  }
,
{ // state 234
25,416, // `]
100,39, // "]"
  }
,
{ // state 235
17,541, // `)
99,432, // ")"
  }
,
{ // state 236
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 237
0x80000000|535, // match move
0x80000000|2, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 238
52,260, // `*
53,452, // `/
54,464, // `%
101,9, // "/"
105,406, // "%"
118,499, // "*"
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 239
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 240
2,566, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 241
7,430, // ID
22,4, // `null
46,248, // <exp1>
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
98,393, // "#"
111,426, // "@"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 242
8,144, // `{
104,254, // "{"
  }
,
{ // state 243
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 244
0x80000000|139, // match move
0x80000000|133, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 245
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 246
16,191, // `(
106,211, // "("
  }
,
{ // state 247
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 248
0x80000000|1, // match move
0x80000000|172, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 249
0x80000000|333, // match move
0x80000000|83, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 250
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 251
7,17, // ID
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
  }
,
{ // state 252
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 253
0x80000000|1, // match move
0x80000000|391, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 254
2,276, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 255
0x80000000|1, // match move
0x80000000|280, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 256
2,385, // ws*
24,MIN_REDUCTION+117, // `[
94,MIN_REDUCTION+117, // "["
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 257
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 258
25,226, // `]
100,39, // "]"
  }
,
{ // state 259
24,MIN_REDUCTION+51, // `[
94,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 260
7,430, // ID
16,433, // `(
22,4, // `null
45,569, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 261
0x80000000|182, // match move
0x80000000|198, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 262
7,572, // ID
65,232, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,339, // letter128
86,174, // {199..218 231..250}
87,174, // {193..198 225..230}
  }
,
{ // state 263
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 264
0x80000000|444, // match move
0x80000000|519, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 265
24,MIN_REDUCTION+60, // `[
36,MIN_REDUCTION+60, // `=
47,MIN_REDUCTION+60, // `<
48,MIN_REDUCTION+60, // `<=
49,MIN_REDUCTION+60, // `>
50,MIN_REDUCTION+60, // `+
51,MIN_REDUCTION+60, // `-
52,MIN_REDUCTION+60, // `*
53,MIN_REDUCTION+60, // `/
54,MIN_REDUCTION+60, // `%
59,MIN_REDUCTION+60, // `.
94,MIN_REDUCTION+60, // "["
95,MIN_REDUCTION+60, // "-"
96,MIN_REDUCTION+60, // "<"
101,MIN_REDUCTION+60, // "/"
103,MIN_REDUCTION+60, // ">"
105,MIN_REDUCTION+60, // "%"
107,MIN_REDUCTION+60, // "+"
108,MIN_REDUCTION+60, // "."
110,MIN_REDUCTION+60, // "="
111,MIN_REDUCTION+60, // "@"
118,MIN_REDUCTION+60, // "*"
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 266
50,82, // `+
51,318, // `-
95,95, // "-"
107,553, // "+"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 267
24,MIN_REDUCTION+56, // `[
94,MIN_REDUCTION+56, // "["
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 268
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 269
24,MIN_REDUCTION+53, // `[
94,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 270
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 271
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 272
2,51, // ws*
24,MIN_REDUCTION+147, // `[
94,MIN_REDUCTION+147, // "["
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 273
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 274
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 275
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
148, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
387, // `void
433, // `(
-1, // `)
-1, // <stmt>*
502, // <type>
352, // `int
149, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
462, // <stmt>
233, // <assign>
421, // `;
21, // <local var decl>
152, // `if
283, // <exp>
-1, // `else
222, // `for
58, // `while
480, // `break
-1, // `=
-1, // `++
246, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
28, // <exp5>
266, // <exp4>
439, // <exp3>
209, // <exp2>
123, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
468, // `+
293, // `-
-1, // `*
-1, // `/
-1, // `%
241, // `!
418, // INTLIT
127, // STRINGLIT
331, // CHARLIT
-1, // `.
253, // `this
15, // `true
255, // `false
368, // `new
-1, // <empty bracket pair>**
96, // letter
413, // "a"
413, // "p"
413, // "s"
413, // "v"
413, // "c"
413, // "f"
413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
413, // "i"
413, // "l"
413, // "o"
413, // "r"
413, // "u"
413, // "x"
413, // "b"
413, // "e"
413, // "h"
413, // "n"
413, // "t"
413, // "w"
136, // letter128
327, // {199..218 231..250}
327, // {193..198 225..230}
-1, // digit
382, // {"1".."9"}
305, // "0"
482, // digit128
53, // {176..185}
-1, // any
-1, // "["
95, // "-"
-1, // "<"
-1, // " "
341, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
290, // ";"
-1, // ">"
254, // "{"
-1, // "%"
211, // "("
553, // "+"
-1, // "."
-1, // "_"
-1, // "="
426, // "@"
-1, // {10}
-1, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "}"
364, // "!"
437, // "'"
312, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 276
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 277
80,556, // "e"
  }
,
{ // state 278
2,583, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 279
78,192, // "x"
  }
,
{ // state 280
24,MIN_REDUCTION+59, // `[
94,MIN_REDUCTION+59, // "["
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 281
10,558, // `}
12,271, // <decl in class>
13,243, // <method decl>
14,577, // `public
98,74, // "#"
114,380, // "}"
  }
,
{ // state 282
75,240, // "o"
  }
,
{ // state 283
36,299, // `=
110,353, // "="
  }
,
{ // state 284
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
190, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
387, // `void
433, // `(
-1, // `)
-1, // <stmt>*
502, // <type>
352, // `int
149, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
511, // <stmt>
129, // <assign>
86, // `;
517, // <local var decl>
500, // `if
283, // <exp>
-1, // `else
134, // `for
304, // `while
498, // `break
-1, // `=
-1, // `++
67, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
28, // <exp5>
266, // <exp4>
439, // <exp3>
209, // <exp2>
123, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
468, // `+
293, // `-
-1, // `*
-1, // `/
-1, // `%
241, // `!
418, // INTLIT
127, // STRINGLIT
331, // CHARLIT
-1, // `.
253, // `this
15, // `true
255, // `false
368, // `new
-1, // <empty bracket pair>**
96, // letter
413, // "a"
413, // "p"
413, // "s"
413, // "v"
413, // "c"
413, // "f"
413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
413, // "i"
413, // "l"
413, // "o"
413, // "r"
413, // "u"
413, // "x"
413, // "b"
413, // "e"
413, // "h"
413, // "n"
413, // "t"
413, // "w"
136, // letter128
327, // {199..218 231..250}
327, // {193..198 225..230}
-1, // digit
382, // {"1".."9"}
305, // "0"
482, // digit128
53, // {176..185}
-1, // any
-1, // "["
95, // "-"
-1, // "<"
-1, // " "
341, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
361, // ";"
-1, // ">"
254, // "{"
-1, // "%"
211, // "("
553, // "+"
-1, // "."
-1, // "_"
-1, // "="
426, // "@"
-1, // {10}
-1, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "}"
364, // "!"
437, // "'"
312, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 285
3,503, // <program>
4,68, // <class decl>+
5,506, // <class decl>
6,493, // `class
97,92, // " "
98,143, // "#"
112,32, // {10}
122,45, // ws
  }
,
{ // state 286
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 287
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 288
2,582, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 289
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 290
0x80000000|358, // match move
0x80000000|410, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 291
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 292
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 293
7,430, // ID
22,4, // `null
46,429, // <exp1>
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
98,393, // "#"
111,426, // "@"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 294
52,260, // `*
53,452, // `/
54,464, // `%
101,9, // "/"
105,406, // "%"
118,499, // "*"
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 295
81,565, // "h"
  }
,
{ // state 296
7,430, // ID
16,433, // `(
22,4, // `null
31,586, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 297
98,277, // "#"
  }
,
{ // state 298
2,443, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 299
7,430, // ID
16,433, // `(
22,4, // `null
31,38, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 300
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
190, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
387, // `void
433, // `(
-1, // `)
-1, // <stmt>*
502, // <type>
352, // `int
149, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
25, // <stmt>
129, // <assign>
86, // `;
517, // <local var decl>
500, // `if
283, // <exp>
-1, // `else
134, // `for
304, // `while
498, // `break
-1, // `=
-1, // `++
67, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
28, // <exp5>
266, // <exp4>
439, // <exp3>
209, // <exp2>
123, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
468, // `+
293, // `-
-1, // `*
-1, // `/
-1, // `%
241, // `!
418, // INTLIT
127, // STRINGLIT
331, // CHARLIT
-1, // `.
253, // `this
15, // `true
255, // `false
368, // `new
-1, // <empty bracket pair>**
96, // letter
413, // "a"
413, // "p"
413, // "s"
413, // "v"
413, // "c"
413, // "f"
413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
413, // "i"
413, // "l"
413, // "o"
413, // "r"
413, // "u"
413, // "x"
413, // "b"
413, // "e"
413, // "h"
413, // "n"
413, // "t"
413, // "w"
136, // letter128
327, // {199..218 231..250}
327, // {193..198 225..230}
-1, // digit
382, // {"1".."9"}
305, // "0"
482, // digit128
53, // {176..185}
-1, // any
-1, // "["
95, // "-"
-1, // "<"
-1, // " "
341, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
361, // ";"
-1, // ">"
254, // "{"
-1, // "%"
211, // "("
553, // "+"
-1, // "."
-1, // "_"
-1, // "="
426, // "@"
-1, // {10}
-1, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "}"
364, // "!"
437, // "'"
312, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 301
66,46, // "a"
67,46, // "p"
68,46, // "s"
69,46, // "v"
70,46, // "c"
71,46, // "f"
72,46, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,46, // "i"
74,46, // "l"
75,46, // "o"
76,46, // "r"
77,46, // "u"
78,46, // "x"
79,46, // "b"
80,46, // "e"
81,46, // "h"
82,46, // "n"
83,46, // "t"
84,46, // "w"
86,584, // {199..218 231..250}
87,584, // {193..198 225..230}
89,46, // {"1".."9"}
90,46, // "0"
92,584, // {176..185}
93,291, // any
94,46, // "["
95,46, // "-"
96,46, // "<"
97,46, // " "
98,46, // "#"
99,46, // ")"
100,46, // "]"
101,46, // "/"
102,46, // ";"
103,46, // ">"
104,46, // "{"
105,46, // "%"
106,46, // "("
107,46, // "+"
108,46, // "."
109,46, // "_"
110,46, // "="
111,46, // "@"
112,46, // {10}
113,46, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
114,46, // "}"
115,46, // "!"
116,46, // "'"
117,46, // '"'
118,46, // "*"
119,522, // any128
120,584, // {223}
121,584, // {128..175 186..192 219..222 224 251..255}
130,574, // $$3
  }
,
{ // state 302
0x80000000|422, // match move
0x80000000|70, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 303
24,477, // `[
59,251, // `.
94,61, // "["
108,59, // "."
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 304
16,561, // `(
106,211, // "("
  }
,
{ // state 305
66,345, // "a"
67,345, // "p"
68,345, // "s"
69,345, // "v"
70,345, // "c"
71,345, // "f"
72,345, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,345, // "i"
74,345, // "l"
75,345, // "o"
76,345, // "r"
77,345, // "u"
78,345, // "x"
79,345, // "b"
80,345, // "e"
81,345, // "h"
82,345, // "n"
83,345, // "t"
84,345, // "w"
87,414, // {193..198 225..230}
89,345, // {"1".."9"}
90,345, // "0"
92,414, // {176..185}
127,567, // hexDigit*
128,349, // $$2
133,454, // hexDigit
134,539, // hexDigit128
  }
,
{ // state 306
69,282, // "v"
  }
,
{ // state 307
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 308
50,82, // `+
51,318, // `-
95,95, // "-"
107,553, // "+"
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 309
23,302, // <empty bracket pair>
24,258, // `[
64,555, // <empty bracket pair>**
94,61, // "["
135,7, // <empty bracket pair>*
  }
,
{ // state 310
7,430, // ID
16,433, // `(
22,4, // `null
31,132, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 311
25,118, // `]
100,13, // "]"
  }
,
{ // state 312
66,46, // "a"
67,46, // "p"
68,46, // "s"
69,46, // "v"
70,46, // "c"
71,46, // "f"
72,46, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,46, // "i"
74,46, // "l"
75,46, // "o"
76,46, // "r"
77,46, // "u"
78,46, // "x"
79,46, // "b"
80,46, // "e"
81,46, // "h"
82,46, // "n"
83,46, // "t"
84,46, // "w"
86,584, // {199..218 231..250}
87,584, // {193..198 225..230}
89,46, // {"1".."9"}
90,46, // "0"
92,584, // {176..185}
93,180, // any
94,46, // "["
95,46, // "-"
96,46, // "<"
97,46, // " "
98,46, // "#"
99,46, // ")"
100,46, // "]"
101,46, // "/"
102,46, // ";"
103,46, // ">"
104,46, // "{"
105,46, // "%"
106,46, // "("
107,46, // "+"
108,46, // "."
109,46, // "_"
110,46, // "="
111,46, // "@"
112,46, // {10}
113,46, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
114,46, // "}"
115,46, // "!"
116,46, // "'"
117,46, // '"'
118,46, // "*"
119,522, // any128
120,584, // {223}
121,584, // {128..175 186..192 219..222 224 251..255}
129,301, // any*
130,369, // $$3
  }
,
{ // state 313
24,MIN_REDUCTION+51, // `[
36,MIN_REDUCTION+51, // `=
37,564, // `++
47,MIN_REDUCTION+51, // `<
48,MIN_REDUCTION+51, // `<=
49,MIN_REDUCTION+51, // `>
50,MIN_REDUCTION+51, // `+
51,MIN_REDUCTION+51, // `-
52,MIN_REDUCTION+51, // `*
53,MIN_REDUCTION+51, // `/
54,MIN_REDUCTION+51, // `%
59,MIN_REDUCTION+51, // `.
94,MIN_REDUCTION+51, // "["
95,MIN_REDUCTION+51, // "-"
96,MIN_REDUCTION+51, // "<"
101,MIN_REDUCTION+51, // "/"
103,MIN_REDUCTION+51, // ">"
105,MIN_REDUCTION+51, // "%"
107,MIN_REDUCTION+51, // "+"
108,MIN_REDUCTION+51, // "."
110,MIN_REDUCTION+51, // "="
111,164, // "@"
118,MIN_REDUCTION+51, // "*"
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 314
0x80000000|417, // match move
0x80000000|523, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 315
7,19, // ID
65,232, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,339, // letter128
86,174, // {199..218 231..250}
87,174, // {193..198 225..230}
  }
,
{ // state 316
84,360, // "w"
  }
,
{ // state 317
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 318
7,430, // ID
16,433, // `(
22,4, // `null
44,294, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 319
2,138, // ws*
  }
,
{ // state 320
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 321
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 322
24,MIN_REDUCTION+68, // `[
94,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 323
0x80000000|546, // match move
0x80000000|35, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 324
9,473, // <decl in class>*
10,122, // `}
12,165, // <decl in class>
13,243, // <method decl>
14,577, // `public
98,74, // "#"
114,380, // "}"
  }
,
{ // state 325
75,458, // "o"
  }
,
{ // state 326
2,11, // ws*
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 327
0x80000000|169, // match move
0x80000000|484, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 328
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 329
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 330
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 331
0x80000000|1, // match move
0x80000000|509, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 332
0x80000000|1, // match move
0x80000000|220, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 333
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 334
7,430, // ID
16,433, // `(
22,4, // `null
31,512, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 335
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 336
0x80000000|472, // match move
0x80000000|106, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 337
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 338
66,202, // "a"
75,514, // "o"
  }
,
{ // state 339
2,177, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 340
0x80000000|532, // match move
0x80000000|14, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 341
68,316, // "s"
69,282, // "v"
71,338, // "f"
73,29, // "i"
79,72, // "b"
82,158, // "n"
83,470, // "t"
84,295, // "w"
107,47, // "+"
  }
,
{ // state 342
10,87, // `}
40,450, // <case>
41,533, // `case
98,107, // "#"
114,380, // "}"
  }
,
{ // state 343
0x80000000|354, // match move
0x80000000|548, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 344
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 345
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 346
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 347
24,477, // `[
59,251, // `.
94,61, // "["
108,59, // "."
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 348
7,430, // ID
16,433, // `(
22,4, // `null
31,235, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
};
}
private class Initter2{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 349
0x80000000|1, // match move
0x80000000|507, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 350
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 351
7,469, // ID
16,433, // `(
22,4, // `null
27,40, // <assign>
31,283, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 352
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 353
2,463, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 354
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 355
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 356
17,102, // `)
99,432, // ")"
  }
,
{ // state 357
0x80000000|257, // match move
0x80000000|105, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 358
2,81, // ws*
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 359
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 360
2,179, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 361
2,150, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 362
2,481, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 363
2,332, // ws*
  }
,
{ // state 364
2,488, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 365
23,227, // <empty bracket pair>
24,258, // `[
94,61, // "["
  }
,
{ // state 366
0x80000000|236, // match move
0x80000000|100, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 367
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 368
7,114, // ID
15,515, // `void
19,547, // <type>
20,171, // `int
21,244, // `boolean
22,571, // `null
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
98,217, // "#"
  }
,
{ // state 369
0x80000000|1, // match move
0x80000000|540, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 370
2,8, // ws*
  }
,
{ // state 371
65,187, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,489, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
88,524, // digit
89,273, // {"1".."9"}
90,273, // "0"
91,178, // digit128
92,53, // {176..185}
109,10, // "_"
120,357, // {223}
124,170, // $$0
131,286, // idChar
132,60, // idChar128
  }
,
{ // state 372
77,166, // "u"
  }
,
{ // state 373
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 374
0x80000000|370, // match move
0x80000000|199, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 375
2,245, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 376
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 377
64,555, // <empty bracket pair>**
135,7, // <empty bracket pair>*
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 378
24,MIN_REDUCTION+58, // `[
94,MIN_REDUCTION+58, // "["
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 379
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 380
2,195, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 381
28,526, // `;
102,361, // ";"
  }
,
{ // state 382
88,23, // digit
89,273, // {"1".."9"}
90,273, // "0"
91,374, // digit128
92,53, // {176..185}
125,415, // digit*
126,552, // $$1
  }
,
{ // state 383
24,MIN_REDUCTION+169, // `[
94,MIN_REDUCTION+169, // "["
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 384
50,82, // `+
51,318, // `-
95,95, // "-"
107,553, // "+"
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 385
0x80000000|1, // match move
0x80000000|543, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 386
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
190, // `{
-1, // <decl in class>*
554, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
387, // `void
433, // `(
-1, // `)
-1, // <stmt>*
502, // <type>
352, // `int
149, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
97, // <stmt>
129, // <assign>
86, // `;
517, // <local var decl>
500, // `if
283, // <exp>
-1, // `else
134, // `for
304, // `while
498, // `break
-1, // `=
-1, // `++
67, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
28, // <exp5>
266, // <exp4>
439, // <exp3>
209, // <exp2>
123, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
468, // `+
293, // `-
-1, // `*
-1, // `/
-1, // `%
241, // `!
418, // INTLIT
127, // STRINGLIT
331, // CHARLIT
-1, // `.
253, // `this
15, // `true
255, // `false
368, // `new
-1, // <empty bracket pair>**
96, // letter
413, // "a"
413, // "p"
413, // "s"
413, // "v"
413, // "c"
413, // "f"
413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
413, // "i"
413, // "l"
413, // "o"
413, // "r"
413, // "u"
413, // "x"
413, // "b"
413, // "e"
413, // "h"
413, // "n"
413, // "t"
413, // "w"
136, // letter128
327, // {199..218 231..250}
327, // {193..198 225..230}
-1, // digit
382, // {"1".."9"}
305, // "0"
482, // digit128
53, // {176..185}
-1, // any
-1, // "["
95, // "-"
-1, // "<"
-1, // " "
341, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
361, // ";"
-1, // ">"
254, // "{"
-1, // "%"
211, // "("
553, // "+"
-1, // "."
-1, // "_"
-1, // "="
426, // "@"
-1, // {10}
-1, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
474, // "}"
364, // "!"
437, // "'"
312, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 387
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 388
24,MIN_REDUCTION+166, // `[
94,MIN_REDUCTION+166, // "["
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 389
66,202, // "a"
  }
,
{ // state 390
9,281, // <decl in class>*
10,335, // `}
12,165, // <decl in class>
13,243, // <method decl>
14,577, // `public
98,74, // "#"
114,380, // "}"
  }
,
{ // state 391
24,MIN_REDUCTION+57, // `[
94,MIN_REDUCTION+57, // "["
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 392
0x80000000|1, // match move
0x80000000|90, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 393
71,389, // "f"
82,158, // "n"
83,470, // "t"
  }
,
{ // state 394
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 395
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 396
97,92, // " "
112,32, // {10}
122,45, // ws
137,MIN_REDUCTION+86, // $NT
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 397
24,MIN_REDUCTION+98, // `[
94,MIN_REDUCTION+98, // "["
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 398
7,430, // ID
16,433, // `(
22,4, // `null
31,167, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 399
74,298, // "l"
  }
,
{ // state 400
2,196, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 401
8,55, // `{
104,254, // "{"
  }
,
{ // state 402
65,187, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,208, // letter128
86,174, // {199..218 231..250}
87,174, // {193..198 225..230}
88,524, // digit
89,273, // {"1".."9"}
90,273, // "0"
91,113, // digit128
92,447, // {176..185}
109,10, // "_"
120,530, // {223}
124,84, // $$0
131,286, // idChar
132,278, // idChar128
  }
,
{ // state 403
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 404
8,324, // `{
11,262, // `extends
98,551, // "#"
104,254, // "{"
  }
,
{ // state 405
0x80000000|1, // match move
0x80000000|66, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 406
2,203, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 407
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
148, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
387, // `void
433, // `(
-1, // `)
-1, // <stmt>*
502, // <type>
352, // `int
149, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
314, // <stmt>
233, // <assign>
421, // `;
21, // <local var decl>
152, // `if
283, // <exp>
-1, // `else
222, // `for
58, // `while
480, // `break
-1, // `=
-1, // `++
246, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
28, // <exp5>
266, // <exp4>
439, // <exp3>
209, // <exp2>
123, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
468, // `+
293, // `-
-1, // `*
-1, // `/
-1, // `%
241, // `!
418, // INTLIT
127, // STRINGLIT
331, // CHARLIT
-1, // `.
253, // `this
15, // `true
255, // `false
368, // `new
-1, // <empty bracket pair>**
96, // letter
413, // "a"
413, // "p"
413, // "s"
413, // "v"
413, // "c"
413, // "f"
413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
413, // "i"
413, // "l"
413, // "o"
413, // "r"
413, // "u"
413, // "x"
413, // "b"
413, // "e"
413, // "h"
413, // "n"
413, // "t"
413, // "w"
136, // letter128
327, // {199..218 231..250}
327, // {193..198 225..230}
-1, // digit
382, // {"1".."9"}
305, // "0"
482, // digit128
53, // {176..185}
-1, // any
-1, // "["
95, // "-"
-1, // "<"
-1, // " "
341, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
290, // ";"
-1, // ">"
254, // "{"
-1, // "%"
211, // "("
553, // "+"
-1, // "."
-1, // "_"
-1, // "="
426, // "@"
-1, // {10}
-1, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "}"
364, // "!"
437, // "'"
312, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 408
24,398, // `[
94,61, // "["
  }
,
{ // state 409
28,141, // `;
102,361, // ";"
  }
,
{ // state 410
2,81, // ws*
97,575, // " "
112,185, // {10}
122,343, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 411
7,469, // ID
16,433, // `(
22,4, // `null
27,104, // <assign>
31,283, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 412
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
148, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
387, // `void
433, // `(
-1, // `)
-1, // <stmt>*
502, // <type>
352, // `int
149, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
578, // <stmt>
233, // <assign>
421, // `;
21, // <local var decl>
152, // `if
283, // <exp>
-1, // `else
222, // `for
58, // `while
480, // `break
-1, // `=
-1, // `++
246, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
28, // <exp5>
266, // <exp4>
439, // <exp3>
209, // <exp2>
123, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
468, // `+
293, // `-
-1, // `*
-1, // `/
-1, // `%
241, // `!
418, // INTLIT
127, // STRINGLIT
331, // CHARLIT
-1, // `.
253, // `this
15, // `true
255, // `false
368, // `new
-1, // <empty bracket pair>**
96, // letter
413, // "a"
413, // "p"
413, // "s"
413, // "v"
413, // "c"
413, // "f"
413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
413, // "i"
413, // "l"
413, // "o"
413, // "r"
413, // "u"
413, // "x"
413, // "b"
413, // "e"
413, // "h"
413, // "n"
413, // "t"
413, // "w"
136, // letter128
327, // {199..218 231..250}
327, // {193..198 225..230}
-1, // digit
382, // {"1".."9"}
305, // "0"
482, // digit128
53, // {176..185}
-1, // any
-1, // "["
95, // "-"
-1, // "<"
-1, // " "
341, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
290, // ";"
-1, // ">"
254, // "{"
-1, // "%"
211, // "("
553, // "+"
-1, // "."
-1, // "_"
-1, // "="
426, // "@"
-1, // {10}
-1, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "}"
364, // "!"
437, // "'"
312, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 413
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 414
0x80000000|135, // match move
0x80000000|383, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 415
88,75, // digit
89,273, // {"1".."9"}
90,273, // "0"
91,374, // digit128
92,53, // {176..185}
126,103, // $$1
  }
,
{ // state 416
0x80000000|1, // match move
0x80000000|63, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 417
32,275, // `else
98,277, // "#"
  }
,
{ // state 418
0x80000000|1, // match move
0x80000000|269, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 419
80,125, // "e"
  }
,
{ // state 420
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 421
0x80000000|239, // match move
0x80000000|359, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 422
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 423
2,366, // ws*
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 424
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 425
0x80000000|344, // match move
0x80000000|49, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 426
117,64, // '"'
  }
,
{ // state 427
2,155, // ws*
  }
,
{ // state 428
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 429
0x80000000|1, // match move
0x80000000|347, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 430
0x80000000|1, // match move
0x80000000|259, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 431
2,425, // ws*
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 432
2,206, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 433
7,559, // ID
15,387, // `void
19,156, // <type>
20,352, // `int
21,149, // `boolean
22,287, // `null
65,232, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,339, // letter128
86,174, // {199..218 231..250}
87,174, // {193..198 225..230}
98,449, // "#"
  }
,
{ // state 434
0x80000000|486, // match move
0x80000000|157, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 435
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 436
0x80000000|431, // match move
0x80000000|467, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 437
66,101, // "a"
67,101, // "p"
68,101, // "s"
69,101, // "v"
70,101, // "c"
71,101, // "f"
72,101, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,101, // "i"
74,101, // "l"
75,101, // "o"
76,101, // "r"
77,101, // "u"
78,101, // "x"
79,101, // "b"
80,101, // "e"
81,101, // "h"
82,101, // "n"
83,101, // "t"
84,101, // "w"
89,101, // {"1".."9"}
90,101, // "0"
93,26, // any
94,101, // "["
95,101, // "-"
96,101, // "<"
97,101, // " "
98,101, // "#"
99,101, // ")"
100,101, // "]"
101,101, // "/"
102,101, // ";"
103,101, // ">"
104,101, // "{"
105,101, // "%"
106,101, // "("
107,101, // "+"
108,101, // "."
109,101, // "_"
110,101, // "="
111,101, // "@"
112,101, // {10}
113,101, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
114,101, // "}"
115,101, // "!"
116,101, // "'"
117,101, // '"'
118,101, // "*"
  }
,
{ // state 438
24,311, // `[
94,61, // "["
  }
,
{ // state 439
52,260, // `*
53,452, // `/
54,464, // `%
101,9, // "/"
105,406, // "%"
118,499, // "*"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 440
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 441
77,400, // "u"
  }
,
{ // state 442
0x80000000|78, // match move
0x80000000|256, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 443
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 444
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 445
17,213, // `)
99,442, // ")"
  }
,
{ // state 446
75,436, // "o"
  }
,
{ // state 447
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 448
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 449
69,282, // "v"
73,29, // "i"
79,576, // "b"
82,441, // "n"
  }
,
{ // state 450
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 451
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 452
7,430, // ID
16,433, // `(
22,4, // `null
45,151, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 453
24,MIN_REDUCTION+187, // `[
94,MIN_REDUCTION+187, // "["
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 454
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 455
24,MIN_REDUCTION+146, // `[
94,MIN_REDUCTION+146, // "["
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 456
24,MIN_REDUCTION+148, // `[
94,MIN_REDUCTION+148, // "["
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 457
2,91, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 458
0x80000000|44, // match move
0x80000000|88, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 459
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 460
24,MIN_REDUCTION+197, // `[
94,MIN_REDUCTION+197, // "["
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 461
107,362, // "+"
  }
,
{ // state 462
0x80000000|346, // match move
0x80000000|307, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 463
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 464
7,430, // ID
16,433, // `(
22,4, // `null
45,186, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 465
10,116, // `}
40,450, // <case>
41,533, // `case
98,107, // "#"
114,474, // "}"
  }
,
{ // state 466
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 467
2,425, // ws*
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 468
7,430, // ID
22,4, // `null
46,405, // <exp1>
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
98,393, // "#"
111,426, // "@"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 469
0x80000000|1, // match move
0x80000000|476, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 470
76,65, // "r"
81,6, // "h"
  }
,
{ // state 471
17,412, // `)
99,432, // ")"
  }
,
{ // state 472
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 473
10,320, // `}
12,271, // <decl in class>
13,243, // <method decl>
14,577, // `public
98,74, // "#"
114,380, // "}"
  }
,
{ // state 474
0x80000000|93, // match move
0x80000000|89, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 475
0x80000000|1, // match move
0x80000000|188, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 476
24,MIN_REDUCTION+51, // `[
37,564, // `++
94,MIN_REDUCTION+51, // "["
111,164, // "@"
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 477
7,430, // ID
16,433, // `(
22,4, // `null
31,234, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 478
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 479
0x80000000|309, // match move
0x80000000|377, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 480
28,131, // `;
102,290, // ";"
  }
,
{ // state 481
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 482
0x80000000|363, // match move
0x80000000|154, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 483
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 484
24,MIN_REDUCTION+65, // `[
94,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 485
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 486
2,336, // ws*
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 487
28,52, // `;
102,361, // ";"
  }
,
{ // state 488
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 489
0x80000000|367, // match move
0x80000000|573, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 490
2,396, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
137,MIN_REDUCTION+87, // $NT
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 491
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 492
2,34, // ws*
  }
,
{ // state 493
7,404, // ID
65,232, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,339, // letter128
86,174, // {199..218 231..250}
87,174, // {193..198 225..230}
  }
,
{ // state 494
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 495
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 496
24,MIN_REDUCTION+195, // `[
94,MIN_REDUCTION+195, // "["
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 497
2,108, // ws*
24,MIN_REDUCTION+157, // `[
94,MIN_REDUCTION+157, // "["
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 498
28,153, // `;
102,361, // ";"
  }
,
{ // state 499
2,111, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 500
16,189, // `(
106,211, // "("
  }
,
{ // state 501
97,575, // " "
112,185, // {10}
122,110, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 502
7,175, // ID
23,228, // <empty bracket pair>
24,311, // `[
65,232, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,339, // letter128
86,174, // {199..218 231..250}
87,174, // {193..198 225..230}
94,61, // "["
  }
,
{ // state 503
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 504
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 505
2,475, // ws*
24,MIN_REDUCTION+93, // `[
94,MIN_REDUCTION+93, // "["
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 506
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 507
24,MIN_REDUCTION+155, // `[
94,MIN_REDUCTION+155, // "["
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 508
2,194, // ws*
24,MIN_REDUCTION+95, // `[
94,MIN_REDUCTION+95, // "["
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 509
24,MIN_REDUCTION+55, // `[
94,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 510
17,407, // `)
99,432, // ")"
  }
,
{ // state 511
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 512
17,242, // `)
99,432, // ")"
  }
,
{ // state 513
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 514
2,140, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 515
0x80000000|451, // match move
0x80000000|376, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 516
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
190, // `{
-1, // <decl in class>*
491, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
387, // `void
433, // `(
-1, // `)
570, // <stmt>*
502, // <type>
352, // `int
149, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
483, // <stmt>
129, // <assign>
86, // `;
517, // <local var decl>
500, // `if
283, // <exp>
-1, // `else
134, // `for
304, // `while
498, // `break
-1, // `=
-1, // `++
67, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
28, // <exp5>
266, // <exp4>
439, // <exp3>
209, // <exp2>
123, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
468, // `+
293, // `-
-1, // `*
-1, // `/
-1, // `%
241, // `!
418, // INTLIT
127, // STRINGLIT
331, // CHARLIT
-1, // `.
253, // `this
15, // `true
255, // `false
368, // `new
-1, // <empty bracket pair>**
96, // letter
413, // "a"
413, // "p"
413, // "s"
413, // "v"
413, // "c"
413, // "f"
413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
413, // "i"
413, // "l"
413, // "o"
413, // "r"
413, // "u"
413, // "x"
413, // "b"
413, // "e"
413, // "h"
413, // "n"
413, // "t"
413, // "w"
136, // letter128
327, // {199..218 231..250}
327, // {193..198 225..230}
-1, // digit
382, // {"1".."9"}
305, // "0"
482, // digit128
53, // {176..185}
-1, // any
-1, // "["
95, // "-"
-1, // "<"
-1, // " "
341, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
361, // ";"
-1, // ">"
254, // "{"
-1, // "%"
211, // "("
553, // "+"
-1, // "."
-1, // "_"
-1, // "="
426, // "@"
-1, // {10}
-1, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
380, // "}"
364, // "!"
437, // "'"
312, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 517
28,274, // `;
102,361, // ";"
  }
,
{ // state 518
136,MIN_REDUCTION+0, // $
  }
,
{ // state 519
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 520
24,MIN_REDUCTION+154, // `[
94,MIN_REDUCTION+154, // "["
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 521
97,MIN_REDUCTION+71, // " "
112,MIN_REDUCTION+71, // {10}
122,MIN_REDUCTION+71, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 522
0x80000000|319, // match move
0x80000000|137, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 523
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 524
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 525
24,MIN_REDUCTION+193, // `[
94,MIN_REDUCTION+193, // "["
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 526
7,430, // ID
16,433, // `(
22,4, // `null
31,487, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 527
0x80000000|448, // match move
0x80000000|76, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 528
24,MIN_REDUCTION+62, // `[
94,MIN_REDUCTION+62, // "["
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 529
2,11, // ws*
24,MIN_REDUCTION+99, // `[
94,MIN_REDUCTION+99, // "["
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 530
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 531
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 532
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 533
7,430, // ID
16,433, // `(
22,4, // `null
31,409, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 534
16,445, // `(
106,211, // "("
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 535
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 536
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 537
2,366, // ws*
24,MIN_REDUCTION+192, // `[
94,MIN_REDUCTION+192, // "["
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 538
2,249, // ws*
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 539
0x80000000|427, // match move
0x80000000|124, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 540
24,MIN_REDUCTION+159, // `[
94,MIN_REDUCTION+159, // "["
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 541
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
148, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
387, // `void
433, // `(
-1, // `)
-1, // <stmt>*
502, // <type>
352, // `int
149, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
323, // <stmt>
233, // <assign>
421, // `;
21, // <local var decl>
152, // `if
283, // <exp>
-1, // `else
222, // `for
58, // `while
480, // `break
-1, // `=
-1, // `++
246, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
28, // <exp5>
266, // <exp4>
439, // <exp3>
209, // <exp2>
123, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
468, // `+
293, // `-
-1, // `*
-1, // `/
-1, // `%
241, // `!
418, // INTLIT
127, // STRINGLIT
331, // CHARLIT
-1, // `.
253, // `this
15, // `true
255, // `false
368, // `new
-1, // <empty bracket pair>**
96, // letter
413, // "a"
413, // "p"
413, // "s"
413, // "v"
413, // "c"
413, // "f"
413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
413, // "i"
413, // "l"
413, // "o"
413, // "r"
413, // "u"
413, // "x"
413, // "b"
413, // "e"
413, // "h"
413, // "n"
413, // "t"
413, // "w"
136, // letter128
327, // {199..218 231..250}
327, // {193..198 225..230}
-1, // digit
382, // {"1".."9"}
305, // "0"
482, // digit128
53, // {176..185}
-1, // any
-1, // "["
95, // "-"
-1, // "<"
-1, // " "
341, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
290, // ";"
-1, // ">"
254, // "{"
-1, // "%"
211, // "("
553, // "+"
-1, // "."
-1, // "_"
-1, // "="
426, // "@"
-1, // {10}
-1, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "}"
364, // "!"
437, // "'"
312, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 542
2,435, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 543
24,MIN_REDUCTION+116, // `[
94,MIN_REDUCTION+116, // "["
97,340, // " "
112,237, // {10}
122,205, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 544
7,430, // ID
16,433, // `(
22,4, // `null
43,229, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 545
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 546
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 547
0x80000000|212, // match move
0x80000000|408, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 548
97,MIN_REDUCTION+188, // " "
112,MIN_REDUCTION+188, // {10}
122,MIN_REDUCTION+188, // ws
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 549
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 550
24,MIN_REDUCTION+69, // `[
94,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 551
80,279, // "e"
  }
,
{ // state 552
0x80000000|1, // match move
0x80000000|27, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 553
2,145, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 554
0x80000000|183, // match move
0x80000000|328, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 555
0x80000000|1, // match move
0x80000000|528, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 556
74,490, // "l"
  }
,
{ // state 557
24,MIN_REDUCTION+188, // `[
94,MIN_REDUCTION+188, // "["
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 558
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 559
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 560
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 561
7,430, // ID
16,433, // `(
22,4, // `null
31,119, // <exp>
42,28, // <exp5>
43,266, // <exp4>
44,439, // <exp3>
45,209, // <exp2>
46,123, // <exp1>
50,468, // `+
51,293, // `-
55,241, // `!
56,418, // INTLIT
57,127, // STRINGLIT
58,331, // CHARLIT
60,253, // `this
61,15, // `true
62,255, // `false
63,368, // `new
65,96, // letter
66,413, // "a"
67,413, // "p"
68,413, // "s"
69,413, // "v"
70,413, // "c"
71,413, // "f"
72,413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,413, // "i"
74,413, // "l"
75,413, // "o"
76,413, // "r"
77,413, // "u"
78,413, // "x"
79,413, // "b"
80,413, // "e"
81,413, // "h"
82,413, // "n"
83,413, // "t"
84,413, // "w"
85,136, // letter128
86,327, // {199..218 231..250}
87,327, // {193..198 225..230}
89,382, // {"1".."9"}
90,305, // "0"
91,482, // digit128
92,53, // {176..185}
95,95, // "-"
98,393, // "#"
106,211, // "("
107,553, // "+"
111,426, // "@"
115,364, // "!"
116,437, // "'"
117,312, // '"'
  }
,
{ // state 562
97,MIN_REDUCTION+187, // " "
112,MIN_REDUCTION+187, // {10}
122,MIN_REDUCTION+187, // ws
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 563
2,475, // ws*
  }
,
{ // state 564
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 565
2,420, // ws*
97,92, // " "
112,32, // {10}
122,130, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 566
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 567
66,345, // "a"
67,345, // "p"
68,345, // "s"
69,345, // "v"
70,345, // "c"
71,345, // "f"
72,345, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
73,345, // "i"
74,345, // "l"
75,345, // "o"
76,345, // "r"
77,345, // "u"
78,345, // "x"
79,345, // "b"
80,345, // "e"
81,345, // "h"
82,345, // "n"
83,345, // "t"
84,345, // "w"
87,414, // {193..198 225..230}
89,345, // {"1".."9"}
90,345, // "0"
92,414, // {176..185}
128,216, // $$2
133,270, // hexDigit
134,539, // hexDigit128
  }
,
{ // state 568
2,108, // ws*
  }
,
{ // state 569
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 570
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
190, // `{
-1, // <decl in class>*
531, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
387, // `void
433, // `(
-1, // `)
-1, // <stmt>*
502, // <type>
352, // `int
149, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
97, // <stmt>
129, // <assign>
86, // `;
517, // <local var decl>
500, // `if
283, // <exp>
-1, // `else
134, // `for
304, // `while
498, // `break
-1, // `=
-1, // `++
67, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
28, // <exp5>
266, // <exp4>
439, // <exp3>
209, // <exp2>
123, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
468, // `+
293, // `-
-1, // `*
-1, // `/
-1, // `%
241, // `!
418, // INTLIT
127, // STRINGLIT
331, // CHARLIT
-1, // `.
253, // `this
15, // `true
255, // `false
368, // `new
-1, // <empty bracket pair>**
96, // letter
413, // "a"
413, // "p"
413, // "s"
413, // "v"
413, // "c"
413, // "f"
413, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
413, // "i"
413, // "l"
413, // "o"
413, // "r"
413, // "u"
413, // "x"
413, // "b"
413, // "e"
413, // "h"
413, // "n"
413, // "t"
413, // "w"
136, // letter128
327, // {199..218 231..250}
327, // {193..198 225..230}
-1, // digit
382, // {"1".."9"}
305, // "0"
482, // digit128
53, // {176..185}
-1, // any
-1, // "["
95, // "-"
-1, // "<"
-1, // " "
341, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
361, // ";"
-1, // ">"
254, // "{"
-1, // "%"
211, // "("
553, // "+"
-1, // "."
-1, // "_"
-1, // "="
426, // "@"
-1, // {10}
-1, // {0..9 11..31 "$" "&" "," ":" "?" "\" "^" "`" "|" "~"..127}
380, // "}"
364, // "!"
437, // "'"
312, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 571
0x80000000|221, // match move
0x80000000|20, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 572
8,390, // `{
104,254, // "{"
  }
,
{ // state 573
24,MIN_REDUCTION+165, // `[
94,MIN_REDUCTION+165, // "["
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 574
0x80000000|1, // match move
0x80000000|204, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 575
0x80000000|160, // match move
0x80000000|230, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 576
75,457, // "o"
  }
,
{ // state 577
15,315, // `void
98,306, // "#"
  }
,
{ // state 578
0x80000000|18, // match move
0x80000000|523, // no-match move
0x80000000|297, // NT-test-match state for `else
  }
,
{ // state 579
2,392, // ws*
24,MIN_REDUCTION+97, // `[
94,MIN_REDUCTION+97, // "["
97,340, // " "
112,237, // {10}
122,99, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 580
2,249, // ws*
24,MIN_REDUCTION+131, // `[
48,MIN_REDUCTION+131, // `<=
54,MIN_REDUCTION+131, // `%
97,340, // " "
105,MIN_REDUCTION+131, // "%"
111,MIN_REDUCTION+131, // "@"
112,237, // {10}
122,99, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 581
2,51, // ws*
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 582
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 583
97,92, // " "
112,32, // {10}
122,45, // ws
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 584
0x80000000|373, // match move
0x80000000|550, // no-match move
0x80000000|438, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 585
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 586
MIN_REDUCTION+29, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[587][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
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
// <type> ::= `boolean
(19<<16)+1,
// <type> ::= `void
(19<<16)+1,
// <type> ::= `null
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
// <stmt> ::= `if `( <exp> `) <stmt> !`else
(26<<16)+5,
// <stmt> ::= `if `( <exp> `) <stmt> `else <stmt>
(26<<16)+7,
// <stmt> ::= `for `( <assign> `; <exp> `; <assign> `) <stmt>
(26<<16)+9,
// <stmt> ::= `while `( <exp> `) <stmt>
(26<<16)+5,
// <stmt> ::= `break `;
(26<<16)+2,
// <assign> ::= <exp> `= <exp>
(27<<16)+3,
// <assign> ::= ID `++
(27<<16)+2,
// <local var decl> ::= <type> ID `= <exp>
(29<<16)+4,
// <stmt> ::= `;
(26<<16)+1,
// <stmt> ::= `switch `( <exp> `) `{ <case>* `}
(26<<16)+7,
// <stmt> ::= `switch `( <exp> `) `{ `}
(26<<16)+6,
// <case> ::= `case <exp> `;
(40<<16)+3,
// <exp> ::= <exp5>
(31<<16)+1,
// <exp5> ::= <exp4>
(42<<16)+1,
// <exp4> ::= <exp3>
(43<<16)+1,
// <exp3> ::= <exp2>
(44<<16)+1,
// <exp2> ::= <exp1>
(45<<16)+1,
// <exp5> ::= <exp5> `< <exp4>
(42<<16)+3,
// <exp5> ::= <exp5> `<= <exp4>
(42<<16)+3,
// <exp5> ::= <exp5> `> <exp4>
(42<<16)+3,
// <exp4> ::= <exp4> `+ <exp3>
(43<<16)+3,
// <exp4> ::= <exp4> `- <exp3>
(43<<16)+3,
// <exp3> ::= <exp3> `* <exp2>
(44<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(44<<16)+3,
// <exp3> ::= <exp3> `% <exp2>
(44<<16)+3,
// <exp2> ::= `( <type> `) <exp1>
(45<<16)+4,
// <exp2> ::= `+ <exp1>
(45<<16)+2,
// <exp2> ::= `- <exp1>
(45<<16)+2,
// <exp2> ::= `! <exp1>
(45<<16)+2,
// <exp1> ::= ID
(46<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(46<<16)+4,
// <exp1> ::= INTLIT
(46<<16)+1,
// <exp1> ::= STRINGLIT
(46<<16)+1,
// <exp1> ::= CHARLIT
(46<<16)+1,
// <exp1> ::= <exp1> `. ID
(46<<16)+3,
// <exp1> ::= `this
(46<<16)+1,
// <exp1> ::= `true
(46<<16)+1,
// <exp1> ::= `false
(46<<16)+1,
// <exp1> ::= `null
(46<<16)+1,
// <exp1> ::= `new ID `( `)
(46<<16)+4,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] <empty bracket pair>**
(46<<16)+6,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] !<empty bracket pair>
(46<<16)+5,
// letter ::= {"A".."Z" "a".."z"}
(65<<16)+1,
// letter128 ::= {193..218 225..250}
(85<<16)+1,
// digit ::= {"0".."9"}
(88<<16)+1,
// digit128 ::= {176..185}
(91<<16)+1,
// any ::= {0..127}
(93<<16)+1,
// any128 ::= {128..255}
(119<<16)+1,
// ws ::= " "
(122<<16)+1,
// ws ::= {10}
(122<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(21<<16)+4,
// `boolean ::= "#" "b" "o"
(21<<16)+3,
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
// `while ::= "#" "w" "h" ws*
(34<<16)+4,
// `while ::= "#" "w" "h"
(34<<16)+3,
// `if ::= "#" "+" ws*
(30<<16)+3,
// `if ::= "#" "+"
(30<<16)+2,
// `else ::= "#" "e" "l" ws*
(32<<16)+4,
// `else ::= "#" "e" "l"
(32<<16)+3,
// `for ::= "#" "f" "o" ws*
(33<<16)+4,
// `for ::= "#" "f" "o"
(33<<16)+3,
// `break ::= "#" "b" "r" ws*
(35<<16)+4,
// `break ::= "#" "b" "r"
(35<<16)+3,
// `this ::= "#" "t" "h" ws*
(60<<16)+4,
// `this ::= "#" "t" "h"
(60<<16)+3,
// `false ::= "#" "f" "a" ws*
(62<<16)+4,
// `false ::= "#" "f" "a"
(62<<16)+3,
// `true ::= "#" "t" "r" ws*
(61<<16)+4,
// `true ::= "#" "t" "r"
(61<<16)+3,
// `null ::= "#" "n" "u" ws*
(22<<16)+4,
// `null ::= "#" "n" "u"
(22<<16)+3,
// `new ::= "#" "n" "e" ws*
(63<<16)+4,
// `new ::= "#" "n" "e"
(63<<16)+3,
// `case ::= "#" "c" "e" ws*
(41<<16)+4,
// `case ::= "#" "c" "e"
(41<<16)+3,
// `public ::= "#" "p" "u" ws*
(14<<16)+4,
// `public ::= "#" "p" "u"
(14<<16)+3,
// `switch ::= "#" "s" "w" ws*
(38<<16)+4,
// `switch ::= "#" "s" "w"
(38<<16)+3,
// `! ::= "!" ws*
(55<<16)+2,
// `! ::= "!"
(55<<16)+1,
// `% ::= "%" ws*
(54<<16)+2,
// `% ::= "%"
(54<<16)+1,
// `* ::= "*" ws*
(52<<16)+2,
// `* ::= "*"
(52<<16)+1,
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
(51<<16)+2,
// `- ::= "-"
(51<<16)+1,
// `+ ::= "+" ws*
(50<<16)+2,
// `+ ::= "+"
(50<<16)+1,
// `= ::= "=" ws*
(36<<16)+2,
// `= ::= "="
(36<<16)+1,
// `[ ::= "[" ws*
(24<<16)+2,
// `[ ::= "["
(24<<16)+1,
// `] ::= "]" ws*
(25<<16)+2,
// `] ::= "]"
(25<<16)+1,
// `< ::= "<" ws*
(47<<16)+2,
// `< ::= "<"
(47<<16)+1,
// `<= ::= "@" "<" ws*
(48<<16)+3,
// `<= ::= "@" "<"
(48<<16)+2,
// `> ::= ">" !"=" ws*
(49<<16)+2,
// `> ::= ">" !"="
(49<<16)+1,
// `. ::= "." ws*
(59<<16)+2,
// `. ::= "."
(59<<16)+1,
// `; ::= ";" ws*
(28<<16)+2,
// `; ::= ";"
(28<<16)+1,
// `++ ::= "@" "+" ws*
(37<<16)+3,
// `++ ::= "@" "+"
(37<<16)+2,
// `/ ::= "/" ws*
(53<<16)+2,
// `/ ::= "/"
(53<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(56<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(56<<16)+2,
// INTLIT ::= digit128 ws*
(56<<16)+2,
// INTLIT ::= digit128
(56<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(56<<16)+3,
// INTLIT ::= "0" $$2
(56<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(57<<16)+3,
// STRINGLIT ::= "@" '"'
(57<<16)+2,
// STRINGLIT ::= '"' any* $$3
(57<<16)+3,
// STRINGLIT ::= '"' $$3
(57<<16)+2,
// CHARLIT ::= "'" any ws*
(58<<16)+3,
// CHARLIT ::= "'" any
(58<<16)+2,
// idChar ::= letter
(131<<16)+1,
// idChar ::= digit
(131<<16)+1,
// idChar ::= "_"
(131<<16)+1,
// idChar128 ::= letter128
(132<<16)+1,
// idChar128 ::= digit128
(132<<16)+1,
// idChar128 ::= {223}
(132<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(133<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(134<<16)+1,
// digit* ::= digit* digit
(125<<16)+2,
// digit* ::= digit
(125<<16)+1,
// any* ::= any* any
(129<<16)+2,
// any* ::= any
(129<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(127<<16)+2,
// hexDigit* ::= hexDigit
(127<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// <case>* ::= <case>* <case>
(39<<16)+2,
// <case>* ::= <case>
(39<<16)+1,
// idChar* ::= idChar* idChar
(123<<16)+2,
// idChar* ::= idChar
(123<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>
(64<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>
(135<<16)+2,
// <empty bracket pair>* ::= <empty bracket pair>
(135<<16)+1,
// $$0 ::= idChar128 ws*
(124<<16)+2,
// $$0 ::= idChar128
(124<<16)+1,
// $$1 ::= digit128 ws*
(126<<16)+2,
// $$1 ::= digit128
(126<<16)+1,
// $$2 ::= hexDigit128 ws*
(128<<16)+2,
// $$2 ::= hexDigit128
(128<<16)+1,
// $$3 ::= any128 ws*
(130<<16)+2,
// $$3 ::= any128
(130<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
113, // 0
113, // 1
113, // 2
113, // 3
113, // 4
113, // 5
113, // 6
113, // 7
113, // 8
113, // 9
112, // 10
113, // 11
113, // 12
113, // 13
113, // 14
113, // 15
113, // 16
113, // 17
113, // 18
113, // 19
113, // 20
113, // 21
113, // 22
113, // 23
113, // 24
113, // 25
113, // 26
113, // 27
113, // 28
113, // 29
113, // 30
113, // 31
97, // " "
115, // "!"
117, // '"'
98, // "#"
113, // "$"
105, // "%"
113, // "&"
116, // "'"
106, // "("
99, // ")"
118, // "*"
107, // "+"
113, // ","
95, // "-"
108, // "."
101, // "/"
90, // "0"
89, // "1"
89, // "2"
89, // "3"
89, // "4"
89, // "5"
89, // "6"
89, // "7"
89, // "8"
89, // "9"
113, // ":"
102, // ";"
96, // "<"
110, // "="
103, // ">"
113, // "?"
111, // "@"
72, // "A"
72, // "B"
72, // "C"
72, // "D"
72, // "E"
72, // "F"
72, // "G"
72, // "H"
72, // "I"
72, // "J"
72, // "K"
72, // "L"
72, // "M"
72, // "N"
72, // "O"
72, // "P"
72, // "Q"
72, // "R"
72, // "S"
72, // "T"
72, // "U"
72, // "V"
72, // "W"
72, // "X"
72, // "Y"
72, // "Z"
94, // "["
113, // "\"
100, // "]"
113, // "^"
109, // "_"
113, // "`"
66, // "a"
79, // "b"
70, // "c"
72, // "d"
80, // "e"
71, // "f"
72, // "g"
81, // "h"
73, // "i"
72, // "j"
72, // "k"
74, // "l"
72, // "m"
82, // "n"
75, // "o"
67, // "p"
72, // "q"
76, // "r"
68, // "s"
83, // "t"
77, // "u"
69, // "v"
84, // "w"
78, // "x"
72, // "y"
72, // "z"
104, // "{"
113, // "|"
114, // "}"
113, // "~"
113, // 127
121, // 128
121, // 129
121, // 130
121, // 131
121, // 132
121, // 133
121, // 134
121, // 135
121, // 136
121, // 137
121, // 138
121, // 139
121, // 140
121, // 141
121, // 142
121, // 143
121, // 144
121, // 145
121, // 146
121, // 147
121, // 148
121, // 149
121, // 150
121, // 151
121, // 152
121, // 153
121, // 154
121, // 155
121, // 156
121, // 157
121, // 158
121, // 159
121, // 160
121, // 161
121, // 162
121, // 163
121, // 164
121, // 165
121, // 166
121, // 167
121, // 168
121, // 169
121, // 170
121, // 171
121, // 172
121, // 173
121, // 174
121, // 175
92, // 176
92, // 177
92, // 178
92, // 179
92, // 180
92, // 181
92, // 182
92, // 183
92, // 184
92, // 185
121, // 186
121, // 187
121, // 188
121, // 189
121, // 190
121, // 191
121, // 192
87, // 193
87, // 194
87, // 195
87, // 196
87, // 197
87, // 198
86, // 199
86, // 200
86, // 201
86, // 202
86, // 203
86, // 204
86, // 205
86, // 206
86, // 207
86, // 208
86, // 209
86, // 210
86, // 211
86, // 212
86, // 213
86, // 214
86, // 215
86, // 216
86, // 217
86, // 218
121, // 219
121, // 220
121, // 221
121, // 222
120, // 223
121, // 224
87, // 225
87, // 226
87, // 227
87, // 228
87, // 229
87, // 230
86, // 231
86, // 232
86, // 233
86, // 234
86, // 235
86, // 236
86, // 237
86, // 238
86, // 239
86, // 240
86, // 241
86, // 242
86, // 243
86, // 244
86, // 245
86, // 246
86, // 247
86, // 248
86, // 249
86, // 250
121, // 251
121, // 252
121, // 253
121, // 254
121, // 255
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
"<type> ::= # `boolean", // 12
"<type> ::= # `void", // 13
"<type> ::= # `null", // 14
"<type> ::= # ID", // 15
"<type> ::= # <type> <empty bracket pair>", // 16
"<empty bracket pair> ::= `[ `]", // 17
"<stmt> ::= # `{ <stmt>* `}", // 18
"<stmt> ::= # `{ <stmt>* `}", // 19
"<stmt> ::= <assign> `;", // 20
"<stmt> ::= <local var decl> `;", // 21
"<stmt> ::= # `if `( <exp> `) <stmt> # !`else", // 22
"<stmt> ::= # `if `( <exp> `) <stmt> # `else <stmt>", // 23
"<stmt> ::= # `for `( <assign> `; <exp> `; <assign> `) <stmt>", // 24
"<stmt> ::= # `while `( <exp> `) <stmt>", // 25
"<stmt> ::= # `break `;", // 26
"<assign> ::= <exp> # `= <exp>", // 27
"<assign> ::= # ID `++", // 28
"<local var decl> ::= <type> # ID `= <exp>", // 29
"<stmt> ::= # `;", // 30
"<stmt> ::= # `switch `( <exp> `) `{ <case>* `}", // 31
"<stmt> ::= # `switch `( <exp> `) `{ <case>* `}", // 32
"<case> ::= `case # <exp> `;", // 33
"<exp> ::= <exp5>", // 34
"<exp5> ::= <exp4>", // 35
"<exp4> ::= <exp3>", // 36
"<exp3> ::= <exp2>", // 37
"<exp2> ::= <exp1>", // 38
"<exp5> ::= <exp5> # `< <exp4>", // 39
"<exp5> ::= <exp5> # `<= <exp4>", // 40
"<exp5> ::= <exp5> # `> <exp4>", // 41
"<exp4> ::= <exp4> # `+ <exp3>", // 42
"<exp4> ::= <exp4> # `- <exp3>", // 43
"<exp3> ::= <exp3> # `* <exp2>", // 44
"<exp3> ::= <exp3> # `/ <exp2>", // 45
"<exp3> ::= <exp3> # `% <exp2>", // 46
"<exp2> ::= # `( <type> `) <exp1>", // 47
"<exp2> ::= # `+ <exp1>", // 48
"<exp2> ::= # `- <exp1>", // 49
"<exp2> ::= # `! <exp1>", // 50
"<exp1> ::= # ID", // 51
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 52
"<exp1> ::= # INTLIT", // 53
"<exp1> ::= # STRINGLIT", // 54
"<exp1> ::= # CHARLIT", // 55
"<exp1> ::= <exp1> `. # ID", // 56
"<exp1> ::= # `this", // 57
"<exp1> ::= # `true", // 58
"<exp1> ::= # `false", // 59
"<exp1> ::= # `null", // 60
"<exp1> ::= # `new # ID `( `)", // 61
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 62
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 63
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 64
"letter128 ::= {193..218 225..250}", // 65
"digit ::= {\"0\"..\"9\"}", // 66
"digit128 ::= {176..185}", // 67
"any ::= {0..127}", // 68
"any128 ::= {128..255}", // 69
"ws ::= \" \"", // 70
"ws ::= {10} registerNewline", // 71
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 72
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 73
"`class ::= \"#\" \"c\" \"l\" ws*", // 74
"`class ::= \"#\" \"c\" \"l\" ws*", // 75
"`extends ::= \"#\" \"e\" \"x\" ws*", // 76
"`extends ::= \"#\" \"e\" \"x\" ws*", // 77
"`void ::= \"#\" \"v\" \"o\" ws*", // 78
"`void ::= \"#\" \"v\" \"o\" ws*", // 79
"`int ::= \"#\" \"i\" \"t\" ws*", // 80
"`int ::= \"#\" \"i\" \"t\" ws*", // 81
"`while ::= \"#\" \"w\" \"h\" ws*", // 82
"`while ::= \"#\" \"w\" \"h\" ws*", // 83
"`if ::= \"#\" \"+\" ws*", // 84
"`if ::= \"#\" \"+\" ws*", // 85
"`else ::= \"#\" \"e\" \"l\" ws*", // 86
"`else ::= \"#\" \"e\" \"l\" ws*", // 87
"`for ::= \"#\" \"f\" \"o\" ws*", // 88
"`for ::= \"#\" \"f\" \"o\" ws*", // 89
"`break ::= \"#\" \"b\" \"r\" ws*", // 90
"`break ::= \"#\" \"b\" \"r\" ws*", // 91
"`this ::= \"#\" \"t\" \"h\" ws*", // 92
"`this ::= \"#\" \"t\" \"h\" ws*", // 93
"`false ::= \"#\" \"f\" \"a\" ws*", // 94
"`false ::= \"#\" \"f\" \"a\" ws*", // 95
"`true ::= \"#\" \"t\" \"r\" ws*", // 96
"`true ::= \"#\" \"t\" \"r\" ws*", // 97
"`null ::= \"#\" \"n\" \"u\" ws*", // 98
"`null ::= \"#\" \"n\" \"u\" ws*", // 99
"`new ::= \"#\" \"n\" \"e\" ws*", // 100
"`new ::= \"#\" \"n\" \"e\" ws*", // 101
"`case ::= \"#\" \"c\" \"e\" ws*", // 102
"`case ::= \"#\" \"c\" \"e\" ws*", // 103
"`public ::= \"#\" \"p\" \"u\" ws*", // 104
"`public ::= \"#\" \"p\" \"u\" ws*", // 105
"`switch ::= \"#\" \"s\" \"w\" ws*", // 106
"`switch ::= \"#\" \"s\" \"w\" ws*", // 107
"`! ::= \"!\" ws*", // 108
"`! ::= \"!\" ws*", // 109
"`% ::= \"%\" ws*", // 110
"`% ::= \"%\" ws*", // 111
"`* ::= \"*\" ws*", // 112
"`* ::= \"*\" ws*", // 113
"`( ::= \"(\" ws*", // 114
"`( ::= \"(\" ws*", // 115
"`) ::= \")\" ws*", // 116
"`) ::= \")\" ws*", // 117
"`{ ::= \"{\" ws*", // 118
"`{ ::= \"{\" ws*", // 119
"`} ::= \"}\" ws*", // 120
"`} ::= \"}\" ws*", // 121
"`- ::= \"-\" ws*", // 122
"`- ::= \"-\" ws*", // 123
"`+ ::= \"+\" ws*", // 124
"`+ ::= \"+\" ws*", // 125
"`= ::= \"=\" ws*", // 126
"`= ::= \"=\" ws*", // 127
"`[ ::= \"[\" ws*", // 128
"`[ ::= \"[\" ws*", // 129
"`] ::= \"]\" ws*", // 130
"`] ::= \"]\" ws*", // 131
"`< ::= \"<\" ws*", // 132
"`< ::= \"<\" ws*", // 133
"`<= ::= \"@\" \"<\" ws*", // 134
"`<= ::= \"@\" \"<\" ws*", // 135
"`> ::= \">\" !\"=\" ws*", // 136
"`> ::= \">\" !\"=\" ws*", // 137
"`. ::= \".\" ws*", // 138
"`. ::= \".\" ws*", // 139
"`; ::= \";\" ws*", // 140
"`; ::= \";\" ws*", // 141
"`++ ::= \"@\" \"+\" ws*", // 142
"`++ ::= \"@\" \"+\" ws*", // 143
"`/ ::= \"/\" ws*", // 144
"`/ ::= \"/\" ws*", // 145
"ID ::= letter128 ws*", // 146
"ID ::= letter128 ws*", // 147
"ID ::= letter idChar* idChar128 ws*", // 148
"ID ::= letter idChar* idChar128 ws*", // 149
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 150
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 151
"INTLIT ::= digit128 ws*", // 152
"INTLIT ::= digit128 ws*", // 153
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 154
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 155
"STRINGLIT ::= \"@\" \'\"\' ws*", // 156
"STRINGLIT ::= \"@\" \'\"\' ws*", // 157
"STRINGLIT ::= \'\"\' any* any128 ws*", // 158
"STRINGLIT ::= \'\"\' any* any128 ws*", // 159
"CHARLIT ::= \"\'\" any ws*", // 160
"CHARLIT ::= \"\'\" any ws*", // 161
"idChar ::= letter", // 162
"idChar ::= digit", // 163
"idChar ::= \"_\"", // 164
"idChar128 ::= letter128", // 165
"idChar128 ::= digit128", // 166
"idChar128 ::= {223}", // 167
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 168
"hexDigit128 ::= {176..185 193..198 225..230}", // 169
"digit* ::= digit* digit", // 170
"digit* ::= digit* digit", // 171
"any* ::= any* any", // 172
"any* ::= any* any", // 173
"<decl in class>* ::= <decl in class>* <decl in class>", // 174
"<decl in class>* ::= <decl in class>* <decl in class>", // 175
"hexDigit* ::= hexDigit* hexDigit", // 176
"hexDigit* ::= hexDigit* hexDigit", // 177
"<stmt>* ::= <stmt>* <stmt>", // 178
"<stmt>* ::= <stmt>* <stmt>", // 179
"<case>* ::= <case>* <case>", // 180
"<case>* ::= <case>* <case>", // 181
"idChar* ::= idChar* idChar", // 182
"idChar* ::= idChar* idChar", // 183
"<class decl>+ ::= <class decl>", // 184
"<class decl>+ ::= <class decl>+ <class decl>", // 185
"<empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>", // 186
"ws* ::= ws* ws", // 187
"ws* ::= ws* ws", // 188
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 189
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 190
"", // 191
"", // 192
"", // 193
"", // 194
"", // 195
"", // 196
"", // 197
"", // 198
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
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
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 7: <class decl> ::= `class [#] ID `extends ID `{ [<decl in class>*] `} @createdExtendsClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
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
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 11: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 12: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 13: <type> ::= [#] `void @voidType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 14: <type> ::= [#] `null @nullType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 15: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 16: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
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
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 19: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
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
    { // 22: <stmt> ::= [#] `if `( <exp> `) <stmt> !`else [#] @newIfBlock(int,Exp,Statement,int)=>Statement
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 23: <stmt> ::= [#] `if `( <exp> `) <stmt> [#] `else <stmt> @newIfElseBlock(int,Exp,Statement,int,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 24: <stmt> ::= [#] `for `( <assign> `; <exp> `; <assign> `) <stmt> @newForLoop(int,Statement,Exp,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 25: <stmt> ::= [#] `while `( <exp> `) <stmt> @newWhileBlock(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 26: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 27: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 28: <assign> ::= [#] ID `++ @assignPlusPlus(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 29: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 30: <stmt> ::= [#] `; @newEmptyStmt(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 31: <stmt> ::= [#] `switch `( <exp> `) `{ <case>* `} @newSwitch(int,Exp,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 32: <stmt> ::= [#] `switch `( <exp> `) `{ [<case>*] `} @newSwitch(int,Exp,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 33: <case> ::= `case [#] <exp> `; @newCase(int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 34: <exp> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 36: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 37: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 38: <exp2> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: <exp5> ::= <exp5> [#] `< <exp4> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 40: <exp5> ::= <exp5> [#] `<= <exp4> @newLessThanEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 41: <exp5> ::= <exp5> [#] `> <exp4> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 42: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 43: <exp4> ::= <exp4> [#] `- <exp3> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 44: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 45: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 46: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 47: <exp2> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 48: <exp2> ::= [#] `+ <exp1> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 49: <exp2> ::= [#] `- <exp1> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 50: <exp2> ::= [#] `! <exp1> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 51: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 52: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 53: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 54: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 55: <exp1> ::= [#] CHARLIT @newCharLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 56: <exp1> ::= <exp1> `. [#] ID @newInstVarAccess(Exp,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 57: <exp1> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 58: <exp1> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 59: <exp1> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 60: <exp1> ::= [#] `null @newNullExp(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 61: <exp1> ::= [#] `new [#] ID `( `) @newObject(int,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 62: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] <empty bracket pair>** @newArray(Type,int,Exp,List<Object>)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 63: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] !<empty bracket pair> [<empty bracket pair>**] @newArray(Type,int,Exp,List<Object>)=>Exp
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 64: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 65: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 66: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 67: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 68: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 69: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 70: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: ws ::= {10} [registerNewline] @void
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 73: `boolean ::= "#" "b" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 74: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 75: `class ::= "#" "c" "l" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 76: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 77: `extends ::= "#" "e" "x" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 78: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 79: `void ::= "#" "v" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 80: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 81: `int ::= "#" "i" "t" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 82: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 83: `while ::= "#" "w" "h" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 84: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 85: `if ::= "#" "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 86: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 87: `else ::= "#" "e" "l" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 88: `for ::= "#" "f" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 89: `for ::= "#" "f" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 90: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 91: `break ::= "#" "b" "r" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 92: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 93: `this ::= "#" "t" "h" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 94: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 95: `false ::= "#" "f" "a" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 96: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 97: `true ::= "#" "t" "r" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 98: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 99: `null ::= "#" "n" "u" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 100: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 101: `new ::= "#" "n" "e" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 102: `case ::= "#" "c" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 103: `case ::= "#" "c" "e" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 104: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 105: `public ::= "#" "p" "u" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 106: `switch ::= "#" "s" "w" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 107: `switch ::= "#" "s" "w" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 108: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 109: `! ::= "!" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 110: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 111: `% ::= "%" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 112: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 113: `* ::= "*" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 114: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 115: `( ::= "(" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 117: `) ::= ")" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 118: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 119: `{ ::= "{" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 120: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 121: `} ::= "}" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `- ::= "-" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 125: `+ ::= "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `= ::= "=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `[ ::= "[" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `] ::= "]" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `< ::= "<" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 135: `<= ::= "@" "<" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 136: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `> ::= ">" !"=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `. ::= "." [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `; ::= ";" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `++ ::= "@" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 143: `++ ::= "@" "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 144: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `/ ::= "/" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 147: ID ::= letter128 [ws*] @text
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 148: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 149: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 150: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 151: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 152: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 153: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 154: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 155: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 156: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 157: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 158: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 159: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 160: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 161: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 162: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 163: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 164: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 165: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 166: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 167: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 168: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 169: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 170: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 171: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 172: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 173: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 174: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 175: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 176: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 177: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 178: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 179: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 180: <case>* ::= <case>* <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 181: <case>* ::= [<case>*] <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 182: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 183: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 184: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 185: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 186: <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 187: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 188: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 189: <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 190: <empty bracket pair>* ::= [<empty bracket pair>*] <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 191: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 192: $$0 ::= idChar128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 193: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 194: $$1 ::= digit128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 195: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 196: $$2 ::= hexDigit128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 197: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 198: $$3 ::= any128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "<case>* ::=", // <case>*
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "<empty bracket pair>* ::=", // <empty bracket pair>*
    "any* ::=", // any*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "<empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>", // <empty bracket pair>**
    "idChar* ::=", // idChar*
    "digit* ::=", // digit*
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // <case>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // hexDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <stmt>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <empty bracket pair>*
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
    { // <empty bracket pair>**
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((55<<5)|0x5)/*methodCall:55*/,
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
      Type result = actionObject.booleanType(parm0);
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
      Type result = actionObject.nullType(parm0);
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
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      int parm3 = (Integer)si.popPb();
      Statement result = actionObject.newIfBlock(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      int parm3 = (Integer)si.popPb();
      Statement parm4 = (Statement)si.popPb();
      Statement result = actionObject.newIfElseBlock(parm0,parm1,parm2,parm3,parm4);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      Statement parm1 = (Statement)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement parm4 = (Statement)si.popPb();
      Statement result = actionObject.newForLoop(parm0,parm1,parm2,parm3,parm4);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.newWhileBlock(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 17: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignPlusPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 19: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newEmptyStmt(parm0);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Statement result = actionObject.newSwitch(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement result = actionObject.newCase(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThanEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 27: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 28: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 29: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 30: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 36: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 40: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstVarAccess(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNullExp(parm0);
      si.pushPb(result);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newObject(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 46: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      List<Object> parm3 = (List<Object>)si.popPb();
      Exp result = actionObject.newArray(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 47: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 48: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 49: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 50: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 51: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 52: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 53: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 54: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 55: {
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
"Type booleanType(int)",
"Type voidType(int)",
"Type nullType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"Statement newBlock(int,List<Statement>)",
"Statement newIfBlock(int,Exp,Statement,int)",
"Statement newIfElseBlock(int,Exp,Statement,int,Statement)",
"Statement newForLoop(int,Statement,Exp,Statement,Statement)",
"Statement newWhileBlock(int,Exp,Statement)",
"Statement newBreak(int)",
"Statement assign(Exp,int,Exp)",
"Statement assignPlusPlus(int,String)",
"Statement localVarDecl(Type,int,String,Exp)",
"Statement newEmptyStmt(int)",
"Statement newSwitch(int,Exp,List<Statement>)",
"Statement newCase(int,Exp)",
"Exp newLessThan(Exp,int,Exp)",
"Exp newLessThanEqualTo(Exp,int,Exp)",
"Exp newGreaterThan(Exp,int,Exp)",
"Exp newPlus(Exp,int,Exp)",
"Exp newMinus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newDivide(Exp,int,Exp)",
"Exp newRemainder(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryPlus(int,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newUnaryNot(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newIntegerLiteral(int,int)",
"Exp newStringLiteral(int,String)",
"Exp newCharLiteral(int,int)",
"Exp newInstVarAccess(Exp,int,String)",
"Exp newThis(int)",
"Exp newTrue(int)",
"Exp newFalse(int)",
"Exp newNullExp(int)",
"Exp newObject(int,int,String)",
"Exp newArray(Type,int,Exp,List<Object>)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
"String emptyString(char,char)",
"String string(char,List<Character>,char)",
"int charVal(char,char)",
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
4,1,
5,1,
5,1,
3,1,
1,1,
3,1,
2,1,
4,1,
1,1,
3,1,
2,1,
3,1,
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
2,1,
2,1,
3,1,
2,1,
2,1,
2,1,
3,1,
1,1,
1,1,
1,1,
1,1,
3,1,
4,1,
1,1,
3,1,
1,1,
3,1,
2,1,
3,1,
2,1,
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
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    0,
    1,
    1,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    0,
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
