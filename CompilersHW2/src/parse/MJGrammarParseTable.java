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
public int getEofSym() { return 168; }
public int getNttSym() { return 169; }
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
public int numSymbols() { return 170;}
private static final int MIN_REDUCTION = 786;
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
1,736, // <start>
2,190, // ws*
3,87, // <program>
4,45, // <class decl>+
5,727, // <class decl>
6,647, // `class
126,440, // " "
127,276, // "#"
144,397, // {10}
153,758, // ws
  }
,
{ // state 1
  }
,
{ // state 2
126,440, // " "
144,397, // {10}
153,410, // ws
169,MIN_REDUCTION+180, // $NT
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 3
0x80000000|578, // match move
0x80000000|517, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 4
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 5
0x80000000|157, // match move
0x80000000|60, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 6
2,16, // ws*
33,MIN_REDUCTION+258, // `[
121,MIN_REDUCTION+258, // "["
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 7
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 8
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 9
2,693, // ws*
  }
,
{ // state 10
24,250, // `(
137,637, // "("
  }
,
{ // state 11
33,MIN_REDUCTION+108, // `[
121,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 12
10,191, // `}
145,490, // "}"
  }
,
{ // state 13
0x80000000|342, // match move
0x80000000|256, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 14
0x80000000|564, // match move
0x80000000|604, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 15
0x80000000|715, // match move
0x80000000|572, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 16
0x80000000|312, // match move
0x80000000|510, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 17
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 18
23,66, // `;
133,417, // ";"
  }
,
{ // state 19
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 20
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 21
0x80000000|774, // match move
0x80000000|168, // no-match move
0x80000000|502, // NT-test-match state for `void
  }
,
{ // state 22
0x80000000|566, // match move
0x80000000|531, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 23
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 24
99,69, // "f"
109,111, // "n"
110,61, // "t"
  }
,
{ // state 25
2,512, // ws*
  }
,
{ // state 26
33,MIN_REDUCTION+83, // `[
121,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 27
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 28
26,233, // `)
129,667, // ")"
  }
,
{ // state 29
24,291, // `(
137,637, // "("
  }
,
{ // state 30
2,666, // ws*
33,MIN_REDUCTION+135, // `[
121,MIN_REDUCTION+135, // "["
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 31
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 32
0x80000000|302, // match move
0x80000000|692, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 33
0x80000000|176, // match move
0x80000000|511, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 34
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 35
33,MIN_REDUCTION+90, // `[
121,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 36
0x80000000|503, // match move
0x80000000|462, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 37
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 38
24,230, // `(
137,637, // "("
  }
,
{ // state 39
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 40
107,442, // "e"
  }
,
{ // state 41
33,MIN_REDUCTION+81, // `[
121,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 42
33,MIN_REDUCTION+214, // `[
121,MIN_REDUCTION+214, // "["
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 43
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 44
0x80000000|646, // match move
0x80000000|783, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 45
5,762, // <class decl>
6,647, // `class
127,276, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 46
0x80000000|243, // match move
0x80000000|645, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 47
2,260, // ws*
33,MIN_REDUCTION+165, // `[
121,MIN_REDUCTION+165, // "["
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 48
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 49
2,615, // ws*
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 50
8,221, // `{
135,555, // "{"
  }
,
{ // state 51
34,MIN_REDUCTION+180, // `]
43,MIN_REDUCTION+180, // $$0
55,MIN_REDUCTION+180, // `:
66,MIN_REDUCTION+180, // `&&
67,MIN_REDUCTION+180, // `==
68,MIN_REDUCTION+180, // `!=
86,MIN_REDUCTION+180, // <empty bracket pair>**
88,MIN_REDUCTION+180, // <next exp>*
89,MIN_REDUCTION+180, // <next exp>
126,624, // " "
130,MIN_REDUCTION+180, // ","
131,MIN_REDUCTION+180, // "]"
141,MIN_REDUCTION+180, // ":"
143,MIN_REDUCTION+180, // "@"
144,538, // {10}
153,129, // ws
167,MIN_REDUCTION+180, // $$5
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 52
2,112, // ws*
33,MIN_REDUCTION+262, // `[
121,MIN_REDUCTION+262, // "["
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 53
2,23, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 54
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 55
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 56
8,612, // `{
135,555, // "{"
  }
,
{ // state 57
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 58
2,48, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 59
33,MIN_REDUCTION+134, // `[
121,MIN_REDUCTION+134, // "["
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 60
2,693, // ws*
33,MIN_REDUCTION+260, // `[
121,MIN_REDUCTION+260, // "["
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 61
103,143, // "r"
108,549, // "h"
  }
,
{ // state 62
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 63
0x80000000|724, // match move
0x80000000|298, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 64
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 65
0x80000000|751, // match move
0x80000000|42, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 66
0x80000000|330, // match move
0x80000000|266, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 67
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 68
0x80000000|382, // match move
0x80000000|358, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 69
92,626, // "a"
  }
,
{ // state 70
7,718, // ID
32,148, // <empty bracket pair>
33,206, // `[
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
121,95, // "["
  }
,
{ // state 71
0x80000000|225, // match move
0x80000000|93, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 72
7,398, // ID
8,489, // `{
10,683, // `}
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,62, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
145,490, // "}"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 73
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 74
7,398, // ID
8,480, // `{
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,675, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,106, // <stmt>
36,152, // <assign>
37,18, // <local var decl>
38,332, // <methodCall>
39,29, // `if
41,10, // `for
46,38, // `while
47,707, // `break
49,525, // `++
50,730, // `--
51,781, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,417, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 75
33,317, // `[
81,553, // `.
121,95, // "["
139,107, // "."
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 76
0x80000000|54, // match move
0x80000000|26, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 77
7,282, // ID
31,3, // `null
64,136, // <exp1>
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
127,24, // "#"
143,482, // "@"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 78
2,515, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 79
23,479, // `;
43,188, // $$0
133,720, // ";"
  }
,
{ // state 80
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 81
24,219, // `(
33,MIN_REDUCTION+80, // `[
49,765, // `++
50,297, // `--
121,MIN_REDUCTION+80, // "["
137,637, // "("
143,557, // "@"
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 82
125,459, // "|"
  }
,
{ // state 83
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 84
96,187, // "v"
100,464, // "i"
106,200, // "b"
109,416, // "n"
  }
,
{ // state 85
100,464, // "i"
106,200, // "b"
109,416, // "n"
  }
,
{ // state 86
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 87
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 88
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 89
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 90
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 91
25,547, // <listElement>*
26,154, // `)
27,413, // <listElement>
28,186, // `,
129,667, // ")"
130,713, // ","
  }
,
{ // state 92
26,77, // `)
32,148, // <empty bracket pair>
33,206, // `[
121,95, // "["
129,667, // ")"
  }
,
{ // state 93
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 94
0x80000000|4, // match move
0x80000000|396, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 95
2,37, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 96
33,MIN_REDUCTION+259, // `[
121,MIN_REDUCTION+259, // "["
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 97
104,431, // "u"
  }
,
{ // state 98
7,135, // ID
22,584, // <exp>
24,284, // `(
26,657, // `)
31,3, // `null
36,251, // <assign>
38,593, // <methodCall>
45,295, // <for3>
49,525, // `++
50,730, // `--
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,105, // "#"
129,667, // ")"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 99
0x80000000|49, // match move
0x80000000|356, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 100
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 101
65,353, // `||
143,82, // "@"
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 102
0x80000000|591, // match move
0x80000000|520, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 103
33,317, // `[
81,553, // `.
121,95, // "["
139,107, // "."
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 104
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 105
95,325, // "s"
99,69, // "f"
109,111, // "n"
110,61, // "t"
  }
,
{ // state 106
0x80000000|283, // match move
0x80000000|7, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 107
2,399, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 108
23,691, // `;
43,694, // $$0
133,720, // ";"
  }
,
{ // state 109
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 111
104,315, // "u"
107,581, // "e"
  }
,
{ // state 112
0x80000000|338, // match move
0x80000000|585, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 113
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 115
7,398, // ID
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,691, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
36,633, // <assign>
37,156, // <local var decl>
38,534, // <methodCall>
42,108, // <for1>
43,163, // $$0
49,525, // `++
50,730, // `--
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,702, // "#"
133,720, // ";"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 116
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 117
33,MIN_REDUCTION+132, // `[
121,MIN_REDUCTION+132, // "["
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 118
102,740, // "o"
  }
,
{ // state 119
2,545, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 120
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 121
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 123
33,MIN_REDUCTION+130, // `[
121,MIN_REDUCTION+130, // "["
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 124
0x80000000|498, // match move
0x80000000|747, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 125
122,674, // "-"
138,470, // "+"
148,596, // '"'
  }
,
{ // state 126
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 127
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 128
96,118, // "v"
100,227, // "i"
106,254, // "b"
109,235, // "n"
  }
,
{ // state 129
0x80000000|159, // match move
0x80000000|301, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 130
8,662, // `{
135,555, // "{"
  }
,
{ // state 131
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 132
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 133
26,710, // `)
129,667, // ")"
  }
,
{ // state 134
0x80000000|565, // match move
0x80000000|35, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 135
0x80000000|1, // match move
0x80000000|81, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 136
0x80000000|255, // match move
0x80000000|599, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 137
2,501, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 138
2,260, // ws*
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 139
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 140
33,MIN_REDUCTION+210, // `[
121,MIN_REDUCTION+210, // "["
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 141
107,742, // "e"
  }
,
{ // state 142
2,355, // ws*
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 143
0x80000000|175, // match move
0x80000000|30, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 144
24,772, // `(
137,637, // "("
  }
,
{ // state 145
0x80000000|677, // match move
0x80000000|478, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 146
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 147
0x80000000|126, // match move
0x80000000|234, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 148
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 149
7,398, // ID
8,489, // `{
10,651, // `}
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,600, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
52,628, // <case>*
53,590, // <case>
54,597, // `case
56,542, // `default
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,445, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
145,490, // "}"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 150
2,666, // ws*
  }
,
{ // state 151
2,347, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 152
23,14, // `;
133,417, // ";"
  }
,
{ // state 153
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 154
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 155
7,282, // ID
31,3, // `null
64,160, // <exp1>
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
127,24, // "#"
143,482, // "@"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 156
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 157
2,693, // ws*
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 158
2,161, // ws*
33,MIN_REDUCTION+181, // `[
66,MIN_REDUCTION+181, // `&&
67,MIN_REDUCTION+181, // `==
68,MIN_REDUCTION+181, // `!=
126,624, // " "
143,MIN_REDUCTION+181, // "@"
144,538, // {10}
153,339, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 160
0x80000000|749, // match move
0x80000000|103, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 161
0x80000000|616, // match move
0x80000000|51, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 162
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 163
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 164
0x80000000|146, // match move
0x80000000|665, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 165
0x80000000|64, // match move
0x80000000|582, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 166
2,512, // ws*
33,MIN_REDUCTION+133, // `[
121,MIN_REDUCTION+133, // "["
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 167
34,145, // `]
131,378, // "]"
  }
,
{ // state 168
126,373, // " "
144,215, // {10}
153,456, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 169
33,MIN_REDUCTION+80, // `[
121,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 170
0x80000000|684, // match move
0x80000000|351, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 171
7,MIN_REDUCTION+22, // ID
33,MIN_REDUCTION+89, // `[
92,MIN_REDUCTION+22, // "a"
93,MIN_REDUCTION+22, // "d"
94,MIN_REDUCTION+22, // "p"
95,MIN_REDUCTION+22, // "s"
96,MIN_REDUCTION+22, // "v"
97,MIN_REDUCTION+22, // "c"
98,MIN_REDUCTION+22, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,MIN_REDUCTION+22, // "f"
100,MIN_REDUCTION+22, // "i"
101,MIN_REDUCTION+22, // "l"
102,MIN_REDUCTION+22, // "o"
103,MIN_REDUCTION+22, // "r"
104,MIN_REDUCTION+22, // "u"
105,MIN_REDUCTION+22, // "x"
106,MIN_REDUCTION+22, // "b"
107,MIN_REDUCTION+22, // "e"
108,MIN_REDUCTION+22, // "h"
109,MIN_REDUCTION+22, // "n"
110,MIN_REDUCTION+22, // "t"
111,MIN_REDUCTION+22, // "w"
113,MIN_REDUCTION+22, // {199..218 231..250}
114,MIN_REDUCTION+22, // {193..198 225..230}
121,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 172
2,390, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 173
2,705, // ws*
33,MIN_REDUCTION+131, // `[
121,MIN_REDUCTION+131, // "["
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 174
0x80000000|737, // match move
0x80000000|561, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 175
2,666, // ws*
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 176
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 177
7,68, // ID
16,735, // `void
19,483, // <type>
29,102, // `int
30,544, // `boolean
31,775, // `null
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
127,128, // "#"
  }
,
{ // state 178
2,22, // ws*
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 180
2,65, // ws*
33,MIN_REDUCTION+215, // `[
121,MIN_REDUCTION+215, // "["
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 181
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 182
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 183
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 184
115,739, // digit
116,183, // {"1".."9"}
117,183, // "0"
118,323, // digit128
119,33, // {176..185}
156,340, // digit*
157,124, // $$2
  }
,
{ // state 185
7,398, // ID
8,480, // `{
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,675, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,304, // <stmt>
36,152, // <assign>
37,18, // <local var decl>
38,332, // <methodCall>
39,29, // `if
41,10, // `for
46,38, // `while
47,707, // `break
49,525, // `++
50,730, // `--
51,781, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,417, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 186
7,761, // ID
16,663, // `void
19,686, // <type>
29,231, // `int
30,86, // `boolean
31,587, // `null
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
127,84, // "#"
  }
,
{ // state 187
102,415, // "o"
  }
,
{ // state 188
0x80000000|181, // match move
0x80000000|122, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 189
7,398, // ID
8,489, // `{
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,345, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 190
3,336, // <program>
4,45, // <class decl>+
5,727, // <class decl>
6,647, // `class
126,440, // " "
127,276, // "#"
144,397, // {10}
153,410, // ws
  }
,
{ // state 191
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 192
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 193
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 194
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 195
7,282, // ID
31,3, // `null
64,679, // <exp1>
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
127,24, // "#"
143,482, // "@"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 196
26,401, // `)
129,667, // ")"
  }
,
{ // state 197
7,282, // ID
22,404, // <exp>
24,284, // `(
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 198
0x80000000|249, // match move
0x80000000|318, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 199
24,115, // `(
137,637, // "("
  }
,
{ // state 200
102,627, // "o"
  }
,
{ // state 201
24,763, // `(
137,637, // "("
  }
,
{ // state 202
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 203
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 204
72,433, // `+
73,209, // `-
122,688, // "-"
138,734, // "+"
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 205
32,319, // <empty bracket pair>
33,167, // `[
86,367, // <empty bracket pair>**
121,95, // "["
166,386, // <empty bracket pair>*
  }
,
{ // state 206
34,460, // `]
131,716, // "]"
  }
,
{ // state 207
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 208
91,509, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,714, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
115,354, // digit
116,183, // {"1".."9"}
117,183, // "0"
118,497, // digit128
119,33, // {176..185}
140,387, // "_"
151,638, // {223}
155,36, // $$1
162,586, // idChar
163,326, // idChar128
  }
,
{ // state 209
7,282, // ID
24,284, // `(
31,3, // `null
62,592, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 210
7,398, // ID
8,480, // `{
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,675, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,620, // <stmt>
36,152, // <assign>
37,18, // <local var decl>
38,332, // <methodCall>
39,29, // `if
41,10, // `for
46,38, // `while
47,707, // `break
49,525, // `++
50,730, // `--
51,781, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,417, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 211
69,362, // `<
70,441, // `<=
71,425, // `>
123,776, // "<"
134,719, // ">"
143,731, // "@"
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 212
26,80, // `)
129,667, // ")"
  }
,
{ // state 213
126,MIN_REDUCTION+250, // " "
144,MIN_REDUCTION+250, // {10}
153,MIN_REDUCTION+250, // ws
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 214
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 215
0x80000000|88, // match move
0x80000000|573, // no-match move
0x80000000|502, // NT-test-match state for `void
  }
,
{ // state 216
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 217
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 218
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 219
7,282, // ID
22,279, // <exp>
24,284, // `(
26,562, // `)
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
87,28, // <expList>
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
129,667, // ")"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 220
0x80000000|539, // match move
0x80000000|343, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 221
7,398, // ID
8,489, // `{
10,73, // `}
16,663, // `void
18,656, // <stmt>*
19,335, // <type>
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,685, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
145,490, // "}"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 222
66,704, // `&&
143,759, // "@"
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 223
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 224
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 226
0x80000000|546, // match move
0x80000000|384, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 227
110,366, // "t"
  }
,
{ // state 228
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 229
2,389, // ws*
33,MIN_REDUCTION+139, // `[
121,MIN_REDUCTION+139, // "["
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 230
7,282, // ID
22,537, // <exp>
24,284, // `(
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 231
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 232
7,282, // ID
24,284, // `(
31,3, // `null
60,211, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 233
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 234
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 235
104,315, // "u"
  }
,
{ // state 236
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 237
102,627, // "o"
103,119, // "r"
  }
,
{ // state 238
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 239
2,265, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
169,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 240
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 241
2,615, // ws*
  }
,
{ // state 242
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 243
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 244
2,518, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 245
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 246
2,424, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 247
0x80000000|650, // match move
0x80000000|699, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 248
0x80000000|352, // match move
0x80000000|770, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 249
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 250
7,398, // ID
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,479, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
36,633, // <assign>
37,156, // <local var decl>
38,534, // <methodCall>
42,79, // <for1>
43,418, // $$0
49,525, // `++
50,730, // `--
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,702, // "#"
133,720, // ";"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 251
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 252
23,98, // `;
133,720, // ";"
167,44, // $$5
  }
,
{ // state 253
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 254
102,174, // "o"
  }
,
{ // state 255
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 256
33,MIN_REDUCTION+87, // `[
121,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 257
34,422, // `]
131,378, // "]"
  }
,
{ // state 258
2,530, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 259
7,282, // ID
22,443, // <exp>
24,284, // `(
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 260
0x80000000|658, // match move
0x80000000|361, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 261
7,398, // ID
8,489, // `{
10,368, // `}
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,62, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
145,697, // "}"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 262
7,761, // ID
9,583, // <decl in class>*
10,619, // `}
12,324, // <decl in class>
13,543, // <method decl>
14,550, // <inst var decl>
15,630, // `public
16,663, // `void
19,495, // <type>
29,231, // `int
30,86, // `boolean
31,587, // `null
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
127,485, // "#"
145,490, // "}"
  }
,
{ // state 263
0x80000000|496, // match move
0x80000000|649, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 264
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 265
126,440, // " "
144,397, // {10}
153,410, // ws
169,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 266
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 267
0x80000000|407, // match move
0x80000000|213, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 268
33,MIN_REDUCTION+138, // `[
121,MIN_REDUCTION+138, // "["
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 269
7,135, // ID
22,584, // <exp>
24,284, // `(
26,507, // `)
31,3, // `null
36,251, // <assign>
38,593, // <methodCall>
45,623, // <for3>
49,525, // `++
50,730, // `--
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,105, // "#"
129,667, // ")"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 270
0x80000000|467, // match move
0x80000000|421, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 271
26,535, // `)
129,667, // ")"
  }
,
{ // state 272
8,602, // `{
11,369, // `extends
127,379, // "#"
135,555, // "{"
  }
,
{ // state 273
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 274
40,185, // `else
127,141, // "#"
  }
,
{ // state 275
0x80000000|116, // match move
0x80000000|574, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 276
97,308, // "c"
  }
,
{ // state 277
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 278
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 279
28,259, // `,
88,328, // <next exp>*
89,551, // <next exp>
130,713, // ","
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 280
0x80000000|629, // match move
0x80000000|31, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 281
17,50, // <formalList>
24,516, // `(
137,637, // "("
  }
,
{ // state 282
0x80000000|458, // match move
0x80000000|169, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 283
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 284
7,761, // ID
16,663, // `void
19,92, // <type>
29,231, // `int
30,86, // `boolean
31,587, // `null
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
127,84, // "#"
  }
,
{ // state 285
0x80000000|113, // match move
0x80000000|19, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 286
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 287
2,16, // ws*
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 288
7,282, // ID
24,284, // `(
31,3, // `null
60,436, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 289
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 290
26,134, // `)
129,571, // ")"
  }
,
{ // state 291
7,282, // ID
22,271, // <exp>
24,284, // `(
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 292
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 293
126,MIN_REDUCTION+249, // " "
144,MIN_REDUCTION+249, // {10}
153,MIN_REDUCTION+249, // ws
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 294
0x80000000|388, // match move
0x80000000|768, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 295
26,74, // `)
129,667, // ")"
  }
,
{ // state 296
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 297
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 298
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 299
7,282, // ID
22,133, // <exp>
24,284, // `(
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 300
7,282, // ID
24,284, // `(
31,3, // `null
63,89, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 301
33,MIN_REDUCTION+249, // `[
121,MIN_REDUCTION+249, // "["
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 302
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 303
2,321, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 304
0x80000000|228, // match move
0x80000000|203, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 305
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 306
7,282, // ID
24,284, // `(
31,3, // `null
63,121, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 307
7,398, // ID
8,489, // `{
10,71, // `}
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,600, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
53,296, // <case>
54,597, // `case
56,542, // `default
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,445, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
145,697, // "}"
146,303, // "!"
147,475, // "'"
148,409, // '"'
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
{ // state 308
101,726, // "l"
  }
,
{ // state 309
2,21, // ws*
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 310
7,282, // ID
22,722, // <exp>
24,284, // `(
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 311
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 312
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 313
7,761, // ID
10,605, // `}
12,577, // <decl in class>
13,543, // <method decl>
14,550, // <inst var decl>
15,630, // `public
16,663, // `void
19,495, // <type>
29,231, // `int
30,86, // `boolean
31,587, // `null
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
127,485, // "#"
145,490, // "}"
  }
,
{ // state 314
7,398, // ID
8,489, // `{
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,110, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 315
0x80000000|438, // match move
0x80000000|229, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 316
86,367, // <empty bracket pair>**
166,386, // <empty bracket pair>*
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 317
7,282, // ID
22,536, // <exp>
24,284, // `(
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 318
33,MIN_REDUCTION+217, // `[
121,MIN_REDUCTION+217, // "["
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 319
0x80000000|34, // match move
0x80000000|526, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 320
2,94, // ws*
126,778, // " "
144,508, // {10}
153,267, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 321
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 322
23,114, // `;
133,720, // ";"
  }
,
{ // state 323
0x80000000|287, // match move
0x80000000|6, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 324
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 325
104,468, // "u"
  }
,
{ // state 326
0x80000000|643, // match move
0x80000000|434, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 327
0x80000000|1, // match move
0x80000000|419, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 328
28,259, // `,
89,242, // <next exp>
130,713, // ","
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 329
126,MIN_REDUCTION+250, // " "
144,MIN_REDUCTION+250, // {10}
153,MIN_REDUCTION+250, // ws
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 330
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 331
7,398, // ID
8,489, // `{
16,663, // `void
19,335, // <type>
20,375, // <returnStmt>
21,670, // `return
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,62, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,642, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 332
23,729, // `;
133,417, // ";"
  }
,
{ // state 333
23,90, // `;
133,720, // ";"
  }
,
{ // state 334
126,778, // " "
144,508, // {10}
153,453, // ws
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 335
7,494, // ID
32,148, // <empty bracket pair>
33,206, // `[
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
121,95, // "["
  }
,
{ // state 336
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 337
33,MIN_REDUCTION+250, // `[
121,MIN_REDUCTION+250, // "["
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 338
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 339
0x80000000|659, // match move
0x80000000|337, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 340
115,427, // digit
116,183, // {"1".."9"}
117,183, // "0"
118,323, // digit128
119,33, // {176..185}
157,294, // $$2
  }
,
{ // state 341
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 342
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 343
33,MIN_REDUCTION+84, // `[
121,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 344
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 345
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 346
91,509, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,522, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
115,354, // digit
116,183, // {"1".."9"}
117,183, // "0"
118,67, // digit128
119,292, // {176..185}
140,387, // "_"
151,746, // {223}
155,182, // $$1
162,586, // idChar
163,552, // idChar128
  }
,
{ // state 347
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 348
81,757, // `.
139,107, // "."
  }
,
{ // state 349
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 350
23,579, // `;
133,720, // ";"
  }
,
{ // state 351
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 352
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 353
7,282, // ID
24,284, // `(
31,3, // `null
58,598, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 354
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 355
0x80000000|687, // match move
0x80000000|429, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 356
2,615, // ws*
33,MIN_REDUCTION+211, // `[
121,MIN_REDUCTION+211, // "["
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 357
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 358
24,290, // `(
137,637, // "("
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 359
95,392, // "s"
96,187, // "v"
99,426, // "f"
100,464, // "i"
106,237, // "b"
109,111, // "n"
110,61, // "t"
111,374, // "w"
138,488, // "+"
  }
,
{ // state 360
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 361
33,MIN_REDUCTION+164, // `[
121,MIN_REDUCTION+164, // "["
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 362
7,282, // ID
24,284, // `(
31,3, // `null
61,532, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 363
96,187, // "v"
  }
,
{ // state 364
23,192, // `;
133,720, // ";"
  }
,
{ // state 365
2,65, // ws*
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 366
0x80000000|570, // match move
0x80000000|738, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 367
0x80000000|253, // match move
0x80000000|744, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 368
0x80000000|506, // match move
0x80000000|216, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 369
7,528, // ID
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
  }
,
{ // state 370
127,141, // "#"
  }
,
{ // state 371
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 372
2,16, // ws*
  }
,
{ // state 373
0x80000000|120, // match move
0x80000000|563, // no-match move
0x80000000|502, // NT-test-match state for `void
  }
,
{ // state 374
108,764, // "h"
  }
,
{ // state 375
10,194, // `}
145,490, // "}"
  }
,
{ // state 376
126,MIN_REDUCTION+249, // " "
144,MIN_REDUCTION+249, // {10}
153,MIN_REDUCTION+249, // ws
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 377
2,705, // ws*
  }
,
{ // state 378
0x80000000|676, // match move
0x80000000|158, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 379
107,575, // "e"
  }
,
{ // state 380
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 381
2,94, // ws*
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 382
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 383
33,MIN_REDUCTION+109, // `[
121,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 384
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 385
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 386
0x80000000|644, // match move
0x80000000|360, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 387
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 388
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 389
0x80000000|55, // match move
0x80000000|268, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 390
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 391
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 392
104,468, // "u"
111,137, // "w"
  }
,
{ // state 393
0x80000000|448, // match move
0x80000000|639, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 394
2,432, // ws*
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 395
40,444, // `else
127,141, // "#"
  }
,
{ // state 396
126,778, // " "
144,508, // {10}
153,453, // ws
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 397
169,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 398
0x80000000|382, // match move
0x80000000|521, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 399
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 400
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 401
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 402
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 403
0x80000000|529, // match move
0x80000000|171, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 404
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 405
23,269, // `;
133,720, // ";"
167,625, // $$5
  }
,
{ // state 406
2,512, // ws*
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 407
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 408
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 409
92,412, // "a"
93,412, // "d"
94,412, // "p"
95,412, // "s"
96,412, // "v"
97,412, // "c"
98,412, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,412, // "f"
100,412, // "i"
101,412, // "l"
102,412, // "o"
103,412, // "r"
104,412, // "u"
105,412, // "x"
106,412, // "b"
107,412, // "e"
108,412, // "h"
109,412, // "n"
110,412, // "t"
111,412, // "w"
113,782, // {199..218 231..250}
114,782, // {193..198 225..230}
116,412, // {"1".."9"}
117,412, // "0"
119,782, // {176..185}
120,400, // any
121,412, // "["
122,412, // "-"
123,412, // "<"
124,412, // {0..9 11..31 "$" "?" "\" "^" "`" "~"..127}
125,412, // "|"
126,412, // " "
127,412, // "#"
128,412, // "&"
129,412, // ")"
130,412, // ","
131,412, // "]"
132,412, // "/"
133,412, // ";"
134,412, // ">"
135,412, // "{"
136,412, // "%"
137,412, // "("
138,412, // "+"
139,412, // "."
140,412, // "_"
141,412, // ":"
142,412, // "="
143,412, // "@"
144,412, // {10}
145,412, // "}"
146,412, // "!"
147,412, // "'"
148,412, // '"'
149,412, // "*"
150,723, // any128
151,782, // {223}
152,782, // {128..175 186..192 219..222 224 251..255}
160,632, // any*
161,198, // $$4
  }
,
{ // state 410
169,MIN_REDUCTION+249, // $NT
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 411
125,459, // "|"
128,452, // "&"
142,703, // "="
146,698, // "!"
  }
,
{ // state 412
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 413
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 414
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 415
2,766, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
169,MIN_REDUCTION+117, // $NT
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 416
104,78, // "u"
  }
,
{ // state 417
0x80000000|394, // match move
0x80000000|728, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 418
0x80000000|162, // match move
0x80000000|527, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 419
24,655, // `(
33,MIN_REDUCTION+85, // `[
121,MIN_REDUCTION+85, // "["
137,637, // "("
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 420
0x80000000|1, // match move
0x80000000|601, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 421
33,317, // `[
81,553, // `.
121,95, // "["
139,107, // "."
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 422
0x80000000|205, // match move
0x80000000|316, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 423
2,112, // ws*
  }
,
{ // state 424
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 425
7,282, // ID
24,284, // `(
31,3, // `null
61,204, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 426
92,626, // "a"
102,756, // "o"
  }
,
{ // state 427
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 428
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 429
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 430
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 431
0x80000000|309, // match move
0x80000000|435, // no-match move
0x80000000|502, // NT-test-match state for `void
  }
,
{ // state 432
0x80000000|457, // match move
0x80000000|334, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 433
7,282, // ID
24,284, // `(
31,3, // `null
62,541, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 434
2,263, // ws*
33,MIN_REDUCTION+256, // `[
121,MIN_REDUCTION+256, // "["
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 435
2,21, // ws*
126,373, // " "
144,215, // {10}
153,678, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 436
69,362, // `<
70,441, // `<=
71,425, // `>
123,776, // "<"
134,719, // ">"
143,731, // "@"
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 437
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 438
2,389, // ws*
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 439
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 440
169,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 441
7,282, // ID
24,284, // `(
31,3, // `null
61,661, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 442
2,743, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 443
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 444
7,398, // ID
8,489, // `{
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,264, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 445
93,595, // "d"
95,392, // "s"
96,187, // "v"
97,669, // "c"
99,426, // "f"
100,464, // "i"
106,237, // "b"
109,111, // "n"
110,61, // "t"
111,374, // "w"
138,488, // "+"
  }
,
{ // state 446
2,112, // ws*
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 447
0x80000000|753, // match move
0x80000000|608, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 448
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 449
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 450
33,MIN_REDUCTION+225, // `[
121,MIN_REDUCTION+225, // "["
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 451
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 452
2,224, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 453
0x80000000|408, // match move
0x80000000|376, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 454
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 455
2,22, // ws*
33,MIN_REDUCTION+219, // `[
121,MIN_REDUCTION+219, // "["
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 456
0x80000000|43, // match move
0x80000000|293, // no-match move
0x80000000|502, // NT-test-match state for `void
  }
,
{ // state 457
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 458
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 459
2,223, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 460
169,MIN_REDUCTION+25, // $NT
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 461
26,189, // `)
129,667, // ")"
  }
,
{ // state 462
33,MIN_REDUCTION+206, // `[
121,MIN_REDUCTION+206, // "["
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 463
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 464
110,58, // "t"
  }
,
{ // state 465
7,281, // ID
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
  }
,
{ // state 466
0x80000000|139, // match move
0x80000000|75, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 467
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 468
2,202, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 469
23,218, // `;
133,720, // ";"
  }
,
{ // state 470
2,706, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 471
0x80000000|428, // match move
0x80000000|484, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 472
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 473
92,631, // "a"
93,631, // "d"
94,631, // "p"
95,631, // "s"
96,631, // "v"
97,631, // "c"
98,631, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,631, // "f"
100,631, // "i"
101,631, // "l"
102,631, // "o"
103,631, // "r"
104,631, // "u"
105,631, // "x"
106,631, // "b"
107,631, // "e"
108,631, // "h"
109,631, // "n"
110,631, // "t"
111,631, // "w"
114,672, // {193..198 225..230}
116,631, // {"1".."9"}
117,631, // "0"
119,672, // {176..185}
159,46, // $$3
164,179, // hexDigit
165,5, // hexDigit128
  }
,
{ // state 474
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 475
92,447, // "a"
93,447, // "d"
94,447, // "p"
95,447, // "s"
96,447, // "v"
97,447, // "c"
98,447, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,447, // "f"
100,447, // "i"
101,447, // "l"
102,447, // "o"
103,447, // "r"
104,447, // "u"
105,447, // "x"
106,447, // "b"
107,447, // "e"
108,447, // "h"
109,447, // "n"
110,447, // "t"
111,447, // "w"
116,447, // {"1".."9"}
117,447, // "0"
120,733, // any
121,447, // "["
122,447, // "-"
123,447, // "<"
124,447, // {0..9 11..31 "$" "?" "\" "^" "`" "~"..127}
125,447, // "|"
126,447, // " "
127,447, // "#"
128,447, // "&"
129,447, // ")"
130,447, // ","
131,447, // "]"
132,447, // "/"
133,447, // ";"
134,447, // ">"
135,447, // "{"
136,447, // "%"
137,447, // "("
138,447, // "+"
139,447, // "."
140,447, // "_"
141,447, // ":"
142,447, // "="
143,447, // "@"
144,447, // {10}
145,447, // "}"
146,447, // "!"
147,447, // "'"
148,447, // '"'
149,447, // "*"
  }
,
{ // state 476
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 477
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 478
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 479
7,282, // ID
22,217, // <exp>
23,98, // `;
24,284, // `(
31,3, // `null
44,252, // <for2>
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
133,720, // ";"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
167,63, // $$5
  }
,
{ // state 480
7,398, // ID
8,489, // `{
10,226, // `}
16,663, // `void
18,261, // <stmt>*
19,335, // <type>
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,685, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
145,697, // "}"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 481
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 482
148,596, // '"'
  }
,
{ // state 483
0x80000000|524, // match move
0x80000000|779, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 484
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 485
94,97, // "p"
96,187, // "v"
100,464, // "i"
106,200, // "b"
109,416, // "n"
  }
,
{ // state 486
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 487
55,712, // `:
141,680, // ":"
  }
,
{ // state 488
2,607, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 489
7,398, // ID
8,489, // `{
10,750, // `}
16,663, // `void
18,72, // <stmt>*
19,335, // <type>
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,685, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
145,490, // "}"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 490
2,513, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 491
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 492
122,674, // "-"
138,470, // "+"
  }
,
{ // state 493
24,610, // `(
137,637, // "("
  }
,
{ // state 494
48,594, // `=
142,614, // "="
  }
,
{ // state 495
7,322, // ID
32,148, // <empty bracket pair>
33,206, // `[
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
121,95, // "["
  }
,
{ // state 496
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 497
0x80000000|636, // match move
0x80000000|664, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 498
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 499
67,232, // `==
68,288, // `!=
143,411, // "@"
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 500
7,91, // ID
32,148, // <empty bracket pair>
33,206, // `[
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
121,95, // "["
  }
,
{ // state 501
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 502
127,363, // "#"
  }
,
{ // state 503
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 504
2,355, // ws*
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 505
91,509, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,714, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
115,354, // digit
116,183, // {"1".."9"}
117,183, // "0"
118,497, // digit128
119,33, // {176..185}
140,387, // "_"
151,638, // {223}
154,208, // idChar*
155,248, // $$1
162,153, // idChar
163,326, // idChar128
  }
,
{ // state 506
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 507
7,398, // ID
8,489, // `{
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,690, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 508
0x80000000|548, // match move
0x80000000|741, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 509
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 510
33,MIN_REDUCTION+257, // `[
121,MIN_REDUCTION+257, // "["
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 511
33,MIN_REDUCTION+105, // `[
121,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 512
0x80000000|20, // match move
0x80000000|117, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 513
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 514
67,232, // `==
68,288, // `!=
143,411, // "@"
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 515
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 516
7,761, // ID
16,663, // `void
19,500, // <type>
26,240, // `)
29,231, // `int
30,86, // `boolean
31,587, // `null
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
127,84, // "#"
129,667, // ")"
  }
,
{ // state 517
33,MIN_REDUCTION+89, // `[
121,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 518
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 519
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 520
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 521
7,MIN_REDUCTION+23, // ID
24,219, // `(
33,MIN_REDUCTION+80, // `[
49,765, // `++
50,297, // `--
92,MIN_REDUCTION+23, // "a"
93,MIN_REDUCTION+23, // "d"
94,MIN_REDUCTION+23, // "p"
95,MIN_REDUCTION+23, // "s"
96,MIN_REDUCTION+23, // "v"
97,MIN_REDUCTION+23, // "c"
98,MIN_REDUCTION+23, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,MIN_REDUCTION+23, // "f"
100,MIN_REDUCTION+23, // "i"
101,MIN_REDUCTION+23, // "l"
102,MIN_REDUCTION+23, // "o"
103,MIN_REDUCTION+23, // "r"
104,MIN_REDUCTION+23, // "u"
105,MIN_REDUCTION+23, // "x"
106,MIN_REDUCTION+23, // "b"
107,MIN_REDUCTION+23, // "e"
108,MIN_REDUCTION+23, // "h"
109,MIN_REDUCTION+23, // "n"
110,MIN_REDUCTION+23, // "t"
111,MIN_REDUCTION+23, // "w"
113,MIN_REDUCTION+23, // {199..218 231..250}
114,MIN_REDUCTION+23, // {193..198 225..230}
121,MIN_REDUCTION+80, // "["
137,637, // "("
143,557, // "@"
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 522
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 523
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 524
32,170, // <empty bracket pair>
33,167, // `[
121,95, // "["
  }
,
{ // state 525
7,652, // ID
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
  }
,
{ // state 526
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 527
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 528
8,262, // `{
135,555, // "{"
  }
,
{ // state 529
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 530
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 531
33,MIN_REDUCTION+218, // `[
121,MIN_REDUCTION+218, // "["
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 532
72,433, // `+
73,209, // `-
122,688, // "-"
138,734, // "+"
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 533
126,MIN_REDUCTION+108, // " "
144,MIN_REDUCTION+108, // {10}
153,MIN_REDUCTION+108, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 534
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 535
7,398, // ID
8,480, // `{
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,675, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,648, // <stmt>
36,152, // <assign>
37,18, // <local var decl>
38,332, // <methodCall>
39,29, // `if
41,10, // `for
46,38, // `while
47,707, // `break
49,525, // `++
50,730, // `--
51,781, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,417, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 536
34,673, // `]
131,378, // "]"
  }
,
{ // state 537
26,752, // `)
129,667, // ")"
  }
,
{ // state 538
0x80000000|748, // match move
0x80000000|383, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 539
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 540
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 541
74,559, // `*
75,300, // `/
76,306, // `%
132,172, // "/"
136,244, // "%"
149,635, // "*"
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 542
55,344, // `:
141,680, // ":"
  }
,
{ // state 543
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 544
0x80000000|477, // match move
0x80000000|472, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 545
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 546
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 547
26,700, // `)
27,214, // <listElement>
28,186, // `,
129,667, // ")"
130,713, // ","
  }
,
{ // state 548
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 549
0x80000000|640, // match move
0x80000000|173, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 550
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 551
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 552
2,760, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 553
7,15, // ID
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
  }
,
{ // state 554
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 555
2,580, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 556
24,299, // `(
137,637, // "("
  }
,
{ // state 557
122,674, // "-"
123,53, // "<"
125,459, // "|"
128,452, // "&"
138,470, // "+"
142,703, // "="
146,698, // "!"
  }
,
{ // state 558
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 559
7,282, // ID
24,284, // `(
31,3, // `null
63,773, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 560
23,771, // `;
133,720, // ";"
  }
,
{ // state 561
2,280, // ws*
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 562
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 563
126,MIN_REDUCTION+108, // " "
144,MIN_REDUCTION+108, // {10}
153,MIN_REDUCTION+108, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 564
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 565
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 566
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 567
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 568
72,433, // `+
73,209, // `-
122,688, // "-"
138,734, // "+"
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 569
26,210, // `)
129,667, // ")"
  }
,
{ // state 570
2,618, // ws*
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 571
0x80000000|138, // match move
0x80000000|47, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 572
33,MIN_REDUCTION+85, // `[
121,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 573
126,MIN_REDUCTION+109, // " "
144,MIN_REDUCTION+109, // {10}
153,MIN_REDUCTION+109, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 574
33,MIN_REDUCTION+82, // `[
121,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 575
105,151, // "x"
  }
,
{ // state 576
0x80000000|671, // match move
0x80000000|696, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 577
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 578
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 579
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 580
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 581
2,780, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 582
33,MIN_REDUCTION+88, // `[
121,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 583
7,761, // ID
10,371, // `}
12,577, // <decl in class>
13,543, // <method decl>
14,550, // <inst var decl>
15,630, // `public
16,663, // `void
19,495, // <type>
29,231, // `int
30,86, // `boolean
31,587, // `null
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
127,485, // "#"
145,490, // "}"
  }
,
{ // state 584
48,197, // `=
142,614, // "="
  }
,
{ // state 585
33,MIN_REDUCTION+261, // `[
121,MIN_REDUCTION+261, // "["
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 586
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 587
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 588
7,282, // ID
22,257, // <exp>
24,284, // `(
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 589
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 590
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 591
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 592
74,559, // `*
75,300, // `/
76,306, // `%
132,172, // "/"
136,244, // "%"
149,635, // "*"
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 593
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 594
7,282, // ID
22,784, // <exp>
24,284, // `(
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 595
107,258, // "e"
  }
,
{ // state 596
0x80000000|365, // match move
0x80000000|180, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 597
7,282, // ID
22,487, // <exp>
24,284, // `(
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 598
66,704, // `&&
143,759, // "@"
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 599
33,317, // `[
81,553, // `.
121,95, // "["
139,107, // "."
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 600
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 601
33,317, // `[
81,617, // `.
121,95, // "["
139,107, // "."
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 602
7,761, // ID
9,313, // <decl in class>*
10,476, // `}
12,324, // <decl in class>
13,543, // <method decl>
14,550, // <inst var decl>
15,630, // `public
16,663, // `void
19,495, // <type>
29,231, // `int
30,86, // `boolean
31,587, // `null
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
127,485, // "#"
145,490, // "}"
  }
,
{ // state 603
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 604
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 605
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 606
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 607
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 608
33,MIN_REDUCTION+106, // `[
121,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 609
0x80000000|754, // match move
0x80000000|402, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 610
7,282, // ID
22,279, // <exp>
24,284, // `(
26,341, // `)
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
87,212, // <expList>
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
129,667, // ")"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 611
0x80000000|100, // match move
0x80000000|709, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 612
7,398, // ID
8,489, // `{
10,725, // `}
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,600, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
52,307, // <case>*
53,590, // <case>
54,597, // `case
56,542, // `default
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,445, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
145,697, // "}"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 613
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 614
2,305, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 615
0x80000000|238, // match move
0x80000000|140, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 616
MIN_REDUCTION+180, // (default reduction)
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
{ // state 617
7,327, // ID
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
  }
,
{ // state 618
0x80000000|311, // match move
0x80000000|449, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 619
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 620
0x80000000|395, // match move
0x80000000|430, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 621
91,509, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,522, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
115,354, // digit
116,183, // {"1".."9"}
117,183, // "0"
118,67, // digit128
119,292, // {176..185}
140,387, // "_"
151,746, // {223}
154,346, // idChar*
155,385, // $$1
162,153, // idChar
163,552, // idChar128
  }
,
{ // state 622
69,362, // `<
70,441, // `<=
71,425, // `>
123,776, // "<"
134,719, // ">"
143,731, // "@"
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 623
26,314, // `)
129,667, // ")"
  }
,
{ // state 624
0x80000000|357, // match move
0x80000000|11, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 625
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 626
0x80000000|406, // match move
0x80000000|166, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 627
2,439, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 628
7,398, // ID
8,489, // `{
10,57, // `}
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,600, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
53,296, // <case>
54,597, // `case
56,542, // `default
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,445, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
145,490, // "}"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 629
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 630
0x80000000|711, // match move
0x80000000|732, // no-match move
0x80000000|502, // NT-test-match state for `void
  }
,
{ // state 631
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 632
92,412, // "a"
93,412, // "d"
94,412, // "p"
95,412, // "s"
96,412, // "v"
97,412, // "c"
98,412, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,412, // "f"
100,412, // "i"
101,412, // "l"
102,412, // "o"
103,412, // "r"
104,412, // "u"
105,412, // "x"
106,412, // "b"
107,412, // "e"
108,412, // "h"
109,412, // "n"
110,412, // "t"
111,412, // "w"
113,782, // {199..218 231..250}
114,782, // {193..198 225..230}
116,412, // {"1".."9"}
117,412, // "0"
119,782, // {176..185}
120,193, // any
121,412, // "["
122,412, // "-"
123,412, // "<"
124,412, // {0..9 11..31 "$" "?" "\" "^" "`" "~"..127}
125,412, // "|"
126,412, // " "
127,412, // "#"
128,412, // "&"
129,412, // ")"
130,412, // ","
131,412, // "]"
132,412, // "/"
133,412, // ";"
134,412, // ">"
135,412, // "{"
136,412, // "%"
137,412, // "("
138,412, // "+"
139,412, // "."
140,412, // "_"
141,412, // ":"
142,412, // "="
143,412, // "@"
144,412, // {10}
145,412, // "}"
146,412, // "!"
147,412, // "'"
148,412, // '"'
149,412, // "*"
150,723, // any128
151,782, // {223}
152,782, // {128..175 186..192 219..222 224 251..255}
161,247, // $$4
  }
,
{ // state 633
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 634
33,317, // `[
81,553, // `.
121,95, // "["
139,107, // "."
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 635
2,454, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 636
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 637
2,554, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 638
0x80000000|558, // match move
0x80000000|450, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 639
33,MIN_REDUCTION+213, // `[
121,MIN_REDUCTION+213, // "["
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 640
2,705, // ws*
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 641
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 642
95,392, // "s"
96,187, // "v"
99,426, // "f"
100,464, // "i"
103,40, // "r"
106,237, // "b"
109,111, // "n"
110,61, // "t"
111,374, // "w"
138,488, // "+"
  }
,
{ // state 643
2,263, // ws*
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 644
32,147, // <empty bracket pair>
33,167, // `[
121,95, // "["
  }
,
{ // state 645
33,MIN_REDUCTION+212, // `[
121,MIN_REDUCTION+212, // "["
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 646
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 647
7,272, // ID
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
  }
,
{ // state 648
0x80000000|274, // match move
0x80000000|430, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 649
33,MIN_REDUCTION+255, // `[
121,MIN_REDUCTION+255, // "["
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 650
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 651
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 652
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 653
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 654
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 655
7,282, // ID
22,279, // <exp>
24,284, // `(
26,236, // `)
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
87,196, // <expList>
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
129,667, // ")"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 656
7,398, // ID
8,489, // `{
10,278, // `}
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,62, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
145,490, // "}"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 657
7,398, // ID
8,480, // `{
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,675, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,285, // <stmt>
36,152, // <assign>
37,18, // <local var decl>
38,332, // <methodCall>
39,29, // `if
41,10, // `for
46,38, // `while
47,707, // `break
49,525, // `++
50,730, // `--
51,781, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,417, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 658
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 659
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 660
33,MIN_REDUCTION+227, // `[
121,MIN_REDUCTION+227, // "["
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 661
72,433, // `+
73,209, // `-
122,688, // "-"
138,734, // "+"
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 662
7,398, // ID
8,489, // `{
16,663, // `void
18,331, // <stmt>*
19,335, // <type>
20,12, // <returnStmt>
21,670, // `return
22,584, // <exp>
23,437, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,685, // <stmt>
36,469, // <assign>
37,350, // <local var decl>
38,364, // <methodCall>
39,144, // `if
41,199, // `for
46,201, // `while
47,333, // `break
49,525, // `++
50,730, // `--
51,556, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,642, // "#"
133,720, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 663
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 664
33,MIN_REDUCTION+224, // `[
121,MIN_REDUCTION+224, // "["
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 665
33,MIN_REDUCTION+86, // `[
121,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 666
0x80000000|717, // match move
0x80000000|59, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 667
2,519, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 668
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 669
107,246, // "e"
  }
,
{ // state 670
7,282, // ID
22,560, // <exp>
24,284, // `(
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 671
2,32, // ws*
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 672
0x80000000|474, // match move
0x80000000|660, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 673
0x80000000|132, // match move
0x80000000|41, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 674
2,27, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 675
0x80000000|540, // match move
0x80000000|641, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 676
2,161, // ws*
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 677
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 678
0x80000000|349, // match move
0x80000000|329, // no-match move
0x80000000|502, // NT-test-match state for `void
  }
,
{ // state 679
0x80000000|380, // match move
0x80000000|634, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 680
2,523, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 681
33,206, // `[
121,95, // "["
  }
,
{ // state 682
74,559, // `*
75,300, // `/
76,306, // `%
132,172, // "/"
136,244, // "%"
149,635, // "*"
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 683
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 684
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 685
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 686
7,606, // ID
32,148, // <empty bracket pair>
33,206, // `[
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
121,95, // "["
  }
,
{ // state 687
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 688
2,414, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 689
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 690
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 691
7,282, // ID
22,217, // <exp>
23,269, // `;
24,284, // `(
31,3, // `null
44,405, // <for2>
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
133,720, // ";"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
167,391, // $$5
  }
,
{ // state 692
33,MIN_REDUCTION+204, // `[
121,MIN_REDUCTION+204, // "["
126,624, // " "
144,538, // {10}
153,129, // ws
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 693
0x80000000|567, // match move
0x80000000|96, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 694
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 695
2,109, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 696
2,32, // ws*
33,MIN_REDUCTION+205, // `[
121,MIN_REDUCTION+205, // "["
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 697
0x80000000|381, // match move
0x80000000|320, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 698
2,463, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 699
33,MIN_REDUCTION+216, // `[
121,MIN_REDUCTION+216, // "["
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 700
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 701
7,282, // ID
31,3, // `null
64,270, // <exp1>
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
127,24, // "#"
143,482, // "@"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 702
95,325, // "s"
96,187, // "v"
99,69, // "f"
100,464, // "i"
106,200, // "b"
109,111, // "n"
110,61, // "t"
  }
,
{ // state 703
2,8, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 704
7,282, // ID
24,284, // `(
31,3, // `null
59,514, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 705
0x80000000|603, // match move
0x80000000|123, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 706
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 707
23,471, // `;
133,417, // ";"
  }
,
{ // state 708
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 709
33,MIN_REDUCTION+103, // `[
121,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 710
8,149, // `{
135,555, // "{"
  }
,
{ // state 711
16,465, // `void
127,363, // "#"
  }
,
{ // state 712
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 713
2,451, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 714
0x80000000|245, // match move
0x80000000|777, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 715
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 716
2,2, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
169,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 717
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 718
17,130, // <formalList>
24,516, // `(
137,637, // "("
  }
,
{ // state 719
0x80000000|1, // match move
0x80000000|745, // no-match move
// T-test match for "=":
142,
  }
,
{ // state 720
2,486, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 721
2,22, // ws*
  }
,
{ // state 722
26,56, // `)
129,667, // ")"
  }
,
{ // state 723
0x80000000|446, // match move
0x80000000|52, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 724
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 725
0x80000000|668, // match move
0x80000000|708, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 726
2,289, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 727
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 728
2,432, // ws*
126,778, // " "
144,508, // {10}
153,267, // ws
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 729
0x80000000|39, // match move
0x80000000|589, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 730
7,127, // ID
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
  }
,
{ // state 731
123,53, // "<"
125,459, // "|"
128,452, // "&"
142,703, // "="
146,698, // "!"
  }
,
{ // state 732
7,761, // ID
19,70, // <type>
29,231, // `int
30,86, // `boolean
31,587, // `null
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
127,85, // "#"
  }
,
{ // state 733
0x80000000|178, // match move
0x80000000|455, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 734
2,481, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 735
0x80000000|689, // match move
0x80000000|654, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 736
168,MIN_REDUCTION+0, // $
  }
,
{ // state 737
2,280, // ws*
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 738
2,618, // ws*
126,624, // " "
144,538, // {10}
153,339, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 739
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 740
0x80000000|142, // match move
0x80000000|504, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 741
126,MIN_REDUCTION+109, // " "
144,MIN_REDUCTION+109, // {10}
153,MIN_REDUCTION+109, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 742
101,239, // "l"
  }
,
{ // state 743
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 744
33,MIN_REDUCTION+91, // `[
121,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 745
2,613, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 746
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 747
33,MIN_REDUCTION+209, // `[
121,MIN_REDUCTION+209, // "["
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 748
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 749
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 750
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 751
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 752
7,398, // ID
8,480, // `{
16,663, // `void
19,335, // <type>
22,584, // <exp>
23,675, // `;
24,284, // `(
29,231, // `int
30,86, // `boolean
31,403, // `null
35,609, // <stmt>
36,152, // <assign>
37,18, // <local var decl>
38,332, // <methodCall>
39,29, // `if
41,10, // `for
46,38, // `while
47,707, // `break
49,525, // `++
50,730, // `--
51,781, // `switch
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,420, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
90,348, // `super
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,359, // "#"
133,417, // ";"
135,555, // "{"
137,637, // "("
138,734, // "+"
143,125, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 753
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 754
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 755
33,MIN_REDUCTION+107, // `[
121,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 756
2,83, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 757
7,493, // ID
91,621, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,695, // letter128
113,104, // {199..218 231..250}
114,104, // {193..198 225..230}
  }
,
{ // state 758
169,MIN_REDUCTION+250, // $NT
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 759
125,459, // "|"
128,452, // "&"
  }
,
{ // state 760
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 761
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 762
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 763
7,282, // ID
22,461, // <exp>
24,284, // `(
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 764
2,277, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 765
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 766
126,440, // " "
144,397, // {10}
153,410, // ws
169,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 767
2,65, // ws*
  }
,
{ // state 768
33,MIN_REDUCTION+208, // `[
121,MIN_REDUCTION+208, // "["
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 769
92,631, // "a"
93,631, // "d"
94,631, // "p"
95,631, // "s"
96,631, // "v"
97,631, // "c"
98,631, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,631, // "f"
100,631, // "i"
101,631, // "l"
102,631, // "o"
103,631, // "r"
104,631, // "u"
105,631, // "x"
106,631, // "b"
107,631, // "e"
108,631, // "h"
109,631, // "n"
110,631, // "t"
111,631, // "w"
114,672, // {193..198 225..230}
116,631, // {"1".."9"}
117,631, // "0"
119,672, // {176..185}
158,473, // hexDigit*
159,393, // $$3
164,207, // hexDigit
165,5, // hexDigit128
  }
,
{ // state 770
33,MIN_REDUCTION+207, // `[
121,MIN_REDUCTION+207, // "["
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 771
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 772
7,282, // ID
22,569, // <exp>
24,284, // `(
31,3, // `null
57,101, // <exp8>
58,222, // <exp7>
59,499, // <exp6>
60,622, // <exp5>
61,568, // <exp4>
62,682, // <exp3>
63,131, // <exp2>
64,466, // <exp1>
72,701, // `+
73,195, // `-
77,155, // `!
78,275, // INTLIT
79,76, // STRINGLIT
80,220, // CHARLIT
82,164, // `this
83,13, // `true
84,165, // `false
85,177, // `new
91,505, // letter
92,273, // "a"
93,273, // "d"
94,273, // "p"
95,273, // "s"
96,273, // "v"
97,273, // "c"
98,273, // {"A".."Z" "g" "j".."k" "m" "q" "y".."z"}
99,273, // "f"
100,273, // "i"
101,273, // "l"
102,273, // "o"
103,273, // "r"
104,273, // "u"
105,273, // "x"
106,273, // "b"
107,273, // "e"
108,273, // "h"
109,273, // "n"
110,273, // "t"
111,273, // "w"
112,576, // letter128
113,611, // {199..218 231..250}
114,611, // {193..198 225..230}
116,184, // {"1".."9"}
117,769, // "0"
118,99, // digit128
119,33, // {176..185}
122,688, // "-"
127,24, // "#"
137,637, // "("
138,734, // "+"
143,482, // "@"
146,303, // "!"
147,475, // "'"
148,409, // '"'
  }
,
{ // state 773
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 774
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 775
0x80000000|529, // match move
0x80000000|17, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 776
2,286, // ws*
126,440, // " "
144,397, // {10}
153,758, // ws
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 777
33,MIN_REDUCTION+223, // `[
121,MIN_REDUCTION+223, // "["
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 778
0x80000000|491, // match move
0x80000000|533, // no-match move
0x80000000|370, // NT-test-match state for `else
  }
,
{ // state 779
33,588, // `[
121,95, // "["
  }
,
{ // state 780
126,440, // " "
144,397, // {10}
153,410, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 781
24,310, // `(
137,637, // "("
  }
,
{ // state 782
0x80000000|653, // match move
0x80000000|755, // no-match move
0x80000000|681, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 783
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 784
MIN_REDUCTION+48, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[785][];
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
(87<<16)+2,
// <expList> ::= <exp>
(87<<16)+1,
// <next exp> ::= `, <exp>
(89<<16)+2,
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
(91<<16)+1,
// letter128 ::= {193..218 225..250}
(112<<16)+1,
// digit ::= {"0".."9"}
(115<<16)+1,
// digit128 ::= {176..185}
(118<<16)+1,
// any ::= {0..127}
(120<<16)+1,
// any128 ::= {128..255}
(150<<16)+1,
// ws ::= " "
(153<<16)+1,
// ws ::= {10}
(153<<16)+1,
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
(82<<16)+4,
// `this ::= "#" "t" "h"
(82<<16)+3,
// `false ::= "#" "f" "a" ws*
(84<<16)+4,
// `false ::= "#" "f" "a"
(84<<16)+3,
// `true ::= "#" "t" "r" ws*
(83<<16)+4,
// `true ::= "#" "t" "r"
(83<<16)+3,
// `super ::= "#" "s" "u" ws*
(90<<16)+4,
// `super ::= "#" "s" "u"
(90<<16)+3,
// `null ::= "#" "n" "u" ws*
(31<<16)+4,
// `null ::= "#" "n" "u"
(31<<16)+3,
// `return ::= "#" "r" "e" ws*
(21<<16)+4,
// `return ::= "#" "r" "e"
(21<<16)+3,
// `new ::= "#" "n" "e" ws*
(85<<16)+4,
// `new ::= "#" "n" "e"
(85<<16)+3,
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
(77<<16)+2,
// `! ::= "!"
(77<<16)+1,
// `!= ::= "@" "!" ws*
(68<<16)+3,
// `!= ::= "@" "!"
(68<<16)+2,
// `% ::= "%" ws*
(76<<16)+2,
// `% ::= "%"
(76<<16)+1,
// `&& ::= "@" "&" ws*
(66<<16)+3,
// `&& ::= "@" "&"
(66<<16)+2,
// `* ::= "*" ws*
(74<<16)+2,
// `* ::= "*"
(74<<16)+1,
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
(73<<16)+2,
// `- ::= "-"
(73<<16)+1,
// `+ ::= "+" ws*
(72<<16)+2,
// `+ ::= "+"
(72<<16)+1,
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
// `: ::= ":" ws*
(55<<16)+2,
// `: ::= ":"
(55<<16)+1,
// `. ::= "." ws*
(81<<16)+2,
// `. ::= "."
(81<<16)+1,
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
(75<<16)+2,
// `/ ::= "/"
(75<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$1
(7<<16)+3,
// ID ::= letter $$1
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$2
(78<<16)+3,
// INTLIT ::= {"1".."9"} $$2
(78<<16)+2,
// INTLIT ::= digit128 ws*
(78<<16)+2,
// INTLIT ::= digit128
(78<<16)+1,
// INTLIT ::= "0" hexDigit* $$3
(78<<16)+3,
// INTLIT ::= "0" $$3
(78<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(79<<16)+3,
// STRINGLIT ::= "@" '"'
(79<<16)+2,
// STRINGLIT ::= '"' any* $$4
(79<<16)+3,
// STRINGLIT ::= '"' $$4
(79<<16)+2,
// CHARLIT ::= "'" any ws*
(80<<16)+3,
// CHARLIT ::= "'" any
(80<<16)+2,
// idChar ::= letter
(162<<16)+1,
// idChar ::= digit
(162<<16)+1,
// idChar ::= "_"
(162<<16)+1,
// idChar128 ::= letter128
(163<<16)+1,
// idChar128 ::= digit128
(163<<16)+1,
// idChar128 ::= {223}
(163<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(164<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(165<<16)+1,
// digit* ::= digit* digit
(156<<16)+2,
// digit* ::= digit
(156<<16)+1,
// <next exp>* ::= <next exp>* <next exp>
(88<<16)+2,
// <next exp>* ::= <next exp>
(88<<16)+1,
// any* ::= any* any
(160<<16)+2,
// any* ::= any
(160<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// <listElement>* ::= <listElement>* <listElement>
(25<<16)+2,
// <listElement>* ::= <listElement>
(25<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(158<<16)+2,
// hexDigit* ::= hexDigit
(158<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// <case>* ::= <case>* <case>
(52<<16)+2,
// <case>* ::= <case>
(52<<16)+1,
// idChar* ::= idChar* idChar
(154<<16)+2,
// idChar* ::= idChar
(154<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>
(86<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>
(166<<16)+2,
// <empty bracket pair>* ::= <empty bracket pair>
(166<<16)+1,
// $$0 ::= `; <for2> $$5
(43<<16)+3,
// $$0 ::= `; $$5
(43<<16)+2,
// $$1 ::= idChar128 ws*
(155<<16)+2,
// $$1 ::= idChar128
(155<<16)+1,
// $$2 ::= digit128 ws*
(157<<16)+2,
// $$2 ::= digit128
(157<<16)+1,
// $$3 ::= hexDigit128 ws*
(159<<16)+2,
// $$3 ::= hexDigit128
(159<<16)+1,
// $$4 ::= any128 ws*
(161<<16)+2,
// $$4 ::= any128
(161<<16)+1,
// $$5 ::= `; <for3> `) <stmt>
(167<<16)+4,
// $$5 ::= `; `) <stmt>
(167<<16)+3,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
124, // 0
124, // 1
124, // 2
124, // 3
124, // 4
124, // 5
124, // 6
124, // 7
124, // 8
124, // 9
144, // 10
124, // 11
124, // 12
124, // 13
124, // 14
124, // 15
124, // 16
124, // 17
124, // 18
124, // 19
124, // 20
124, // 21
124, // 22
124, // 23
124, // 24
124, // 25
124, // 26
124, // 27
124, // 28
124, // 29
124, // 30
124, // 31
126, // " "
146, // "!"
148, // '"'
127, // "#"
124, // "$"
136, // "%"
128, // "&"
147, // "'"
137, // "("
129, // ")"
149, // "*"
138, // "+"
130, // ","
122, // "-"
139, // "."
132, // "/"
117, // "0"
116, // "1"
116, // "2"
116, // "3"
116, // "4"
116, // "5"
116, // "6"
116, // "7"
116, // "8"
116, // "9"
141, // ":"
133, // ";"
123, // "<"
142, // "="
134, // ">"
124, // "?"
143, // "@"
98, // "A"
98, // "B"
98, // "C"
98, // "D"
98, // "E"
98, // "F"
98, // "G"
98, // "H"
98, // "I"
98, // "J"
98, // "K"
98, // "L"
98, // "M"
98, // "N"
98, // "O"
98, // "P"
98, // "Q"
98, // "R"
98, // "S"
98, // "T"
98, // "U"
98, // "V"
98, // "W"
98, // "X"
98, // "Y"
98, // "Z"
121, // "["
124, // "\"
131, // "]"
124, // "^"
140, // "_"
124, // "`"
92, // "a"
106, // "b"
97, // "c"
93, // "d"
107, // "e"
99, // "f"
98, // "g"
108, // "h"
100, // "i"
98, // "j"
98, // "k"
101, // "l"
98, // "m"
109, // "n"
102, // "o"
94, // "p"
98, // "q"
103, // "r"
95, // "s"
110, // "t"
104, // "u"
96, // "v"
111, // "w"
105, // "x"
98, // "y"
98, // "z"
135, // "{"
125, // "|"
145, // "}"
124, // "~"
124, // 127
152, // 128
152, // 129
152, // 130
152, // 131
152, // 132
152, // 133
152, // 134
152, // 135
152, // 136
152, // 137
152, // 138
152, // 139
152, // 140
152, // 141
152, // 142
152, // 143
152, // 144
152, // 145
152, // 146
152, // 147
152, // 148
152, // 149
152, // 150
152, // 151
152, // 152
152, // 153
152, // 154
152, // 155
152, // 156
152, // 157
152, // 158
152, // 159
152, // 160
152, // 161
152, // 162
152, // 163
152, // 164
152, // 165
152, // 166
152, // 167
152, // 168
152, // 169
152, // 170
152, // 171
152, // 172
152, // 173
152, // 174
152, // 175
119, // 176
119, // 177
119, // 178
119, // 179
119, // 180
119, // 181
119, // 182
119, // 183
119, // 184
119, // 185
152, // 186
152, // 187
152, // 188
152, // 189
152, // 190
152, // 191
152, // 192
114, // 193
114, // 194
114, // 195
114, // 196
114, // 197
114, // 198
113, // 199
113, // 200
113, // 201
113, // 202
113, // 203
113, // 204
113, // 205
113, // 206
113, // 207
113, // 208
113, // 209
113, // 210
113, // 211
113, // 212
113, // 213
113, // 214
113, // 215
113, // 216
113, // 217
113, // 218
152, // 219
152, // 220
152, // 221
152, // 222
151, // 223
152, // 224
114, // 225
114, // 226
114, // 227
114, // 228
114, // 229
114, // 230
113, // 231
113, // 232
113, // 233
113, // 234
113, // 235
113, // 236
113, // 237
113, // 238
113, // 239
113, // 240
113, // 241
113, // 242
113, // 243
113, // 244
113, // 245
113, // 246
113, // 247
113, // 248
113, // 249
113, // 250
152, // 251
152, // 252
152, // 253
152, // 254
152, // 255
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
"<stmt> ::= # `if `( <exp> `) <stmt> !`else #", // 31
"<stmt> ::= # `if `( <exp> `) <stmt> # `else <stmt>", // 32
"<stmt> ::= # `for `( <for1> `; <for2> `; <for3> `) <stmt>", // 33
"<stmt> ::= # `for `( <for1> `; <for2> `; <for3> `) <stmt>", // 34
"<for1> ::= <local var decl>", // 35
"<for1> ::= <assign>", // 36
"<for1> ::= # <methodCall>", // 37
"<for2> ::= <exp>", // 38
"<for3> ::= # <methodCall>", // 39
"<for3> ::= <assign>", // 40
"<stmt> ::= # `while `( <exp> `) <stmt>", // 41
"<stmt> ::= # `break `;", // 42
"<assign> ::= <exp> # `= <exp>", // 43
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
"<exp4> ::= <exp4> # `+ <exp3>", // 71
"<exp4> ::= <exp4> # `- <exp3>", // 72
"<exp3> ::= <exp3> # `* <exp2>", // 73
"<exp3> ::= <exp3> # `/ <exp2>", // 74
"<exp3> ::= <exp3> # `% <exp2>", // 75
"<exp2> ::= # `( <type> `) <exp1>", // 76
"<exp2> ::= # `+ <exp1>", // 77
"<exp2> ::= # `- <exp1>", // 78
"<exp2> ::= # `! <exp1>", // 79
"<exp1> ::= # ID", // 80
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 81
"<exp1> ::= # INTLIT", // 82
"<exp1> ::= # STRINGLIT", // 83
"<exp1> ::= # CHARLIT", // 84
"<exp1> ::= <exp1> `. # ID", // 85
"<exp1> ::= # `this", // 86
"<exp1> ::= # `true", // 87
"<exp1> ::= # `false", // 88
"<exp1> ::= # `null", // 89
"<exp1> ::= # `new # ID `( `)", // 90
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 91
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 92
"<expList> ::= <exp> <next exp>*", // 93
"<expList> ::= <exp> <next exp>*", // 94
"<next exp> ::= `, <exp>", // 95
"<methodCall> ::= # <exp1> `. ID `( <expList> `)", // 96
"<methodCall> ::= # <exp1> `. ID `( <expList> `)", // 97
"<methodCall> ::= # `super `. # ID `( <expList> `)", // 98
"<methodCall> ::= # `super `. # ID `( <expList> `)", // 99
"<methodCall> ::= # ID `( <expList> `)", // 100
"<methodCall> ::= # ID `( <expList> `)", // 101
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 102
"letter128 ::= {193..218 225..250}", // 103
"digit ::= {\"0\"..\"9\"}", // 104
"digit128 ::= {176..185}", // 105
"any ::= {0..127}", // 106
"any128 ::= {128..255}", // 107
"ws ::= \" \"", // 108
"ws ::= {10} registerNewline", // 109
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 110
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 111
"`class ::= \"#\" \"c\" \"l\" ws*", // 112
"`class ::= \"#\" \"c\" \"l\" ws*", // 113
"`extends ::= \"#\" \"e\" \"x\" ws*", // 114
"`extends ::= \"#\" \"e\" \"x\" ws*", // 115
"`void ::= \"#\" \"v\" \"o\" ws*", // 116
"`void ::= \"#\" \"v\" \"o\" ws*", // 117
"`int ::= \"#\" \"i\" \"t\" ws*", // 118
"`int ::= \"#\" \"i\" \"t\" ws*", // 119
"`while ::= \"#\" \"w\" \"h\" ws*", // 120
"`while ::= \"#\" \"w\" \"h\" ws*", // 121
"`if ::= \"#\" \"+\" ws*", // 122
"`if ::= \"#\" \"+\" ws*", // 123
"`else ::= \"#\" \"e\" \"l\" ws*", // 124
"`else ::= \"#\" \"e\" \"l\" ws*", // 125
"`for ::= \"#\" \"f\" \"o\" ws*", // 126
"`for ::= \"#\" \"f\" \"o\" ws*", // 127
"`break ::= \"#\" \"b\" \"r\" ws*", // 128
"`break ::= \"#\" \"b\" \"r\" ws*", // 129
"`this ::= \"#\" \"t\" \"h\" ws*", // 130
"`this ::= \"#\" \"t\" \"h\" ws*", // 131
"`false ::= \"#\" \"f\" \"a\" ws*", // 132
"`false ::= \"#\" \"f\" \"a\" ws*", // 133
"`true ::= \"#\" \"t\" \"r\" ws*", // 134
"`true ::= \"#\" \"t\" \"r\" ws*", // 135
"`super ::= \"#\" \"s\" \"u\" ws*", // 136
"`super ::= \"#\" \"s\" \"u\" ws*", // 137
"`null ::= \"#\" \"n\" \"u\" ws*", // 138
"`null ::= \"#\" \"n\" \"u\" ws*", // 139
"`return ::= \"#\" \"r\" \"e\" ws*", // 140
"`return ::= \"#\" \"r\" \"e\" ws*", // 141
"`new ::= \"#\" \"n\" \"e\" ws*", // 142
"`new ::= \"#\" \"n\" \"e\" ws*", // 143
"`case ::= \"#\" \"c\" \"e\" ws*", // 144
"`case ::= \"#\" \"c\" \"e\" ws*", // 145
"`default ::= \"#\" \"d\" \"e\" ws*", // 146
"`default ::= \"#\" \"d\" \"e\" ws*", // 147
"`public ::= \"#\" \"p\" \"u\" ws*", // 148
"`public ::= \"#\" \"p\" \"u\" ws*", // 149
"`switch ::= \"#\" \"s\" \"w\" ws*", // 150
"`switch ::= \"#\" \"s\" \"w\" ws*", // 151
"`! ::= \"!\" ws*", // 152
"`! ::= \"!\" ws*", // 153
"`!= ::= \"@\" \"!\" ws*", // 154
"`!= ::= \"@\" \"!\" ws*", // 155
"`% ::= \"%\" ws*", // 156
"`% ::= \"%\" ws*", // 157
"`&& ::= \"@\" \"&\" ws*", // 158
"`&& ::= \"@\" \"&\" ws*", // 159
"`* ::= \"*\" ws*", // 160
"`* ::= \"*\" ws*", // 161
"`( ::= \"(\" ws*", // 162
"`( ::= \"(\" ws*", // 163
"`) ::= \")\" ws*", // 164
"`) ::= \")\" ws*", // 165
"`{ ::= \"{\" ws*", // 166
"`{ ::= \"{\" ws*", // 167
"`} ::= \"}\" ws*", // 168
"`} ::= \"}\" ws*", // 169
"`- ::= \"-\" ws*", // 170
"`- ::= \"-\" ws*", // 171
"`+ ::= \"+\" ws*", // 172
"`+ ::= \"+\" ws*", // 173
"`= ::= \"=\" ws*", // 174
"`= ::= \"=\" ws*", // 175
"`== ::= \"@\" \"=\" ws*", // 176
"`== ::= \"@\" \"=\" ws*", // 177
"`[ ::= \"[\" ws*", // 178
"`[ ::= \"[\" ws*", // 179
"`] ::= \"]\" ws*", // 180
"`] ::= \"]\" ws*", // 181
"`|| ::= \"@\" \"|\" ws*", // 182
"`|| ::= \"@\" \"|\" ws*", // 183
"`< ::= \"<\" ws*", // 184
"`< ::= \"<\" ws*", // 185
"`<= ::= \"@\" \"<\" ws*", // 186
"`<= ::= \"@\" \"<\" ws*", // 187
"`, ::= \",\" ws*", // 188
"`, ::= \",\" ws*", // 189
"`> ::= \">\" !\"=\" ws*", // 190
"`> ::= \">\" !\"=\" ws*", // 191
"`: ::= \":\" ws*", // 192
"`: ::= \":\" ws*", // 193
"`. ::= \".\" ws*", // 194
"`. ::= \".\" ws*", // 195
"`; ::= \";\" ws*", // 196
"`; ::= \";\" ws*", // 197
"`++ ::= \"@\" \"+\" ws*", // 198
"`++ ::= \"@\" \"+\" ws*", // 199
"`-- ::= \"@\" \"-\" ws*", // 200
"`-- ::= \"@\" \"-\" ws*", // 201
"`/ ::= \"/\" ws*", // 202
"`/ ::= \"/\" ws*", // 203
"ID ::= letter128 ws*", // 204
"ID ::= letter128 ws*", // 205
"ID ::= letter idChar* idChar128 ws*", // 206
"ID ::= letter idChar* idChar128 ws*", // 207
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 208
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 209
"INTLIT ::= digit128 ws*", // 210
"INTLIT ::= digit128 ws*", // 211
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 212
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 213
"STRINGLIT ::= \"@\" \'\"\' ws*", // 214
"STRINGLIT ::= \"@\" \'\"\' ws*", // 215
"STRINGLIT ::= \'\"\' any* any128 ws*", // 216
"STRINGLIT ::= \'\"\' any* any128 ws*", // 217
"CHARLIT ::= \"\'\" any ws*", // 218
"CHARLIT ::= \"\'\" any ws*", // 219
"idChar ::= letter", // 220
"idChar ::= digit", // 221
"idChar ::= \"_\"", // 222
"idChar128 ::= letter128", // 223
"idChar128 ::= digit128", // 224
"idChar128 ::= {223}", // 225
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 226
"hexDigit128 ::= {176..185 193..198 225..230}", // 227
"digit* ::= digit* digit", // 228
"digit* ::= digit* digit", // 229
"<next exp>* ::= <next exp>* <next exp>", // 230
"<next exp>* ::= <next exp>* <next exp>", // 231
"any* ::= any* any", // 232
"any* ::= any* any", // 233
"<decl in class>* ::= <decl in class>* <decl in class>", // 234
"<decl in class>* ::= <decl in class>* <decl in class>", // 235
"<listElement>* ::= <listElement>* <listElement>", // 236
"<listElement>* ::= <listElement>* <listElement>", // 237
"hexDigit* ::= hexDigit* hexDigit", // 238
"hexDigit* ::= hexDigit* hexDigit", // 239
"<stmt>* ::= <stmt>* <stmt>", // 240
"<stmt>* ::= <stmt>* <stmt>", // 241
"<case>* ::= <case>* <case>", // 242
"<case>* ::= <case>* <case>", // 243
"idChar* ::= idChar* idChar", // 244
"idChar* ::= idChar* idChar", // 245
"<class decl>+ ::= <class decl>", // 246
"<class decl>+ ::= <class decl>+ <class decl>", // 247
"<empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>", // 248
"ws* ::= ws* ws", // 249
"ws* ::= ws* ws", // 250
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 251
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 252
"", // 253
"", // 254
"", // 255
"", // 256
"", // 257
"", // 258
"", // 259
"", // 260
"", // 261
"", // 262
"", // 263
"", // 264
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
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 13: <method decl> ::= `public !`void <type> [#] ID <formalList> `{ [<stmt>*] <returnStmt> `} @createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Statement>,Exp)=>Decl
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
    { // 21: <type> ::= [#] `void @voidType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 22: <type> ::= [#] `null @nullType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 23: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 24: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
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
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 27: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
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
    { // 30: <stmt> ::= [#] <methodCall> `; @newCallStatement(int,Call)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 31: <stmt> ::= [#] `if `( <exp> `) <stmt> !`else [#] @newIfOnlyBlock(int,Exp,Statement,int)=>Statement
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
    { // 32: <stmt> ::= [#] `if `( <exp> `) <stmt> [#] `else <stmt> @newIfElseBlock(int,Exp,Statement,int,Statement)=>Statement
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
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 33: <stmt> ::= [#] `for `( <for1> $$0 @newForLoop(int,Statement,Exp,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x0)/*popToPushBack:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 34: <stmt> ::= [#] `for `( [<for1>] $$0 @newForLoop(int,Statement,Exp,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x0)/*popToPushBack:3*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 35: <for1> ::= <local var decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 36: <for1> ::= <assign> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 37: <for1> ::= [#] <methodCall> @newFor1CallStatement(int,Call)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 38: <for2> ::= <exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: <for3> ::= [#] <methodCall> @newFor3CallStatement(int,Call)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 40: <for3> ::= <assign> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: <stmt> ::= [#] `while `( <exp> `) <stmt> @newWhileBlock(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 42: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 43: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
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
    { // 71: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 72: <exp4> ::= <exp4> [#] `- <exp3> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 73: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 74: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 75: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 76: <exp2> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 77: <exp2> ::= [#] `+ <exp1> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 78: <exp2> ::= [#] `- <exp1> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 79: <exp2> ::= [#] `! <exp1> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 80: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 81: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 82: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 83: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 84: <exp1> ::= [#] CHARLIT @newCharLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 85: <exp1> ::= <exp1> `. [#] ID @newInstVarAccess(Exp,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 86: <exp1> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 87: <exp1> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 88: <exp1> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 89: <exp1> ::= [#] `null @newNullExp(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 90: <exp1> ::= [#] `new [#] ID `( `) @newObject(int,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 91: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] <empty bracket pair>** @newArray(Type,int,Exp,List<Object>)=>Exp
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
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 92: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] !<empty bracket pair> [<empty bracket pair>**] @newArray(Type,int,Exp,List<Object>)=>Exp
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 93: <expList> ::= <exp> <next exp>* @newExpList(Exp,List<Exp>)=>ExpList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 94: <expList> ::= <exp> [<next exp>*] @newExpList(Exp,List<Exp>)=>ExpList
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 95: <next exp> ::= `, <exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 96: <methodCall> ::= [#] <exp1> `. ID `( <expList> `) @newMethodCall(int,Exp,String,ExpList)=>Call
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
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 97: <methodCall> ::= [#] <exp1> `. ID `( [<expList>] `) @newMethodCall(int,Exp,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 98: <methodCall> ::= [#] `super `. [#] ID `( <expList> `) @newSuperMethodCall(int,int,String,ExpList)=>Call
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
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 99: <methodCall> ::= [#] `super `. [#] ID `( [<expList>] `) @newSuperMethodCall(int,int,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 100: <methodCall> ::= [#] ID `( <expList> `) @newThisMethodCall(int,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 101: <methodCall> ::= [#] ID `( [<expList>] `) @newThisMethodCall(int,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 102: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 103: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 104: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 105: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 106: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 107: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 108: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 109: ws ::= {10} [registerNewline] @void
      ((17<<5)|0x6)/*nullProductionAction:17*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 110: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 111: `boolean ::= "#" "b" "o" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 112: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 113: `class ::= "#" "c" "l" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 114: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 115: `extends ::= "#" "e" "x" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 116: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 117: `void ::= "#" "v" "o" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 118: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 119: `int ::= "#" "i" "t" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 120: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 121: `while ::= "#" "w" "h" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 122: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 123: `if ::= "#" "+" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 124: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 125: `else ::= "#" "e" "l" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 126: `for ::= "#" "f" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 127: `for ::= "#" "f" "o" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 128: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 129: `break ::= "#" "b" "r" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 130: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 131: `this ::= "#" "t" "h" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 132: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 133: `false ::= "#" "f" "a" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 134: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 135: `true ::= "#" "t" "r" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 136: `super ::= "#" "s" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 137: `super ::= "#" "s" "u" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 138: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 139: `null ::= "#" "n" "u" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 140: `return ::= "#" "r" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 141: `return ::= "#" "r" "e" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 142: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 143: `new ::= "#" "n" "e" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 144: `case ::= "#" "c" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 145: `case ::= "#" "c" "e" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 146: `default ::= "#" "d" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 147: `default ::= "#" "d" "e" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 148: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 149: `public ::= "#" "p" "u" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 150: `switch ::= "#" "s" "w" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 151: `switch ::= "#" "s" "w" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 152: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `! ::= "!" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `!= ::= "@" "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 155: `!= ::= "@" "!" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 156: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `% ::= "%" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 159: `&& ::= "@" "&" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 160: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: `* ::= "*" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `( ::= "(" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 164: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `) ::= ")" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 166: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 167: `{ ::= "{" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 169: `} ::= "}" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 171: `- ::= "-" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `+ ::= "+" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 174: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 175: `= ::= "=" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 176: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 177: `== ::= "@" "=" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 178: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: `[ ::= "[" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 180: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 181: `] ::= "]" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 182: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 183: `|| ::= "@" "|" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 184: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 185: `< ::= "<" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 186: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 187: `<= ::= "@" "<" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 188: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 189: `, ::= "," [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 190: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 191: `> ::= ">" !"=" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 192: `: ::= ":" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 193: `: ::= ":" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 194: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 195: `. ::= "." [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 196: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 197: `; ::= ";" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 198: `++ ::= "@" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 199: `++ ::= "@" "+" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 200: `-- ::= "@" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 201: `-- ::= "@" "-" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 202: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 203: `/ ::= "/" [ws*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 204: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 205: ID ::= letter128 [ws*] @text
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 206: ID ::= letter idChar* $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 207: ID ::= letter [idChar*] $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 208: INTLIT ::= {"1".."9"} digit* $$2 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 209: INTLIT ::= {"1".."9"} [digit*] $$2 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 210: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 211: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 212: INTLIT ::= "0" hexDigit* $$3 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 213: INTLIT ::= "0" [hexDigit*] $$3 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 214: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 215: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 216: STRINGLIT ::= '"' any* $$4 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 217: STRINGLIT ::= '"' [any*] $$4 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 218: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 219: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 220: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 221: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 222: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 223: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 224: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 225: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 226: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 227: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 228: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 229: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 230: <next exp>* ::= <next exp>* <next exp> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 231: <next exp>* ::= [<next exp>*] <next exp> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 232: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 233: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 234: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 235: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 236: <listElement>* ::= <listElement>* <listElement> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 237: <listElement>* ::= [<listElement>*] <listElement> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 238: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 239: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 240: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 241: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 242: <case>* ::= <case>* <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 243: <case>* ::= [<case>*] <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 244: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 245: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 246: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 247: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 248: <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 249: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 250: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
    },
    { // 251: <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 252: <empty bracket pair>* ::= [<empty bracket pair>*] <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 253: $$0 ::= `; <for2> $$5 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 254: $$0 ::= `; [<for2>] $$5 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((15<<5)|0x6)/*nullProductionAction:15*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 255: $$1 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 256: $$1 ::= idChar128 [ws*] @pass
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 257: $$2 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 258: $$2 ::= digit128 [ws*] @pass
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 259: $$3 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 260: $$3 ::= hexDigit128 [ws*] @pass
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 261: $$4 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 262: $$4 ::= any128 [ws*] @pass
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 263: $$5 ::= `; <for3> `) <stmt> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 264: $$5 ::= `; [<for3>] `) <stmt> @pass
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
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // hexDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <expList>
      ((76<<5)|0x5)/*methodCall:76*/,
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
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // digit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <for2>
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((16<<5)|0x6)/*nullProductionAction:16*/,
      ((79<<5)|0x5)/*methodCall:79*/,
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
      Statement result = actionObject.newCallStatement(parm0,parm1);
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
      Call parm1 = (Call)si.popPb();
      Statement result = actionObject.newFor1CallStatement(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      Call parm1 = (Call)si.popPb();
      Statement result = actionObject.newFor3CallStatement(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.newWhileBlock(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 24: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
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
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 43: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 44: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 45: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 46: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 52: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 55: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 56: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstVarAccess(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 57: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 58: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 59: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 60: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNullExp(parm0);
      si.pushPb(result);
    }
    break;
    case 61: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newObject(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 62: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      List<Object> parm3 = (List<Object>)si.popPb();
      Exp result = actionObject.newArray(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 63: {
      Exp parm0 = (Exp)si.popPb();
      List<Exp> parm1 = (List<Exp>)si.popPb();
      ExpList result = actionObject.newExpList(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 64: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      String parm2 = (String)si.popPb();
      ExpList parm3 = (ExpList)si.popPb();
      Call result = actionObject.newMethodCall(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 65: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      ExpList parm3 = (ExpList)si.popPb();
      Call result = actionObject.newSuperMethodCall(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 66: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      ExpList parm2 = (ExpList)si.popPb();
      Call result = actionObject.newThisMethodCall(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 67: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 68: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 69: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 70: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 71: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 72: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 73: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 74: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 75: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newFor1EmptyStmt(parm0);
      si.pushPb(result);
    }
    break;
    case 76: {
      ExpList result = actionObject.newEmptyExpList();
      si.pushPb(result);
    }
    break;
    case 77: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newFor3EmptyStmt(parm0);
      si.pushPb(result);
    }
    break;
    case 78: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFor2True(parm0);
      si.pushPb(result);
    }
    break;
    case 79: {
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
"Statement newCallStatement(int,Call)",
"Statement newIfOnlyBlock(int,Exp,Statement,int)",
"Statement newIfElseBlock(int,Exp,Statement,int,Statement)",
"Statement newForLoop(int,Statement,Exp,Statement,Statement)",
"Statement newFor1CallStatement(int,Call)",
"Statement newFor3CallStatement(int,Call)",
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
