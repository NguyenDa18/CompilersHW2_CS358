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
public int getEofSym() { return 170; }
public int getNttSym() { return 171; }
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
"<inst var decl>",
"`public",
"`void",
"<formalList>",
"<stmt>*",
"<type>",
"<returnStmt>",
"`return",
"<exp>",
"`;",
"`(",
"<listElement>*",
"`)",
"<listElement>",
"`,",
"`int",
"`boolean",
"`null",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"<local var decl>",
"<methodCall>",
"`if",
"`else",
"`for",
"<for1>",
"$$0",
"<for2>",
"<for3>",
"`while",
"`break",
"`=",
"`++",
"`--",
"`switch",
"<case>*",
"<case>",
"`case",
"`:",
"`default",
"<exp8>",
"<exp7>",
"<exp6>",
"<exp5>",
"<exp4>",
"<exp3>",
"<exp2>",
"<exp1>",
"`||",
"`&&",
"`==",
"`!=",
"`<",
"`<=",
"`>",
"`>=",
"`instanceof",
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
"<expList>",
"<next exp>*",
"<next exp>",
"`super",
"letter",
"\"a\"",
"\"d\"",
"\"p\"",
"\"s\"",
"\"v\"",
"\"c\"",
"{\"A\"..\"Z\" \"g\" \"j\"..\"k\" \"m\" \"q\" \"y\"..\"z\"}",
"\"f\"",
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
"{0..9 11..31 \"$\" \"?\" \"\\\" \"^\" \"`\" \"~\"..127}",
"\"|\"",
"\" \"",
"\"#\"",
"\"&\"",
"\")\"",
"\",\"",
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
"\":\"",
"\"=\"",
"\"@\"",
"10",
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
"$$1",
"digit*",
"$$2",
"hexDigit*",
"$$3",
"any*",
"$$4",
"idChar",
"idChar128",
"hexDigit",
"hexDigit128",
"<empty bracket pair>*",
"$$5",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 172;}
private static final int MIN_REDUCTION = 768;
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
1,692, // <start>
2,386, // ws*
3,185, // <program>
4,87, // <class decl>+
5,674, // <class decl>
6,505, // `class
128,114, // " "
129,563, // "#"
146,34, // {10}
155,727, // ws
  }
,
{ // state 1
  }
,
{ // state 2
33,MIN_REDUCTION+111, // `[
123,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 3
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 4
128,114, // " "
146,34, // {10}
155,52, // ws
171,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 5
0x80000000|369, // match move
0x80000000|255, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 6
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 7
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 8
0x80000000|499, // match move
0x80000000|713, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 9
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 10
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 11
0x80000000|106, // match move
0x80000000|549, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 13
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 14
0x80000000|312, // match move
0x80000000|115, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 15
2,28, // ws*
33,MIN_REDUCTION+264, // `[
123,MIN_REDUCTION+264, // "["
128,461, // " "
146,303, // {10}
155,673, // ws
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 17
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 18
2,605, // ws*
  }
,
{ // state 19
24,514, // `(
139,487, // "("
  }
,
{ // state 20
106,158, // "u"
113,275, // "w"
  }
,
{ // state 21
0x80000000|125, // match move
0x80000000|493, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 22
2,97, // ws*
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 23
33,MIN_REDUCTION+110, // `[
123,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 24
0x80000000|680, // match move
0x80000000|525, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 25
0x80000000|344, // match move
0x80000000|422, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 26
0x80000000|647, // match move
0x80000000|358, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 27
40,121, // `else
129,283, // "#"
  }
,
{ // state 28
0x80000000|624, // match move
0x80000000|243, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 29
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 30
23,133, // `;
135,72, // ";"
  }
,
{ // state 31
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 33
128,756, // " "
146,238, // {10}
155,134, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 34
171,MIN_REDUCTION+111, // $NT
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 35
0x80000000|765, // match move
0x80000000|263, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 36
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 37
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 38
0x80000000|348, // match move
0x80000000|286, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 39
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 40
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 41
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 42
0x80000000|281, // match move
0x80000000|347, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 43
101,139, // "f"
111,223, // "n"
112,119, // "t"
  }
,
{ // state 44
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 45
23,551, // `;
135,653, // ";"
169,462, // $$5
  }
,
{ // state 46
2,248, // ws*
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 47
2,248, // ws*
  }
,
{ // state 48
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 49
33,MIN_REDUCTION+85, // `[
123,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 51
94,57, // "a"
95,57, // "d"
96,57, // "p"
97,57, // "s"
98,57, // "v"
99,57, // "c"
100,57, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,57, // "f"
102,57, // "i"
103,57, // "l"
104,57, // "o"
105,57, // "r"
106,57, // "u"
107,57, // "x"
108,57, // "b"
109,57, // "e"
110,57, // "h"
111,57, // "n"
112,57, // "t"
113,57, // "w"
115,763, // {199..218 231..250}
116,763, // {193..198 225..230}
118,57, // {"1".."9"}
119,57, // "0"
121,763, // {176..185}
122,37, // any
123,57, // "["
124,57, // "-"
125,57, // "<"
126,57, // {0..9 11..31 "$" "?" "\" "^" "`" "~"..127}
127,57, // "|"
128,57, // " "
129,57, // "#"
130,57, // "&"
131,57, // ")"
132,57, // ","
133,57, // "]"
134,57, // "/"
135,57, // ";"
136,57, // ">"
137,57, // "{"
138,57, // "%"
139,57, // "("
140,57, // "+"
141,57, // "."
142,57, // "_"
143,57, // ":"
144,57, // "="
145,57, // "@"
146,57, // {10}
147,57, // "}"
148,57, // "!"
149,57, // "'"
150,57, // '"'
151,57, // "*"
152,660, // any128
153,763, // {223}
154,763, // {128..175 186..192 219..222 224 251..255}
162,470, // any*
163,401, // $$4
  }
,
{ // state 52
171,MIN_REDUCTION+255, // $NT
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 53
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 54
26,482, // `)
131,544, // ")"
  }
,
{ // state 55
24,589, // `(
139,487, // "("
  }
,
{ // state 56
127,143, // "|"
130,132, // "&"
144,626, // "="
148,616, // "!"
  }
,
{ // state 57
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 58
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 59
2,540, // ws*
33,MIN_REDUCTION+137, // `[
123,MIN_REDUCTION+137, // "["
128,461, // " "
146,303, // {10}
155,673, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 60
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 61
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 62
2,744, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 63
128,461, // " "
146,303, // {10}
155,260, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 64
0x80000000|606, // match move
0x80000000|603, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 65
0x80000000|359, // match move
0x80000000|246, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 66
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 67
33,MIN_REDUCTION+92, // `[
123,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 68
0x80000000|227, // match move
0x80000000|148, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 69
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 70
106,159, // "u"
  }
,
{ // state 71
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 72
0x80000000|22, // match move
0x80000000|679, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 73
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 74
24,476, // `(
139,487, // "("
  }
,
{ // state 75
97,20, // "s"
101,92, // "f"
102,151, // "i"
105,77, // "r"
108,486, // "b"
111,223, // "n"
112,119, // "t"
113,739, // "w"
140,191, // "+"
  }
,
{ // state 76
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 77
109,117, // "e"
  }
,
{ // state 78
0x80000000|321, // match move
0x80000000|278, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 79
33,MIN_REDUCTION+220, // `[
123,MIN_REDUCTION+220, // "["
128,461, // " "
146,303, // {10}
155,260, // ws
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 80
33,MIN_REDUCTION+83, // `[
123,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 81
24,524, // `(
33,MIN_REDUCTION+87, // `[
123,MIN_REDUCTION+87, // "["
139,487, // "("
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 82
0x80000000|504, // match move
0x80000000|764, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 83
0x80000000|277, // match move
0x80000000|417, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 84
33,633, // `[
83,328, // `.
123,200, // "["
141,214, // "."
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 85
0x80000000|415, // match move
0x80000000|631, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 86
2,225, // ws*
  }
,
{ // state 87
5,737, // <class decl>
6,505, // `class
129,563, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 88
0x80000000|501, // match move
0x80000000|503, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 89
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 90
2,535, // ws*
33,MIN_REDUCTION+169, // `[
123,MIN_REDUCTION+169, // "["
128,461, // " "
146,303, // {10}
155,673, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 91
7,573, // ID
24,575, // `(
31,5, // `null
61,414, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 92
94,463, // "a"
104,725, // "o"
  }
,
{ // state 93
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 94
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 95
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 96
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 97
0x80000000|140, // match move
0x80000000|667, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 98
7,573, // ID
24,575, // `(
31,5, // `null
62,308, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 99
2,541, // ws*
33,MIN_REDUCTION+262, // `[
123,MIN_REDUCTION+262, // "["
128,461, // " "
146,303, // {10}
155,673, // ws
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 100
2,445, // ws*
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 101
8,446, // `{
137,331, // "{"
  }
,
{ // state 102
34,MIN_REDUCTION+184, // `]
43,MIN_REDUCTION+184, // $$0
66,MIN_REDUCTION+184, // `&&
67,MIN_REDUCTION+184, // `==
68,MIN_REDUCTION+184, // `!=
72,MIN_REDUCTION+184, // `>=
73,MIN_REDUCTION+184, // `instanceof
88,MIN_REDUCTION+184, // <empty bracket pair>**
90,MIN_REDUCTION+184, // <next exp>*
91,MIN_REDUCTION+184, // <next exp>
128,461, // " "
129,MIN_REDUCTION+184, // "#"
132,MIN_REDUCTION+184, // ","
133,MIN_REDUCTION+184, // "]"
145,MIN_REDUCTION+184, // "@"
146,303, // {10}
155,260, // ws
169,MIN_REDUCTION+184, // $$5
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 103
2,225, // ws*
33,MIN_REDUCTION+268, // `[
123,MIN_REDUCTION+268, // "["
128,461, // " "
146,303, // {10}
155,673, // ws
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 104
2,41, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 105
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 106
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 107
8,437, // `{
137,331, // "{"
  }
,
{ // state 108
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 109
2,11, // ws*
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 111
2,96, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 112
33,MIN_REDUCTION+136, // `[
123,MIN_REDUCTION+136, // "["
128,461, // " "
146,303, // {10}
155,260, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 113
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 114
171,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 115
2,605, // ws*
33,MIN_REDUCTION+266, // `[
123,MIN_REDUCTION+266, // "["
128,461, // " "
146,303, // {10}
155,673, // ws
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 116
7,573, // ID
24,575, // `(
31,5, // `null
61,534, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 117
2,702, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 118
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 119
105,285, // "r"
110,323, // "h"
  }
,
{ // state 120
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 121
7,35, // ID
8,193, // `{
19,668, // <type>
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,543, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 122
0x80000000|661, // match move
0x80000000|597, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 123
2,225, // ws*
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 124
0x80000000|719, // match move
0x80000000|428, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 125
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 126
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 127
7,244, // ID
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
  }
,
{ // state 128
128,461, // " "
146,303, // {10}
155,260, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 129
33,MIN_REDUCTION+231, // `[
123,MIN_REDUCTION+231, // "["
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 130
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 131
0x80000000|715, // match move
0x80000000|79, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 132
2,458, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 133
0x80000000|662, // match move
0x80000000|547, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 134
0x80000000|50, // match move
0x80000000|740, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 135
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 137
2,38, // ws*
33,MIN_REDUCTION+225, // `[
123,MIN_REDUCTION+225, // "["
128,461, // " "
146,303, // {10}
155,673, // ws
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 138
0x80000000|765, // match move
0x80000000|709, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 139
94,463, // "a"
  }
,
{ // state 140
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 142
0x80000000|459, // match move
0x80000000|196, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 143
2,454, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 144
7,35, // ID
8,193, // `{
10,582, // `}
19,668, // <type>
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,120, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
147,194, // "}"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 145
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 146
171,MIN_REDUCTION+24, // $NT
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 147
26,385, // `)
131,544, // ")"
  }
,
{ // state 148
33,MIN_REDUCTION+212, // `[
123,MIN_REDUCTION+212, // "["
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 149
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 150
7,35, // ID
8,176, // `{
19,668, // <type>
22,675, // <exp>
23,565, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,213, // <stmt>
36,299, // <assign>
37,30, // <local var decl>
38,665, // <methodCall>
39,55, // `if
41,19, // `for
46,74, // `while
47,635, // `break
49,271, // `++
50,683, // `--
51,762, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,72, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 151
112,111, // "t"
  }
,
{ // state 152
7,570, // ID
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
  }
,
{ // state 153
0x80000000|277, // match move
0x80000000|154, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 154
33,633, // `[
83,328, // `.
123,200, // "["
141,214, // "."
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 155
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 156
0x80000000|105, // match move
0x80000000|49, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 157
7,573, // ID
31,5, // `null
64,274, // <exp1>
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
129,43, // "#"
145,179, // "@"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 158
2,412, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 159
2,252, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 160
23,438, // `;
135,653, // ";"
  }
,
{ // state 161
2,634, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 162
0x80000000|94, // match move
0x80000000|181, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 163
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 164
94,469, // "a"
95,469, // "d"
96,469, // "p"
97,469, // "s"
98,469, // "v"
99,469, // "c"
100,469, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,469, // "f"
102,469, // "i"
103,469, // "l"
104,469, // "o"
105,469, // "r"
106,469, // "u"
107,469, // "x"
108,469, // "b"
109,469, // "e"
110,469, // "h"
111,469, // "n"
112,469, // "t"
113,469, // "w"
116,558, // {193..198 225..230}
118,469, // {"1".."9"}
119,469, // "0"
121,558, // {176..185}
161,88, // $$3
166,364, // hexDigit
167,14, // hexDigit128
  }
,
{ // state 165
23,175, // `;
43,380, // $$0
135,653, // ";"
  }
,
{ // state 166
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 167
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 168
94,124, // "a"
95,124, // "d"
96,124, // "p"
97,124, // "s"
98,124, // "v"
99,124, // "c"
100,124, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,124, // "f"
102,124, // "i"
103,124, // "l"
104,124, // "o"
105,124, // "r"
106,124, // "u"
107,124, // "x"
108,124, // "b"
109,124, // "e"
110,124, // "h"
111,124, // "n"
112,124, // "t"
113,124, // "w"
118,124, // {"1".."9"}
119,124, // "0"
122,689, // any
123,124, // "["
124,124, // "-"
125,124, // "<"
126,124, // {0..9 11..31 "$" "?" "\" "^" "`" "~"..127}
127,124, // "|"
128,124, // " "
129,124, // "#"
130,124, // "&"
131,124, // ")"
132,124, // ","
133,124, // "]"
134,124, // "/"
135,124, // ";"
136,124, // ">"
137,124, // "{"
138,124, // "%"
139,124, // "("
140,124, // "+"
141,124, // "."
142,124, // "_"
143,124, // ":"
144,124, // "="
145,124, // "@"
146,124, // {10}
147,124, // "}"
148,124, // "!"
149,124, // "'"
150,124, // '"'
151,124, // "*"
  }
,
{ // state 169
24,441, // `(
33,MIN_REDUCTION+82, // `[
49,743, // `++
50,596, // `--
123,MIN_REDUCTION+82, // "["
139,487, // "("
145,212, // "@"
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 171
127,143, // "|"
  }
,
{ // state 172
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 173
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 174
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 175
7,573, // ID
22,436, // <exp>
23,202, // `;
24,575, // `(
31,5, // `null
44,517, // <for2>
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
135,653, // ";"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
169,122, // $$5
  }
,
{ // state 176
7,35, // ID
8,193, // `{
10,460, // `}
18,536, // <stmt>*
19,668, // <type>
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,588, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
147,615, // "}"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 177
98,378, // "v"
102,151, // "i"
108,409, // "b"
111,70, // "n"
  }
,
{ // state 178
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 179
150,403, // '"'
  }
,
{ // state 180
0x80000000|267, // match move
0x80000000|757, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 181
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 182
102,151, // "i"
108,409, // "b"
111,70, // "n"
  }
,
{ // state 183
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 184
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 185
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 186
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 188
25,322, // <listElement>*
26,304, // `)
27,60, // <listElement>
28,379, // `,
131,544, // ")"
132,643, // ","
  }
,
{ // state 189
55,641, // `:
143,578, // ":"
  }
,
{ // state 190
26,157, // `)
32,291, // <empty bracket pair>
33,416, // `[
123,200, // "["
131,544, // ")"
  }
,
{ // state 191
2,427, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 192
111,257, // "n"
  }
,
{ // state 193
7,35, // ID
8,193, // `{
10,714, // `}
18,144, // <stmt>*
19,668, // <type>
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,588, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
147,194, // "}"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 194
2,250, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 196
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 197
124,562, // "-"
140,161, // "+"
  }
,
{ // state 198
0x80000000|6, // match move
0x80000000|33, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 199
24,433, // `(
139,487, // "("
  }
,
{ // state 200
2,73, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 201
33,MIN_REDUCTION+265, // `[
123,MIN_REDUCTION+265, // "["
128,461, // " "
146,303, // {10}
155,260, // ws
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 202
7,273, // ID
22,675, // <exp>
24,575, // `(
26,529, // `)
31,5, // `null
36,515, // <assign>
38,397, // <methodCall>
45,593, // <for3>
49,271, // `++
50,683, // `--
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,211, // "#"
131,544, // ")"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 203
0x80000000|100, // match move
0x80000000|707, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 204
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 205
65,699, // `||
145,171, // "@"
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 206
0x80000000|394, // match move
0x80000000|262, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 207
33,633, // `[
83,328, // `.
123,200, // "["
141,214, // "."
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 208
69,718, // `<
70,116, // `<=
71,91, // `>
72,663, // `>=
73,127, // `instanceof
125,754, // "<"
129,604, // "#"
136,652, // ">"
145,481, // "@"
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 209
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 210
48,398, // `=
144,444, // "="
  }
,
{ // state 211
97,650, // "s"
101,139, // "f"
111,223, // "n"
112,119, // "t"
  }
,
{ // state 212
124,562, // "-"
125,104, // "<"
127,143, // "|"
130,132, // "&"
136,584, // ">"
140,161, // "+"
144,626, // "="
148,616, // "!"
  }
,
{ // state 213
0x80000000|574, // match move
0x80000000|16, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 214
2,36, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 215
23,600, // `;
43,607, // $$0
135,653, // ";"
  }
,
{ // state 216
7,645, // ID
32,291, // <empty bracket pair>
33,416, // `[
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
123,200, // "["
  }
,
{ // state 217
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 218
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 219
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 220
0x80000000|478, // match move
0x80000000|538, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 221
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 222
67,480, // `==
68,583, // `!=
145,56, // "@"
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 223
106,629, // "u"
109,381, // "e"
  }
,
{ // state 224
7,188, // ID
32,291, // <empty bracket pair>
33,416, // `[
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
123,200, // "["
  }
,
{ // state 225
0x80000000|671, // match move
0x80000000|384, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 226
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 227
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 228
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 230
7,35, // ID
19,668, // <type>
22,675, // <exp>
23,600, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
36,473, // <assign>
37,311, // <local var decl>
38,295, // <methodCall>
42,215, // <for1>
43,325, // $$0
49,271, // `++
50,683, // `--
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,450, // "#"
135,653, // ";"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 231
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 232
33,MIN_REDUCTION+134, // `[
123,MIN_REDUCTION+134, // "["
128,461, // " "
146,303, // {10}
155,260, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 233
93,241, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,644, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
117,700, // digit
118,371, // {"1".."9"}
119,371, // "0"
120,220, // digit128
121,65, // {176..185}
142,9, // "_"
153,488, // {223}
156,421, // idChar*
157,509, // $$1
164,302, // idChar
165,656, // idChar128
  }
,
{ // state 234
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 235
2,316, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 236
7,35, // ID
8,193, // `{
19,668, // <type>
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,598, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 237
102,466, // "i"
108,521, // "b"
111,484, // "n"
  }
,
{ // state 238
0x80000000|324, // match move
0x80000000|697, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 239
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 240
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 242
33,MIN_REDUCTION+132, // `[
123,MIN_REDUCTION+132, // "["
128,461, // " "
146,303, // {10}
155,260, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 243
33,MIN_REDUCTION+263, // `[
123,MIN_REDUCTION+263, // "["
128,461, // " "
146,303, // {10}
155,260, // ws
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 244
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 245
96,411, // "p"
102,151, // "i"
108,409, // "b"
111,70, // "n"
  }
,
{ // state 246
33,MIN_REDUCTION+107, // `[
123,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 247
0x80000000|221, // match move
0x80000000|706, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 248
0x80000000|32, // match move
0x80000000|232, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 249
124,562, // "-"
140,161, // "+"
150,403, // '"'
  }
,
{ // state 250
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 251
67,480, // `==
68,583, // `!=
145,56, // "@"
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 252
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 253
7,736, // ID
19,224, // <type>
26,494, // `)
29,479, // `int
30,183, // `boolean
31,388, // `null
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
129,182, // "#"
131,544, // ")"
  }
,
{ // state 254
7,736, // ID
16,152, // `void
19,305, // <type>
29,479, // `int
30,183, // `boolean
31,388, // `null
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
129,177, // "#"
  }
,
{ // state 255
33,MIN_REDUCTION+91, // `[
123,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 256
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 257
2,440, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 258
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 259
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 260
0x80000000|317, // match move
0x80000000|602, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 261
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 262
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 263
7,MIN_REDUCTION+22, // ID
24,441, // `(
33,MIN_REDUCTION+82, // `[
49,743, // `++
50,596, // `--
94,MIN_REDUCTION+22, // "a"
95,MIN_REDUCTION+22, // "d"
96,MIN_REDUCTION+22, // "p"
97,MIN_REDUCTION+22, // "s"
98,MIN_REDUCTION+22, // "v"
99,MIN_REDUCTION+22, // "c"
100,MIN_REDUCTION+22, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,MIN_REDUCTION+22, // "f"
102,MIN_REDUCTION+22, // "i"
103,MIN_REDUCTION+22, // "l"
104,MIN_REDUCTION+22, // "o"
105,MIN_REDUCTION+22, // "r"
106,MIN_REDUCTION+22, // "u"
107,MIN_REDUCTION+22, // "x"
108,MIN_REDUCTION+22, // "b"
109,MIN_REDUCTION+22, // "e"
110,MIN_REDUCTION+22, // "h"
111,MIN_REDUCTION+22, // "n"
112,MIN_REDUCTION+22, // "t"
113,MIN_REDUCTION+22, // "w"
115,MIN_REDUCTION+22, // {199..218 231..250}
116,MIN_REDUCTION+22, // {193..198 225..230}
123,MIN_REDUCTION+82, // "["
139,487, // "("
145,212, // "@"
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 264
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 265
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 266
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 267
32,345, // <empty bracket pair>
33,338, // `[
123,200, // "["
  }
,
{ // state 268
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 269
26,640, // `)
131,544, // ")"
  }
,
{ // state 270
0x80000000|346, // match move
0x80000000|67, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 271
7,519, // ID
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
  }
,
{ // state 272
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 273
0x80000000|1, // match move
0x80000000|169, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 274
0x80000000|522, // match move
0x80000000|407, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 275
2,226, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 276
2,535, // ws*
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 277
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 278
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 279
33,MIN_REDUCTION+216, // `[
123,MIN_REDUCTION+216, // "["
128,461, // " "
146,303, // {10}
155,260, // ws
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 280
8,537, // `{
137,331, // "{"
  }
,
{ // state 281
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 282
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 283
109,701, // "e"
  }
,
{ // state 284
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 285
0x80000000|355, // match move
0x80000000|59, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 286
33,MIN_REDUCTION+224, // `[
123,MIN_REDUCTION+224, // "["
128,461, // " "
146,303, // {10}
155,260, // ws
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 287
24,751, // `(
139,487, // "("
  }
,
{ // state 288
0x80000000|571, // match move
0x80000000|174, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 289
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 290
0x80000000|256, // match move
0x80000000|483, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 291
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 292
7,35, // ID
8,193, // `{
10,518, // `}
19,668, // <type>
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,408, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
52,465, // <case>*
53,392, // <case>
54,405, // `case
56,309, // `default
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,471, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
147,194, // "}"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 293
74,98, // `+
75,423, // `-
124,594, // "-"
140,690, // "+"
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 294
128,MIN_REDUCTION+110, // " "
146,MIN_REDUCTION+110, // {10}
155,MIN_REDUCTION+110, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 295
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 296
2,540, // ws*
  }
,
{ // state 297
2,687, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 298
7,35, // ID
8,176, // `{
19,668, // <type>
22,675, // <exp>
23,565, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,510, // <stmt>
36,299, // <assign>
37,30, // <local var decl>
38,665, // <methodCall>
39,55, // `if
41,19, // `for
46,74, // `while
47,635, // `break
49,271, // `++
50,683, // `--
51,762, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,72, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 299
23,25, // `;
135,72, // ";"
  }
,
{ // state 300
34,559, // `]
133,749, // "]"
  }
,
{ // state 301
26,716, // `)
131,544, // ")"
  }
,
{ // state 302
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 303
0x80000000|711, // match move
0x80000000|2, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 304
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 305
7,676, // ID
32,291, // <empty bracket pair>
33,416, // `[
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
123,200, // "["
  }
,
{ // state 306
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 307
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 308
76,340, // `*
77,601, // `/
78,613, // `%
134,349, // "/"
138,502, // "%"
151,477, // "*"
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 309
55,684, // `:
143,578, // ":"
  }
,
{ // state 310
7,573, // ID
31,5, // `null
64,319, // <exp1>
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
129,43, // "#"
145,179, // "@"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 311
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 312
2,605, // ws*
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 313
2,320, // ws*
33,MIN_REDUCTION+185, // `[
43,MIN_REDUCTION+185, // $$0
66,MIN_REDUCTION+185, // `&&
67,MIN_REDUCTION+185, // `==
68,MIN_REDUCTION+185, // `!=
72,MIN_REDUCTION+185, // `>=
128,461, // " "
145,MIN_REDUCTION+185, // "@"
146,303, // {10}
155,673, // ws
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 314
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 315
0x80000000|172, // match move
0x80000000|163, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 316
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 317
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 318
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 319
0x80000000|712, // match move
0x80000000|207, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 320
0x80000000|447, // match move
0x80000000|102, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 321
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 322
26,618, // `)
27,431, // <listElement>
28,379, // `,
131,544, // ")"
132,643, // ","
  }
,
{ // state 323
0x80000000|492, // match move
0x80000000|351, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 324
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 326
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 327
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 328
7,26, // ID
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
  }
,
{ // state 329
2,735, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 330
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 331
2,377, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 332
24,599, // `(
139,487, // "("
  }
,
{ // state 333
0x80000000|289, // match move
0x80000000|539, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 334
7,404, // ID
22,44, // <exp>
24,575, // `(
31,5, // `null
38,614, // <methodCall>
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,211, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 335
0x80000000|126, // match move
0x80000000|382, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 336
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 337
2,248, // ws*
33,MIN_REDUCTION+135, // `[
123,MIN_REDUCTION+135, // "["
128,461, // " "
146,303, // {10}
155,673, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 338
34,288, // `]
133,749, // "]"
  }
,
{ // state 339
33,MIN_REDUCTION+82, // `[
123,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 340
7,573, // ID
24,575, // `(
31,5, // `null
63,752, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 341
23,750, // `;
135,653, // ";"
  }
,
{ // state 342
2,569, // ws*
128,461, // " "
146,303, // {10}
155,673, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 343
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 344
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 345
0x80000000|586, // match move
0x80000000|693, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 346
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 347
7,MIN_REDUCTION+21, // ID
33,MIN_REDUCTION+91, // `[
94,MIN_REDUCTION+21, // "a"
95,MIN_REDUCTION+21, // "d"
96,MIN_REDUCTION+21, // "p"
97,MIN_REDUCTION+21, // "s"
98,MIN_REDUCTION+21, // "v"
99,MIN_REDUCTION+21, // "c"
100,MIN_REDUCTION+21, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,MIN_REDUCTION+21, // "f"
102,MIN_REDUCTION+21, // "i"
103,MIN_REDUCTION+21, // "l"
104,MIN_REDUCTION+21, // "o"
105,MIN_REDUCTION+21, // "r"
106,MIN_REDUCTION+21, // "u"
107,MIN_REDUCTION+21, // "x"
108,MIN_REDUCTION+21, // "b"
109,MIN_REDUCTION+21, // "e"
110,MIN_REDUCTION+21, // "h"
111,MIN_REDUCTION+21, // "n"
112,MIN_REDUCTION+21, // "t"
113,MIN_REDUCTION+21, // "w"
115,MIN_REDUCTION+21, // {199..218 231..250}
116,MIN_REDUCTION+21, // {193..198 225..230}
123,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 348
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 349
2,12, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 350
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 351
2,630, // ws*
33,MIN_REDUCTION+133, // `[
123,MIN_REDUCTION+133, // "["
128,461, // " "
146,303, // {10}
155,673, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 352
74,98, // `+
75,423, // `-
124,594, // "-"
140,690, // "+"
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 353
0x80000000|694, // match move
0x80000000|342, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 354
26,424, // `)
131,544, // ")"
  }
,
{ // state 355
2,540, // ws*
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 356
2,451, // ws*
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 357
0x80000000|276, // match move
0x80000000|90, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 358
33,MIN_REDUCTION+87, // `[
123,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 359
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 360
7,138, // ID
19,180, // <type>
29,206, // `int
30,315, // `boolean
31,753, // `null
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
129,237, // "#"
  }
,
{ // state 361
2,38, // ws*
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 362
33,MIN_REDUCTION+84, // `[
123,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 363
107,297, // "x"
  }
,
{ // state 364
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 365
0x80000000|557, // match move
0x80000000|611, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 366
2,131, // ws*
33,MIN_REDUCTION+221, // `[
123,MIN_REDUCTION+221, // "["
128,461, // " "
146,303, // {10}
155,673, // ws
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 367
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 368
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 369
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 370
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 371
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 372
69,718, // `<
70,116, // `<=
71,91, // `>
72,663, // `>=
73,127, // `instanceof
125,754, // "<"
129,604, // "#"
136,652, // ">"
145,481, // "@"
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 373
117,696, // digit
118,371, // {"1".."9"}
119,371, // "0"
120,646, // digit128
121,65, // {176..185}
158,677, // digit*
159,247, // $$2
  }
,
{ // state 374
7,35, // ID
8,193, // `{
19,668, // <type>
20,495, // <returnStmt>
21,552, // `return
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,120, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,75, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
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
{ // state 375
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 376
7,35, // ID
8,176, // `{
19,668, // <type>
22,675, // <exp>
23,565, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,610, // <stmt>
36,299, // <assign>
37,30, // <local var decl>
38,665, // <methodCall>
39,55, // `if
41,19, // `for
46,74, // `while
47,635, // `break
49,271, // `++
50,683, // `--
51,762, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,72, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 377
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 378
104,62, // "o"
  }
,
{ // state 379
7,736, // ID
19,591, // <type>
29,479, // `int
30,183, // `boolean
31,388, // `null
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
129,182, // "#"
  }
,
{ // state 380
0x80000000|368, // match move
0x80000000|240, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 381
2,761, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 382
33,MIN_REDUCTION+90, // `[
123,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 383
7,736, // ID
10,733, // `}
12,367, // <decl in class>
13,314, // <method decl>
14,326, // <inst var decl>
15,254, // `public
19,216, // <type>
29,479, // `int
30,183, // `boolean
31,388, // `null
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
129,245, // "#"
147,194, // "}"
  }
,
{ // state 384
33,MIN_REDUCTION+267, // `[
123,MIN_REDUCTION+267, // "["
128,461, // " "
146,303, // {10}
155,260, // ws
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 385
7,35, // ID
8,193, // `{
19,668, // <type>
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,685, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 386
3,669, // <program>
4,87, // <class decl>+
5,674, // <class decl>
6,505, // `class
128,114, // " "
129,563, // "#"
146,34, // {10}
155,52, // ws
  }
,
{ // state 387
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 388
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 389
7,573, // ID
22,526, // <exp>
24,575, // `(
31,5, // `null
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 390
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 391
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 392
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 393
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 394
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 395
7,573, // ID
31,5, // `null
64,572, // <exp1>
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
129,43, // "#"
145,179, // "@"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 396
76,340, // `*
77,601, // `/
78,613, // `%
134,349, // "/"
138,502, // "%"
151,477, // "*"
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 397
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 398
7,573, // ID
22,766, // <exp>
24,575, // `(
31,5, // `null
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 399
26,39, // `)
131,544, // ")"
  }
,
{ // state 400
109,528, // "e"
  }
,
{ // state 401
0x80000000|513, // match move
0x80000000|632, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 402
24,230, // `(
139,487, // "("
  }
,
{ // state 403
0x80000000|722, // match move
0x80000000|366, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 404
0x80000000|141, // match move
0x80000000|489, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 405
7,573, // ID
22,189, // <exp>
24,575, // `(
31,5, // `null
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 406
66,627, // `&&
145,731, // "@"
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 407
33,633, // `[
83,328, // `.
123,200, // "["
141,214, // "."
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 408
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 409
104,464, // "o"
  }
,
{ // state 410
24,738, // `(
139,487, // "("
  }
,
{ // state 411
106,542, // "u"
  }
,
{ // state 412
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 413
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 414
74,98, // `+
75,423, // `-
124,594, // "-"
140,690, // "+"
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 415
32,636, // <empty bracket pair>
33,338, // `[
88,728, // <empty bracket pair>**
123,200, // "["
168,8, // <empty bracket pair>*
  }
,
{ // state 416
34,146, // `]
133,649, // "]"
  }
,
{ // state 417
33,633, // `[
83,448, // `.
123,200, // "["
141,214, // "."
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 418
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 419
7,736, // ID
9,625, // <decl in class>*
10,170, // `}
12,648, // <decl in class>
13,314, // <method decl>
14,326, // <inst var decl>
15,254, // `public
19,216, // <type>
29,479, // `int
30,183, // `boolean
31,388, // `null
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
129,245, // "#"
147,194, // "}"
  }
,
{ // state 420
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 421
93,241, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,644, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
117,700, // digit
118,371, // {"1".."9"}
119,371, // "0"
120,220, // digit128
121,65, // {176..185}
142,9, // "_"
153,488, // {223}
157,68, // $$1
164,387, // idChar
165,656, // idChar128
  }
,
{ // state 422
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 423
7,573, // ID
24,575, // `(
31,5, // `null
62,396, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 424
7,35, // ID
8,176, // `{
19,668, // <type>
22,675, // <exp>
23,565, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,453, // <stmt>
36,299, // <assign>
37,30, // <local var decl>
38,665, // <methodCall>
39,55, // `if
41,19, // `for
46,74, // `while
47,635, // `break
49,271, // `++
50,683, // `--
51,762, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,72, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 425
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 426
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 427
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 428
33,MIN_REDUCTION+108, // `[
123,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 429
26,167, // `)
131,544, // ")"
  }
,
{ // state 430
128,MIN_REDUCTION+256, // " "
146,MIN_REDUCTION+256, // {10}
155,MIN_REDUCTION+256, // ws
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 431
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 432
0x80000000|720, // match move
0x80000000|40, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 433
7,573, // ID
22,567, // <exp>
24,575, // `(
26,678, // `)
31,5, // `null
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
89,429, // <expList>
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
131,544, // ")"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 434
0x80000000|204, // match move
0x80000000|638, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 435
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 436
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 437
7,35, // ID
8,193, // `{
10,664, // `}
19,668, // <type>
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,408, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
52,619, // <case>*
53,392, // <case>
54,405, // `case
56,309, // `default
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,471, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
147,615, // "}"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 438
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 439
10,58, // `}
147,194, // "}"
  }
,
{ // state 440
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 441
7,573, // ID
22,567, // <exp>
24,575, // `(
26,343, // `)
31,5, // `null
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
89,54, // <expList>
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
131,544, // ")"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 442
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 443
0x80000000|307, // match move
0x80000000|681, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 444
2,612, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 445
0x80000000|490, // match move
0x80000000|279, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 446
7,35, // ID
8,193, // `{
10,145, // `}
18,527, // <stmt>*
19,668, // <type>
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,588, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
147,194, // "}"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 447
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 448
7,657, // ID
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
  }
,
{ // state 449
66,627, // `&&
145,731, // "@"
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 450
97,650, // "s"
101,139, // "f"
102,151, // "i"
108,409, // "b"
111,223, // "n"
112,119, // "t"
  }
,
{ // state 451
0x80000000|623, // match move
0x80000000|128, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 452
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 453
0x80000000|27, // match move
0x80000000|95, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 454
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 455
93,241, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,264, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
117,700, // digit
118,371, // {"1".."9"}
119,371, // "0"
120,136, // digit128
121,590, // {176..185}
142,9, // "_"
153,705, // {223}
156,686, // idChar*
157,7, // $$1
164,302, // idChar
165,329, // idChar128
  }
,
{ // state 456
26,628, // `)
131,544, // ")"
  }
,
{ // state 457
8,654, // `{
137,331, // "{"
  }
,
{ // state 458
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 459
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 460
0x80000000|318, // match move
0x80000000|3, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 461
0x80000000|708, // match move
0x80000000|23, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 462
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 463
0x80000000|46, // match move
0x80000000|337, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 464
2,113, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 465
7,35, // ID
8,193, // `{
10,110, // `}
19,668, // <type>
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,408, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
53,595, // <case>
54,405, // `case
56,309, // `default
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,471, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
147,194, // "}"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 466
112,724, // "t"
  }
,
{ // state 467
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 468
97,20, // "s"
101,92, // "f"
102,151, // "i"
108,486, // "b"
111,223, // "n"
112,119, // "t"
113,739, // "w"
140,191, // "+"
  }
,
{ // state 469
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 470
94,57, // "a"
95,57, // "d"
96,57, // "p"
97,57, // "s"
98,57, // "v"
99,57, // "c"
100,57, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,57, // "f"
102,57, // "i"
103,57, // "l"
104,57, // "o"
105,57, // "r"
106,57, // "u"
107,57, // "x"
108,57, // "b"
109,57, // "e"
110,57, // "h"
111,57, // "n"
112,57, // "t"
113,57, // "w"
115,763, // {199..218 231..250}
116,763, // {193..198 225..230}
118,57, // {"1".."9"}
119,57, // "0"
121,763, // {176..185}
122,393, // any
123,57, // "["
124,57, // "-"
125,57, // "<"
126,57, // {0..9 11..31 "$" "?" "\" "^" "`" "~"..127}
127,57, // "|"
128,57, // " "
129,57, // "#"
130,57, // "&"
131,57, // ")"
132,57, // ","
133,57, // "]"
134,57, // "/"
135,57, // ";"
136,57, // ">"
137,57, // "{"
138,57, // "%"
139,57, // "("
140,57, // "+"
141,57, // "."
142,57, // "_"
143,57, // ":"
144,57, // "="
145,57, // "@"
146,57, // {10}
147,57, // "}"
148,57, // "!"
149,57, // "'"
150,57, // '"'
151,57, // "*"
152,660, // any128
153,763, // {223}
154,763, // {128..175 186..192 219..222 224 251..255}
163,507, // $$4
  }
,
{ // state 471
95,400, // "d"
97,20, // "s"
99,548, // "c"
101,92, // "f"
102,151, // "i"
108,486, // "b"
111,223, // "n"
112,119, // "t"
113,739, // "w"
140,191, // "+"
  }
,
{ // state 472
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 473
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 474
2,11, // ws*
33,MIN_REDUCTION+141, // `[
123,MIN_REDUCTION+141, // "["
128,461, // " "
146,303, // {10}
155,673, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 475
33,633, // `[
83,328, // `.
123,200, // "["
141,214, // "."
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 476
7,573, // ID
22,301, // <exp>
24,575, // `(
31,5, // `null
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 477
2,135, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 478
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 479
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 480
7,573, // ID
24,575, // `(
31,5, // `null
60,710, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 481
125,104, // "<"
127,143, // "|"
130,132, // "&"
136,584, // ">"
144,626, // "="
148,616, // "!"
  }
,
{ // state 482
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 483
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 484
106,629, // "u"
  }
,
{ // state 485
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 486
104,464, // "o"
105,235, // "r"
  }
,
{ // state 487
2,330, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 488
0x80000000|336, // match move
0x80000000|129, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 489
24,441, // `(
33,MIN_REDUCTION+82, // `[
123,MIN_REDUCTION+82, // "["
139,487, // "("
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 490
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 491
2,546, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
171,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 492
2,630, // ws*
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 493
33,MIN_REDUCTION+219, // `[
123,MIN_REDUCTION+219, // "["
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 494
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 495
10,69, // `}
147,194, // "}"
  }
,
{ // state 496
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 497
2,541, // ws*
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 498
2,445, // ws*
  }
,
{ // state 499
32,290, // <empty bracket pair>
33,338, // `[
123,200, // "["
  }
,
{ // state 500
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 501
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 502
2,258, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 503
33,MIN_REDUCTION+218, // `[
123,MIN_REDUCTION+218, // "["
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 504
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 505
7,555, // ID
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
  }
,
{ // state 506
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 507
0x80000000|512, // match move
0x80000000|617, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 508
2,89, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 509
0x80000000|698, // match move
0x80000000|748, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 510
0x80000000|560, // match move
0x80000000|95, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 511
33,MIN_REDUCTION+261, // `[
123,MIN_REDUCTION+261, // "["
128,461, // " "
146,303, // {10}
155,260, // ws
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 512
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 513
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 514
7,35, // ID
19,668, // <type>
22,675, // <exp>
23,175, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
36,473, // <assign>
37,311, // <local var decl>
38,295, // <methodCall>
42,165, // <for1>
43,78, // $$0
49,271, // `++
50,683, // `--
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,450, // "#"
135,653, // ";"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 515
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 516
74,98, // `+
75,423, // `-
124,594, // "-"
140,690, // "+"
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 517
23,202, // `;
135,653, // ";"
169,82, // $$5
  }
,
{ // state 518
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 519
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 520
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 521
104,353, // "o"
  }
,
{ // state 522
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 523
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 524
7,573, // ID
22,567, // <exp>
24,575, // `(
26,485, // `)
31,5, // `null
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
89,399, // <expList>
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
131,544, // ")"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 525
33,MIN_REDUCTION+89, // `[
123,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 526
34,85, // `]
133,749, // "]"
  }
,
{ // state 527
7,35, // ID
8,193, // `{
10,566, // `}
19,668, // <type>
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,120, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
147,194, // "}"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 528
2,282, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 529
7,35, // ID
8,176, // `{
19,668, // <type>
22,675, // <exp>
23,565, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,576, // <stmt>
36,299, // <assign>
37,30, // <local var decl>
38,665, // <methodCall>
39,55, // `if
41,19, // `for
46,74, // `while
47,635, // `break
49,271, // `++
50,683, // `--
51,762, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,72, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 530
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 531
7,573, // ID
22,118, // <exp>
24,575, // `(
31,5, // `null
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 532
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 533
33,MIN_REDUCTION+233, // `[
123,MIN_REDUCTION+233, // "["
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 534
74,98, // `+
75,423, // `-
124,594, // "-"
140,690, // "+"
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 535
0x80000000|530, // match move
0x80000000|717, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 536
7,35, // ID
8,193, // `{
10,729, // `}
19,668, // <type>
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,120, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
147,615, // "}"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 537
7,736, // ID
9,383, // <decl in class>*
10,452, // `}
12,648, // <decl in class>
13,314, // <method decl>
14,326, // <inst var decl>
15,254, // `public
19,216, // <type>
29,479, // `int
30,183, // `boolean
31,388, // `null
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
129,245, // "#"
147,194, // "}"
  }
,
{ // state 538
33,MIN_REDUCTION+230, // `[
123,MIN_REDUCTION+230, // "["
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 539
33,MIN_REDUCTION+88, // `[
123,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 540
0x80000000|651, // match move
0x80000000|112, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 541
0x80000000|217, // match move
0x80000000|511, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 542
2,284, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 543
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 544
2,261, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 545
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 546
128,114, // " "
146,34, // {10}
155,52, // ws
171,MIN_REDUCTION+126, // $NT
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 547
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 548
109,508, // "e"
  }
,
{ // state 549
33,MIN_REDUCTION+140, // `[
123,MIN_REDUCTION+140, // "["
128,461, // " "
146,303, // {10}
155,260, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 550
0x80000000|48, // match move
0x80000000|430, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 551
7,273, // ID
22,675, // <exp>
24,575, // `(
26,236, // `)
31,5, // `null
36,515, // <assign>
38,397, // <methodCall>
45,456, // <for3>
49,271, // `++
50,683, // `--
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,211, // "#"
131,544, // ")"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 552
7,573, // ID
22,341, // <exp>
24,575, // `(
31,5, // `null
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 553
0x80000000|155, // match move
0x80000000|84, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 554
26,298, // `)
131,544, // ")"
  }
,
{ // state 555
8,419, // `{
11,730, // `extends
129,758, // "#"
137,331, // "{"
  }
,
{ // state 556
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 557
2,64, // ws*
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 558
0x80000000|166, // match move
0x80000000|533, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 559
0x80000000|268, // match move
0x80000000|80, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 560
40,376, // `else
129,283, // "#"
  }
,
{ // state 561
0x80000000|231, // match move
0x80000000|362, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 562
2,53, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 563
99,620, // "c"
  }
,
{ // state 564
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 565
0x80000000|306, // match move
0x80000000|496, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 566
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 567
28,531, // `,
90,658, // <next exp>*
91,327, // <next exp>
132,643, // ","
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 568
2,320, // ws*
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 569
0x80000000|467, // match move
0x80000000|63, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 570
17,101, // <formalList>
24,253, // `(
139,487, // "("
  }
,
{ // state 571
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 572
0x80000000|759, // match move
0x80000000|475, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 573
0x80000000|141, // match move
0x80000000|339, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 574
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 575
7,736, // ID
19,190, // <type>
29,479, // `int
30,183, // `boolean
31,388, // `null
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
129,182, // "#"
  }
,
{ // state 576
0x80000000|228, // match move
0x80000000|31, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 577
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 578
2,266, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 579
33,416, // `[
123,200, // "["
  }
,
{ // state 580
76,340, // `*
77,601, // `/
78,613, // `%
134,349, // "/"
138,502, // "%"
151,477, // "*"
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 581
2,28, // ws*
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 582
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 583
7,573, // ID
24,575, // `(
31,5, // `null
60,208, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 584
2,71, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 585
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 586
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 587
26,270, // `)
131,357, // ")"
  }
,
{ // state 588
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 589
7,573, // ID
22,554, // <exp>
24,575, // `(
31,5, // `null
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 590
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 591
7,426, // ID
32,291, // <empty bracket pair>
33,416, // `[
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
123,200, // "["
  }
,
{ // state 592
0x80000000|10, // match move
0x80000000|746, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 593
26,150, // `)
131,544, // ")"
  }
,
{ // state 594
2,61, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 595
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 596
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 597
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 598
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 599
7,573, // ID
22,269, // <exp>
24,575, // `(
31,5, // `null
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 600
7,573, // ID
22,436, // <exp>
23,551, // `;
24,575, // `(
31,5, // `null
44,45, // <for2>
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
135,653, // ";"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
169,13, // $$5
  }
};
}
private class Initter3{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 601
7,573, // ID
24,575, // `(
31,5, // `null
63,186, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 602
33,MIN_REDUCTION+255, // `[
123,MIN_REDUCTION+255, // "["
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 603
33,MIN_REDUCTION+210, // `[
123,MIN_REDUCTION+210, // "["
128,461, // " "
146,303, // {10}
155,260, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 604
102,192, // "i"
  }
,
{ // state 605
0x80000000|350, // match move
0x80000000|201, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 606
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 607
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 608
2,642, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 609
2,218, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 610
0x80000000|472, // match move
0x80000000|413, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 611
2,64, // ws*
33,MIN_REDUCTION+211, // `[
123,MIN_REDUCTION+211, // "["
128,461, // " "
146,303, // {10}
155,673, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 612
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 613
7,573, // ID
24,575, // `(
31,5, // `null
63,239, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 614
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 615
0x80000000|760, // match move
0x80000000|639, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 616
2,149, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 617
33,MIN_REDUCTION+222, // `[
123,MIN_REDUCTION+222, // "["
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 618
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 619
7,35, // ID
8,193, // `{
10,142, // `}
19,668, // <type>
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,408, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
53,595, // <case>
54,405, // `case
56,309, // `default
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,471, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
147,615, // "}"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 620
103,672, // "l"
  }
,
{ // state 621
7,573, // ID
22,659, // <exp>
24,575, // `(
31,5, // `null
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 622
7,573, // ID
31,5, // `null
64,553, // <exp1>
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
129,43, // "#"
145,179, // "@"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 623
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 624
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 625
7,736, // ID
10,425, // `}
12,367, // <decl in class>
13,314, // <method decl>
14,326, // <inst var decl>
15,254, // `public
19,216, // <type>
29,479, // `int
30,183, // `boolean
31,388, // `null
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
129,245, // "#"
147,194, // "}"
  }
,
{ // state 626
2,17, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 627
7,573, // ID
24,575, // `(
31,5, // `null
59,251, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 628
7,35, // ID
8,193, // `{
19,668, // <type>
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,219, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 629
0x80000000|109, // match move
0x80000000|474, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 630
0x80000000|420, // match move
0x80000000|242, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 631
88,728, // <empty bracket pair>**
168,8, // <empty bracket pair>*
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 632
33,MIN_REDUCTION+223, // `[
123,MIN_REDUCTION+223, // "["
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 633
7,573, // ID
22,300, // <exp>
24,575, // `(
31,5, // `null
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 634
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 635
23,162, // `;
135,72, // ";"
  }
,
{ // state 636
0x80000000|66, // match move
0x80000000|272, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 637
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 638
33,MIN_REDUCTION+105, // `[
123,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 639
2,198, // ws*
128,756, // " "
146,238, // {10}
155,550, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 640
8,292, // `{
137,331, // "{"
  }
,
{ // state 641
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 642
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 643
2,130, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 644
0x80000000|506, // match move
0x80000000|755, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 645
23,229, // `;
135,653, // ";"
  }
,
{ // state 646
0x80000000|581, // match move
0x80000000|15, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 647
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 648
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 649
2,4, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
171,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 650
106,158, // "u"
  }
,
{ // state 651
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 652
0x80000000|1, // match move
0x80000000|704, // no-match move
// T-test match for "=":
144,
  }
,
{ // state 653
2,184, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 654
7,35, // ID
8,193, // `{
18,374, // <stmt>*
19,668, // <type>
20,439, // <returnStmt>
21,552, // `return
22,675, // <exp>
23,108, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,588, // <stmt>
36,160, // <assign>
37,691, // <local var decl>
38,721, // <methodCall>
39,287, // `if
41,402, // `for
46,410, // `while
47,666, // `break
49,271, // `++
50,683, // `--
51,332, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,75, // "#"
135,653, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 655
2,38, // ws*
  }
,
{ // state 656
0x80000000|497, // match move
0x80000000|99, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 657
0x80000000|647, // match move
0x80000000|81, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 658
28,531, // `,
91,500, // <next exp>
132,643, // ","
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 659
26,107, // `)
131,544, // ")"
  }
,
{ // state 660
0x80000000|123, // match move
0x80000000|103, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 661
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 662
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 663
7,573, // ID
24,575, // `(
31,5, // `null
61,516, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 664
0x80000000|545, // match move
0x80000000|637, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 665
23,682, // `;
135,72, // ";"
  }
,
{ // state 666
23,187, // `;
135,653, // ";"
  }
,
{ // state 667
128,756, // " "
146,238, // {10}
155,134, // ws
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 668
7,210, // ID
32,291, // <empty bracket pair>
33,416, // `[
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
123,200, // "["
  }
,
{ // state 669
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 670
33,MIN_REDUCTION+256, // `[
123,MIN_REDUCTION+256, // "["
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 671
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 672
2,585, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 673
0x80000000|532, // match move
0x80000000|670, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 674
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 675
48,334, // `=
144,444, // "="
  }
,
{ // state 676
17,457, // <formalList>
24,253, // `(
139,487, // "("
  }
,
{ // state 677
117,93, // digit
118,371, // {"1".."9"}
119,371, // "0"
120,646, // digit128
121,65, // {176..185}
159,592, // $$2
  }
,
{ // state 678
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 679
2,97, // ws*
128,756, // " "
146,238, // {10}
155,550, // ws
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 680
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 681
33,MIN_REDUCTION+86, // `[
123,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 682
0x80000000|76, // match move
0x80000000|390, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 683
7,259, // ID
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
  }
,
{ // state 684
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 685
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 686
93,241, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,264, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
117,700, // digit
118,371, // {"1".."9"}
119,371, // "0"
120,136, // digit128
121,590, // {176..185}
142,9, // "_"
153,705, // {223}
157,370, // $$1
164,387, // idChar
165,329, // idChar128
  }
,
{ // state 687
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 688
83,726, // `.
141,214, // "."
  }
,
{ // state 689
0x80000000|361, // match move
0x80000000|137, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 690
2,178, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 691
23,375, // `;
135,653, // ";"
  }
,
{ // state 692
170,MIN_REDUCTION+0, // $
  }
,
{ // state 693
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 694
2,569, // ws*
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 695
2,451, // ws*
128,461, // " "
146,303, // {10}
155,673, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 696
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 697
128,MIN_REDUCTION+111, // " "
146,MIN_REDUCTION+111, // {10}
155,MIN_REDUCTION+111, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 698
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 699
7,573, // ID
24,575, // `(
31,5, // `null
58,406, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 700
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 701
103,491, // "l"
  }
,
{ // state 702
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 703
33,MIN_REDUCTION+93, // `[
123,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 704
2,442, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 705
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 706
33,MIN_REDUCTION+215, // `[
123,MIN_REDUCTION+215, // "["
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 707
2,445, // ws*
33,MIN_REDUCTION+217, // `[
123,MIN_REDUCTION+217, // "["
128,461, // " "
146,303, // {10}
155,673, // ws
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 708
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 709
24,587, // `(
139,487, // "("
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 710
69,718, // `<
70,116, // `<=
71,91, // `>
72,663, // `>=
73,127, // `instanceof
125,754, // "<"
129,604, // "#"
136,652, // ">"
145,481, // "@"
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 711
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 712
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 713
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 714
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 715
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 716
7,35, // ID
8,176, // `{
19,668, // <type>
22,675, // <exp>
23,565, // `;
24,575, // `(
29,479, // `int
30,183, // `boolean
31,42, // `null
35,432, // <stmt>
36,299, // <assign>
37,30, // <local var decl>
38,665, // <methodCall>
39,55, // `if
41,19, // `for
46,74, // `while
47,635, // `break
49,271, // `++
50,683, // `--
51,762, // `switch
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,83, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
92,688, // `super
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,468, // "#"
135,72, // ";"
137,331, // "{"
139,487, // "("
140,690, // "+"
145,249, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 717
33,MIN_REDUCTION+168, // `[
123,MIN_REDUCTION+168, // "["
128,461, // " "
146,303, // {10}
155,260, // ws
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 718
7,573, // ID
24,575, // `(
31,5, // `null
61,293, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 719
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 720
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 721
23,391, // `;
135,653, // ";"
  }
,
{ // state 722
2,131, // ws*
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 723
33,MIN_REDUCTION+109, // `[
123,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 724
0x80000000|356, // match move
0x80000000|695, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 725
2,173, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 726
7,199, // ID
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
  }
,
{ // state 727
171,MIN_REDUCTION+256, // $NT
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 728
0x80000000|520, // match move
0x80000000|703, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 729
0x80000000|234, // match move
0x80000000|435, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 730
7,280, // ID
93,455, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,609, // letter128
115,209, // {199..218 231..250}
116,209, // {193..198 225..230}
  }
,
{ // state 731
127,143, // "|"
130,132, // "&"
  }
,
{ // state 732
129,283, // "#"
  }
,
{ // state 733
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 734
2,28, // ws*
  }
,
{ // state 735
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 736
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 737
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 738
7,573, // ID
22,147, // <exp>
24,575, // `(
31,5, // `null
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 739
110,742, // "h"
  }
,
{ // state 740
128,MIN_REDUCTION+255, // " "
146,MIN_REDUCTION+255, // {10}
155,MIN_REDUCTION+255, // ws
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 741
2,630, // ws*
  }
,
{ // state 742
2,564, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 743
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 744
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 745
2,131, // ws*
  }
,
{ // state 746
33,MIN_REDUCTION+214, // `[
123,MIN_REDUCTION+214, // "["
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 747
94,469, // "a"
95,469, // "d"
96,469, // "p"
97,469, // "s"
98,469, // "v"
99,469, // "c"
100,469, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,469, // "f"
102,469, // "i"
103,469, // "l"
104,469, // "o"
105,469, // "r"
106,469, // "u"
107,469, // "x"
108,469, // "b"
109,469, // "e"
110,469, // "h"
111,469, // "n"
112,469, // "t"
113,469, // "w"
116,558, // {193..198 225..230}
118,469, // {"1".."9"}
119,469, // "0"
121,558, // {176..185}
160,164, // hexDigit*
161,21, // $$3
166,418, // hexDigit
167,14, // hexDigit128
  }
,
{ // state 748
33,MIN_REDUCTION+213, // `[
123,MIN_REDUCTION+213, // "["
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 749
0x80000000|568, // match move
0x80000000|313, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 750
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 751
7,573, // ID
22,354, // <exp>
24,575, // `(
31,5, // `null
57,205, // <exp8>
58,449, // <exp7>
59,222, // <exp6>
60,372, // <exp5>
61,352, // <exp4>
62,580, // <exp3>
63,265, // <exp2>
64,153, // <exp1>
74,622, // `+
75,395, // `-
79,310, // `!
80,561, // INTLIT
81,156, // STRINGLIT
82,443, // CHARLIT
84,333, // `this
85,24, // `true
86,335, // `false
87,360, // `new
93,233, // letter
94,556, // "a"
95,556, // "d"
96,556, // "p"
97,556, // "s"
98,556, // "v"
99,556, // "c"
100,556, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
101,556, // "f"
102,556, // "i"
103,556, // "l"
104,556, // "o"
105,556, // "r"
106,556, // "u"
107,556, // "x"
108,556, // "b"
109,556, // "e"
110,556, // "h"
111,556, // "n"
112,556, // "t"
113,556, // "w"
114,365, // letter128
115,434, // {199..218 231..250}
116,434, // {193..198 225..230}
118,373, // {"1".."9"}
119,747, // "0"
120,203, // digit128
121,65, // {176..185}
124,594, // "-"
129,43, // "#"
139,487, // "("
140,690, // "+"
145,179, // "@"
148,608, // "!"
149,168, // "'"
150,51, // '"'
  }
,
{ // state 752
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 753
0x80000000|281, // match move
0x80000000|29, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 754
2,577, // ws*
128,114, // " "
146,34, // {10}
155,727, // ws
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 755
33,MIN_REDUCTION+229, // `[
123,MIN_REDUCTION+229, // "["
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 756
0x80000000|195, // match move
0x80000000|294, // no-match move
0x80000000|732, // NT-test-match state for `else
  }
,
{ // state 757
33,389, // `[
123,200, // "["
  }
,
{ // state 758
109,363, // "e"
  }
,
{ // state 759
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 760
2,198, // ws*
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 761
128,114, // " "
146,34, // {10}
155,52, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 762
24,621, // `(
139,487, // "("
  }
,
{ // state 763
0x80000000|523, // match move
0x80000000|723, // no-match move
0x80000000|579, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 764
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 765
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 766
MIN_REDUCTION+48, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[767][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
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
// <decl in class> ::= <inst var decl>
(12<<16)+1,
// <method decl> ::= `public `void ID <formalList> `{ <stmt>* `}
(13<<16)+7,
// <method decl> ::= `public `void ID <formalList> `{ `}
(13<<16)+6,
// <method decl> ::= `public <type> ID <formalList> `{ <stmt>* <returnStmt> `}
(13<<16)+8,
// <method decl> ::= `public <type> ID <formalList> `{ <returnStmt> `}
(13<<16)+7,
// <returnStmt> ::= `return <exp> `;
(20<<16)+3,
// <formalList> ::= `( <type> ID <listElement>* `)
(17<<16)+5,
// <formalList> ::= `( <type> ID `)
(17<<16)+4,
// <formalList> ::= `( `)
(17<<16)+2,
// <listElement> ::= `, <type> ID
(27<<16)+3,
// <type> ::= `int
(19<<16)+1,
// <type> ::= `boolean
(19<<16)+1,
// <type> ::= `null
(19<<16)+1,
// <type> ::= ID
(19<<16)+1,
// <type> ::= <type> <empty bracket pair>
(19<<16)+2,
// <empty bracket pair> ::= `[ `]
(32<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(35<<16)+3,
// <stmt> ::= `{ `}
(35<<16)+2,
// <stmt> ::= <assign> `;
(35<<16)+2,
// <stmt> ::= <local var decl> `;
(35<<16)+2,
// <stmt> ::= <methodCall> `;
(35<<16)+2,
// <stmt> ::= `if `( <exp> `) <stmt> !`else
(35<<16)+5,
// <stmt> ::= `if `( <exp> `) <stmt> `else <stmt>
(35<<16)+7,
// <stmt> ::= `for `( <for1> $$0
(35<<16)+4,
// <stmt> ::= `for `( $$0
(35<<16)+3,
// <for1> ::= <local var decl>
(42<<16)+1,
// <for1> ::= <assign>
(42<<16)+1,
// <for1> ::= <methodCall>
(42<<16)+1,
// <for2> ::= <exp>
(44<<16)+1,
// <for3> ::= <methodCall>
(45<<16)+1,
// <for3> ::= <assign>
(45<<16)+1,
// <stmt> ::= `while `( <exp> `) <stmt>
(35<<16)+5,
// <stmt> ::= `break `;
(35<<16)+2,
// <assign> ::= <exp> `= <exp>
(36<<16)+3,
// <assign> ::= <exp> `= <methodCall>
(36<<16)+3,
// <assign> ::= ID `++
(36<<16)+2,
// <assign> ::= `++ ID
(36<<16)+2,
// <assign> ::= ID `--
(36<<16)+2,
// <assign> ::= `-- ID
(36<<16)+2,
// <local var decl> ::= <type> ID `= <exp>
(37<<16)+4,
// <inst var decl> ::= <type> ID `;
(14<<16)+3,
// <stmt> ::= `;
(35<<16)+1,
// <stmt> ::= `switch `( <exp> `) `{ <case>* `}
(35<<16)+7,
// <stmt> ::= `switch `( <exp> `) `{ `}
(35<<16)+6,
// <case> ::= `case <exp> `:
(53<<16)+3,
// <case> ::= <stmt>
(53<<16)+1,
// <case> ::= `default `:
(53<<16)+2,
// <exp> ::= <exp8>
(22<<16)+1,
// <exp8> ::= <exp7>
(57<<16)+1,
// <exp7> ::= <exp6>
(58<<16)+1,
// <exp6> ::= <exp5>
(59<<16)+1,
// <exp5> ::= <exp4>
(60<<16)+1,
// <exp4> ::= <exp3>
(61<<16)+1,
// <exp3> ::= <exp2>
(62<<16)+1,
// <exp2> ::= <exp1>
(63<<16)+1,
// <exp8> ::= <exp8> `|| <exp7>
(57<<16)+3,
// <exp7> ::= <exp7> `&& <exp6>
(58<<16)+3,
// <exp6> ::= <exp6> `== <exp5>
(59<<16)+3,
// <exp6> ::= <exp6> `!= <exp5>
(59<<16)+3,
// <exp5> ::= <exp5> `< <exp4>
(60<<16)+3,
// <exp5> ::= <exp5> `<= <exp4>
(60<<16)+3,
// <exp5> ::= <exp5> `> <exp4>
(60<<16)+3,
// <exp5> ::= <exp5> `>= <exp4>
(60<<16)+3,
// <exp5> ::= <exp5> `instanceof ID
(60<<16)+3,
// <exp4> ::= <exp4> `+ <exp3>
(61<<16)+3,
// <exp4> ::= <exp4> `- <exp3>
(61<<16)+3,
// <exp3> ::= <exp3> `* <exp2>
(62<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(62<<16)+3,
// <exp3> ::= <exp3> `% <exp2>
(62<<16)+3,
// <exp2> ::= `( <type> `) <exp1>
(63<<16)+4,
// <exp2> ::= `+ <exp1>
(63<<16)+2,
// <exp2> ::= `- <exp1>
(63<<16)+2,
// <exp2> ::= `! <exp1>
(63<<16)+2,
// <exp1> ::= ID
(64<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(64<<16)+4,
// <exp1> ::= INTLIT
(64<<16)+1,
// <exp1> ::= STRINGLIT
(64<<16)+1,
// <exp1> ::= CHARLIT
(64<<16)+1,
// <exp1> ::= <exp1> `. ID
(64<<16)+3,
// <exp1> ::= `this
(64<<16)+1,
// <exp1> ::= `true
(64<<16)+1,
// <exp1> ::= `false
(64<<16)+1,
// <exp1> ::= `null
(64<<16)+1,
// <exp1> ::= `new ID `( `)
(64<<16)+4,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] <empty bracket pair>**
(64<<16)+6,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] !<empty bracket pair>
(64<<16)+5,
// <expList> ::= <exp> <next exp>*
(89<<16)+2,
// <expList> ::= <exp>
(89<<16)+1,
// <next exp> ::= `, <exp>
(91<<16)+2,
// <methodCall> ::= <exp1> `. ID `( <expList> `)
(38<<16)+6,
// <methodCall> ::= <exp1> `. ID `( `)
(38<<16)+5,
// <methodCall> ::= `super `. ID `( <expList> `)
(38<<16)+6,
// <methodCall> ::= `super `. ID `( `)
(38<<16)+5,
// <methodCall> ::= ID `( <expList> `)
(38<<16)+4,
// <methodCall> ::= ID `( `)
(38<<16)+3,
// letter ::= {"A".."Z" "a".."z"}
(93<<16)+1,
// letter128 ::= {193..218 225..250}
(114<<16)+1,
// digit ::= {"0".."9"}
(117<<16)+1,
// digit128 ::= {176..185}
(120<<16)+1,
// any ::= {0..127}
(122<<16)+1,
// any128 ::= {128..255}
(152<<16)+1,
// ws ::= " "
(155<<16)+1,
// ws ::= {10}
(155<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(30<<16)+4,
// `boolean ::= "#" "b" "o"
(30<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `extends ::= "#" "e" "x" ws*
(11<<16)+4,
// `extends ::= "#" "e" "x"
(11<<16)+3,
// `void ::= "#" "v" "o" ws*
(16<<16)+4,
// `void ::= "#" "v" "o"
(16<<16)+3,
// `int ::= "#" "i" "t" ws*
(29<<16)+4,
// `int ::= "#" "i" "t"
(29<<16)+3,
// `while ::= "#" "w" "h" ws*
(46<<16)+4,
// `while ::= "#" "w" "h"
(46<<16)+3,
// `if ::= "#" "+" ws*
(39<<16)+3,
// `if ::= "#" "+"
(39<<16)+2,
// `else ::= "#" "e" "l" ws*
(40<<16)+4,
// `else ::= "#" "e" "l"
(40<<16)+3,
// `for ::= "#" "f" "o" ws*
(41<<16)+4,
// `for ::= "#" "f" "o"
(41<<16)+3,
// `break ::= "#" "b" "r" ws*
(47<<16)+4,
// `break ::= "#" "b" "r"
(47<<16)+3,
// `this ::= "#" "t" "h" ws*
(84<<16)+4,
// `this ::= "#" "t" "h"
(84<<16)+3,
// `false ::= "#" "f" "a" ws*
(86<<16)+4,
// `false ::= "#" "f" "a"
(86<<16)+3,
// `true ::= "#" "t" "r" ws*
(85<<16)+4,
// `true ::= "#" "t" "r"
(85<<16)+3,
// `super ::= "#" "s" "u" ws*
(92<<16)+4,
// `super ::= "#" "s" "u"
(92<<16)+3,
// `null ::= "#" "n" "u" ws*
(31<<16)+4,
// `null ::= "#" "n" "u"
(31<<16)+3,
// `return ::= "#" "r" "e" ws*
(21<<16)+4,
// `return ::= "#" "r" "e"
(21<<16)+3,
// `instanceof ::= "#" "i" "n" ws*
(73<<16)+4,
// `instanceof ::= "#" "i" "n"
(73<<16)+3,
// `new ::= "#" "n" "e" ws*
(87<<16)+4,
// `new ::= "#" "n" "e"
(87<<16)+3,
// `case ::= "#" "c" "e" ws*
(54<<16)+4,
// `case ::= "#" "c" "e"
(54<<16)+3,
// `default ::= "#" "d" "e" ws*
(56<<16)+4,
// `default ::= "#" "d" "e"
(56<<16)+3,
// `public ::= "#" "p" "u" ws*
(15<<16)+4,
// `public ::= "#" "p" "u"
(15<<16)+3,
// `switch ::= "#" "s" "w" ws*
(51<<16)+4,
// `switch ::= "#" "s" "w"
(51<<16)+3,
// `! ::= "!" ws*
(79<<16)+2,
// `! ::= "!"
(79<<16)+1,
// `!= ::= "@" "!" ws*
(68<<16)+3,
// `!= ::= "@" "!"
(68<<16)+2,
// `% ::= "%" ws*
(78<<16)+2,
// `% ::= "%"
(78<<16)+1,
// `&& ::= "@" "&" ws*
(66<<16)+3,
// `&& ::= "@" "&"
(66<<16)+2,
// `* ::= "*" ws*
(76<<16)+2,
// `* ::= "*"
(76<<16)+1,
// `( ::= "(" ws*
(24<<16)+2,
// `( ::= "("
(24<<16)+1,
// `) ::= ")" ws*
(26<<16)+2,
// `) ::= ")"
(26<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(75<<16)+2,
// `- ::= "-"
(75<<16)+1,
// `+ ::= "+" ws*
(74<<16)+2,
// `+ ::= "+"
(74<<16)+1,
// `= ::= "=" ws*
(48<<16)+2,
// `= ::= "="
(48<<16)+1,
// `== ::= "@" "=" ws*
(67<<16)+3,
// `== ::= "@" "="
(67<<16)+2,
// `[ ::= "[" ws*
(33<<16)+2,
// `[ ::= "["
(33<<16)+1,
// `] ::= "]" ws*
(34<<16)+2,
// `] ::= "]"
(34<<16)+1,
// `|| ::= "@" "|" ws*
(65<<16)+3,
// `|| ::= "@" "|"
(65<<16)+2,
// `< ::= "<" ws*
(69<<16)+2,
// `< ::= "<"
(69<<16)+1,
// `<= ::= "@" "<" ws*
(70<<16)+3,
// `<= ::= "@" "<"
(70<<16)+2,
// `, ::= "," ws*
(28<<16)+2,
// `, ::= ","
(28<<16)+1,
// `> ::= ">" !"=" ws*
(71<<16)+2,
// `> ::= ">" !"="
(71<<16)+1,
// `>= ::= "@" ">" ws*
(72<<16)+3,
// `>= ::= "@" ">"
(72<<16)+2,
// `: ::= ":" ws*
(55<<16)+2,
// `: ::= ":"
(55<<16)+1,
// `. ::= "." ws*
(83<<16)+2,
// `. ::= "."
(83<<16)+1,
// `; ::= ";" ws*
(23<<16)+2,
// `; ::= ";"
(23<<16)+1,
// `++ ::= "@" "+" ws*
(49<<16)+3,
// `++ ::= "@" "+"
(49<<16)+2,
// `-- ::= "@" "-" ws*
(50<<16)+3,
// `-- ::= "@" "-"
(50<<16)+2,
// `/ ::= "/" ws*
(77<<16)+2,
// `/ ::= "/"
(77<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$1
(7<<16)+3,
// ID ::= letter $$1
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$2
(80<<16)+3,
// INTLIT ::= {"1".."9"} $$2
(80<<16)+2,
// INTLIT ::= digit128 ws*
(80<<16)+2,
// INTLIT ::= digit128
(80<<16)+1,
// INTLIT ::= "0" hexDigit* $$3
(80<<16)+3,
// INTLIT ::= "0" $$3
(80<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(81<<16)+3,
// STRINGLIT ::= "@" '"'
(81<<16)+2,
// STRINGLIT ::= '"' any* $$4
(81<<16)+3,
// STRINGLIT ::= '"' $$4
(81<<16)+2,
// CHARLIT ::= "'" any ws*
(82<<16)+3,
// CHARLIT ::= "'" any
(82<<16)+2,
// idChar ::= letter
(164<<16)+1,
// idChar ::= digit
(164<<16)+1,
// idChar ::= "_"
(164<<16)+1,
// idChar128 ::= letter128
(165<<16)+1,
// idChar128 ::= digit128
(165<<16)+1,
// idChar128 ::= {223}
(165<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(166<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(167<<16)+1,
// digit* ::= digit* digit
(158<<16)+2,
// digit* ::= digit
(158<<16)+1,
// <next exp>* ::= <next exp>* <next exp>
(90<<16)+2,
// <next exp>* ::= <next exp>
(90<<16)+1,
// any* ::= any* any
(162<<16)+2,
// any* ::= any
(162<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// <listElement>* ::= <listElement>* <listElement>
(25<<16)+2,
// <listElement>* ::= <listElement>
(25<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(160<<16)+2,
// hexDigit* ::= hexDigit
(160<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// <case>* ::= <case>* <case>
(52<<16)+2,
// <case>* ::= <case>
(52<<16)+1,
// idChar* ::= idChar* idChar
(156<<16)+2,
// idChar* ::= idChar
(156<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>
(88<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>
(168<<16)+2,
// <empty bracket pair>* ::= <empty bracket pair>
(168<<16)+1,
// $$0 ::= `; <for2> $$5
(43<<16)+3,
// $$0 ::= `; $$5
(43<<16)+2,
// $$1 ::= idChar128 ws*
(157<<16)+2,
// $$1 ::= idChar128
(157<<16)+1,
// $$2 ::= digit128 ws*
(159<<16)+2,
// $$2 ::= digit128
(159<<16)+1,
// $$3 ::= hexDigit128 ws*
(161<<16)+2,
// $$3 ::= hexDigit128
(161<<16)+1,
// $$4 ::= any128 ws*
(163<<16)+2,
// $$4 ::= any128
(163<<16)+1,
// $$5 ::= `; <for3> `) <stmt>
(169<<16)+4,
// $$5 ::= `; `) <stmt>
(169<<16)+3,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
126, // 0
126, // 1
126, // 2
126, // 3
126, // 4
126, // 5
126, // 6
126, // 7
126, // 8
126, // 9
146, // 10
126, // 11
126, // 12
126, // 13
126, // 14
126, // 15
126, // 16
126, // 17
126, // 18
126, // 19
126, // 20
126, // 21
126, // 22
126, // 23
126, // 24
126, // 25
126, // 26
126, // 27
126, // 28
126, // 29
126, // 30
126, // 31
128, // " "
148, // "!"
150, // '"'
129, // "#"
126, // "$"
138, // "%"
130, // "&"
149, // "'"
139, // "("
131, // ")"
151, // "*"
140, // "+"
132, // ","
124, // "-"
141, // "."
134, // "/"
119, // "0"
118, // "1"
118, // "2"
118, // "3"
118, // "4"
118, // "5"
118, // "6"
118, // "7"
118, // "8"
118, // "9"
143, // ":"
135, // ";"
125, // "<"
144, // "="
136, // ">"
126, // "?"
145, // "@"
100, // "A"
100, // "B"
100, // "C"
100, // "D"
100, // "E"
100, // "F"
100, // "G"
100, // "H"
100, // "I"
100, // "J"
100, // "K"
100, // "L"
100, // "M"
100, // "N"
100, // "O"
100, // "P"
100, // "Q"
100, // "R"
100, // "S"
100, // "T"
100, // "U"
100, // "V"
100, // "W"
100, // "X"
100, // "Y"
100, // "Z"
123, // "["
126, // "\"
133, // "]"
126, // "^"
142, // "_"
126, // "`"
94, // "a"
108, // "b"
99, // "c"
95, // "d"
109, // "e"
101, // "f"
100, // "g"
110, // "h"
102, // "i"
100, // "j"
100, // "k"
103, // "l"
100, // "m"
111, // "n"
104, // "o"
96, // "p"
100, // "q"
105, // "r"
97, // "s"
112, // "t"
106, // "u"
98, // "v"
113, // "w"
107, // "x"
100, // "y"
100, // "z"
137, // "{"
127, // "|"
147, // "}"
126, // "~"
126, // 127
154, // 128
154, // 129
154, // 130
154, // 131
154, // 132
154, // 133
154, // 134
154, // 135
154, // 136
154, // 137
154, // 138
154, // 139
154, // 140
154, // 141
154, // 142
154, // 143
154, // 144
154, // 145
154, // 146
154, // 147
154, // 148
154, // 149
154, // 150
154, // 151
154, // 152
154, // 153
154, // 154
154, // 155
154, // 156
154, // 157
154, // 158
154, // 159
154, // 160
154, // 161
154, // 162
154, // 163
154, // 164
154, // 165
154, // 166
154, // 167
154, // 168
154, // 169
154, // 170
154, // 171
154, // 172
154, // 173
154, // 174
154, // 175
121, // 176
121, // 177
121, // 178
121, // 179
121, // 180
121, // 181
121, // 182
121, // 183
121, // 184
121, // 185
154, // 186
154, // 187
154, // 188
154, // 189
154, // 190
154, // 191
154, // 192
116, // 193
116, // 194
116, // 195
116, // 196
116, // 197
116, // 198
115, // 199
115, // 200
115, // 201
115, // 202
115, // 203
115, // 204
115, // 205
115, // 206
115, // 207
115, // 208
115, // 209
115, // 210
115, // 211
115, // 212
115, // 213
115, // 214
115, // 215
115, // 216
115, // 217
115, // 218
154, // 219
154, // 220
154, // 221
154, // 222
153, // 223
154, // 224
116, // 225
116, // 226
116, // 227
116, // 228
116, // 229
116, // 230
115, // 231
115, // 232
115, // 233
115, // 234
115, // 235
115, // 236
115, // 237
115, // 238
115, // 239
115, // 240
115, // 241
115, // 242
115, // 243
115, // 244
115, // 245
115, // 246
115, // 247
115, // 248
115, // 249
115, // 250
154, // 251
154, // 252
154, // 253
154, // 254
154, // 255
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
"<decl in class> ::= <inst var decl>", // 9
"<method decl> ::= `public `void # ID <formalList> `{ <stmt>* `}", // 10
"<method decl> ::= `public `void # ID <formalList> `{ <stmt>* `}", // 11
"<method decl> ::= `public <type> # ID <formalList> `{ <stmt>* <returnStmt> `}", // 12
"<method decl> ::= `public <type> # ID <formalList> `{ <stmt>* <returnStmt> `}", // 13
"<returnStmt> ::= `return <exp> `;", // 14
"<formalList> ::= `( <type> # ID <listElement>* `)", // 15
"<formalList> ::= `( <type> # ID <listElement>* `)", // 16
"<formalList> ::= `( `)", // 17
"<listElement> ::= `, <type> # ID", // 18
"<type> ::= # `int", // 19
"<type> ::= # `boolean", // 20
"<type> ::= # `null", // 21
"<type> ::= # ID", // 22
"<type> ::= # <type> <empty bracket pair>", // 23
"<empty bracket pair> ::= `[ `]", // 24
"<stmt> ::= # `{ <stmt>* `}", // 25
"<stmt> ::= # `{ <stmt>* `}", // 26
"<stmt> ::= <assign> `;", // 27
"<stmt> ::= <local var decl> `;", // 28
"<stmt> ::= # <methodCall> `;", // 29
"<stmt> ::= # `if `( <exp> `) <stmt> !`else #", // 30
"<stmt> ::= # `if `( <exp> `) <stmt> # `else <stmt>", // 31
"<stmt> ::= # `for `( <for1> `; <for2> `; <for3> `) <stmt>", // 32
"<stmt> ::= # `for `( <for1> `; <for2> `; <for3> `) <stmt>", // 33
"<for1> ::= <local var decl>", // 34
"<for1> ::= <assign>", // 35
"<for1> ::= # <methodCall>", // 36
"<for2> ::= <exp>", // 37
"<for3> ::= # <methodCall>", // 38
"<for3> ::= <assign>", // 39
"<stmt> ::= # `while `( <exp> `) <stmt>", // 40
"<stmt> ::= # `break `;", // 41
"<assign> ::= <exp> # `= <exp>", // 42
"<assign> ::= <exp> # `= <methodCall>", // 43
"<assign> ::= # ID `++", // 44
"<assign> ::= # `++ ID", // 45
"<assign> ::= # ID `--", // 46
"<assign> ::= # `-- ID", // 47
"<local var decl> ::= <type> # ID `= <exp>", // 48
"<inst var decl> ::= <type> # ID `;", // 49
"<stmt> ::= # `;", // 50
"<stmt> ::= # `switch `( <exp> `) `{ <case>* `}", // 51
"<stmt> ::= # `switch `( <exp> `) `{ <case>* `}", // 52
"<case> ::= `case # <exp> `:", // 53
"<case> ::= <stmt>", // 54
"<case> ::= # `default `:", // 55
"<exp> ::= <exp8>", // 56
"<exp8> ::= <exp7>", // 57
"<exp7> ::= <exp6>", // 58
"<exp6> ::= <exp5>", // 59
"<exp5> ::= <exp4>", // 60
"<exp4> ::= <exp3>", // 61
"<exp3> ::= <exp2>", // 62
"<exp2> ::= <exp1>", // 63
"<exp8> ::= <exp8> # `|| <exp7>", // 64
"<exp7> ::= <exp7> # `&& <exp6>", // 65
"<exp6> ::= <exp6> # `== <exp5>", // 66
"<exp6> ::= <exp6> # `!= <exp5>", // 67
"<exp5> ::= <exp5> # `< <exp4>", // 68
"<exp5> ::= <exp5> # `<= <exp4>", // 69
"<exp5> ::= <exp5> # `> <exp4>", // 70
"<exp5> ::= <exp5> # `>= <exp4>", // 71
"<exp5> ::= <exp5> # `instanceof # ID", // 72
"<exp4> ::= <exp4> # `+ <exp3>", // 73
"<exp4> ::= <exp4> # `- <exp3>", // 74
"<exp3> ::= <exp3> # `* <exp2>", // 75
"<exp3> ::= <exp3> # `/ <exp2>", // 76
"<exp3> ::= <exp3> # `% <exp2>", // 77
"<exp2> ::= # `( <type> `) <exp1>", // 78
"<exp2> ::= # `+ <exp1>", // 79
"<exp2> ::= # `- <exp1>", // 80
"<exp2> ::= # `! <exp1>", // 81
"<exp1> ::= # ID", // 82
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 83
"<exp1> ::= # INTLIT", // 84
"<exp1> ::= # STRINGLIT", // 85
"<exp1> ::= # CHARLIT", // 86
"<exp1> ::= <exp1> `. # ID", // 87
"<exp1> ::= # `this", // 88
"<exp1> ::= # `true", // 89
"<exp1> ::= # `false", // 90
"<exp1> ::= # `null", // 91
"<exp1> ::= # `new # ID `( `)", // 92
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 93
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 94
"<expList> ::= <exp> <next exp>*", // 95
"<expList> ::= <exp> <next exp>*", // 96
"<next exp> ::= `, <exp>", // 97
"<methodCall> ::= # <exp1> `. ID `( <expList> `)", // 98
"<methodCall> ::= # <exp1> `. ID `( <expList> `)", // 99
"<methodCall> ::= # `super `. # ID `( <expList> `)", // 100
"<methodCall> ::= # `super `. # ID `( <expList> `)", // 101
"<methodCall> ::= # ID `( <expList> `)", // 102
"<methodCall> ::= # ID `( <expList> `)", // 103
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 104
"letter128 ::= {193..218 225..250}", // 105
"digit ::= {\"0\"..\"9\"}", // 106
"digit128 ::= {176..185}", // 107
"any ::= {0..127}", // 108
"any128 ::= {128..255}", // 109
"ws ::= \" \"", // 110
"ws ::= {10} registerNewline", // 111
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 112
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 113
"`class ::= \"#\" \"c\" \"l\" ws*", // 114
"`class ::= \"#\" \"c\" \"l\" ws*", // 115
"`extends ::= \"#\" \"e\" \"x\" ws*", // 116
"`extends ::= \"#\" \"e\" \"x\" ws*", // 117
"`void ::= \"#\" \"v\" \"o\" ws*", // 118
"`void ::= \"#\" \"v\" \"o\" ws*", // 119
"`int ::= \"#\" \"i\" \"t\" ws*", // 120
"`int ::= \"#\" \"i\" \"t\" ws*", // 121
"`while ::= \"#\" \"w\" \"h\" ws*", // 122
"`while ::= \"#\" \"w\" \"h\" ws*", // 123
"`if ::= \"#\" \"+\" ws*", // 124
"`if ::= \"#\" \"+\" ws*", // 125
"`else ::= \"#\" \"e\" \"l\" ws*", // 126
"`else ::= \"#\" \"e\" \"l\" ws*", // 127
"`for ::= \"#\" \"f\" \"o\" ws*", // 128
"`for ::= \"#\" \"f\" \"o\" ws*", // 129
"`break ::= \"#\" \"b\" \"r\" ws*", // 130
"`break ::= \"#\" \"b\" \"r\" ws*", // 131
"`this ::= \"#\" \"t\" \"h\" ws*", // 132
"`this ::= \"#\" \"t\" \"h\" ws*", // 133
"`false ::= \"#\" \"f\" \"a\" ws*", // 134
"`false ::= \"#\" \"f\" \"a\" ws*", // 135
"`true ::= \"#\" \"t\" \"r\" ws*", // 136
"`true ::= \"#\" \"t\" \"r\" ws*", // 137
"`super ::= \"#\" \"s\" \"u\" ws*", // 138
"`super ::= \"#\" \"s\" \"u\" ws*", // 139
"`null ::= \"#\" \"n\" \"u\" ws*", // 140
"`null ::= \"#\" \"n\" \"u\" ws*", // 141
"`return ::= \"#\" \"r\" \"e\" ws*", // 142
"`return ::= \"#\" \"r\" \"e\" ws*", // 143
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 144
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 145
"`new ::= \"#\" \"n\" \"e\" ws*", // 146
"`new ::= \"#\" \"n\" \"e\" ws*", // 147
"`case ::= \"#\" \"c\" \"e\" ws*", // 148
"`case ::= \"#\" \"c\" \"e\" ws*", // 149
"`default ::= \"#\" \"d\" \"e\" ws*", // 150
"`default ::= \"#\" \"d\" \"e\" ws*", // 151
"`public ::= \"#\" \"p\" \"u\" ws*", // 152
"`public ::= \"#\" \"p\" \"u\" ws*", // 153
"`switch ::= \"#\" \"s\" \"w\" ws*", // 154
"`switch ::= \"#\" \"s\" \"w\" ws*", // 155
"`! ::= \"!\" ws*", // 156
"`! ::= \"!\" ws*", // 157
"`!= ::= \"@\" \"!\" ws*", // 158
"`!= ::= \"@\" \"!\" ws*", // 159
"`% ::= \"%\" ws*", // 160
"`% ::= \"%\" ws*", // 161
"`&& ::= \"@\" \"&\" ws*", // 162
"`&& ::= \"@\" \"&\" ws*", // 163
"`* ::= \"*\" ws*", // 164
"`* ::= \"*\" ws*", // 165
"`( ::= \"(\" ws*", // 166
"`( ::= \"(\" ws*", // 167
"`) ::= \")\" ws*", // 168
"`) ::= \")\" ws*", // 169
"`{ ::= \"{\" ws*", // 170
"`{ ::= \"{\" ws*", // 171
"`} ::= \"}\" ws*", // 172
"`} ::= \"}\" ws*", // 173
"`- ::= \"-\" ws*", // 174
"`- ::= \"-\" ws*", // 175
"`+ ::= \"+\" ws*", // 176
"`+ ::= \"+\" ws*", // 177
"`= ::= \"=\" ws*", // 178
"`= ::= \"=\" ws*", // 179
"`== ::= \"@\" \"=\" ws*", // 180
"`== ::= \"@\" \"=\" ws*", // 181
"`[ ::= \"[\" ws*", // 182
"`[ ::= \"[\" ws*", // 183
"`] ::= \"]\" ws*", // 184
"`] ::= \"]\" ws*", // 185
"`|| ::= \"@\" \"|\" ws*", // 186
"`|| ::= \"@\" \"|\" ws*", // 187
"`< ::= \"<\" ws*", // 188
"`< ::= \"<\" ws*", // 189
"`<= ::= \"@\" \"<\" ws*", // 190
"`<= ::= \"@\" \"<\" ws*", // 191
"`, ::= \",\" ws*", // 192
"`, ::= \",\" ws*", // 193
"`> ::= \">\" !\"=\" ws*", // 194
"`> ::= \">\" !\"=\" ws*", // 195
"`>= ::= \"@\" \">\" ws*", // 196
"`>= ::= \"@\" \">\" ws*", // 197
"`: ::= \":\" ws*", // 198
"`: ::= \":\" ws*", // 199
"`. ::= \".\" ws*", // 200
"`. ::= \".\" ws*", // 201
"`; ::= \";\" ws*", // 202
"`; ::= \";\" ws*", // 203
"`++ ::= \"@\" \"+\" ws*", // 204
"`++ ::= \"@\" \"+\" ws*", // 205
"`-- ::= \"@\" \"-\" ws*", // 206
"`-- ::= \"@\" \"-\" ws*", // 207
"`/ ::= \"/\" ws*", // 208
"`/ ::= \"/\" ws*", // 209
"ID ::= letter128 ws*", // 210
"ID ::= letter128 ws*", // 211
"ID ::= letter idChar* idChar128 ws*", // 212
"ID ::= letter idChar* idChar128 ws*", // 213
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 214
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 215
"INTLIT ::= digit128 ws*", // 216
"INTLIT ::= digit128 ws*", // 217
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 218
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 219
"STRINGLIT ::= \"@\" \'\"\' ws*", // 220
"STRINGLIT ::= \"@\" \'\"\' ws*", // 221
"STRINGLIT ::= \'\"\' any* any128 ws*", // 222
"STRINGLIT ::= \'\"\' any* any128 ws*", // 223
"CHARLIT ::= \"\'\" any ws*", // 224
"CHARLIT ::= \"\'\" any ws*", // 225
"idChar ::= letter", // 226
"idChar ::= digit", // 227
"idChar ::= \"_\"", // 228
"idChar128 ::= letter128", // 229
"idChar128 ::= digit128", // 230
"idChar128 ::= {223}", // 231
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 232
"hexDigit128 ::= {176..185 193..198 225..230}", // 233
"digit* ::= digit* digit", // 234
"digit* ::= digit* digit", // 235
"<next exp>* ::= <next exp>* <next exp>", // 236
"<next exp>* ::= <next exp>* <next exp>", // 237
"any* ::= any* any", // 238
"any* ::= any* any", // 239
"<decl in class>* ::= <decl in class>* <decl in class>", // 240
"<decl in class>* ::= <decl in class>* <decl in class>", // 241
"<listElement>* ::= <listElement>* <listElement>", // 242
"<listElement>* ::= <listElement>* <listElement>", // 243
"hexDigit* ::= hexDigit* hexDigit", // 244
"hexDigit* ::= hexDigit* hexDigit", // 245
"<stmt>* ::= <stmt>* <stmt>", // 246
"<stmt>* ::= <stmt>* <stmt>", // 247
"<case>* ::= <case>* <case>", // 248
"<case>* ::= <case>* <case>", // 249
"idChar* ::= idChar* idChar", // 250
"idChar* ::= idChar* idChar", // 251
"<class decl>+ ::= <class decl>", // 252
"<class decl>+ ::= <class decl>+ <class decl>", // 253
"<empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>", // 254
"ws* ::= ws* ws", // 255
"ws* ::= ws* ws", // 256
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 257
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 258
"", // 259
"", // 260
"", // 261
"", // 262
"", // 263
"", // 264
"", // 265
"", // 266
"", // 267
"", // 268
"", // 269
"", // 270
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
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
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 7: <class decl> ::= `class [#] ID `extends ID `{ [<decl in class>*] `} @createdExtendsClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 9: <decl in class> ::= <inst var decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 10: <method decl> ::= `public `void [#] ID <formalList> `{ <stmt>* `} @createMethodDeclVoid(int,String,VarDeclList,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 11: <method decl> ::= `public `void [#] ID <formalList> `{ [<stmt>*] `} @createMethodDeclVoid(int,String,VarDeclList,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 12: <method decl> ::= `public <type> [#] ID <formalList> `{ <stmt>* <returnStmt> `} @createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 13: <method decl> ::= `public <type> [#] ID <formalList> `{ [<stmt>*] <returnStmt> `} @createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 14: <returnStmt> ::= `return <exp> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 15: <formalList> ::= `( <type> [#] ID <listElement>* `) @createVarDeclList(Type,int,String,List<VarDecl>)=>VarDeclList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 16: <formalList> ::= `( <type> [#] ID [<listElement>*] `) @createVarDeclList(Type,int,String,List<VarDecl>)=>VarDeclList
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 17: <formalList> ::= `( `) @createEmptyVarDeclList()=>VarDeclList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 18: <listElement> ::= `, <type> [#] ID @createListVarDecl(Type,int,String)=>VarDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 19: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 20: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 21: <type> ::= [#] `null @nullType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 22: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 23: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 24: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 25: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 26: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 27: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 28: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <stmt> ::= [#] <methodCall> `; @newCallStatement(int,Call)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 30: <stmt> ::= [#] `if `( <exp> `) <stmt> !`else [#] @newIfOnlyBlock(int,Exp,Statement,int)=>Statement
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 31: <stmt> ::= [#] `if `( <exp> `) <stmt> [#] `else <stmt> @newIfElseBlock(int,Exp,Statement,int,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 32: <stmt> ::= [#] `for `( <for1> $$0 @newForLoop(int,Statement,Exp,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x0)/*popToPushBack:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 33: <stmt> ::= [#] `for `( [<for1>] $$0 @newForLoop(int,Statement,Exp,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x0)/*popToPushBack:3*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 34: <for1> ::= <local var decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <for1> ::= <assign> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 36: <for1> ::= [#] <methodCall> @newFor1CallStatement(int,Call)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 37: <for2> ::= <exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 38: <for3> ::= [#] <methodCall> @newFor3CallStatement(int,Call)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 39: <for3> ::= <assign> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 40: <stmt> ::= [#] `while `( <exp> `) <stmt> @newWhileBlock(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 41: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 42: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 43: <assign> ::= <exp> [#] `= <methodCall> @assignMethodCall(Exp,int,Call)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 44: <assign> ::= [#] ID `++ @assignPlusPlus(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 45: <assign> ::= [#] `++ ID @assignPlusPlusLeft(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 46: <assign> ::= [#] ID `-- @assignMinusMinus(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 47: <assign> ::= [#] `-- ID @assignMinusMinusLeft(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 48: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 49: <inst var decl> ::= <type> [#] ID `; @instanceVarDecl(Type,int,String)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 50: <stmt> ::= [#] `; @newEmptyStmt(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 51: <stmt> ::= [#] `switch `( <exp> `) `{ <case>* `} @newSwitch(int,Exp,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 52: <stmt> ::= [#] `switch `( <exp> `) `{ [<case>*] `} @newSwitch(int,Exp,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 53: <case> ::= `case [#] <exp> `: @newCase(int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 54: <case> ::= <stmt> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 55: <case> ::= [#] `default `: @newDefault(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 56: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 57: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 58: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 59: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 60: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 61: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 62: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 63: <exp2> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 64: <exp8> ::= <exp8> [#] `|| <exp7> @newOr(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 65: <exp7> ::= <exp7> [#] `&& <exp6> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 66: <exp6> ::= <exp6> [#] `== <exp5> @newDoubleEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 67: <exp6> ::= <exp6> [#] `!= <exp5> @newNotEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 68: <exp5> ::= <exp5> [#] `< <exp4> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 69: <exp5> ::= <exp5> [#] `<= <exp4> @newLessThanEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 70: <exp5> ::= <exp5> [#] `> <exp4> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 71: <exp5> ::= <exp5> [#] `>= <exp4> @newGreaterThanEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 72: <exp5> ::= <exp5> [#] `instanceof [#] ID @newInstanceOf(Exp,int,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 73: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 74: <exp4> ::= <exp4> [#] `- <exp3> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 75: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 76: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 77: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 78: <exp2> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 79: <exp2> ::= [#] `+ <exp1> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 80: <exp2> ::= [#] `- <exp1> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 81: <exp2> ::= [#] `! <exp1> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 82: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 83: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 84: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 85: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 86: <exp1> ::= [#] CHARLIT @newCharLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 87: <exp1> ::= <exp1> `. [#] ID @newInstVarAccess(Exp,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 88: <exp1> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 89: <exp1> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 90: <exp1> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 91: <exp1> ::= [#] `null @newNullExp(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 92: <exp1> ::= [#] `new [#] ID `( `) @newObject(int,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 93: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] <empty bracket pair>** @newArray(Type,int,Exp,List<Object>)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 94: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] !<empty bracket pair> [<empty bracket pair>**] @newArray(Type,int,Exp,List<Object>)=>Exp
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 95: <expList> ::= <exp> <next exp>* @newExpList(Exp,List<Exp>)=>ExpList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 96: <expList> ::= <exp> [<next exp>*] @newExpList(Exp,List<Exp>)=>ExpList
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 97: <next exp> ::= `, <exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 98: <methodCall> ::= [#] <exp1> `. ID `( <expList> `) @newMethodCall(int,Exp,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 99: <methodCall> ::= [#] <exp1> `. ID `( [<expList>] `) @newMethodCall(int,Exp,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 100: <methodCall> ::= [#] `super `. [#] ID `( <expList> `) @newSuperMethodCall(int,int,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 101: <methodCall> ::= [#] `super `. [#] ID `( [<expList>] `) @newSuperMethodCall(int,int,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 102: <methodCall> ::= [#] ID `( <expList> `) @newThisMethodCall(int,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 103: <methodCall> ::= [#] ID `( [<expList>] `) @newThisMethodCall(int,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 104: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 105: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 106: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 107: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 108: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 109: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 110: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 111: ws ::= {10} [registerNewline] @void
      ((17<<5)|0x6)/*nullProductionAction:17*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 112: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 113: `boolean ::= "#" "b" "o" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 114: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 115: `class ::= "#" "c" "l" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 116: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 117: `extends ::= "#" "e" "x" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 118: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 119: `void ::= "#" "v" "o" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 120: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 121: `int ::= "#" "i" "t" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 122: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 123: `while ::= "#" "w" "h" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 124: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 125: `if ::= "#" "+" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 126: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 127: `else ::= "#" "e" "l" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 128: `for ::= "#" "f" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 129: `for ::= "#" "f" "o" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 130: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 131: `break ::= "#" "b" "r" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 132: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 133: `this ::= "#" "t" "h" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 134: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 135: `false ::= "#" "f" "a" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 136: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 137: `true ::= "#" "t" "r" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 138: `super ::= "#" "s" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 139: `super ::= "#" "s" "u" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 140: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 141: `null ::= "#" "n" "u" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 142: `return ::= "#" "r" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 143: `return ::= "#" "r" "e" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 144: `instanceof ::= "#" "i" "n" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 145: `instanceof ::= "#" "i" "n" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 146: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 147: `new ::= "#" "n" "e" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 148: `case ::= "#" "c" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 149: `case ::= "#" "c" "e" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 150: `default ::= "#" "d" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 151: `default ::= "#" "d" "e" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 152: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 153: `public ::= "#" "p" "u" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 154: `switch ::= "#" "s" "w" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 155: `switch ::= "#" "s" "w" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 156: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `! ::= "!" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `!= ::= "@" "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 159: `!= ::= "@" "!" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 160: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: `% ::= "%" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 163: `&& ::= "@" "&" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 164: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `* ::= "*" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 166: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 167: `( ::= "(" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 169: `) ::= ")" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 171: `{ ::= "{" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `} ::= "}" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 174: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 175: `- ::= "-" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 176: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 177: `+ ::= "+" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 178: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: `= ::= "=" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 180: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 181: `== ::= "@" "=" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 182: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 183: `[ ::= "[" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 184: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 185: `] ::= "]" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 186: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 187: `|| ::= "@" "|" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 188: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 189: `< ::= "<" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 190: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 191: `<= ::= "@" "<" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 192: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 193: `, ::= "," [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 194: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 195: `> ::= ">" !"=" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 196: `>= ::= "@" ">" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 197: `>= ::= "@" ">" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 198: `: ::= ":" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 199: `: ::= ":" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 200: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 201: `. ::= "." [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 202: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 203: `; ::= ";" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 204: `++ ::= "@" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 205: `++ ::= "@" "+" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 206: `-- ::= "@" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 207: `-- ::= "@" "-" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 208: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 209: `/ ::= "/" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 210: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 211: ID ::= letter128 [ws*] @text
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 212: ID ::= letter idChar* $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 213: ID ::= letter [idChar*] $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 214: INTLIT ::= {"1".."9"} digit* $$2 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 215: INTLIT ::= {"1".."9"} [digit*] $$2 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 216: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 217: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 218: INTLIT ::= "0" hexDigit* $$3 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 219: INTLIT ::= "0" [hexDigit*] $$3 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 220: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 221: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 222: STRINGLIT ::= '"' any* $$4 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 223: STRINGLIT ::= '"' [any*] $$4 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 224: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 225: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 226: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 227: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 228: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 229: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 230: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 231: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 232: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 233: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 234: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 235: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 236: <next exp>* ::= <next exp>* <next exp> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 237: <next exp>* ::= [<next exp>*] <next exp> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 238: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 239: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 240: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 241: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 242: <listElement>* ::= <listElement>* <listElement> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 243: <listElement>* ::= [<listElement>*] <listElement> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 244: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 245: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 246: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 247: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 248: <case>* ::= <case>* <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 249: <case>* ::= [<case>*] <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 250: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 251: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 252: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 253: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 254: <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 255: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 256: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
    },
    { // 257: <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 258: <empty bracket pair>* ::= [<empty bracket pair>*] <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 259: $$0 ::= `; <for2> $$5 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 260: $$0 ::= `; [<for2>] $$5 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((15<<5)|0x6)/*nullProductionAction:15*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 261: $$1 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 262: $$1 ::= idChar128 [ws*] @pass
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 263: $$2 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 264: $$2 ::= digit128 [ws*] @pass
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 265: $$3 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 266: $$3 ::= hexDigit128 [ws*] @pass
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 267: $$4 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 268: $$4 ::= any128 [ws*] @pass
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 269: $$5 ::= `; <for3> `) <stmt> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 270: $$5 ::= `; [<for3>] `) <stmt> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "<case>* ::=", // <case>*
    "<for1> ::= #", // <for1>
    "hexDigit* ::=", // hexDigit*
    "<expList> ::=", // <expList>
    "<stmt>* ::=", // <stmt>*
    "<next exp>* ::=", // <next exp>*
    "<empty bracket pair>* ::=", // <empty bracket pair>*
    "any* ::=", // any*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "<empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>", // <empty bracket pair>**
    "idChar* ::=", // idChar*
    "<listElement>* ::=", // <listElement>*
    "<for3> ::= #", // <for3>
    "digit* ::=", // digit*
    "<for2> ::= #", // <for2>
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // <case>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <for1>
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // hexDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <expList>
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // <stmt>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <next exp>*
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <listElement>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <for3>
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // digit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <for2>
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((81<<5)|0x5)/*methodCall:81*/,
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
      VarDeclList parm2 = (VarDeclList)si.popPb();
      List<Statement> parm3 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 5: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      VarDeclList parm3 = (VarDeclList)si.popPb();
      List<Statement> parm4 = (List<Statement>)si.popPb();
      Exp parm5 = (Exp)si.popPb();
      Decl result = actionObject.createMethodDeclNonVoid(parm0,parm1,parm2,parm3,parm4,parm5);
      si.pushPb(result);
    }
    break;
    case 6: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      List<VarDecl> parm3 = (List<VarDecl>)si.popPb();
      VarDeclList result = actionObject.createVarDeclList(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 7: {
      VarDeclList result = actionObject.createEmptyVarDeclList();
      si.pushPb(result);
    }
    break;
    case 8: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      VarDecl result = actionObject.createListVarDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.nullType(parm0);
      si.pushPb(result);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      Call parm1 = (Call)si.popPb();
      Statement result = actionObject.newCallStatement(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      int parm3 = (Integer)si.popPb();
      Statement result = actionObject.newIfOnlyBlock(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      int parm3 = (Integer)si.popPb();
      Statement parm4 = (Statement)si.popPb();
      Statement result = actionObject.newIfElseBlock(parm0,parm1,parm2,parm3,parm4);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      Statement parm1 = (Statement)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement parm4 = (Statement)si.popPb();
      Statement result = actionObject.newForLoop(parm0,parm1,parm2,parm3,parm4);
      si.pushPb(result);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      Call parm1 = (Call)si.popPb();
      Statement result = actionObject.newFor1CallStatement(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      Call parm1 = (Call)si.popPb();
      Statement result = actionObject.newFor3CallStatement(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.newWhileBlock(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Call parm2 = (Call)si.popPb();
      Statement result = actionObject.assignMethodCall(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignPlusPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignPlusPlusLeft(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignMinusMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignMinusMinusLeft(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 29: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 30: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Decl result = actionObject.instanceVarDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newEmptyStmt(parm0);
      si.pushPb(result);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Statement result = actionObject.newSwitch(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement result = actionObject.newCase(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newDefault(parm0);
      si.pushPb(result);
    }
    break;
    case 35: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newOr(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 36: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 37: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDoubleEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 38: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newNotEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 39: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 40: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThanEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 41: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 42: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThanEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 43: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      int parm2 = (Integer)si.popPb();
      String parm3 = (String)si.popPb();
      Exp result = actionObject.newInstanceOf(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 44: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 45: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 46: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 47: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 48: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 54: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 55: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 56: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 57: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 58: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstVarAccess(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 59: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 60: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 61: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 62: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNullExp(parm0);
      si.pushPb(result);
    }
    break;
    case 63: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newObject(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 64: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      List<Object> parm3 = (List<Object>)si.popPb();
      Exp result = actionObject.newArray(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 65: {
      Exp parm0 = (Exp)si.popPb();
      List<Exp> parm1 = (List<Exp>)si.popPb();
      ExpList result = actionObject.newExpList(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 66: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      String parm2 = (String)si.popPb();
      ExpList parm3 = (ExpList)si.popPb();
      Call result = actionObject.newMethodCall(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 67: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      ExpList parm3 = (ExpList)si.popPb();
      Call result = actionObject.newSuperMethodCall(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 68: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      ExpList parm2 = (ExpList)si.popPb();
      Call result = actionObject.newThisMethodCall(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 69: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 70: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 71: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 72: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 73: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 74: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 75: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 76: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 77: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newFor1EmptyStmt(parm0);
      si.pushPb(result);
    }
    break;
    case 78: {
      ExpList result = actionObject.newEmptyExpList();
      si.pushPb(result);
    }
    break;
    case 79: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newFor3EmptyStmt(parm0);
      si.pushPb(result);
    }
    break;
    case 80: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFor2True(parm0);
      si.pushPb(result);
    }
    break;
    case 81: {
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
"Decl createMethodDeclVoid(int,String,VarDeclList,List<Statement>)",
"Decl createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Statement>,Exp)",
"VarDeclList createVarDeclList(Type,int,String,List<VarDecl>)",
"VarDeclList createEmptyVarDeclList()",
"VarDecl createListVarDecl(Type,int,String)",
"Type intType(int)",
"Type booleanType(int)",
"Type nullType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"Statement newBlock(int,List<Statement>)",
"Statement newCallStatement(int,Call)",
"Statement newIfOnlyBlock(int,Exp,Statement,int)",
"Statement newIfElseBlock(int,Exp,Statement,int,Statement)",
"Statement newForLoop(int,Statement,Exp,Statement,Statement)",
"Statement newFor1CallStatement(int,Call)",
"Statement newFor3CallStatement(int,Call)",
"Statement newWhileBlock(int,Exp,Statement)",
"Statement newBreak(int)",
"Statement assign(Exp,int,Exp)",
"Statement assignMethodCall(Exp,int,Call)",
"Statement assignPlusPlus(int,String)",
"Statement assignPlusPlusLeft(int,String)",
"Statement assignMinusMinus(int,String)",
"Statement assignMinusMinusLeft(int,String)",
"Statement localVarDecl(Type,int,String,Exp)",
"Decl instanceVarDecl(Type,int,String)",
"Statement newEmptyStmt(int)",
"Statement newSwitch(int,Exp,List<Statement>)",
"Statement newCase(int,Exp)",
"Statement newDefault(int)",
"Exp newOr(Exp,int,Exp)",
"Exp newAnd(Exp,int,Exp)",
"Exp newDoubleEqualTo(Exp,int,Exp)",
"Exp newNotEqualTo(Exp,int,Exp)",
"Exp newLessThan(Exp,int,Exp)",
"Exp newLessThanEqualTo(Exp,int,Exp)",
"Exp newGreaterThan(Exp,int,Exp)",
"Exp newGreaterThanEqualTo(Exp,int,Exp)",
"Exp newInstanceOf(Exp,int,int,String)",
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
"ExpList newExpList(Exp,List<Exp>)",
"Call newMethodCall(int,Exp,String,ExpList)",
"Call newSuperMethodCall(int,int,String,ExpList)",
"Call newThisMethodCall(int,String,ExpList)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
"String emptyString(char,char)",
"String string(char,List<Character>,char)",
"int charVal(char,char)",
"char underscore(char)",
"Statement newFor1EmptyStmt(int)",
"ExpList newEmptyExpList()",
"Statement newFor3EmptyStmt(int)",
"Exp newFor2True(int)",
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
4,1,
6,1,
4,1,
0,1,
3,1,
1,1,
1,1,
1,1,
2,1,
3,1,
2,1,
2,1,
4,1,
5,1,
5,1,
2,1,
2,1,
3,1,
1,1,
3,1,
3,1,
2,1,
2,1,
2,1,
2,1,
4,1,
3,1,
1,1,
3,1,
2,1,
1,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
4,1,
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
2,1,
4,1,
4,1,
3,1,
1,1,
3,1,
1,1,
3,1,
2,1,
3,1,
2,1,
1,1,
1,1,
0,1,
1,1,
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
    1,
    0,
    0,
    1,
    1,
    1,
    1,
    0,
    1,
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
    0,
    0,
    1,
    1,
    1,
    1,
    0,
    0,
    0,
    1,
    3,
    1,
    1,
    0,
    0,
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
    1,
    1,
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
    1,
    1,
    0,
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
    2,
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
