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
public int getEofSym() { return 163; }
public int getNttSym() { return 164; }
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
public int numSymbols() { return 165;}
private static final int MIN_REDUCTION = 765;
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
1,686, // <start>
2,368, // ws*
3,229, // <program>
4,68, // <class decl>+
5,669, // <class decl>
6,32, // `class
122,107, // " "
123,498, // "#"
140,29, // {10}
149,671, // ws
  }
,
{ // state 1
  }
,
{ // state 2
33,MIN_REDUCTION+103, // `[
117,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 3
122,107, // " "
140,29, // {10}
149,43, // ws
164,MIN_REDUCTION+174, // $NT
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 4
103,58, // "e"
  }
,
{ // state 5
0x80000000|355, // match move
0x80000000|252, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 6
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 7
0x80000000|118, // match move
0x80000000|169, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 8
0x80000000|480, // match move
0x80000000|713, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 9
0x80000000|1, // match move
0x80000000|228, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 10
0x80000000|632, // match move
0x80000000|694, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 11
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 12
0x80000000|93, // match move
0x80000000|529, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 13
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 14
100,115, // "u"
  }
,
{ // state 15
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 16
33,MIN_REDUCTION+102, // `[
117,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 17
0x80000000|674, // match move
0x80000000|502, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 18
0x80000000|336, // match move
0x80000000|410, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 19
7,730, // ID
16,513, // `void
19,291, // <type>
26,472, // `)
29,466, // `int
30,181, // `boolean
31,371, // `null
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
123,725, // "#"
125,385, // ")"
  }
,
{ // state 20
0x80000000|650, // match move
0x80000000|349, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 21
40,112, // `else
123,347, // "#"
  }
,
{ // state 22
2,760, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 23
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 24
23,130, // `;
129,7, // ";"
  }
,
{ // state 25
33,MIN_REDUCTION+202, // `[
117,MIN_REDUCTION+202, // "["
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 26
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 27
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 28
122,757, // " "
140,234, // {10}
149,131, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 29
164,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 30
0x80000000|751, // match move
0x80000000|330, // no-match move
0x80000000|258, // NT-test-match state for `void
  }
,
{ // state 31
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 32
7,45, // ID
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
  }
,
{ // state 33
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 34
0x80000000|341, // match move
0x80000000|282, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 35
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 36
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 37
0x80000000|279, // match move
0x80000000|340, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 38
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 39
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 40
33,MIN_REDUCTION+77, // `[
117,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 41
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 42
103,399, // "e"
  }
,
{ // state 43
164,MIN_REDUCTION+243, // $NT
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 44
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 45
8,362, // `{
11,323, // `extends
123,42, // "#"
131,361, // "{"
  }
,
{ // state 46
26,468, // `)
125,385, // ")"
  }
,
{ // state 47
24,578, // `(
133,444, // "("
  }
,
{ // state 48
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 49
87,236, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,647, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
111,693, // digit
112,357, // {"1".."9"}
113,357, // "0"
114,215, // digit128
115,54, // {176..185}
136,11, // "_"
147,470, // {223}
150,492, // idChar*
151,193, // $$0
158,656, // idChar
159,454, // idChar128
  }
,
{ // state 50
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 51
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 52
0x80000000|601, // match move
0x80000000|596, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 53
7,9, // ID
22,366, // <exp>
24,566, // `(
31,5, // `null
36,273, // <assign>
45,270, // `++
46,677, // `--
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 54
0x80000000|351, // match move
0x80000000|240, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 55
33,MIN_REDUCTION+84, // `[
117,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 56
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 57
24,461, // `(
133,444, // "("
  }
,
{ // state 58
2,697, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 59
26,462, // `)
125,385, // ")"
  }
,
{ // state 60
88,250, // "a"
  }
,
{ // state 61
122,MIN_REDUCTION+244, // " "
140,MIN_REDUCTION+244, // {10}
149,MIN_REDUCTION+244, // ws
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 62
33,MIN_REDUCTION+208, // `[
117,MIN_REDUCTION+208, // "["
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 63
33,MIN_REDUCTION+75, // `[
117,MIN_REDUCTION+75, // "["
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 64
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 65
88,121, // "a"
89,121, // "d"
90,121, // "p"
91,121, // "s"
92,121, // "v"
93,121, // "c"
94,121, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,121, // "f"
96,121, // "i"
97,121, // "l"
98,121, // "o"
99,121, // "r"
100,121, // "u"
101,121, // "x"
102,121, // "b"
103,121, // "e"
104,121, // "h"
105,121, // "n"
106,121, // "t"
107,121, // "w"
112,121, // {"1".."9"}
113,121, // "0"
116,406, // any
117,121, // "["
118,121, // "-"
119,121, // "<"
120,121, // {0..9 11..31 "$" "?" "\" "^" "`" "~"..127}
121,121, // "|"
122,121, // " "
123,121, // "#"
124,121, // "&"
125,121, // ")"
126,121, // ","
127,121, // "]"
128,121, // "/"
129,121, // ";"
130,121, // ">"
131,121, // "{"
132,121, // "%"
133,121, // "("
134,121, // "+"
135,121, // "."
136,121, // "_"
137,121, // ":"
138,121, // "="
139,121, // "@"
140,121, // {10}
141,121, // "}"
142,121, // "!"
143,121, // "'"
144,121, // '"'
145,121, // "*"
  }
,
{ // state 66
33,629, // `[
77,324, // `.
117,526, // "["
135,251, // "."
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 67
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 68
5,731, // <class decl>
6,32, // `class
123,498, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 69
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 70
0x80000000|1, // match move
0x80000000|155, // no-match move
// T-test match for "=":
138,
  }
,
{ // state 71
88,457, // "a"
89,457, // "d"
90,457, // "p"
91,457, // "s"
92,457, // "v"
93,457, // "c"
94,457, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,457, // "f"
96,457, // "i"
97,457, // "l"
98,457, // "o"
99,457, // "r"
100,457, // "u"
101,457, // "x"
102,457, // "b"
103,457, // "e"
104,457, // "h"
105,457, // "n"
106,457, // "t"
107,457, // "w"
110,539, // {193..198 225..230}
112,457, // {"1".."9"}
113,457, // "0"
115,539, // {176..185}
154,742, // hexDigit*
155,666, // $$2
160,508, // hexDigit
161,714, // hexDigit128
  }
,
{ // state 72
7,562, // ID
24,566, // `(
31,5, // `null
57,402, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 73
0x80000000|1, // match move
0x80000000|745, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 74
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 75
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 76
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 77
2,314, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 79
2,511, // ws*
  }
,
{ // state 80
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 81
0x80000000|137, // match move
0x80000000|665, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 82
7,562, // ID
24,566, // `(
31,5, // `null
58,307, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 83
0x80000000|146, // match move
0x80000000|489, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 84
23,531, // `;
129,7, // ";"
  }
,
{ // state 85
65,718, // `<
66,108, // `<=
67,72, // `>
119,726, // "<"
130,70, // ">"
139,550, // "@"
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 86
0x80000000|521, // match move
0x80000000|400, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 87
62,MIN_REDUCTION+174, // `&&
63,MIN_REDUCTION+174, // `==
64,MIN_REDUCTION+174, // `!=
82,MIN_REDUCTION+174, // <empty bracket pair>**
122,453, // " "
139,MIN_REDUCTION+174, // "@"
140,303, // {10}
149,257, // ws
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 88
2,698, // ws*
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 89
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 90
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 91
0x80000000|701, // match move
0x80000000|248, // no-match move
0x80000000|258, // NT-test-match state for `void
  }
,
{ // state 92
2,482, // ws*
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 93
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 94
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 95
87,236, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,261, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
111,693, // digit
112,357, // {"1".."9"}
113,357, // "0"
114,133, // digit128
115,579, // {176..185}
136,11, // "_"
147,702, // {223}
150,533, // idChar*
151,124, // $$0
158,656, // idChar
159,22, // idChar128
  }
,
{ // state 96
100,584, // "u"
107,233, // "w"
  }
,
{ // state 97
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 98
24,525, // `(
133,444, // "("
  }
,
{ // state 99
90,173, // "p"
92,204, // "v"
96,200, // "i"
102,735, // "b"
105,14, // "n"
  }
,
{ // state 100
2,646, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 101
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 102
2,630, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 103
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 104
82,728, // <empty bracket pair>**
162,8, // <empty bracket pair>*
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 105
33,MIN_REDUCTION+128, // `[
117,MIN_REDUCTION+128, // "["
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 106
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 107
164,MIN_REDUCTION+102, // $NT
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 108
7,562, // ID
24,566, // `(
31,5, // `null
57,510, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 109
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 110
24,516, // `(
133,444, // "("
  }
,
{ // state 111
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 112
7,120, // ID
8,621, // `{
16,513, // `void
19,667, // <type>
22,366, // <exp>
23,101, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,520, // <stmt>
36,158, // <assign>
37,685, // <local var decl>
38,238, // <methodCall>
39,284, // `if
41,98, // `for
42,396, // `while
43,661, // `break
45,270, // `++
46,677, // `--
47,110, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,602, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 113
7,120, // ID
8,621, // `{
10,700, // `}
16,513, // `void
18,504, // <stmt>*
19,667, // <type>
22,366, // <exp>
23,101, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,649, // <stmt>
36,158, // <assign>
37,685, // <local var decl>
38,238, // <methodCall>
39,284, // `if
41,98, // `for
42,396, // `while
43,661, // `break
45,270, // `++
46,677, // `--
47,110, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,602, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
141,143, // "}"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 114
2,197, // ws*
122,757, // " "
140,234, // {10}
149,209, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 115
2,246, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 116
0x80000000|623, // match move
0x80000000|186, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 117
2,34, // ws*
33,MIN_REDUCTION+213, // `[
117,MIN_REDUCTION+213, // "["
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 118
2,81, // ws*
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 119
33,MIN_REDUCTION+247, // `[
117,MIN_REDUCTION+247, // "["
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 120
0x80000000|762, // match move
0x80000000|334, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
0x80000000|719, // match move
0x80000000|420, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 122
0x80000000|239, // match move
0x80000000|25, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 123
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 125
26,247, // `)
125,385, // ")"
  }
,
{ // state 126
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 127
33,MIN_REDUCTION+219, // `[
117,MIN_REDUCTION+219, // "["
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 128
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 129
0x80000000|715, // match move
0x80000000|62, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 130
0x80000000|657, // match move
0x80000000|528, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 131
0x80000000|41, // match move
0x80000000|737, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 132
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 133
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 134
0x80000000|762, // match move
0x80000000|708, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 135
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 136
0x80000000|64, // match move
0x80000000|581, // no-match move
0x80000000|258, // NT-test-match state for `void
  }
,
{ // state 137
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 138
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 139
0x80000000|451, // match move
0x80000000|196, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 140
7,120, // ID
8,621, // `{
10,571, // `}
16,513, // `void
19,667, // <type>
22,366, // <exp>
23,101, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,111, // <stmt>
36,158, // <assign>
37,685, // <local var decl>
38,238, // <methodCall>
39,284, // `if
41,98, // `for
42,396, // `while
43,661, // `break
45,270, // `++
46,677, // `--
47,110, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,602, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
141,143, // "}"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 141
164,MIN_REDUCTION+25, // $NT
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 142
26,367, // `)
125,385, // ")"
  }
,
{ // state 143
2,242, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 144
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 145
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 147
121,178, // "|"
124,175, // "&"
138,573, // "="
142,663, // "!"
  }
,
{ // state 148
0x80000000|277, // match move
0x80000000|150, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 149
2,129, // ws*
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 150
33,629, // `[
77,324, // `.
117,526, // "["
135,251, // "."
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 151
98,605, // "o"
  }
,
{ // state 152
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 153
2,80, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 154
0x80000000|90, // match move
0x80000000|40, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 155
2,434, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 156
111,640, // digit
112,357, // {"1".."9"}
113,357, // "0"
114,116, // digit128
115,54, // {176..185}
152,541, // digit*
153,523, // $$1
  }
,
{ // state 157
7,562, // ID
31,5, // `null
60,276, // <exp1>
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
123,431, // "#"
139,637, // "@"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 158
23,433, // `;
129,602, // ";"
  }
,
{ // state 159
0x80000000|76, // match move
0x80000000|180, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 160
23,430, // `;
129,602, // ";"
  }
,
{ // state 161
23,537, // `;
129,602, // ";"
  }
,
{ // state 162
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 163
2,518, // ws*
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 164
2,197, // ws*
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 165
0x80000000|475, // match move
0x80000000|61, // no-match move
0x80000000|258, // NT-test-match state for `void
  }
,
{ // state 166
17,382, // <formalList>
24,19, // `(
133,444, // "("
  }
,
{ // state 167
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 169
2,81, // ws*
122,757, // " "
140,234, // {10}
149,209, // ws
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 170
0x80000000|599, // match move
0x80000000|603, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 171
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 172
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 173
100,91, // "u"
  }
,
{ // state 174
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 175
2,450, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 176
97,617, // "l"
  }
,
{ // state 177
0x80000000|604, // match move
0x80000000|554, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 178
2,448, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 179
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 181
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 182
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 183
2,12, // ws*
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 184
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 185
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 186
2,10, // ws*
33,MIN_REDUCTION+250, // `[
117,MIN_REDUCTION+250, // "["
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 189
51,642, // `:
137,615, // ":"
  }
,
{ // state 190
0x80000000|218, // match move
0x80000000|658, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 191
26,157, // `)
32,288, // <empty bracket pair>
33,404, // `[
117,526, // "["
125,385, // ")"
  }
,
{ // state 192
122,MIN_REDUCTION+244, // " "
140,MIN_REDUCTION+244, // {10}
149,MIN_REDUCTION+244, // ws
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 193
0x80000000|724, // match move
0x80000000|660, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 194
2,698, // ws*
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 196
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 197
0x80000000|6, // match move
0x80000000|28, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 198
0x80000000|183, // match move
0x80000000|638, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 199
7,166, // ID
32,288, // <empty bracket pair>
33,404, // `[
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
117,526, // "["
  }
,
{ // state 200
106,153, // "t"
  }
,
{ // state 201
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 202
61,692, // `||
139,598, // "@"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 203
0x80000000|532, // match move
0x80000000|597, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 204
98,290, // "o"
  }
,
{ // state 205
0x80000000|378, // match move
0x80000000|260, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 206
33,629, // `[
77,324, // `.
117,526, // "["
135,251, // "."
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 207
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 208
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 209
0x80000000|540, // match move
0x80000000|192, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 210
44,383, // `=
138,478, // "="
  }
,
{ // state 211
98,177, // "o"
  }
,
{ // state 212
0x80000000|373, // match move
0x80000000|635, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 213
7,648, // ID
32,288, // <empty bracket pair>
33,404, // `[
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
117,526, // "["
  }
,
{ // state 214
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 215
0x80000000|464, // match move
0x80000000|514, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 216
63,467, // `==
64,572, // `!=
139,147, // "@"
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 217
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 218
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 219
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 221
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
621, // `{
-1, // <decl in class>*
662, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
513, // `void
-1, // <formalList>
-1, // <stmt>*
667, // <type>
-1, // <returnStmt>
-1, // `return
366, // <exp>
101, // `;
566, // `(
-1, // <listElement>*
-1, // `)
-1, // <listElement>
-1, // `,
466, // `int
181, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
395, // <stmt>
158, // <assign>
685, // <local var decl>
238, // <methodCall>
284, // `if
-1, // `else
98, // `for
396, // `while
661, // `break
-1, // `=
270, // `++
677, // `--
110, // `switch
455, // <case>*
710, // <case>
392, // `case
-1, // `:
308, // `default
202, // <exp8>
445, // <exp7>
216, // <exp6>
449, // <exp5>
344, // <exp4>
569, // <exp3>
263, // <exp2>
73, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
619, // `+
380, // `-
-1, // `*
-1, // `/
-1, // `%
309, // `!
545, // INTLIT
154, // STRINGLIT
435, // CHARLIT
-1, // `.
326, // `this
17, // `true
327, // `false
616, // `new
-1, // <empty bracket pair>**
-1, // <expList>
-1, // <next exp>*
-1, // <next exp>
497, // `super
49, // letter
538, // "a"
538, // "d"
538, // "p"
538, // "s"
538, // "v"
538, // "c"
538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
538, // "f"
538, // "i"
538, // "l"
538, // "o"
538, // "r"
538, // "u"
538, // "x"
538, // "b"
538, // "e"
538, // "h"
538, // "n"
538, // "t"
538, // "w"
565, // letter128
428, // {199..218 231..250}
428, // {193..198 225..230}
-1, // digit
156, // {"1".."9"}
71, // "0"
633, // digit128
54, // {176..185}
-1, // any
-1, // "["
557, // "-"
-1, // "<"
-1, // {0..9 11..31 "$" "?" "\" "^" "`" "~"..127}
-1, // "|"
-1, // " "
551, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
602, // ";"
-1, // ">"
361, // "{"
-1, // "%"
444, // "("
743, // "+"
-1, // "."
-1, // "_"
-1, // ":"
-1, // "="
421, // "@"
-1, // {10}
143, // "}"
100, // "!"
65, // "'"
262, // '"'
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
{ // state 222
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 223
7,730, // ID
19,199, // <type>
29,466, // `int
30,181, // `boolean
31,371, // `null
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
123,442, // "#"
  }
,
{ // state 224
33,MIN_REDUCTION+126, // `[
117,MIN_REDUCTION+126, // "["
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 225
2,511, // ws*
33,MIN_REDUCTION+159, // `[
117,MIN_REDUCTION+159, // "["
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 226
2,254, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 227
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 228
33,MIN_REDUCTION+74, // `[
45,739, // `++
46,589, // `--
117,MIN_REDUCTION+74, // "["
139,707, // "@"
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 230
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 231
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 232
26,652, // `)
125,385, // ")"
  }
,
{ // state 233
2,217, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 234
0x80000000|321, // match move
0x80000000|690, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 235
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 236
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 237
33,MIN_REDUCTION+124, // `[
117,MIN_REDUCTION+124, // "["
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 238
23,94, // `;
129,602, // ";"
  }
,
{ // state 239
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 240
33,MIN_REDUCTION+99, // `[
117,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 241
0x80000000|27, // match move
0x80000000|224, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 242
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 243
63,467, // `==
64,572, // `!=
139,147, // "@"
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 244
10,645, // `}
141,143, // "}"
  }
,
{ // state 245
0x80000000|556, // match move
0x80000000|223, // no-match move
0x80000000|258, // NT-test-match state for `void
  }
,
{ // state 246
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 247
7,120, // ID
8,585, // `{
16,513, // `void
19,667, // <type>
22,366, // <exp>
23,548, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,212, // <stmt>
36,298, // <assign>
37,24, // <local var decl>
38,84, // <methodCall>
39,47, // `if
41,289, // `for
42,57, // `while
43,631, // `break
45,270, // `++
46,677, // `--
47,543, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,7, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 248
2,30, // ws*
122,734, // " "
140,427, // {10}
149,165, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 249
0x80000000|1, // match move
0x80000000|369, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 250
0x80000000|310, // match move
0x80000000|704, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 251
2,31, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 252
33,MIN_REDUCTION+83, // `[
117,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 253
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 254
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 255
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 256
33,MIN_REDUCTION+210, // `[
117,MIN_REDUCTION+210, // "["
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 257
0x80000000|316, // match move
0x80000000|595, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 258
123,580, // "#"
  }
,
{ // state 259
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 260
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 261
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 262
88,48, // "a"
89,48, // "d"
90,48, // "p"
91,48, // "s"
92,48, // "v"
93,48, // "c"
94,48, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,48, // "f"
96,48, // "i"
97,48, // "l"
98,48, // "o"
99,48, // "r"
100,48, // "u"
101,48, // "x"
102,48, // "b"
103,48, // "e"
104,48, // "h"
105,48, // "n"
106,48, // "t"
107,48, // "w"
109,761, // {199..218 231..250}
110,761, // {193..198 225..230}
112,48, // {"1".."9"}
113,48, // "0"
115,761, // {176..185}
116,530, // any
117,48, // "["
118,48, // "-"
119,48, // "<"
120,48, // {0..9 11..31 "$" "?" "\" "^" "`" "~"..127}
121,48, // "|"
122,48, // " "
123,48, // "#"
124,48, // "&"
125,48, // ")"
126,48, // ","
127,48, // "]"
128,48, // "/"
129,48, // ";"
130,48, // ">"
131,48, // "{"
132,48, // "%"
133,48, // "("
134,48, // "+"
135,48, // "."
136,48, // "_"
137,48, // ":"
138,48, // "="
139,48, // "@"
140,48, // {10}
141,48, // "}"
142,48, // "!"
143,48, // "'"
144,48, // '"'
145,48, // "*"
146,691, // any128
147,761, // {223}
148,761, // {128..175 186..192 219..222 224 251..255}
156,390, // any*
157,487, // $$3
  }
,
{ // state 263
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 264
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 265
2,511, // ws*
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 266
2,418, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 267
32,338, // <empty bracket pair>
33,329, // `[
117,526, // "["
  }
,
{ // state 268
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 269
0x80000000|339, // match move
0x80000000|55, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 270
7,493, // ID
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
  }
,
{ // state 271
2,628, // ws*
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 272
99,459, // "r"
104,384, // "h"
  }
,
{ // state 273
26,388, // `)
125,385, // ")"
  }
,
{ // state 274
0x80000000|664, // match move
0x80000000|689, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 275
0x80000000|135, // match move
0x80000000|709, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 276
0x80000000|495, // match move
0x80000000|394, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 277
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 278
33,MIN_REDUCTION+204, // `[
117,MIN_REDUCTION+204, // "["
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 279
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 280
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 281
2,190, // ws*
33,MIN_REDUCTION+252, // `[
117,MIN_REDUCTION+252, // "["
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 282
33,MIN_REDUCTION+212, // `[
117,MIN_REDUCTION+212, // "["
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 283
34,688, // `]
127,426, // "]"
  }
,
{ // state 284
24,748, // `(
133,444, // "("
  }
,
{ // state 285
0x80000000|560, // match move
0x80000000|174, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 286
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 287
0x80000000|253, // match move
0x80000000|469, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 288
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 289
24,439, // `(
133,444, // "("
  }
,
{ // state 290
2,740, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
164,MIN_REDUCTION+111, // $NT
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 291
7,563, // ID
32,288, // <empty bracket pair>
33,404, // `[
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
117,526, // "["
  }
,
{ // state 292
2,190, // ws*
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 293
68,82, // `+
69,411, // `-
118,557, // "-"
134,743, // "+"
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 294
122,MIN_REDUCTION+102, // " "
140,MIN_REDUCTION+102, // {10}
149,MIN_REDUCTION+102, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 295
2,518, // ws*
  }
,
{ // state 296
7,562, // ID
22,302, // <exp>
24,566, // `(
26,441, // `)
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
83,386, // <expList>
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
125,385, // ")"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 297
7,120, // ID
8,585, // `{
16,513, // `void
19,667, // <type>
22,366, // <exp>
23,548, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,486, // <stmt>
36,298, // <assign>
37,24, // <local var decl>
38,84, // <methodCall>
39,47, // `if
41,289, // `for
42,57, // `while
43,631, // `break
45,270, // `++
46,677, // `--
47,543, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,7, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 298
23,18, // `;
129,7, // ";"
  }
,
{ // state 299
34,542, // `]
127,426, // "]"
  }
,
{ // state 300
26,716, // `)
125,385, // ")"
  }
,
{ // state 301
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 302
28,507, // `,
84,655, // <next exp>*
85,501, // <next exp>
126,476, // ","
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 303
0x80000000|711, // match move
0x80000000|2, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 304
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 305
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 306
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 307
70,332, // `*
71,594, // `/
72,609, // `%
128,372, // "/"
132,226, // "%"
145,407, // "*"
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 308
51,678, // `:
137,615, // ":"
  }
,
{ // state 309
7,562, // ID
31,5, // `null
60,318, // <exp1>
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
123,431, // "#"
139,637, // "@"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 310
2,241, // ws*
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 311
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 312
7,562, // ID
22,302, // <exp>
24,566, // `(
26,505, // `)
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
83,419, // <expList>
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
125,385, // ")"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 313
0x80000000|171, // match move
0x80000000|162, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 314
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 315
2,759, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 316
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 317
33,641, // `[
117,526, // "["
  }
,
{ // state 318
0x80000000|712, // match move
0x80000000|206, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 319
0x80000000|438, // match move
0x80000000|87, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 320
26,613, // `)
27,422, // <listElement>
28,363, // `,
125,385, // ")"
126,476, // ","
  }
,
{ // state 321
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 322
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 323
7,733, // ID
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
  }
,
{ // state 324
7,20, // ID
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
  }
,
{ // state 325
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 326
0x80000000|286, // match move
0x80000000|517, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 327
0x80000000|123, // match move
0x80000000|364, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 328
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 329
34,285, // `]
127,426, // "]"
  }
,
{ // state 330
122,734, // " "
140,427, // {10}
149,136, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 331
33,MIN_REDUCTION+74, // `[
117,MIN_REDUCTION+74, // "["
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 332
7,562, // ID
24,566, // `(
31,5, // `null
59,749, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 333
23,747, // `;
129,602, // ";"
  }
,
{ // state 334
7,MIN_REDUCTION+23, // ID
24,425, // `(
33,MIN_REDUCTION+74, // `[
45,739, // `++
46,589, // `--
88,MIN_REDUCTION+23, // "a"
89,MIN_REDUCTION+23, // "d"
90,MIN_REDUCTION+23, // "p"
91,MIN_REDUCTION+23, // "s"
92,MIN_REDUCTION+23, // "v"
93,MIN_REDUCTION+23, // "c"
94,MIN_REDUCTION+23, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,MIN_REDUCTION+23, // "f"
96,MIN_REDUCTION+23, // "i"
97,MIN_REDUCTION+23, // "l"
98,MIN_REDUCTION+23, // "o"
99,MIN_REDUCTION+23, // "r"
100,MIN_REDUCTION+23, // "u"
101,MIN_REDUCTION+23, // "x"
102,MIN_REDUCTION+23, // "b"
103,MIN_REDUCTION+23, // "e"
104,MIN_REDUCTION+23, // "h"
105,MIN_REDUCTION+23, // "n"
106,MIN_REDUCTION+23, // "t"
107,MIN_REDUCTION+23, // "w"
109,MIN_REDUCTION+23, // {199..218 231..250}
110,MIN_REDUCTION+23, // {193..198 225..230}
117,MIN_REDUCTION+74, // "["
133,444, // "("
139,707, // "@"
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 335
122,MIN_REDUCTION+102, // " "
140,MIN_REDUCTION+102, // {10}
149,MIN_REDUCTION+102, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 336
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 337
2,682, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 338
0x80000000|575, // match move
0x80000000|687, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 339
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 340
7,MIN_REDUCTION+22, // ID
33,MIN_REDUCTION+83, // `[
88,MIN_REDUCTION+22, // "a"
89,MIN_REDUCTION+22, // "d"
90,MIN_REDUCTION+22, // "p"
91,MIN_REDUCTION+22, // "s"
92,MIN_REDUCTION+22, // "v"
93,MIN_REDUCTION+22, // "c"
94,MIN_REDUCTION+22, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,MIN_REDUCTION+22, // "f"
96,MIN_REDUCTION+22, // "i"
97,MIN_REDUCTION+22, // "l"
98,MIN_REDUCTION+22, // "o"
99,MIN_REDUCTION+22, // "r"
100,MIN_REDUCTION+22, // "u"
101,MIN_REDUCTION+22, // "x"
102,MIN_REDUCTION+22, // "b"
103,MIN_REDUCTION+22, // "e"
104,MIN_REDUCTION+22, // "h"
105,MIN_REDUCTION+22, // "n"
106,MIN_REDUCTION+22, // "t"
107,MIN_REDUCTION+22, // "w"
109,MIN_REDUCTION+22, // {199..218 231..250}
110,MIN_REDUCTION+22, // {193..198 225..230}
117,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 341
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 342
103,473, // "e"
  }
,
{ // state 343
98,398, // "o"
99,77, // "r"
  }
,
{ // state 344
68,82, // `+
69,411, // `-
118,557, // "-"
134,743, // "+"
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 345
26,412, // `)
125,385, // ")"
  }
,
{ // state 346
106,86, // "t"
  }
,
{ // state 347
103,744, // "e"
  }
,
{ // state 348
2,436, // ws*
33,MIN_REDUCTION+205, // `[
117,MIN_REDUCTION+205, // "["
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 349
33,MIN_REDUCTION+79, // `[
117,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 350
122,MIN_REDUCTION+103, // " "
140,MIN_REDUCTION+103, // {10}
149,MIN_REDUCTION+103, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 352
33,MIN_REDUCTION+76, // `[
117,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 353
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 354
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 355
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 356
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
621, // `{
-1, // <decl in class>*
587, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
513, // `void
-1, // <formalList>
-1, // <stmt>*
667, // <type>
-1, // <returnStmt>
-1, // `return
366, // <exp>
101, // `;
566, // `(
-1, // <listElement>*
-1, // `)
-1, // <listElement>
-1, // `,
466, // `int
181, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
395, // <stmt>
158, // <assign>
685, // <local var decl>
238, // <methodCall>
284, // `if
-1, // `else
98, // `for
396, // `while
661, // `break
-1, // `=
270, // `++
677, // `--
110, // `switch
614, // <case>*
710, // <case>
392, // `case
-1, // `:
308, // `default
202, // <exp8>
445, // <exp7>
216, // <exp6>
449, // <exp5>
344, // <exp4>
569, // <exp3>
263, // <exp2>
73, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
619, // `+
380, // `-
-1, // `*
-1, // `/
-1, // `%
309, // `!
545, // INTLIT
154, // STRINGLIT
435, // CHARLIT
-1, // `.
326, // `this
17, // `true
327, // `false
616, // `new
-1, // <empty bracket pair>**
-1, // <expList>
-1, // <next exp>*
-1, // <next exp>
497, // `super
49, // letter
538, // "a"
538, // "d"
538, // "p"
538, // "s"
538, // "v"
538, // "c"
538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
538, // "f"
538, // "i"
538, // "l"
538, // "o"
538, // "r"
538, // "u"
538, // "x"
538, // "b"
538, // "e"
538, // "h"
538, // "n"
538, // "t"
538, // "w"
565, // letter128
428, // {199..218 231..250}
428, // {193..198 225..230}
-1, // digit
156, // {"1".."9"}
71, // "0"
633, // digit128
54, // {176..185}
-1, // any
-1, // "["
557, // "-"
-1, // "<"
-1, // {0..9 11..31 "$" "?" "\" "^" "`" "~"..127}
-1, // "|"
-1, // " "
551, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
602, // ";"
-1, // ">"
361, // "{"
-1, // "%"
444, // "("
743, // "+"
-1, // "."
-1, // "_"
-1, // ":"
-1, // "="
421, // "@"
-1, // {10}
639, // "}"
100, // "!"
65, // "'"
262, // '"'
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
{ // state 357
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 358
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 359
7,120, // ID
8,585, // `{
16,513, // `void
19,667, // <type>
22,366, // <exp>
23,548, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,606, // <stmt>
36,298, // <assign>
37,24, // <local var decl>
38,84, // <methodCall>
39,47, // `if
41,289, // `for
42,57, // `while
43,631, // `break
45,270, // `++
46,677, // `--
47,543, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,7, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 360
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 361
2,360, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 362
7,730, // ID
9,624, // <decl in class>*
10,519, // `}
12,304, // <decl in class>
13,311, // <method decl>
14,322, // <inst var decl>
15,245, // `public
16,513, // `void
19,213, // <type>
29,466, // `int
30,181, // `boolean
31,371, // `null
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
123,99, // "#"
141,143, // "}"
  }
,
{ // state 363
7,730, // ID
16,513, // `void
19,582, // <type>
29,466, // `int
30,181, // `boolean
31,371, // `null
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
123,725, // "#"
  }
,
{ // state 364
33,MIN_REDUCTION+82, // `[
117,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 365
7,730, // ID
10,729, // `}
12,354, // <decl in class>
13,311, // <method decl>
14,322, // <inst var decl>
15,245, // `public
16,513, // `void
19,213, // <type>
29,466, // `int
30,181, // `boolean
31,371, // `null
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
123,99, // "#"
141,143, // "}"
  }
,
{ // state 366
44,387, // `=
138,478, // "="
  }
,
{ // state 367
7,120, // ID
8,621, // `{
16,513, // `void
19,667, // <type>
22,366, // <exp>
23,101, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,679, // <stmt>
36,158, // <assign>
37,685, // <local var decl>
38,238, // <methodCall>
39,284, // `if
41,98, // `for
42,396, // `while
43,661, // `break
45,270, // `++
46,677, // `--
47,110, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,602, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
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
{ // state 368
3,668, // <program>
4,68, // <class decl>+
5,669, // <class decl>
6,32, // `class
122,107, // " "
123,498, // "#"
140,29, // {10}
149,43, // ws
  }
,
{ // state 369
24,296, // `(
33,MIN_REDUCTION+79, // `[
117,MIN_REDUCTION+79, // "["
133,444, // "("
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 370
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 371
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 372
2,13, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 373
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 374
17,696, // <formalList>
24,19, // `(
133,444, // "("
  }
,
{ // state 375
7,9, // ID
22,366, // <exp>
24,566, // `(
31,5, // `null
36,488, // <assign>
45,270, // `++
46,677, // `--
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 376
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 377
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 378
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 379
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 380
7,562, // ID
31,5, // `null
60,561, // <exp1>
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
123,431, // "#"
139,637, // "@"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 381
70,332, // `*
71,594, // `/
72,609, // `%
128,372, // "/"
132,226, // "%"
145,407, // "*"
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 382
8,625, // `{
131,361, // "{"
  }
,
{ // state 383
7,562, // ID
22,763, // <exp>
24,566, // `(
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 384
0x80000000|271, // match move
0x80000000|746, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 385
2,259, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 386
26,33, // `)
125,385, // ")"
  }
,
{ // state 387
7,562, // ID
22,39, // <exp>
24,566, // `(
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 388
7,120, // ID
8,621, // `{
16,513, // `void
19,667, // <type>
22,366, // <exp>
23,101, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,26, // <stmt>
36,158, // <assign>
37,685, // <local var decl>
38,238, // <methodCall>
39,284, // `if
41,98, // `for
42,396, // `while
43,661, // `break
45,270, // `++
46,677, // `--
47,110, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,602, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 389
7,730, // ID
9,365, // <decl in class>*
10,618, // `}
12,304, // <decl in class>
13,311, // <method decl>
14,322, // <inst var decl>
15,245, // `public
16,513, // `void
19,213, // <type>
29,466, // `int
30,181, // `boolean
31,371, // `null
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
123,99, // "#"
141,143, // "}"
  }
,
{ // state 390
88,48, // "a"
89,48, // "d"
90,48, // "p"
91,48, // "s"
92,48, // "v"
93,48, // "c"
94,48, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,48, // "f"
96,48, // "i"
97,48, // "l"
98,48, // "o"
99,48, // "r"
100,48, // "u"
101,48, // "x"
102,48, // "b"
103,48, // "e"
104,48, // "h"
105,48, // "n"
106,48, // "t"
107,48, // "w"
109,761, // {199..218 231..250}
110,761, // {193..198 225..230}
112,48, // {"1".."9"}
113,48, // "0"
115,761, // {176..185}
116,377, // any
117,48, // "["
118,48, // "-"
119,48, // "<"
120,48, // {0..9 11..31 "$" "?" "\" "^" "`" "~"..127}
121,48, // "|"
122,48, // " "
123,48, // "#"
124,48, // "&"
125,48, // ")"
126,48, // ","
127,48, // "]"
128,48, // "/"
129,48, // ";"
130,48, // ">"
131,48, // "{"
132,48, // "%"
133,48, // "("
134,48, // "+"
135,48, // "."
136,48, // "_"
137,48, // ":"
138,48, // "="
139,48, // "@"
140,48, // {10}
141,48, // "}"
142,48, // "!"
143,48, // "'"
144,48, // '"'
145,48, // "*"
146,691, // any128
147,761, // {223}
148,761, // {128..175 186..192 219..222 224 251..255}
157,754, // $$3
  }
,
{ // state 391
7,374, // ID
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
  }
,
{ // state 392
7,562, // ID
22,189, // <exp>
24,566, // `(
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 393
62,626, // `&&
139,443, // "@"
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 394
33,629, // `[
77,324, // `.
117,526, // "["
135,251, // "."
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 395
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 396
24,732, // `(
133,444, // "("
  }
,
{ // state 397
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 398
2,106, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 399
101,337, // "x"
  }
,
{ // state 400
2,446, // ws*
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 401
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 402
68,82, // `+
69,411, // `-
118,557, // "-"
134,743, // "+"
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 403
32,607, // <empty bracket pair>
33,329, // `[
82,728, // <empty bracket pair>**
117,526, // "["
162,8, // <empty bracket pair>*
  }
,
{ // state 404
34,141, // `]
127,593, // "]"
  }
,
{ // state 405
23,552, // `;
129,602, // ";"
  }
,
{ // state 406
0x80000000|553, // match move
0x80000000|117, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 407
2,132, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 408
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 409
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 410
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 411
7,562, // ID
24,566, // `(
31,5, // `null
58,381, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 412
7,120, // ID
8,585, // `{
16,513, // `void
19,667, // <type>
22,366, // <exp>
23,548, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,447, // <stmt>
36,298, // <assign>
37,24, // <local var decl>
38,84, // <methodCall>
39,47, // `if
41,289, // `for
42,57, // `while
43,631, // `break
45,270, // `++
46,677, // `--
47,543, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,7, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 413
8,356, // `{
131,361, // "{"
  }
,
{ // state 414
2,170, // ws*
  }
,
{ // state 415
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 416
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 417
65,718, // `<
66,108, // `<=
67,72, // `>
119,726, // "<"
130,70, // ">"
139,550, // "@"
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 418
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 419
26,168, // `)
125,385, // ")"
  }
,
{ // state 420
33,MIN_REDUCTION+100, // `[
117,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 421
118,499, // "-"
134,102, // "+"
144,437, // '"'
  }
,
{ // state 422
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 423
103,522, // "e"
  }
,
{ // state 424
0x80000000|720, // match move
0x80000000|35, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 425
7,562, // ID
22,302, // <exp>
24,566, // `(
26,97, // `)
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
83,46, // <expList>
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
125,385, // ")"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 426
0x80000000|676, // match move
0x80000000|644, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 427
0x80000000|184, // match move
0x80000000|350, // no-match move
0x80000000|258, // NT-test-match state for `void
  }
,
{ // state 428
0x80000000|201, // match move
0x80000000|634, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 429
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 430
7,562, // ID
22,643, // <exp>
23,375, // `;
24,566, // `(
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
129,602, // ";"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 431
95,60, // "f"
105,452, // "n"
106,272, // "t"
  }
,
{ // state 432
2,52, // ws*
33,MIN_REDUCTION+199, // `[
117,MIN_REDUCTION+199, // "["
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 433
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 434
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 435
0x80000000|305, // match move
0x80000000|675, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 436
0x80000000|471, // match move
0x80000000|278, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 437
0x80000000|149, // match move
0x80000000|756, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 438
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 439
7,9, // ID
22,366, // <exp>
24,566, // `(
31,5, // `null
36,405, // <assign>
45,270, // `++
46,677, // `--
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 440
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 441
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 442
96,200, // "i"
102,735, // "b"
105,14, // "n"
  }
,
{ // state 443
121,178, // "|"
124,175, // "&"
  }
,
{ // state 444
2,325, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 445
62,626, // `&&
139,443, // "@"
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 446
0x80000000|622, // match move
0x80000000|126, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 447
0x80000000|21, // match move
0x80000000|78, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 448
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 449
65,718, // `<
66,108, // `<=
67,72, // `>
119,726, // "<"
130,70, // ">"
139,550, // "@"
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 450
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 451
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 452
100,198, // "u"
103,315, // "e"
  }
,
{ // state 453
0x80000000|705, // match move
0x80000000|16, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 454
0x80000000|92, // match move
0x80000000|673, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 455
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
621, // `{
-1, // <decl in class>*
103, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
513, // `void
-1, // <formalList>
-1, // <stmt>*
667, // <type>
-1, // <returnStmt>
-1, // `return
366, // <exp>
101, // `;
566, // `(
-1, // <listElement>*
-1, // `)
-1, // <listElement>
-1, // `,
466, // `int
181, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
395, // <stmt>
158, // <assign>
685, // <local var decl>
238, // <methodCall>
284, // `if
-1, // `else
98, // `for
396, // `while
661, // `break
-1, // `=
270, // `++
677, // `--
110, // `switch
-1, // <case>*
588, // <case>
392, // `case
-1, // `:
308, // `default
202, // <exp8>
445, // <exp7>
216, // <exp6>
449, // <exp5>
344, // <exp4>
569, // <exp3>
263, // <exp2>
73, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
619, // `+
380, // `-
-1, // `*
-1, // `/
-1, // `%
309, // `!
545, // INTLIT
154, // STRINGLIT
435, // CHARLIT
-1, // `.
326, // `this
17, // `true
327, // `false
616, // `new
-1, // <empty bracket pair>**
-1, // <expList>
-1, // <next exp>*
-1, // <next exp>
497, // `super
49, // letter
538, // "a"
538, // "d"
538, // "p"
538, // "s"
538, // "v"
538, // "c"
538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
538, // "f"
538, // "i"
538, // "l"
538, // "o"
538, // "r"
538, // "u"
538, // "x"
538, // "b"
538, // "e"
538, // "h"
538, // "n"
538, // "t"
538, // "w"
565, // letter128
428, // {199..218 231..250}
428, // {193..198 225..230}
-1, // digit
156, // {"1".."9"}
71, // "0"
633, // digit128
54, // {176..185}
-1, // any
-1, // "["
557, // "-"
-1, // "<"
-1, // {0..9 11..31 "$" "?" "\" "^" "`" "~"..127}
-1, // "|"
-1, // " "
551, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
602, // ";"
-1, // ">"
361, // "{"
-1, // "%"
444, // "("
743, // "+"
-1, // "."
-1, // "_"
-1, // ":"
-1, // "="
421, // "@"
-1, // {10}
143, // "}"
100, // "!"
65, // "'"
262, // '"'
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
{ // state 456
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 457
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 458
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 459
0x80000000|163, // match move
0x80000000|592, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 460
33,629, // `[
77,324, // `.
117,526, // "["
135,251, // "."
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 461
7,562, // ID
22,300, // <exp>
24,566, // `(
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 462
8,221, // `{
131,361, // "{"
  }
,
{ // state 463
33,MIN_REDUCTION+207, // `[
117,MIN_REDUCTION+207, // "["
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 464
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 465
26,413, // `)
125,385, // ")"
  }
,
{ // state 466
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 467
7,562, // ID
24,566, // `(
31,5, // `null
56,417, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 468
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 469
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 470
0x80000000|328, // match move
0x80000000|127, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 471
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 472
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 473
2,280, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 474
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 475
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 476
2,128, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 477
2,436, // ws*
  }
,
{ // state 478
2,608, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 479
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 480
32,287, // <empty bracket pair>
33,329, // `[
117,526, // "["
  }
,
{ // state 481
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 482
0x80000000|301, // match move
0x80000000|119, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 483
2,170, // ws*
33,MIN_REDUCTION+254, // `[
117,MIN_REDUCTION+254, // "["
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 484
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 485
118,499, // "-"
134,102, // "+"
  }
,
{ // state 486
0x80000000|544, // match move
0x80000000|78, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 487
0x80000000|559, // match move
0x80000000|670, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 488
26,695, // `)
125,385, // ")"
  }
,
{ // state 489
33,MIN_REDUCTION+244, // `[
117,MIN_REDUCTION+244, // "["
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 490
7,562, // ID
22,465, // <exp>
24,566, // `(
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 491
2,10, // ws*
  }
,
{ // state 492
87,236, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,647, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
111,693, // digit
112,357, // {"1".."9"}
113,357, // "0"
114,215, // digit128
115,54, // {176..185}
136,11, // "_"
147,470, // {223}
151,203, // $$0
158,370, // idChar
159,454, // idChar128
  }
,
{ // state 493
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 494
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 495
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 496
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 497
77,564, // `.
135,251, // "."
  }
,
{ // state 498
93,176, // "c"
  }
,
{ // state 499
2,44, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 500
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 501
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 502
33,MIN_REDUCTION+81, // `[
117,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 503
2,170, // ws*
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 504
7,120, // ID
8,621, // `{
10,549, // `}
16,513, // `void
19,667, // <type>
22,366, // <exp>
23,101, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,111, // <stmt>
36,158, // <assign>
37,685, // <local var decl>
38,238, // <methodCall>
39,284, // `if
41,98, // `for
42,396, // `while
43,661, // `break
45,270, // `++
46,677, // `--
47,110, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,602, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
141,143, // "}"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 505
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 506
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 507
7,562, // ID
22,109, // <exp>
24,566, // `(
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 508
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 509
33,MIN_REDUCTION+221, // `[
117,MIN_REDUCTION+221, // "["
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 510
68,82, // `+
69,411, // `-
118,557, // "-"
134,743, // "+"
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 511
0x80000000|506, // match move
0x80000000|717, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 512
7,120, // ID
8,621, // `{
10,727, // `}
16,513, // `void
19,667, // <type>
22,366, // <exp>
23,101, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,111, // <stmt>
36,158, // <assign>
37,685, // <local var decl>
38,238, // <methodCall>
39,284, // `if
41,98, // `for
42,396, // `while
43,661, // `break
45,270, // `++
46,677, // `--
47,110, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,602, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
141,639, // "}"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 513
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 514
33,MIN_REDUCTION+218, // `[
117,MIN_REDUCTION+218, // "["
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 515
7,249, // ID
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
  }
,
{ // state 516
7,562, // ID
22,59, // <exp>
24,566, // `(
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 517
33,MIN_REDUCTION+80, // `[
117,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 518
0x80000000|651, // match move
0x80000000|105, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 519
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 520
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 521
2,446, // ws*
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 522
2,69, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 523
0x80000000|67, // match move
0x80000000|524, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 524
33,MIN_REDUCTION+203, // `[
117,MIN_REDUCTION+203, // "["
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 525
7,9, // ID
22,366, // <exp>
24,566, // `(
31,5, // `null
36,160, // <assign>
45,270, // `++
46,677, // `--
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 526
2,56, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 527
122,107, // " "
140,29, // {10}
149,43, // ws
164,MIN_REDUCTION+118, // $NT
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 528
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 529
33,MIN_REDUCTION+132, // `[
117,MIN_REDUCTION+132, // "["
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 530
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 531
0x80000000|188, // match move
0x80000000|376, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 532
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 533
87,236, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,261, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
111,693, // digit
112,357, // {"1".."9"}
113,357, // "0"
114,133, // digit128
115,579, // {176..185}
136,11, // "_"
147,702, // {223}
151,89, // $$0
158,370, // idChar
159,22, // idChar128
  }
,
{ // state 534
7,562, // ID
22,333, // <exp>
24,566, // `(
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 535
0x80000000|152, // match move
0x80000000|66, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 536
26,297, // `)
125,385, // ")"
  }
,
{ // state 537
7,9, // ID
22,366, // <exp>
24,566, // `(
31,5, // `null
36,125, // <assign>
45,270, // `++
46,677, // `--
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 538
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 539
0x80000000|167, // match move
0x80000000|509, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 540
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 541
111,74, // digit
112,357, // {"1".."9"}
113,357, // "0"
114,116, // digit128
115,54, // {176..185}
153,122, // $$1
  }
,
{ // state 542
0x80000000|268, // match move
0x80000000|63, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 543
24,490, // `(
133,444, // "("
  }
,
{ // state 544
40,359, // `else
123,347, // "#"
  }
,
{ // state 545
0x80000000|220, // match move
0x80000000|352, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 546
24,312, // `(
133,444, // "("
  }
,
{ // state 547
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 548
0x80000000|306, // match move
0x80000000|474, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 549
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 550
119,636, // "<"
121,178, // "|"
124,175, // "&"
138,573, // "="
142,663, // "!"
  }
,
{ // state 551
89,342, // "d"
91,96, // "s"
92,204, // "v"
93,423, // "c"
95,600, // "f"
96,200, // "i"
102,343, // "b"
105,452, // "n"
106,272, // "t"
107,590, // "w"
134,266, // "+"
  }
,
{ // state 552
7,562, // ID
22,161, // <exp>
23,703, // `;
24,566, // `(
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
129,602, // ";"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 553
2,34, // ws*
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 554
2,555, // ws*
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 555
0x80000000|456, // match move
0x80000000|51, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 556
16,391, // `void
123,580, // "#"
  }
,
{ // state 557
2,50, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 558
2,190, // ws*
  }
,
{ // state 559
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 560
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 561
0x80000000|758, // match move
0x80000000|460, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 562
0x80000000|138, // match move
0x80000000|331, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 563
25,320, // <listElement>*
26,409, // `)
27,612, // <listElement>
28,363, // `,
125,385, // ")"
126,476, // ","
  }
,
{ // state 564
7,546, // ID
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
  }
,
{ // state 565
0x80000000|721, // match move
0x80000000|432, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 566
7,730, // ID
16,513, // `void
19,191, // <type>
29,466, // `int
30,181, // `boolean
31,371, // `null
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
123,725, // "#"
  }
,
{ // state 567
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 568
33,404, // `[
117,526, // "["
  }
,
{ // state 569
70,332, // `*
71,594, // `/
72,609, // `%
128,372, // "/"
132,226, // "%"
145,407, // "*"
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 570
0x80000000|265, // match move
0x80000000|225, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 571
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 572
7,562, // ID
24,566, // `(
31,5, // `null
56,85, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 573
2,15, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 574
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 575
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 576
26,269, // `)
125,570, // ")"
  }
,
{ // state 577
92,151, // "v"
96,346, // "i"
102,211, // "b"
105,722, // "n"
  }
,
{ // state 578
7,562, // ID
22,536, // <exp>
24,566, // `(
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 579
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 580
92,204, // "v"
  }
,
{ // state 581
122,MIN_REDUCTION+243, // " "
140,MIN_REDUCTION+243, // {10}
149,MIN_REDUCTION+243, // ws
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 582
7,416, // ID
32,288, // <empty bracket pair>
33,404, // `[
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
117,526, // "["
  }
,
{ // state 583
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 584
2,397, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 585
7,120, // ID
8,621, // `{
10,586, // `}
16,513, // `void
18,512, // <stmt>*
19,667, // <type>
22,366, // <exp>
23,101, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,649, // <stmt>
36,158, // <assign>
37,685, // <local var decl>
38,238, // <methodCall>
39,284, // `if
41,98, // `for
42,396, // `while
43,661, // `break
45,270, // `++
46,677, // `--
47,110, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,602, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
141,639, // "}"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 586
0x80000000|222, // match move
0x80000000|752, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 587
0x80000000|208, // match move
0x80000000|440, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 588
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 589
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 590
104,750, // "h"
  }
,
{ // state 591
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 592
2,518, // ws*
33,MIN_REDUCTION+129, // `[
117,MIN_REDUCTION+129, // "["
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 593
2,3, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
164,MIN_REDUCTION+175, // $NT
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 594
7,562, // ID
24,566, // `(
31,5, // `null
59,185, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 595
33,MIN_REDUCTION+243, // `[
117,MIN_REDUCTION+243, // "["
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 596
33,MIN_REDUCTION+198, // `[
117,MIN_REDUCTION+198, // "["
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 597
33,MIN_REDUCTION+200, // `[
117,MIN_REDUCTION+200, // "["
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 598
121,178, // "|"
  }
,
{ // state 599
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 600
88,250, // "a"
98,672, // "o"
  }
,
{ // state 601
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 602
2,182, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 603
33,MIN_REDUCTION+253, // `[
117,MIN_REDUCTION+253, // "["
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 604
2,555, // ws*
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 605
0x80000000|194, // match move
0x80000000|88, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 606
0x80000000|458, // match move
0x80000000|401, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 607
0x80000000|680, // match move
0x80000000|681, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 608
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 609
7,562, // ID
24,566, // `(
31,5, // `null
59,235, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 610
2,436, // ws*
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 611
123,347, // "#"
  }
,
{ // state 612
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 613
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 614
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
621, // `{
-1, // <decl in class>*
139, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
513, // `void
-1, // <formalList>
-1, // <stmt>*
667, // <type>
-1, // <returnStmt>
-1, // `return
366, // <exp>
101, // `;
566, // `(
-1, // <listElement>*
-1, // `)
-1, // <listElement>
-1, // `,
466, // `int
181, // `boolean
37, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
395, // <stmt>
158, // <assign>
685, // <local var decl>
238, // <methodCall>
284, // `if
-1, // `else
98, // `for
396, // `while
661, // `break
-1, // `=
270, // `++
677, // `--
110, // `switch
-1, // <case>*
588, // <case>
392, // `case
-1, // `:
308, // `default
202, // <exp8>
445, // <exp7>
216, // <exp6>
449, // <exp5>
344, // <exp4>
569, // <exp3>
263, // <exp2>
73, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
619, // `+
380, // `-
-1, // `*
-1, // `/
-1, // `%
309, // `!
545, // INTLIT
154, // STRINGLIT
435, // CHARLIT
-1, // `.
326, // `this
17, // `true
327, // `false
616, // `new
-1, // <empty bracket pair>**
-1, // <expList>
-1, // <next exp>*
-1, // <next exp>
497, // `super
49, // letter
538, // "a"
538, // "d"
538, // "p"
538, // "s"
538, // "v"
538, // "c"
538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
538, // "f"
538, // "i"
538, // "l"
538, // "o"
538, // "r"
538, // "u"
538, // "x"
538, // "b"
538, // "e"
538, // "h"
538, // "n"
538, // "t"
538, // "w"
565, // letter128
428, // {199..218 231..250}
428, // {193..198 225..230}
-1, // digit
156, // {"1".."9"}
71, // "0"
633, // digit128
54, // {176..185}
-1, // any
-1, // "["
557, // "-"
-1, // "<"
-1, // {0..9 11..31 "$" "?" "\" "^" "`" "~"..127}
-1, // "|"
-1, // " "
551, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
602, // ";"
-1, // ">"
361, // "{"
-1, // "%"
444, // "("
743, // "+"
-1, // "."
-1, // "_"
-1, // ":"
-1, // "="
421, // "@"
-1, // {10}
639, // "}"
100, // "!"
65, // "'"
262, // '"'
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
{ // state 615
2,264, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 616
7,134, // ID
16,683, // `void
19,620, // <type>
29,205, // `int
30,313, // `boolean
31,753, // `null
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
123,577, // "#"
  }
,
{ // state 617
2,574, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 618
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 619
7,562, // ID
31,5, // `null
60,535, // <exp1>
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
123,431, // "#"
139,637, // "@"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 620
0x80000000|267, // match move
0x80000000|317, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 621
7,120, // ID
8,621, // `{
10,145, // `}
16,513, // `void
18,140, // <stmt>*
19,667, // <type>
22,366, // <exp>
23,101, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,649, // <stmt>
36,158, // <assign>
37,685, // <local var decl>
38,238, // <methodCall>
39,284, // `if
41,98, // `for
42,396, // `while
43,661, // `break
45,270, // `++
46,677, // `--
47,110, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,602, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
141,143, // "}"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 622
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 623
2,10, // ws*
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 624
7,730, // ID
10,415, // `}
12,354, // <decl in class>
13,311, // <method decl>
14,322, // <inst var decl>
15,245, // `public
16,513, // `void
19,213, // <type>
29,466, // `int
30,181, // `boolean
31,371, // `null
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
123,99, // "#"
141,143, // "}"
  }
,
{ // state 625
7,120, // ID
8,621, // `{
16,513, // `void
18,659, // <stmt>*
19,667, // <type>
20,244, // <returnStmt>
21,534, // `return
22,366, // <exp>
23,101, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,649, // <stmt>
36,158, // <assign>
37,685, // <local var decl>
38,238, // <methodCall>
39,284, // `if
41,98, // `for
42,396, // `while
43,661, // `break
45,270, // `++
46,677, // `--
47,110, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,684, // "#"
129,602, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 626
7,562, // ID
24,566, // `(
31,5, // `null
55,243, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 627
91,96, // "s"
92,204, // "v"
95,600, // "f"
96,200, // "i"
102,343, // "b"
105,452, // "n"
106,272, // "t"
107,590, // "w"
134,266, // "+"
  }
,
{ // state 628
0x80000000|408, // match move
0x80000000|237, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 629
7,562, // ID
22,299, // <exp>
24,566, // `(
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 630
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 631
23,159, // `;
129,7, // ";"
  }
,
{ // state 632
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 633
0x80000000|610, // match move
0x80000000|348, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 634
33,MIN_REDUCTION+97, // `[
117,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 635
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 636
2,36, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 637
144,437, // '"'
  }
,
{ // state 638
2,12, // ws*
33,MIN_REDUCTION+133, // `[
117,MIN_REDUCTION+133, // "["
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 639
0x80000000|164, // match move
0x80000000|114, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 640
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 641
7,562, // ID
22,283, // <exp>
24,566, // `(
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 642
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 643
23,53, // `;
129,602, // ";"
  }
,
{ // state 644
2,319, // ws*
23,MIN_REDUCTION+175, // `;
44,MIN_REDUCTION+175, // `=
51,MIN_REDUCTION+175, // `:
61,MIN_REDUCTION+175, // `||
62,MIN_REDUCTION+175, // `&&
65,MIN_REDUCTION+175, // `<
66,MIN_REDUCTION+175, // `<=
67,MIN_REDUCTION+175, // `>
82,MIN_REDUCTION+175, // <empty bracket pair>**
84,MIN_REDUCTION+175, // <next exp>*
117,MIN_REDUCTION+175, // "["
119,MIN_REDUCTION+175, // "<"
122,453, // " "
126,MIN_REDUCTION+175, // ","
129,MIN_REDUCTION+175, // ";"
130,MIN_REDUCTION+175, // ">"
137,MIN_REDUCTION+175, // ":"
138,MIN_REDUCTION+175, // "="
139,MIN_REDUCTION+175, // "@"
140,303, // {10}
149,83, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 645
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 646
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 647
0x80000000|484, // match move
0x80000000|755, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 648
23,219, // `;
129,602, // ";"
  }
,
{ // state 649
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 650
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 651
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 652
7,120, // ID
8,585, // `{
16,513, // `void
19,667, // <type>
22,366, // <exp>
23,548, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,275, // <stmt>
36,298, // <assign>
37,24, // <local var decl>
38,84, // <methodCall>
39,47, // `if
41,289, // `for
42,57, // `while
43,631, // `break
45,270, // `++
46,677, // `--
47,543, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,7, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 653
2,34, // ws*
  }
,
{ // state 654
2,214, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 655
28,507, // `,
85,481, // <next exp>
126,476, // ","
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 656
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 657
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 658
33,MIN_REDUCTION+251, // `[
117,MIN_REDUCTION+251, // "["
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 659
7,120, // ID
8,621, // `{
16,513, // `void
19,667, // <type>
20,736, // <returnStmt>
21,534, // `return
22,366, // <exp>
23,101, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,111, // <stmt>
36,158, // <assign>
37,685, // <local var decl>
38,238, // <methodCall>
39,284, // `if
41,98, // `for
42,396, // `while
43,661, // `break
45,270, // `++
46,677, // `--
47,110, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,684, // "#"
129,602, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 660
33,MIN_REDUCTION+201, // `[
117,MIN_REDUCTION+201, // "["
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 661
23,187, // `;
129,602, // ";"
  }
,
{ // state 662
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 663
2,144, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 664
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 665
122,757, // " "
140,234, // {10}
149,131, // ws
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 666
0x80000000|479, // match move
0x80000000|463, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 667
7,210, // ID
32,288, // <empty bracket pair>
33,404, // `[
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
117,526, // "["
  }
,
{ // state 668
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 669
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 670
33,MIN_REDUCTION+211, // `[
117,MIN_REDUCTION+211, // "["
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 671
164,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 672
2,172, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 673
2,482, // ws*
33,MIN_REDUCTION+248, // `[
117,MIN_REDUCTION+248, // "["
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 674
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 675
33,MIN_REDUCTION+78, // `[
117,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 676
2,319, // ws*
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 677
7,255, // ID
87,95, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,654, // letter128
109,207, // {199..218 231..250}
110,207, // {193..198 225..230}
  }
,
{ // state 678
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 679
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 680
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 681
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 682
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 683
0x80000000|591, // match move
0x80000000|500, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 684
91,96, // "s"
92,204, // "v"
95,600, // "f"
96,200, // "i"
99,4, // "r"
102,343, // "b"
105,452, // "n"
106,272, // "t"
107,590, // "w"
134,266, // "+"
  }
,
{ // state 685
23,358, // `;
129,602, // ";"
  }
,
{ // state 686
163,MIN_REDUCTION+0, // $
  }
,
{ // state 687
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 688
0x80000000|403, // match move
0x80000000|104, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 689
33,MIN_REDUCTION+206, // `[
117,MIN_REDUCTION+206, // "["
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 690
122,MIN_REDUCTION+103, // " "
140,MIN_REDUCTION+103, // {10}
149,MIN_REDUCTION+103, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 691
0x80000000|503, // match move
0x80000000|483, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 692
7,562, // ID
24,566, // `(
31,5, // `null
54,393, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 693
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 694
33,MIN_REDUCTION+249, // `[
117,MIN_REDUCTION+249, // "["
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 695
7,120, // ID
8,621, // `{
16,513, // `void
19,667, // <type>
22,366, // <exp>
23,101, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,38, // <stmt>
36,158, // <assign>
37,685, // <local var decl>
38,238, // <methodCall>
39,284, // `if
41,98, // `for
42,396, // `while
43,661, // `break
45,270, // `++
46,677, // `--
47,110, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,602, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 696
8,113, // `{
131,361, // "{"
  }
,
{ // state 697
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 698
0x80000000|583, // match move
0x80000000|75, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 699
33,MIN_REDUCTION+85, // `[
117,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 700
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 701
2,30, // ws*
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 702
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 703
7,9, // ID
22,366, // <exp>
24,566, // `(
31,5, // `null
36,232, // <assign>
45,270, // `++
46,677, // `--
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 704
2,241, // ws*
33,MIN_REDUCTION+127, // `[
117,MIN_REDUCTION+127, // "["
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 705
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 706
2,527, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
164,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 707
118,499, // "-"
119,636, // "<"
121,178, // "|"
124,175, // "&"
134,102, // "+"
138,573, // "="
142,663, // "!"
  }
,
{ // state 708
24,576, // `(
133,444, // "("
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 709
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 710
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 711
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 712
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 713
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 714
0x80000000|292, // match move
0x80000000|281, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 715
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 716
7,120, // ID
8,585, // `{
16,513, // `void
19,667, // <type>
22,366, // <exp>
23,548, // `;
24,566, // `(
29,466, // `int
30,181, // `boolean
31,37, // `null
35,424, // <stmt>
36,298, // <assign>
37,24, // <local var decl>
38,84, // <methodCall>
39,47, // `if
41,289, // `for
42,57, // `while
43,631, // `break
45,270, // `++
46,677, // `--
47,543, // `switch
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,73, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
86,497, // `super
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,627, // "#"
129,7, // ";"
131,361, // "{"
133,444, // "("
134,743, // "+"
139,421, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 717
33,MIN_REDUCTION+158, // `[
117,MIN_REDUCTION+158, // "["
122,453, // " "
140,303, // {10}
149,257, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 718
7,562, // ID
24,566, // `(
31,5, // `null
57,293, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 719
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 720
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 721
2,52, // ws*
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 722
100,198, // "u"
  }
,
{ // state 723
33,MIN_REDUCTION+101, // `[
117,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 724
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 725
92,204, // "v"
96,200, // "i"
102,735, // "b"
105,14, // "n"
  }
,
{ // state 726
2,567, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 727
0x80000000|227, // match move
0x80000000|429, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 728
0x80000000|494, // match move
0x80000000|699, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 729
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 730
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 731
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 732
7,562, // ID
22,142, // <exp>
24,566, // `(
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 733
8,389, // `{
131,361, // "{"
  }
,
{ // state 734
0x80000000|230, // match move
0x80000000|335, // no-match move
0x80000000|258, // NT-test-match state for `void
  }
,
{ // state 735
98,398, // "o"
  }
,
{ // state 736
10,379, // `}
141,143, // "}"
  }
,
{ // state 737
122,MIN_REDUCTION+243, // " "
140,MIN_REDUCTION+243, // {10}
149,MIN_REDUCTION+243, // ws
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 738
2,628, // ws*
  }
,
{ // state 739
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 740
122,107, // " "
140,29, // {10}
149,43, // ws
164,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 741
2,129, // ws*
  }
,
{ // state 742
88,457, // "a"
89,457, // "d"
90,457, // "p"
91,457, // "s"
92,457, // "v"
93,457, // "c"
94,457, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,457, // "f"
96,457, // "i"
97,457, // "l"
98,457, // "o"
99,457, // "r"
100,457, // "u"
101,457, // "x"
102,457, // "b"
103,457, // "e"
104,457, // "h"
105,457, // "n"
106,457, // "t"
107,457, // "w"
110,539, // {193..198 225..230}
112,457, // {"1".."9"}
113,457, // "0"
115,539, // {176..185}
155,274, // $$2
160,353, // hexDigit
161,714, // hexDigit128
  }
,
{ // state 743
2,179, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 744
97,706, // "l"
  }
,
{ // state 745
33,629, // `[
77,515, // `.
117,526, // "["
135,251, // "."
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 746
2,628, // ws*
33,MIN_REDUCTION+125, // `[
117,MIN_REDUCTION+125, // "["
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 747
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 748
7,562, // ID
22,345, // <exp>
24,566, // `(
31,5, // `null
53,202, // <exp8>
54,445, // <exp7>
55,216, // <exp6>
56,449, // <exp5>
57,344, // <exp4>
58,569, // <exp3>
59,263, // <exp2>
60,148, // <exp1>
68,619, // `+
69,380, // `-
73,309, // `!
74,545, // INTLIT
75,154, // STRINGLIT
76,435, // CHARLIT
78,326, // `this
79,17, // `true
80,327, // `false
81,616, // `new
87,49, // letter
88,538, // "a"
89,538, // "d"
90,538, // "p"
91,538, // "s"
92,538, // "v"
93,538, // "c"
94,538, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
95,538, // "f"
96,538, // "i"
97,538, // "l"
98,538, // "o"
99,538, // "r"
100,538, // "u"
101,538, // "x"
102,538, // "b"
103,538, // "e"
104,538, // "h"
105,538, // "n"
106,538, // "t"
107,538, // "w"
108,565, // letter128
109,428, // {199..218 231..250}
110,428, // {193..198 225..230}
112,156, // {"1".."9"}
113,71, // "0"
114,633, // digit128
115,54, // {176..185}
118,557, // "-"
123,431, // "#"
133,444, // "("
134,743, // "+"
139,637, // "@"
142,100, // "!"
143,65, // "'"
144,262, // '"'
  }
,
{ // state 749
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 750
2,547, // ws*
122,107, // " "
140,29, // {10}
149,671, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 751
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 752
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 753
0x80000000|279, // match move
0x80000000|23, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 754
0x80000000|231, // match move
0x80000000|256, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 755
33,MIN_REDUCTION+217, // `[
117,MIN_REDUCTION+217, // "["
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 756
2,129, // ws*
33,MIN_REDUCTION+209, // `[
117,MIN_REDUCTION+209, // "["
122,453, // " "
140,303, // {10}
149,83, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 757
0x80000000|195, // match move
0x80000000|294, // no-match move
0x80000000|611, // NT-test-match state for `else
  }
,
{ // state 758
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 759
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 760
122,107, // " "
140,29, // {10}
149,43, // ws
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 761
0x80000000|496, // match move
0x80000000|723, // no-match move
0x80000000|568, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 762
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 763
MIN_REDUCTION+42, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[764][];
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
// <method decl> ::= `public !`void <type> ID <formalList> `{ <stmt>* <returnStmt> `}
(13<<16)+8,
// <method decl> ::= `public !`void <type> ID <formalList> `{ <returnStmt> `}
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
// <type> ::= `void
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
// <stmt> ::= `for `( <assign> `; <exp> `; <assign> `) <stmt>
(35<<16)+9,
// <stmt> ::= `for `( <assign> `; `; <assign> `) <stmt>
(35<<16)+8,
// <stmt> ::= `while `( <exp> `) <stmt>
(35<<16)+5,
// <stmt> ::= `break `;
(35<<16)+2,
// <assign> ::= <exp> `= <exp>
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
(49<<16)+3,
// <case> ::= <stmt>
(49<<16)+1,
// <case> ::= `default `:
(49<<16)+2,
// <exp> ::= <exp8>
(22<<16)+1,
// <exp8> ::= <exp7>
(53<<16)+1,
// <exp7> ::= <exp6>
(54<<16)+1,
// <exp6> ::= <exp5>
(55<<16)+1,
// <exp5> ::= <exp4>
(56<<16)+1,
// <exp4> ::= <exp3>
(57<<16)+1,
// <exp3> ::= <exp2>
(58<<16)+1,
// <exp2> ::= <exp1>
(59<<16)+1,
// <exp8> ::= <exp8> `|| <exp7>
(53<<16)+3,
// <exp7> ::= <exp7> `&& <exp6>
(54<<16)+3,
// <exp6> ::= <exp6> `== <exp5>
(55<<16)+3,
// <exp6> ::= <exp6> `!= <exp5>
(55<<16)+3,
// <exp5> ::= <exp5> `< <exp4>
(56<<16)+3,
// <exp5> ::= <exp5> `<= <exp4>
(56<<16)+3,
// <exp5> ::= <exp5> `> <exp4>
(56<<16)+3,
// <exp4> ::= <exp4> `+ <exp3>
(57<<16)+3,
// <exp4> ::= <exp4> `- <exp3>
(57<<16)+3,
// <exp3> ::= <exp3> `* <exp2>
(58<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(58<<16)+3,
// <exp3> ::= <exp3> `% <exp2>
(58<<16)+3,
// <exp2> ::= `( <type> `) <exp1>
(59<<16)+4,
// <exp2> ::= `+ <exp1>
(59<<16)+2,
// <exp2> ::= `- <exp1>
(59<<16)+2,
// <exp2> ::= `! <exp1>
(59<<16)+2,
// <exp1> ::= ID
(60<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(60<<16)+4,
// <exp1> ::= INTLIT
(60<<16)+1,
// <exp1> ::= STRINGLIT
(60<<16)+1,
// <exp1> ::= CHARLIT
(60<<16)+1,
// <exp1> ::= <exp1> `. ID
(60<<16)+3,
// <exp1> ::= `this
(60<<16)+1,
// <exp1> ::= `true
(60<<16)+1,
// <exp1> ::= `false
(60<<16)+1,
// <exp1> ::= `null
(60<<16)+1,
// <exp1> ::= `new ID `( `)
(60<<16)+4,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] <empty bracket pair>**
(60<<16)+6,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] !<empty bracket pair>
(60<<16)+5,
// <expList> ::= <exp> <next exp>*
(83<<16)+2,
// <expList> ::= <exp>
(83<<16)+1,
// <next exp> ::= `, <exp>
(85<<16)+2,
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
(87<<16)+1,
// letter128 ::= {193..218 225..250}
(108<<16)+1,
// digit ::= {"0".."9"}
(111<<16)+1,
// digit128 ::= {176..185}
(114<<16)+1,
// any ::= {0..127}
(116<<16)+1,
// any128 ::= {128..255}
(146<<16)+1,
// ws ::= " "
(149<<16)+1,
// ws ::= {10}
(149<<16)+1,
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
(42<<16)+4,
// `while ::= "#" "w" "h"
(42<<16)+3,
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
(43<<16)+4,
// `break ::= "#" "b" "r"
(43<<16)+3,
// `this ::= "#" "t" "h" ws*
(78<<16)+4,
// `this ::= "#" "t" "h"
(78<<16)+3,
// `false ::= "#" "f" "a" ws*
(80<<16)+4,
// `false ::= "#" "f" "a"
(80<<16)+3,
// `true ::= "#" "t" "r" ws*
(79<<16)+4,
// `true ::= "#" "t" "r"
(79<<16)+3,
// `super ::= "#" "s" "u" ws*
(86<<16)+4,
// `super ::= "#" "s" "u"
(86<<16)+3,
// `null ::= "#" "n" "u" ws*
(31<<16)+4,
// `null ::= "#" "n" "u"
(31<<16)+3,
// `return ::= "#" "r" "e" ws*
(21<<16)+4,
// `return ::= "#" "r" "e"
(21<<16)+3,
// `new ::= "#" "n" "e" ws*
(81<<16)+4,
// `new ::= "#" "n" "e"
(81<<16)+3,
// `case ::= "#" "c" "e" ws*
(50<<16)+4,
// `case ::= "#" "c" "e"
(50<<16)+3,
// `default ::= "#" "d" "e" ws*
(52<<16)+4,
// `default ::= "#" "d" "e"
(52<<16)+3,
// `public ::= "#" "p" "u" ws*
(15<<16)+4,
// `public ::= "#" "p" "u"
(15<<16)+3,
// `switch ::= "#" "s" "w" ws*
(47<<16)+4,
// `switch ::= "#" "s" "w"
(47<<16)+3,
// `! ::= "!" ws*
(73<<16)+2,
// `! ::= "!"
(73<<16)+1,
// `!= ::= "@" "!" ws*
(64<<16)+3,
// `!= ::= "@" "!"
(64<<16)+2,
// `% ::= "%" ws*
(72<<16)+2,
// `% ::= "%"
(72<<16)+1,
// `&& ::= "@" "&" ws*
(62<<16)+3,
// `&& ::= "@" "&"
(62<<16)+2,
// `* ::= "*" ws*
(70<<16)+2,
// `* ::= "*"
(70<<16)+1,
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
(69<<16)+2,
// `- ::= "-"
(69<<16)+1,
// `+ ::= "+" ws*
(68<<16)+2,
// `+ ::= "+"
(68<<16)+1,
// `= ::= "=" ws*
(44<<16)+2,
// `= ::= "="
(44<<16)+1,
// `== ::= "@" "=" ws*
(63<<16)+3,
// `== ::= "@" "="
(63<<16)+2,
// `[ ::= "[" ws*
(33<<16)+2,
// `[ ::= "["
(33<<16)+1,
// `] ::= "]" ws*
(34<<16)+2,
// `] ::= "]"
(34<<16)+1,
// `|| ::= "@" "|" ws*
(61<<16)+3,
// `|| ::= "@" "|"
(61<<16)+2,
// `< ::= "<" ws*
(65<<16)+2,
// `< ::= "<"
(65<<16)+1,
// `<= ::= "@" "<" ws*
(66<<16)+3,
// `<= ::= "@" "<"
(66<<16)+2,
// `, ::= "," ws*
(28<<16)+2,
// `, ::= ","
(28<<16)+1,
// `> ::= ">" !"=" ws*
(67<<16)+2,
// `> ::= ">" !"="
(67<<16)+1,
// `: ::= ":" ws*
(51<<16)+2,
// `: ::= ":"
(51<<16)+1,
// `. ::= "." ws*
(77<<16)+2,
// `. ::= "."
(77<<16)+1,
// `; ::= ";" ws*
(23<<16)+2,
// `; ::= ";"
(23<<16)+1,
// `++ ::= "@" "+" ws*
(45<<16)+3,
// `++ ::= "@" "+"
(45<<16)+2,
// `-- ::= "@" "-" ws*
(46<<16)+3,
// `-- ::= "@" "-"
(46<<16)+2,
// `/ ::= "/" ws*
(71<<16)+2,
// `/ ::= "/"
(71<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(74<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(74<<16)+2,
// INTLIT ::= digit128 ws*
(74<<16)+2,
// INTLIT ::= digit128
(74<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(74<<16)+3,
// INTLIT ::= "0" $$2
(74<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(75<<16)+3,
// STRINGLIT ::= "@" '"'
(75<<16)+2,
// STRINGLIT ::= '"' any* $$3
(75<<16)+3,
// STRINGLIT ::= '"' $$3
(75<<16)+2,
// CHARLIT ::= "'" any ws*
(76<<16)+3,
// CHARLIT ::= "'" any
(76<<16)+2,
// idChar ::= letter
(158<<16)+1,
// idChar ::= digit
(158<<16)+1,
// idChar ::= "_"
(158<<16)+1,
// idChar128 ::= letter128
(159<<16)+1,
// idChar128 ::= digit128
(159<<16)+1,
// idChar128 ::= {223}
(159<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(160<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(161<<16)+1,
// digit* ::= digit* digit
(152<<16)+2,
// digit* ::= digit
(152<<16)+1,
// <next exp>* ::= <next exp>* <next exp>
(84<<16)+2,
// <next exp>* ::= <next exp>
(84<<16)+1,
// any* ::= any* any
(156<<16)+2,
// any* ::= any
(156<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// <listElement>* ::= <listElement>* <listElement>
(25<<16)+2,
// <listElement>* ::= <listElement>
(25<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(154<<16)+2,
// hexDigit* ::= hexDigit
(154<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// <case>* ::= <case>* <case>
(48<<16)+2,
// <case>* ::= <case>
(48<<16)+1,
// idChar* ::= idChar* idChar
(150<<16)+2,
// idChar* ::= idChar
(150<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>
(82<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>
(162<<16)+2,
// <empty bracket pair>* ::= <empty bracket pair>
(162<<16)+1,
// $$0 ::= idChar128 ws*
(151<<16)+2,
// $$0 ::= idChar128
(151<<16)+1,
// $$1 ::= digit128 ws*
(153<<16)+2,
// $$1 ::= digit128
(153<<16)+1,
// $$2 ::= hexDigit128 ws*
(155<<16)+2,
// $$2 ::= hexDigit128
(155<<16)+1,
// $$3 ::= any128 ws*
(157<<16)+2,
// $$3 ::= any128
(157<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
120, // 0
120, // 1
120, // 2
120, // 3
120, // 4
120, // 5
120, // 6
120, // 7
120, // 8
120, // 9
140, // 10
120, // 11
120, // 12
120, // 13
120, // 14
120, // 15
120, // 16
120, // 17
120, // 18
120, // 19
120, // 20
120, // 21
120, // 22
120, // 23
120, // 24
120, // 25
120, // 26
120, // 27
120, // 28
120, // 29
120, // 30
120, // 31
122, // " "
142, // "!"
144, // '"'
123, // "#"
120, // "$"
132, // "%"
124, // "&"
143, // "'"
133, // "("
125, // ")"
145, // "*"
134, // "+"
126, // ","
118, // "-"
135, // "."
128, // "/"
113, // "0"
112, // "1"
112, // "2"
112, // "3"
112, // "4"
112, // "5"
112, // "6"
112, // "7"
112, // "8"
112, // "9"
137, // ":"
129, // ";"
119, // "<"
138, // "="
130, // ">"
120, // "?"
139, // "@"
94, // "A"
94, // "B"
94, // "C"
94, // "D"
94, // "E"
94, // "F"
94, // "G"
94, // "H"
94, // "I"
94, // "J"
94, // "K"
94, // "L"
94, // "M"
94, // "N"
94, // "O"
94, // "P"
94, // "Q"
94, // "R"
94, // "S"
94, // "T"
94, // "U"
94, // "V"
94, // "W"
94, // "X"
94, // "Y"
94, // "Z"
117, // "["
120, // "\"
127, // "]"
120, // "^"
136, // "_"
120, // "`"
88, // "a"
102, // "b"
93, // "c"
89, // "d"
103, // "e"
95, // "f"
94, // "g"
104, // "h"
96, // "i"
94, // "j"
94, // "k"
97, // "l"
94, // "m"
105, // "n"
98, // "o"
90, // "p"
94, // "q"
99, // "r"
91, // "s"
106, // "t"
100, // "u"
92, // "v"
107, // "w"
101, // "x"
94, // "y"
94, // "z"
131, // "{"
121, // "|"
141, // "}"
120, // "~"
120, // 127
148, // 128
148, // 129
148, // 130
148, // 131
148, // 132
148, // 133
148, // 134
148, // 135
148, // 136
148, // 137
148, // 138
148, // 139
148, // 140
148, // 141
148, // 142
148, // 143
148, // 144
148, // 145
148, // 146
148, // 147
148, // 148
148, // 149
148, // 150
148, // 151
148, // 152
148, // 153
148, // 154
148, // 155
148, // 156
148, // 157
148, // 158
148, // 159
148, // 160
148, // 161
148, // 162
148, // 163
148, // 164
148, // 165
148, // 166
148, // 167
148, // 168
148, // 169
148, // 170
148, // 171
148, // 172
148, // 173
148, // 174
148, // 175
115, // 176
115, // 177
115, // 178
115, // 179
115, // 180
115, // 181
115, // 182
115, // 183
115, // 184
115, // 185
148, // 186
148, // 187
148, // 188
148, // 189
148, // 190
148, // 191
148, // 192
110, // 193
110, // 194
110, // 195
110, // 196
110, // 197
110, // 198
109, // 199
109, // 200
109, // 201
109, // 202
109, // 203
109, // 204
109, // 205
109, // 206
109, // 207
109, // 208
109, // 209
109, // 210
109, // 211
109, // 212
109, // 213
109, // 214
109, // 215
109, // 216
109, // 217
109, // 218
148, // 219
148, // 220
148, // 221
148, // 222
147, // 223
148, // 224
110, // 225
110, // 226
110, // 227
110, // 228
110, // 229
110, // 230
109, // 231
109, // 232
109, // 233
109, // 234
109, // 235
109, // 236
109, // 237
109, // 238
109, // 239
109, // 240
109, // 241
109, // 242
109, // 243
109, // 244
109, // 245
109, // 246
109, // 247
109, // 248
109, // 249
109, // 250
148, // 251
148, // 252
148, // 253
148, // 254
148, // 255
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
"<method decl> ::= `public !`void <type> # ID <formalList> `{ <stmt>* <returnStmt> `}", // 12
"<method decl> ::= `public !`void <type> # ID <formalList> `{ <stmt>* <returnStmt> `}", // 13
"<returnStmt> ::= `return <exp> `;", // 14
"<formalList> ::= `( <type> # ID <listElement>* `)", // 15
"<formalList> ::= `( <type> # ID <listElement>* `)", // 16
"<formalList> ::= `( `)", // 17
"<listElement> ::= `, <type> # ID", // 18
"<type> ::= # `int", // 19
"<type> ::= # `boolean", // 20
"<type> ::= # `void", // 21
"<type> ::= # `null", // 22
"<type> ::= # ID", // 23
"<type> ::= # <type> <empty bracket pair>", // 24
"<empty bracket pair> ::= `[ `]", // 25
"<stmt> ::= # `{ <stmt>* `}", // 26
"<stmt> ::= # `{ <stmt>* `}", // 27
"<stmt> ::= <assign> `;", // 28
"<stmt> ::= <local var decl> `;", // 29
"<stmt> ::= # <methodCall> `;", // 30
"<stmt> ::= # `if `( <exp> `) <stmt> # !`else", // 31
"<stmt> ::= # `if `( <exp> `) <stmt> # `else <stmt>", // 32
"<stmt> ::= # `for `( <assign> `; <exp> `; <assign> `) <stmt>", // 33
"<stmt> ::= # `for `( <assign> `; `; <assign> `) <stmt>", // 34
"<stmt> ::= # `while `( <exp> `) <stmt>", // 35
"<stmt> ::= # `break `;", // 36
"<assign> ::= <exp> # `= <exp>", // 37
"<assign> ::= # ID `++", // 38
"<assign> ::= # `++ ID", // 39
"<assign> ::= # ID `--", // 40
"<assign> ::= # `-- ID", // 41
"<local var decl> ::= <type> # ID `= <exp>", // 42
"<inst var decl> ::= <type> # ID `;", // 43
"<stmt> ::= # `;", // 44
"<stmt> ::= # `switch `( <exp> `) `{ <case>* `}", // 45
"<stmt> ::= # `switch `( <exp> `) `{ <case>* `}", // 46
"<case> ::= `case # <exp> `:", // 47
"<case> ::= <stmt>", // 48
"<case> ::= # `default `:", // 49
"<exp> ::= <exp8>", // 50
"<exp8> ::= <exp7>", // 51
"<exp7> ::= <exp6>", // 52
"<exp6> ::= <exp5>", // 53
"<exp5> ::= <exp4>", // 54
"<exp4> ::= <exp3>", // 55
"<exp3> ::= <exp2>", // 56
"<exp2> ::= <exp1>", // 57
"<exp8> ::= <exp8> # `|| <exp7>", // 58
"<exp7> ::= <exp7> # `&& <exp6>", // 59
"<exp6> ::= <exp6> # `== <exp5>", // 60
"<exp6> ::= <exp6> # `!= <exp5>", // 61
"<exp5> ::= <exp5> # `< <exp4>", // 62
"<exp5> ::= <exp5> # `<= <exp4>", // 63
"<exp5> ::= <exp5> # `> <exp4>", // 64
"<exp4> ::= <exp4> # `+ <exp3>", // 65
"<exp4> ::= <exp4> # `- <exp3>", // 66
"<exp3> ::= <exp3> # `* <exp2>", // 67
"<exp3> ::= <exp3> # `/ <exp2>", // 68
"<exp3> ::= <exp3> # `% <exp2>", // 69
"<exp2> ::= # `( <type> `) <exp1>", // 70
"<exp2> ::= # `+ <exp1>", // 71
"<exp2> ::= # `- <exp1>", // 72
"<exp2> ::= # `! <exp1>", // 73
"<exp1> ::= # ID", // 74
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 75
"<exp1> ::= # INTLIT", // 76
"<exp1> ::= # STRINGLIT", // 77
"<exp1> ::= # CHARLIT", // 78
"<exp1> ::= <exp1> `. # ID", // 79
"<exp1> ::= # `this", // 80
"<exp1> ::= # `true", // 81
"<exp1> ::= # `false", // 82
"<exp1> ::= # `null", // 83
"<exp1> ::= # `new # ID `( `)", // 84
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 85
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 86
"<expList> ::= <exp> <next exp>*", // 87
"<expList> ::= <exp> <next exp>*", // 88
"<next exp> ::= `, <exp>", // 89
"<methodCall> ::= # <exp1> `. ID `( <expList> `)", // 90
"<methodCall> ::= # <exp1> `. ID `( <expList> `)", // 91
"<methodCall> ::= # `super `. # ID `( <expList> `)", // 92
"<methodCall> ::= # `super `. # ID `( <expList> `)", // 93
"<methodCall> ::= # ID `( <expList> `)", // 94
"<methodCall> ::= # ID `( <expList> `)", // 95
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 96
"letter128 ::= {193..218 225..250}", // 97
"digit ::= {\"0\"..\"9\"}", // 98
"digit128 ::= {176..185}", // 99
"any ::= {0..127}", // 100
"any128 ::= {128..255}", // 101
"ws ::= \" \"", // 102
"ws ::= {10} registerNewline", // 103
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 104
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 105
"`class ::= \"#\" \"c\" \"l\" ws*", // 106
"`class ::= \"#\" \"c\" \"l\" ws*", // 107
"`extends ::= \"#\" \"e\" \"x\" ws*", // 108
"`extends ::= \"#\" \"e\" \"x\" ws*", // 109
"`void ::= \"#\" \"v\" \"o\" ws*", // 110
"`void ::= \"#\" \"v\" \"o\" ws*", // 111
"`int ::= \"#\" \"i\" \"t\" ws*", // 112
"`int ::= \"#\" \"i\" \"t\" ws*", // 113
"`while ::= \"#\" \"w\" \"h\" ws*", // 114
"`while ::= \"#\" \"w\" \"h\" ws*", // 115
"`if ::= \"#\" \"+\" ws*", // 116
"`if ::= \"#\" \"+\" ws*", // 117
"`else ::= \"#\" \"e\" \"l\" ws*", // 118
"`else ::= \"#\" \"e\" \"l\" ws*", // 119
"`for ::= \"#\" \"f\" \"o\" ws*", // 120
"`for ::= \"#\" \"f\" \"o\" ws*", // 121
"`break ::= \"#\" \"b\" \"r\" ws*", // 122
"`break ::= \"#\" \"b\" \"r\" ws*", // 123
"`this ::= \"#\" \"t\" \"h\" ws*", // 124
"`this ::= \"#\" \"t\" \"h\" ws*", // 125
"`false ::= \"#\" \"f\" \"a\" ws*", // 126
"`false ::= \"#\" \"f\" \"a\" ws*", // 127
"`true ::= \"#\" \"t\" \"r\" ws*", // 128
"`true ::= \"#\" \"t\" \"r\" ws*", // 129
"`super ::= \"#\" \"s\" \"u\" ws*", // 130
"`super ::= \"#\" \"s\" \"u\" ws*", // 131
"`null ::= \"#\" \"n\" \"u\" ws*", // 132
"`null ::= \"#\" \"n\" \"u\" ws*", // 133
"`return ::= \"#\" \"r\" \"e\" ws*", // 134
"`return ::= \"#\" \"r\" \"e\" ws*", // 135
"`new ::= \"#\" \"n\" \"e\" ws*", // 136
"`new ::= \"#\" \"n\" \"e\" ws*", // 137
"`case ::= \"#\" \"c\" \"e\" ws*", // 138
"`case ::= \"#\" \"c\" \"e\" ws*", // 139
"`default ::= \"#\" \"d\" \"e\" ws*", // 140
"`default ::= \"#\" \"d\" \"e\" ws*", // 141
"`public ::= \"#\" \"p\" \"u\" ws*", // 142
"`public ::= \"#\" \"p\" \"u\" ws*", // 143
"`switch ::= \"#\" \"s\" \"w\" ws*", // 144
"`switch ::= \"#\" \"s\" \"w\" ws*", // 145
"`! ::= \"!\" ws*", // 146
"`! ::= \"!\" ws*", // 147
"`!= ::= \"@\" \"!\" ws*", // 148
"`!= ::= \"@\" \"!\" ws*", // 149
"`% ::= \"%\" ws*", // 150
"`% ::= \"%\" ws*", // 151
"`&& ::= \"@\" \"&\" ws*", // 152
"`&& ::= \"@\" \"&\" ws*", // 153
"`* ::= \"*\" ws*", // 154
"`* ::= \"*\" ws*", // 155
"`( ::= \"(\" ws*", // 156
"`( ::= \"(\" ws*", // 157
"`) ::= \")\" ws*", // 158
"`) ::= \")\" ws*", // 159
"`{ ::= \"{\" ws*", // 160
"`{ ::= \"{\" ws*", // 161
"`} ::= \"}\" ws*", // 162
"`} ::= \"}\" ws*", // 163
"`- ::= \"-\" ws*", // 164
"`- ::= \"-\" ws*", // 165
"`+ ::= \"+\" ws*", // 166
"`+ ::= \"+\" ws*", // 167
"`= ::= \"=\" ws*", // 168
"`= ::= \"=\" ws*", // 169
"`== ::= \"@\" \"=\" ws*", // 170
"`== ::= \"@\" \"=\" ws*", // 171
"`[ ::= \"[\" ws*", // 172
"`[ ::= \"[\" ws*", // 173
"`] ::= \"]\" ws*", // 174
"`] ::= \"]\" ws*", // 175
"`|| ::= \"@\" \"|\" ws*", // 176
"`|| ::= \"@\" \"|\" ws*", // 177
"`< ::= \"<\" ws*", // 178
"`< ::= \"<\" ws*", // 179
"`<= ::= \"@\" \"<\" ws*", // 180
"`<= ::= \"@\" \"<\" ws*", // 181
"`, ::= \",\" ws*", // 182
"`, ::= \",\" ws*", // 183
"`> ::= \">\" !\"=\" ws*", // 184
"`> ::= \">\" !\"=\" ws*", // 185
"`: ::= \":\" ws*", // 186
"`: ::= \":\" ws*", // 187
"`. ::= \".\" ws*", // 188
"`. ::= \".\" ws*", // 189
"`; ::= \";\" ws*", // 190
"`; ::= \";\" ws*", // 191
"`++ ::= \"@\" \"+\" ws*", // 192
"`++ ::= \"@\" \"+\" ws*", // 193
"`-- ::= \"@\" \"-\" ws*", // 194
"`-- ::= \"@\" \"-\" ws*", // 195
"`/ ::= \"/\" ws*", // 196
"`/ ::= \"/\" ws*", // 197
"ID ::= letter128 ws*", // 198
"ID ::= letter128 ws*", // 199
"ID ::= letter idChar* idChar128 ws*", // 200
"ID ::= letter idChar* idChar128 ws*", // 201
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 202
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 203
"INTLIT ::= digit128 ws*", // 204
"INTLIT ::= digit128 ws*", // 205
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 206
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 207
"STRINGLIT ::= \"@\" \'\"\' ws*", // 208
"STRINGLIT ::= \"@\" \'\"\' ws*", // 209
"STRINGLIT ::= \'\"\' any* any128 ws*", // 210
"STRINGLIT ::= \'\"\' any* any128 ws*", // 211
"CHARLIT ::= \"\'\" any ws*", // 212
"CHARLIT ::= \"\'\" any ws*", // 213
"idChar ::= letter", // 214
"idChar ::= digit", // 215
"idChar ::= \"_\"", // 216
"idChar128 ::= letter128", // 217
"idChar128 ::= digit128", // 218
"idChar128 ::= {223}", // 219
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 220
"hexDigit128 ::= {176..185 193..198 225..230}", // 221
"digit* ::= digit* digit", // 222
"digit* ::= digit* digit", // 223
"<next exp>* ::= <next exp>* <next exp>", // 224
"<next exp>* ::= <next exp>* <next exp>", // 225
"any* ::= any* any", // 226
"any* ::= any* any", // 227
"<decl in class>* ::= <decl in class>* <decl in class>", // 228
"<decl in class>* ::= <decl in class>* <decl in class>", // 229
"<listElement>* ::= <listElement>* <listElement>", // 230
"<listElement>* ::= <listElement>* <listElement>", // 231
"hexDigit* ::= hexDigit* hexDigit", // 232
"hexDigit* ::= hexDigit* hexDigit", // 233
"<stmt>* ::= <stmt>* <stmt>", // 234
"<stmt>* ::= <stmt>* <stmt>", // 235
"<case>* ::= <case>* <case>", // 236
"<case>* ::= <case>* <case>", // 237
"idChar* ::= idChar* idChar", // 238
"idChar* ::= idChar* idChar", // 239
"<class decl>+ ::= <class decl>", // 240
"<class decl>+ ::= <class decl>+ <class decl>", // 241
"<empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>", // 242
"ws* ::= ws* ws", // 243
"ws* ::= ws* ws", // 244
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 245
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 246
"", // 247
"", // 248
"", // 249
"", // 250
"", // 251
"", // 252
"", // 253
"", // 254
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
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
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 7: <class decl> ::= `class [#] ID `extends ID `{ [<decl in class>*] `} @createdExtendsClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
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
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 11: <method decl> ::= `public `void [#] ID <formalList> `{ [<stmt>*] `} @createMethodDeclVoid(int,String,VarDeclList,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 12: <method decl> ::= `public !`void <type> [#] ID <formalList> `{ <stmt>* <returnStmt> `} @createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Statement>,Exp)=>Decl
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
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 13: <method decl> ::= `public !`void <type> [#] ID <formalList> `{ [<stmt>*] <returnStmt> `} @createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
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
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 16: <formalList> ::= `( <type> [#] ID [<listElement>*] `) @createVarDeclList(Type,int,String,List<VarDecl>)=>VarDeclList
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
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
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 19: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 20: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 21: <type> ::= [#] `void @voidType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 22: <type> ::= [#] `null @nullType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 23: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 24: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 25: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 26: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 27: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 28: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 30: <stmt> ::= [#] <methodCall> `; @newExpStatement(int,Call)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 31: <stmt> ::= [#] `if `( <exp> `) <stmt> !`else [#] @newIfOnlyBlock(int,Exp,Statement,int)=>Statement
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 32: <stmt> ::= [#] `if `( <exp> `) <stmt> [#] `else <stmt> @newIfElseBlock(int,Exp,Statement,int,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 33: <stmt> ::= [#] `for `( <assign> `; <exp> `; <assign> `) <stmt> @newForLoop(int,Statement,Exp,Statement,Statement)=>Statement
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
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 34: <stmt> ::= [#] `for `( <assign> `; `; <assign> `) <stmt> @newTrueForLoop(int,Statement,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 35: <stmt> ::= [#] `while `( <exp> `) <stmt> @newWhileBlock(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 36: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 37: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 38: <assign> ::= [#] ID `++ @assignPlusPlus(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 39: <assign> ::= [#] `++ ID @assignPlusPlusLeft(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 40: <assign> ::= [#] ID `-- @assignMinusMinus(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 41: <assign> ::= [#] `-- ID @assignMinusMinusLeft(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 42: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 43: <inst var decl> ::= <type> [#] ID `; @instanceVarDecl(Type,int,String)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 44: <stmt> ::= [#] `; @newEmptyStmt(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 45: <stmt> ::= [#] `switch `( <exp> `) `{ <case>* `} @newSwitch(int,Exp,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 46: <stmt> ::= [#] `switch `( <exp> `) `{ [<case>*] `} @newSwitch(int,Exp,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 47: <case> ::= `case [#] <exp> `: @newCase(int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 48: <case> ::= <stmt> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 49: <case> ::= [#] `default `: @newDefault(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 50: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 51: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 52: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 53: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 54: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 55: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 56: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 57: <exp2> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 58: <exp8> ::= <exp8> [#] `|| <exp7> @newOr(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 59: <exp7> ::= <exp7> [#] `&& <exp6> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 60: <exp6> ::= <exp6> [#] `== <exp5> @newDoubleEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 61: <exp6> ::= <exp6> [#] `!= <exp5> @newNotEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 62: <exp5> ::= <exp5> [#] `< <exp4> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 63: <exp5> ::= <exp5> [#] `<= <exp4> @newLessThanEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 64: <exp5> ::= <exp5> [#] `> <exp4> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 65: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 66: <exp4> ::= <exp4> [#] `- <exp3> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 67: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 68: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 69: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 70: <exp2> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 71: <exp2> ::= [#] `+ <exp1> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 72: <exp2> ::= [#] `- <exp1> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 73: <exp2> ::= [#] `! <exp1> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 74: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 75: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 76: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 77: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 78: <exp1> ::= [#] CHARLIT @newCharLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 79: <exp1> ::= <exp1> `. [#] ID @newInstVarAccess(Exp,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 80: <exp1> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 81: <exp1> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 82: <exp1> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 83: <exp1> ::= [#] `null @newNullExp(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 84: <exp1> ::= [#] `new [#] ID `( `) @newObject(int,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 85: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] <empty bracket pair>** @newArray(Type,int,Exp,List<Object>)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 86: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] !<empty bracket pair> [<empty bracket pair>**] @newArray(Type,int,Exp,List<Object>)=>Exp
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 87: <expList> ::= <exp> <next exp>* @newExpList(Exp,List<Exp>)=>ExpList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 88: <expList> ::= <exp> [<next exp>*] @newExpList(Exp,List<Exp>)=>ExpList
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 89: <next exp> ::= `, <exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 90: <methodCall> ::= [#] <exp1> `. ID `( <expList> `) @newMethodCall(int,Exp,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 91: <methodCall> ::= [#] <exp1> `. ID `( [<expList>] `) @newMethodCall(int,Exp,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 92: <methodCall> ::= [#] `super `. [#] ID `( <expList> `) @newSuperMethodCall(int,int,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 93: <methodCall> ::= [#] `super `. [#] ID `( [<expList>] `) @newSuperMethodCall(int,int,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 94: <methodCall> ::= [#] ID `( <expList> `) @newThisMethodCall(int,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 95: <methodCall> ::= [#] ID `( [<expList>] `) @newThisMethodCall(int,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 96: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 97: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 98: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 99: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 100: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 101: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 102: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 103: ws ::= {10} [registerNewline] @void
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 104: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 105: `boolean ::= "#" "b" "o" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 106: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 107: `class ::= "#" "c" "l" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 108: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 109: `extends ::= "#" "e" "x" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 110: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 111: `void ::= "#" "v" "o" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 112: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 113: `int ::= "#" "i" "t" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 114: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 115: `while ::= "#" "w" "h" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 116: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 117: `if ::= "#" "+" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 118: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 119: `else ::= "#" "e" "l" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 120: `for ::= "#" "f" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 121: `for ::= "#" "f" "o" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 122: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 123: `break ::= "#" "b" "r" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 124: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 125: `this ::= "#" "t" "h" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 126: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 127: `false ::= "#" "f" "a" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 128: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 129: `true ::= "#" "t" "r" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 130: `super ::= "#" "s" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 131: `super ::= "#" "s" "u" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 132: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 133: `null ::= "#" "n" "u" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 134: `return ::= "#" "r" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 135: `return ::= "#" "r" "e" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 136: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 137: `new ::= "#" "n" "e" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 138: `case ::= "#" "c" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 139: `case ::= "#" "c" "e" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 140: `default ::= "#" "d" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 141: `default ::= "#" "d" "e" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 142: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 143: `public ::= "#" "p" "u" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 144: `switch ::= "#" "s" "w" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 145: `switch ::= "#" "s" "w" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 146: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `! ::= "!" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `!= ::= "@" "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 149: `!= ::= "@" "!" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 150: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `% ::= "%" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 153: `&& ::= "@" "&" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 154: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `* ::= "*" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `( ::= "(" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 159: `) ::= ")" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: `{ ::= "{" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `} ::= "}" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 164: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `- ::= "-" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 166: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 167: `+ ::= "+" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 169: `= ::= "=" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 171: `== ::= "@" "=" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 172: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `[ ::= "[" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 174: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 175: `] ::= "]" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 176: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 177: `|| ::= "@" "|" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 178: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: `< ::= "<" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 180: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 181: `<= ::= "@" "<" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 182: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 183: `, ::= "," [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 184: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 185: `> ::= ">" !"=" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 186: `: ::= ":" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 187: `: ::= ":" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 188: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 189: `. ::= "." [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 190: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 191: `; ::= ";" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 192: `++ ::= "@" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 193: `++ ::= "@" "+" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 194: `-- ::= "@" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 195: `-- ::= "@" "-" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 196: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 197: `/ ::= "/" [ws*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 198: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 199: ID ::= letter128 [ws*] @text
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 200: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 201: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 202: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 203: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 204: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 205: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 206: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 207: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 208: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 209: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 210: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 211: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 212: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 213: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 214: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 215: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 216: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 217: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 218: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 219: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 220: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 221: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 222: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 223: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 224: <next exp>* ::= <next exp>* <next exp> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 225: <next exp>* ::= [<next exp>*] <next exp> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 226: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 227: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 228: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 229: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 230: <listElement>* ::= <listElement>* <listElement> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 231: <listElement>* ::= [<listElement>*] <listElement> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 232: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 233: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 234: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 235: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 236: <case>* ::= <case>* <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 237: <case>* ::= [<case>*] <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 238: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 239: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 240: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 241: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 242: <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 243: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 244: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // 245: <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 246: <empty bracket pair>* ::= [<empty bracket pair>*] <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 247: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 248: $$0 ::= idChar128 [ws*] @pass
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 249: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 250: $$1 ::= digit128 [ws*] @pass
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 251: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 252: $$2 ::= hexDigit128 [ws*] @pass
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 253: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 254: $$3 ::= any128 [ws*] @pass
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "<case>* ::=", // <case>*
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
    { // <expList>
      ((74<<5)|0x5)/*methodCall:74*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <listElement>*
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
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((75<<5)|0x5)/*methodCall:75*/,
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
      Type result = actionObject.voidType(parm0);
      si.pushPb(result);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.nullType(parm0);
      si.pushPb(result);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      Call parm1 = (Call)si.popPb();
      Statement result = actionObject.newExpStatement(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      int parm3 = (Integer)si.popPb();
      Statement result = actionObject.newIfOnlyBlock(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      int parm3 = (Integer)si.popPb();
      Statement parm4 = (Statement)si.popPb();
      Statement result = actionObject.newIfElseBlock(parm0,parm1,parm2,parm3,parm4);
      si.pushPb(result);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      Statement parm1 = (Statement)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement parm4 = (Statement)si.popPb();
      Statement result = actionObject.newForLoop(parm0,parm1,parm2,parm3,parm4);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      Statement parm1 = (Statement)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement result = actionObject.newTrueForLoop(parm0,parm1,parm2,parm3);
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
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignPlusPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignPlusPlusLeft(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignMinusMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignMinusMinusLeft(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 28: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 29: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Decl result = actionObject.instanceVarDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 30: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newEmptyStmt(parm0);
      si.pushPb(result);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Statement result = actionObject.newSwitch(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement result = actionObject.newCase(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newDefault(parm0);
      si.pushPb(result);
    }
    break;
    case 34: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newOr(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 35: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 36: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDoubleEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 37: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newNotEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 38: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 39: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThanEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 40: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 41: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 42: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 43: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 44: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 45: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 51: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 55: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstVarAccess(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 56: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 57: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 58: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 59: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNullExp(parm0);
      si.pushPb(result);
    }
    break;
    case 60: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newObject(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 61: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      List<Object> parm3 = (List<Object>)si.popPb();
      Exp result = actionObject.newArray(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 62: {
      Exp parm0 = (Exp)si.popPb();
      List<Exp> parm1 = (List<Exp>)si.popPb();
      ExpList result = actionObject.newExpList(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 63: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      String parm2 = (String)si.popPb();
      ExpList parm3 = (ExpList)si.popPb();
      Call result = actionObject.newMethodCall(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 64: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      ExpList parm3 = (ExpList)si.popPb();
      Call result = actionObject.newSuperMethodCall(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 65: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      ExpList parm2 = (ExpList)si.popPb();
      Call result = actionObject.newThisMethodCall(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 66: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 67: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 68: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 69: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 70: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 71: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 72: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 73: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 74: {
      ExpList result = actionObject.newEmptyExpList();
      si.pushPb(result);
    }
    break;
    case 75: {
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
"Type voidType(int)",
"Type nullType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"Statement newBlock(int,List<Statement>)",
"Statement newExpStatement(int,Call)",
"Statement newIfOnlyBlock(int,Exp,Statement,int)",
"Statement newIfElseBlock(int,Exp,Statement,int,Statement)",
"Statement newForLoop(int,Statement,Exp,Statement,Statement)",
"Statement newTrueForLoop(int,Statement,Statement,Statement)",
"Statement newWhileBlock(int,Exp,Statement)",
"Statement newBreak(int)",
"Statement assign(Exp,int,Exp)",
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
"ExpList newEmptyExpList()",
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
1,1,
2,1,
3,1,
2,1,
2,1,
4,1,
5,1,
5,1,
4,1,
3,1,
1,1,
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
0,1,
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
