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
public int getEofSym() { return 146; }
public int getNttSym() { return 147; }
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
"`--",
"`switch",
"<case>*",
"<case>",
"`case",
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
"\"|\"",
"\" \"",
"\"#\"",
"\"&\"",
"\")\"",
"\"]\"",
"\"/\"",
"\";\"",
"{0..9 11..31 \"$\" \",\" \":\" \"?\" \"\\\" \"^\" \"`\" \"~\"..127}",
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
public int numSymbols() { return 148;}
private static final int MIN_REDUCTION = 618;
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
1,549, // <start>
2,309, // ws*
3,608, // <program>
4,71, // <class decl>+
5,538, // <class decl>
6,426, // `class
106,101, // " "
107,591, // "#"
123,31, // {10}
132,428, // ws
  }
,
{ // state 1
  }
,
{ // state 2
2,34, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 3
24,MIN_REDUCTION+81, // `[
102,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 4
106,101, // " "
123,31, // {10}
132,49, // ws
147,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 5
0x80000000|1, // match move
0x80000000|215, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 6
24,MIN_REDUCTION+169, // `[
102,MIN_REDUCTION+169, // "["
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 7
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 8
2,87, // ws*
106,606, // " "
123,198, // {10}
132,249, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 9
0x80000000|335, // match move
0x80000000|181, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 10
0x80000000|397, // match move
0x80000000|572, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 11
0x80000000|1, // match move
0x80000000|557, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
0x80000000|1, // match move
0x80000000|197, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 13
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 14
0x80000000|93, // match move
0x80000000|433, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 15
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 16
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 17
24,MIN_REDUCTION+80, // `[
102,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 18
17,347, // `)
109,486, // ")"
  }
,
{ // state 19
0x80000000|1, // match move
0x80000000|412, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 20
0x80000000|282, // match move
0x80000000|342, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 21
0x80000000|1, // match move
0x80000000|554, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 22
0x80000000|1, // match move
0x80000000|289, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 23
0x80000000|279, // match move
0x80000000|6, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 24
32,107, // `else
107,111, // "#"
  }
,
{ // state 25
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 26
28,121, // `;
112,192, // ";"
  }
,
{ // state 27
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
295, // `{
-1, // <decl in class>*
94, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
419, // `void
465, // `(
-1, // `)
418, // <stmt>*
534, // <type>
388, // `int
161, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
32, // <stmt>
140, // <assign>
95, // `;
548, // <local var decl>
532, // `if
307, // <exp>
-1, // `else
146, // `for
330, // `while
530, // `break
-1, // `=
232, // `++
542, // `--
598, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
175, // <exp8>
366, // <exp7>
189, // <exp6>
372, // <exp5>
286, // <exp4>
468, // <exp3>
229, // <exp2>
134, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
503, // `+
321, // `-
-1, // `*
-1, // `/
-1, // `%
258, // `!
448, // INTLIT
136, // STRINGLIT
359, // CHARLIT
-1, // `.
274, // `this
19, // `true
275, // `false
76, // `new
-1, // <empty bracket pair>**
420, // letter
442, // "a"
442, // "p"
442, // "s"
442, // "v"
442, // "c"
442, // "f"
442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
442, // "i"
442, // "l"
442, // "o"
442, // "r"
442, // "u"
442, // "x"
442, // "b"
442, // "e"
442, // "h"
442, // "n"
442, // "t"
442, // "w"
450, // letter128
353, // {199..218 231..250}
353, // {193..198 225..230}
-1, // digit
265, // {"1".."9"}
324, // "0"
417, // digit128
58, // {176..185}
-1, // any
-1, // "["
303, // "-"
-1, // "<"
-1, // "|"
-1, // " "
436, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
368, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
461, // "{"
-1, // "%"
500, // "("
106, // "+"
-1, // "."
-1, // "_"
-1, // "="
272, // "@"
-1, // {10}
375, // "}"
376, // "!"
338, // "'"
172, // '"'
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
{ // state 28
24,MIN_REDUCTION+170, // `[
102,MIN_REDUCTION+170, // "["
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 29
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 30
106,606, // " "
123,198, // {10}
132,122, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 31
147,MIN_REDUCTION+81, // $NT
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 33
2,60, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 34
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 35
0x80000000|1, // match move
0x80000000|37, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 36
0x80000000|1, // match move
0x80000000|241, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 37
24,MIN_REDUCTION+175, // `[
102,MIN_REDUCTION+175, // "["
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 38
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 39
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 40
79,333, // "f"
90,407, // "n"
91,83, // "t"
  }
,
{ // state 41
0x80000000|238, // match move
0x80000000|285, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 42
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 43
28,336, // `;
112,368, // ";"
  }
,
{ // state 44
8,369, // `{
115,461, // "{"
  }
,
{ // state 45
2,207, // ws*
  }
,
{ // state 46
0x80000000|84, // match move
0x80000000|476, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 47
24,MIN_REDUCTION+64, // `[
102,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 48
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 49
147,MIN_REDUCTION+207, // $NT
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 50
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 52
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 53
77,398, // "v"
81,541, // "i"
87,113, // "b"
90,301, // "n"
  }
,
{ // state 54
2,399, // ws*
24,MIN_REDUCTION+212, // `[
102,MIN_REDUCTION+212, // "["
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 55
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 56
0x80000000|493, // match move
0x80000000|489, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 57
7,12, // ID
16,465, // `(
22,5, // `null
27,233, // <assign>
31,307, // <exp>
37,232, // `++
38,542, // `--
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,272, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 58
0x80000000|290, // match move
0x80000000|206, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 59
24,MIN_REDUCTION+71, // `[
102,MIN_REDUCTION+71, // "["
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 60
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 61
16,384, // `(
117,500, // "("
  }
,
{ // state 62
8,523, // `{
115,461, // "{"
  }
,
{ // state 63
24,MIN_REDUCTION+176, // `[
102,MIN_REDUCTION+176, // "["
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 64
24,MIN_REDUCTION+62, // `[
102,MIN_REDUCTION+62, // "["
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 65
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 66
91,243, // "t"
  }
,
{ // state 67
24,511, // `[
67,270, // `.
102,33, // "["
119,2, // "."
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 68
0x80000000|344, // match move
0x80000000|508, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 69
2,16, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 70
2,39, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 71
5,584, // <class decl>
6,426, // `class
107,591, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 72
0x80000000|537, // match move
0x80000000|191, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 73
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 74
7,460, // ID
16,465, // `(
22,5, // `null
47,334, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 75
2,349, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 76
7,126, // ID
15,547, // `void
19,89, // <type>
20,178, // `int
21,261, // `boolean
22,603, // `null
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
107,53, // "#"
  }
,
{ // state 77
2,133, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 79
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 80
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 81
0x80000000|45, // match move
0x80000000|204, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 82
0x80000000|1, // match move
0x80000000|607, // no-match move
// T-test match for "=":
121,
  }
,
{ // state 83
84,525, // "r"
89,478, // "h"
  }
,
{ // state 84
2,416, // ws*
  }
,
{ // state 85
7,460, // ID
16,465, // `(
22,5, // `null
31,543, // <exp>
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 86
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 87
0x80000000|127, // match move
0x80000000|533, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 88
7,460, // ID
16,465, // `(
22,5, // `null
48,256, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 89
0x80000000|230, // match move
0x80000000|170, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 90
55,575, // `<
56,102, // `<=
57,74, // `>
104,400, // "<"
114,82, // ">"
122,299, // "@"
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 91
17,MIN_REDUCTION+146, // `)
25,MIN_REDUCTION+146, // `]
28,MIN_REDUCTION+146, // `;
52,MIN_REDUCTION+146, // `&&
53,MIN_REDUCTION+146, // `==
54,MIN_REDUCTION+146, // `!=
72,MIN_REDUCTION+146, // <empty bracket pair>**
106,377, // " "
109,MIN_REDUCTION+146, // ")"
110,MIN_REDUCTION+146, // "]"
112,MIN_REDUCTION+146, // ";"
122,MIN_REDUCTION+146, // "@"
123,255, // {10}
132,222, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 92
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 93
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 94
0x80000000|394, // match move
0x80000000|195, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 95
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 96
7,460, // ID
16,465, // `(
22,5, // `null
31,288, // <exp>
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 97
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 98
2,546, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 99
24,MIN_REDUCTION+106, // `[
102,MIN_REDUCTION+106, // "["
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 100
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 101
147,MIN_REDUCTION+80, // $NT
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 102
7,460, // ID
16,465, // `(
22,5, // `null
47,415, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 103
7,MIN_REDUCTION+15, // ID
24,MIN_REDUCTION+61, // `[
37,592, // `++
38,483, // `--
74,MIN_REDUCTION+15, // "a"
75,MIN_REDUCTION+15, // "p"
76,MIN_REDUCTION+15, // "s"
77,MIN_REDUCTION+15, // "v"
78,MIN_REDUCTION+15, // "c"
79,MIN_REDUCTION+15, // "f"
80,MIN_REDUCTION+15, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,MIN_REDUCTION+15, // "i"
82,MIN_REDUCTION+15, // "l"
83,MIN_REDUCTION+15, // "o"
84,MIN_REDUCTION+15, // "r"
85,MIN_REDUCTION+15, // "u"
86,MIN_REDUCTION+15, // "x"
87,MIN_REDUCTION+15, // "b"
88,MIN_REDUCTION+15, // "e"
89,MIN_REDUCTION+15, // "h"
90,MIN_REDUCTION+15, // "n"
91,MIN_REDUCTION+15, // "t"
92,MIN_REDUCTION+15, // "w"
94,MIN_REDUCTION+15, // {199..218 231..250}
95,MIN_REDUCTION+15, // {193..198 225..230}
102,MIN_REDUCTION+61, // "["
122,123, // "@"
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 104
2,593, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 105
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 106
2,156, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 107
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
295, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
419, // `void
465, // `(
-1, // `)
-1, // <stmt>*
534, // <type>
388, // `int
161, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
430, // <stmt>
140, // <assign>
95, // `;
548, // <local var decl>
532, // `if
307, // <exp>
-1, // `else
146, // `for
330, // `while
530, // `break
-1, // `=
232, // `++
542, // `--
598, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
175, // <exp8>
366, // <exp7>
189, // <exp6>
372, // <exp5>
286, // <exp4>
468, // <exp3>
229, // <exp2>
134, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
503, // `+
321, // `-
-1, // `*
-1, // `/
-1, // `%
258, // `!
448, // INTLIT
136, // STRINGLIT
359, // CHARLIT
-1, // `.
274, // `this
19, // `true
275, // `false
76, // `new
-1, // <empty bracket pair>**
420, // letter
442, // "a"
442, // "p"
442, // "s"
442, // "v"
442, // "c"
442, // "f"
442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
442, // "i"
442, // "l"
442, // "o"
442, // "r"
442, // "u"
442, // "x"
442, // "b"
442, // "e"
442, // "h"
442, // "n"
442, // "t"
442, // "w"
450, // letter128
353, // {199..218 231..250}
353, // {193..198 225..230}
-1, // digit
265, // {"1".."9"}
324, // "0"
417, // digit128
58, // {176..185}
-1, // any
-1, // "["
303, // "-"
-1, // "<"
-1, // "|"
-1, // " "
436, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
368, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
461, // "{"
-1, // "%"
500, // "("
106, // "+"
-1, // "."
-1, // "_"
-1, // "="
272, // "@"
-1, // {10}
-1, // "}"
376, // "!"
338, // "'"
172, // '"'
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
{ // state 108
24,MIN_REDUCTION+211, // `[
102,MIN_REDUCTION+211, // "["
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 109
0x80000000|576, // match move
0x80000000|350, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 110
2,151, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 111
88,464, // "e"
  }
,
{ // state 112
75,220, // "p"
  }
,
{ // state 113
83,454, // "o"
  }
,
{ // state 114
0x80000000|1, // match move
0x80000000|28, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 115
17,213, // `)
109,486, // ")"
  }
,
{ // state 116
24,MIN_REDUCTION+187, // `[
102,MIN_REDUCTION+187, // "["
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 117
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 118
0x80000000|1, // match move
0x80000000|63, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 119
2,4, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
147,MIN_REDUCTION+147, // $NT
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 120
0x80000000|615, // match move
0x80000000|103, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
0x80000000|527, // match move
0x80000000|431, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 122
0x80000000|48, // match move
0x80000000|587, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 123
103,578, // "-"
104,70, // "<"
105,597, // "|"
108,314, // "&"
118,588, // "+"
121,69, // "="
125,77, // "!"
  }
,
{ // state 124
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 125
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 126
0x80000000|615, // match move
0x80000000|568, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 127
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 128
0x80000000|374, // match move
0x80000000|169, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 129
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
295, // `{
-1, // <decl in class>*
469, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
419, // `void
465, // `(
-1, // `)
-1, // <stmt>*
534, // <type>
388, // `int
161, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
105, // <stmt>
140, // <assign>
95, // `;
548, // <local var decl>
532, // `if
307, // <exp>
-1, // `else
146, // `for
330, // `while
530, // `break
-1, // `=
232, // `++
542, // `--
598, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
175, // <exp8>
366, // <exp7>
189, // <exp6>
372, // <exp5>
286, // <exp4>
468, // <exp3>
229, // <exp2>
134, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
503, // `+
321, // `-
-1, // `*
-1, // `/
-1, // `%
258, // `!
448, // INTLIT
136, // STRINGLIT
359, // CHARLIT
-1, // `.
274, // `this
19, // `true
275, // `false
76, // `new
-1, // <empty bracket pair>**
420, // letter
442, // "a"
442, // "p"
442, // "s"
442, // "v"
442, // "c"
442, // "f"
442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
442, // "i"
442, // "l"
442, // "o"
442, // "r"
442, // "u"
442, // "x"
442, // "b"
442, // "e"
442, // "h"
442, // "n"
442, // "t"
442, // "w"
450, // letter128
353, // {199..218 231..250}
353, // {193..198 225..230}
-1, // digit
265, // {"1".."9"}
324, // "0"
417, // digit128
58, // {176..185}
-1, // any
-1, // "["
303, // "-"
-1, // "<"
-1, // "|"
-1, // " "
436, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
368, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
461, // "{"
-1, // "%"
500, // "("
106, // "+"
-1, // "."
-1, // "_"
-1, // "="
272, // "@"
-1, // {10}
331, // "}"
376, // "!"
338, // "'"
172, // '"'
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
{ // state 130
147,MIN_REDUCTION+17, // $NT
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 131
17,308, // `)
109,486, // ")"
  }
,
{ // state 132
83,104, // "o"
  }
,
{ // state 133
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 134
0x80000000|1, // match move
0x80000000|135, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 135
24,511, // `[
67,270, // `.
102,33, // "["
119,2, // "."
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 136
0x80000000|1, // match move
0x80000000|47, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 137
105,597, // "|"
108,314, // "&"
121,69, // "="
125,77, // "!"
  }
,
{ // state 138
7,460, // ID
22,5, // `null
50,235, // <exp1>
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
107,40, // "#"
122,390, // "@"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 139
16,424, // `(
117,500, // "("
  }
,
{ // state 140
28,357, // `;
112,368, // ";"
  }
,
{ // state 141
0x80000000|80, // match move
0x80000000|158, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 142
28,440, // `;
112,368, // ";"
  }
,
{ // state 143
0x80000000|1, // match move
0x80000000|264, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 144
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 145
86,98, // "x"
  }
,
{ // state 146
16,236, // `(
117,500, // "("
  }
,
{ // state 147
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 148
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 149
0x80000000|1, // match move
0x80000000|494, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 150
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 151
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 152
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 153
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 154
2,15, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 155
2,36, // ws*
24,MIN_REDUCTION+181, // `[
102,MIN_REDUCTION+181, // "["
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 156
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 157
7,403, // ID
73,519, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,318, // letter128
94,183, // {199..218 231..250}
95,183, // {193..198 225..230}
  }
,
{ // state 158
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 159
17,44, // `)
109,486, // ")"
  }
,
{ // state 160
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 162
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 163
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 164
16,85, // `(
117,500, // "("
  }
,
{ // state 165
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 166
0x80000000|1, // match move
0x80000000|528, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 167
17,138, // `)
23,245, // <empty bracket pair>
24,337, // `[
102,33, // "["
109,486, // ")"
  }
,
{ // state 168
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 169
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 170
24,96, // `[
102,33, // "["
  }
,
{ // state 171
0x80000000|7, // match move
0x80000000|30, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 172
74,51, // "a"
75,51, // "p"
76,51, // "s"
77,51, // "v"
78,51, // "c"
79,51, // "f"
80,51, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,51, // "i"
82,51, // "l"
83,51, // "o"
84,51, // "r"
85,51, // "u"
86,51, // "x"
87,51, // "b"
88,51, // "e"
89,51, // "h"
90,51, // "n"
91,51, // "t"
92,51, // "w"
94,613, // {199..218 231..250}
95,613, // {193..198 225..230}
97,51, // {"1".."9"}
98,51, // "0"
100,613, // {176..185}
101,160, // any
102,51, // "["
103,51, // "-"
104,51, // "<"
105,51, // "|"
106,51, // " "
107,51, // "#"
108,51, // "&"
109,51, // ")"
110,51, // "]"
111,51, // "/"
112,51, // ";"
113,51, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
114,51, // ">"
115,51, // "{"
116,51, // "%"
117,51, // "("
118,51, // "+"
119,51, // "."
120,51, // "_"
121,51, // "="
122,51, // "@"
123,51, // {10}
124,51, // "}"
125,51, // "!"
126,51, // "'"
127,51, // '"'
128,51, // "*"
129,68, // any128
130,613, // {223}
131,613, // {128..175 186..192 219..222 224 251..255}
139,327, // any*
140,143, // $$3
  }
,
{ // state 173
0x80000000|453, // match move
0x80000000|223, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 174
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 175
51,555, // `||
122,565, // "@"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 176
0x80000000|435, // match move
0x80000000|490, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 177
24,MIN_REDUCTION+208, // `[
102,MIN_REDUCTION+208, // "["
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 178
0x80000000|320, // match move
0x80000000|225, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 179
24,511, // `[
67,270, // `.
102,33, // "["
119,2, // "."
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 180
2,240, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 181
72,581, // <empty bracket pair>**
145,10, // <empty bracket pair>*
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 182
7,460, // ID
16,465, // `(
22,5, // `null
31,159, // <exp>
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 183
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 184
36,323, // `=
121,205, // "="
  }
,
{ // state 185
88,315, // "e"
  }
,
{ // state 186
0x80000000|316, // match move
0x80000000|515, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 187
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 188
0x80000000|386, // match move
0x80000000|421, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 189
53,389, // `==
54,472, // `!=
122,137, // "@"
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 190
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 191
2,14, // ws*
24,MIN_REDUCTION+109, // `[
102,MIN_REDUCTION+109, // "["
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 192
0x80000000|273, // match move
0x80000000|8, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 193
88,145, // "e"
  }
,
{ // state 194
24,MIN_REDUCTION+104, // `[
102,MIN_REDUCTION+104, // "["
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 196
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 197
24,MIN_REDUCTION+61, // `[
37,592, // `++
38,483, // `--
102,MIN_REDUCTION+61, // "["
122,123, // "@"
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 198
0x80000000|268, // match move
0x80000000|552, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 199
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 200
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 201
24,MIN_REDUCTION+102, // `[
102,MIN_REDUCTION+102, // "["
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 202
0x80000000|148, // match move
0x80000000|449, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 203
7,460, // ID
16,465, // `(
22,5, // `null
31,504, // <exp>
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 204
2,207, // ws*
24,MIN_REDUCTION+105, // `[
102,MIN_REDUCTION+105, // "["
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 205
2,496, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 206
24,MIN_REDUCTION+77, // `[
102,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 207
0x80000000|1, // match move
0x80000000|194, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 208
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 209
53,389, // `==
54,472, // `!=
122,137, // "@"
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 210
0x80000000|471, // match move
0x80000000|278, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 211
2,559, // ws*
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 212
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 213
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
27, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
419, // `void
465, // `(
-1, // `)
-1, // <stmt>*
534, // <type>
388, // `int
161, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
186, // <stmt>
250, // <assign>
452, // `;
26, // <local var decl>
164, // `if
307, // <exp>
-1, // `else
239, // `for
61, // `while
512, // `break
-1, // `=
232, // `++
542, // `--
219, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
175, // <exp8>
366, // <exp7>
189, // <exp6>
372, // <exp5>
286, // <exp4>
468, // <exp3>
229, // <exp2>
134, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
503, // `+
321, // `-
-1, // `*
-1, // `/
-1, // `%
258, // `!
448, // INTLIT
136, // STRINGLIT
359, // CHARLIT
-1, // `.
274, // `this
19, // `true
275, // `false
76, // `new
-1, // <empty bracket pair>**
420, // letter
442, // "a"
442, // "p"
442, // "s"
442, // "v"
442, // "c"
442, // "f"
442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
442, // "i"
442, // "l"
442, // "o"
442, // "r"
442, // "u"
442, // "x"
442, // "b"
442, // "e"
442, // "h"
442, // "n"
442, // "t"
442, // "w"
450, // letter128
353, // {199..218 231..250}
353, // {193..198 225..230}
-1, // digit
265, // {"1".."9"}
324, // "0"
417, // digit128
58, // {176..185}
-1, // any
-1, // "["
303, // "-"
-1, // "<"
-1, // "|"
-1, // " "
436, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
192, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
461, // "{"
-1, // "%"
500, // "("
106, // "+"
-1, // "."
-1, // "_"
-1, // "="
272, // "@"
-1, // {10}
-1, // "}"
376, // "!"
338, // "'"
172, // '"'
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
{ // state 214
105,597, // "|"
108,314, // "&"
  }
,
{ // state 215
24,MIN_REDUCTION+70, // `[
102,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 216
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 217
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 218
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 219
16,182, // `(
117,500, // "("
  }
,
{ // state 220
85,180, // "u"
  }
,
{ // state 221
24,MIN_REDUCTION+178, // `[
102,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 222
0x80000000|263, // match move
0x80000000|488, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 223
2,267, // ws*
24,MIN_REDUCTION+147, // `[
36,MIN_REDUCTION+147, // `=
51,MIN_REDUCTION+147, // `||
52,MIN_REDUCTION+147, // `&&
53,MIN_REDUCTION+147, // `==
54,MIN_REDUCTION+147, // `!=
55,MIN_REDUCTION+147, // `<
56,MIN_REDUCTION+147, // `<=
57,MIN_REDUCTION+147, // `>
62,MIN_REDUCTION+147, // `%
104,MIN_REDUCTION+147, // "<"
106,377, // " "
114,MIN_REDUCTION+147, // ">"
116,MIN_REDUCTION+147, // "%"
121,MIN_REDUCTION+147, // "="
122,MIN_REDUCTION+147, // "@"
123,255, // {10}
132,599, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 224
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 226
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 227
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 228
2,427, // ws*
24,MIN_REDUCTION+107, // `[
102,MIN_REDUCTION+107, // "["
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 230
23,283, // <empty bracket pair>
24,277, // `[
102,33, // "["
  }
,
{ // state 231
0x80000000|1, // match move
0x80000000|59, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 232
7,408, // ID
73,519, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,318, // letter128
94,183, // {199..218 231..250}
95,183, // {193..198 225..230}
  }
,
{ // state 233
17,326, // `)
109,486, // ")"
  }
,
{ // state 234
0x80000000|1, // match move
0x80000000|551, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 235
0x80000000|1, // match move
0x80000000|329, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 236
7,12, // ID
16,465, // `(
22,5, // `null
27,413, // <assign>
31,307, // <exp>
37,232, // `++
38,542, // `--
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,272, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 237
24,MIN_REDUCTION+172, // `[
102,MIN_REDUCTION+172, // "["
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 238
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 239
16,387, // `(
117,500, // "("
  }
,
{ // state 240
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 241
24,MIN_REDUCTION+180, // `[
102,MIN_REDUCTION+180, // "["
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 242
0x80000000|458, // match move
0x80000000|153, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 243
2,86, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 244
0x80000000|216, // match move
0x80000000|391, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 245
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 246
58,88, // `+
59,343, // `-
103,303, // "-"
118,106, // "+"
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 247
106,MIN_REDUCTION+80, // " "
123,MIN_REDUCTION+80, // {10}
132,MIN_REDUCTION+80, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 248
2,427, // ws*
  }
,
{ // state 249
0x80000000|65, // match move
0x80000000|300, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 250
28,20, // `;
112,192, // ";"
  }
,
{ // state 251
25,446, // `]
110,173, // "]"
  }
,
{ // state 252
17,573, // `)
109,486, // ")"
  }
,
{ // state 253
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 254
2,399, // ws*
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 255
0x80000000|571, // match move
0x80000000|3, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 256
60,281, // `*
61,487, // `/
62,497, // `%
111,154, // "/"
116,269, // "%"
128,516, // "*"
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 257
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 258
7,460, // ID
22,5, // `null
50,266, // <exp1>
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
107,40, // "#"
122,390, // "@"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 259
2,559, // ws*
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 260
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 261
0x80000000|150, // match move
0x80000000|144, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 262
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 263
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 264
24,MIN_REDUCTION+179, // `[
102,MIN_REDUCTION+179, // "["
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 265
96,498, // digit
97,294, // {"1".."9"}
98,294, // "0"
99,422, // digit128
100,58, // {176..185}
135,445, // digit*
136,21, // $$1
  }
,
{ // state 266
0x80000000|1, // match move
0x80000000|179, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 267
0x80000000|362, // match move
0x80000000|91, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 268
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 269
2,217, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 270
7,22, // ID
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
  }
,
{ // state 271
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 272
103,578, // "-"
118,588, // "+"
127,569, // '"'
  }
,
{ // state 273
2,87, // ws*
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 274
0x80000000|1, // match move
0x80000000|425, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 275
0x80000000|1, // match move
0x80000000|305, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 276
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 277
25,242, // `]
110,173, // "]"
  }
,
{ // state 278
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 279
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 280
24,MIN_REDUCTION+61, // `[
102,MIN_REDUCTION+61, // "["
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 281
7,460, // ID
16,465, // `(
22,5, // `null
49,600, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 282
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 283
0x80000000|474, // match move
0x80000000|550, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 284
2,456, // ws*
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 285
7,MIN_REDUCTION+14, // ID
24,MIN_REDUCTION+70, // `[
74,MIN_REDUCTION+14, // "a"
75,MIN_REDUCTION+14, // "p"
76,MIN_REDUCTION+14, // "s"
77,MIN_REDUCTION+14, // "v"
78,MIN_REDUCTION+14, // "c"
79,MIN_REDUCTION+14, // "f"
80,MIN_REDUCTION+14, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,MIN_REDUCTION+14, // "i"
82,MIN_REDUCTION+14, // "l"
83,MIN_REDUCTION+14, // "o"
84,MIN_REDUCTION+14, // "r"
85,MIN_REDUCTION+14, // "u"
86,MIN_REDUCTION+14, // "x"
87,MIN_REDUCTION+14, // "b"
88,MIN_REDUCTION+14, // "e"
89,MIN_REDUCTION+14, // "h"
90,MIN_REDUCTION+14, // "n"
91,MIN_REDUCTION+14, // "t"
92,MIN_REDUCTION+14, // "w"
94,MIN_REDUCTION+14, // {199..218 231..250}
95,MIN_REDUCTION+14, // {193..198 225..230}
102,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 286
58,88, // `+
59,343, // `-
103,303, // "-"
118,106, // "+"
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 287
2,118, // ws*
24,MIN_REDUCTION+177, // `[
102,MIN_REDUCTION+177, // "["
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 288
25,9, // `]
110,173, // "]"
  }
,
{ // state 289
24,MIN_REDUCTION+66, // `[
102,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 291
24,MIN_REDUCTION+63, // `[
102,MIN_REDUCTION+63, // "["
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 292
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 293
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 294
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 295
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
295, // `{
-1, // <decl in class>*
396, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
419, // `void
465, // `(
-1, // `)
129, // <stmt>*
534, // <type>
388, // `int
161, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
32, // <stmt>
140, // <assign>
95, // `;
548, // <local var decl>
532, // `if
307, // <exp>
-1, // `else
146, // `for
330, // `while
530, // `break
-1, // `=
232, // `++
542, // `--
598, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
175, // <exp8>
366, // <exp7>
189, // <exp6>
372, // <exp5>
286, // <exp4>
468, // <exp3>
229, // <exp2>
134, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
503, // `+
321, // `-
-1, // `*
-1, // `/
-1, // `%
258, // `!
448, // INTLIT
136, // STRINGLIT
359, // CHARLIT
-1, // `.
274, // `this
19, // `true
275, // `false
76, // `new
-1, // <empty bracket pair>**
420, // letter
442, // "a"
442, // "p"
442, // "s"
442, // "v"
442, // "c"
442, // "f"
442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
442, // "i"
442, // "l"
442, // "o"
442, // "r"
442, // "u"
442, // "x"
442, // "b"
442, // "e"
442, // "h"
442, // "n"
442, // "t"
442, // "w"
450, // letter128
353, // {199..218 231..250}
353, // {193..198 225..230}
-1, // digit
265, // {"1".."9"}
324, // "0"
417, // digit128
58, // {176..185}
-1, // any
-1, // "["
303, // "-"
-1, // "<"
-1, // "|"
-1, // " "
436, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
368, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
461, // "{"
-1, // "%"
500, // "("
106, // "+"
-1, // "."
-1, // "_"
-1, // "="
272, // "@"
-1, // {10}
331, // "}"
376, // "!"
338, // "'"
172, // '"'
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
{ // state 296
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 297
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
27, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
419, // `void
465, // `(
-1, // `)
-1, // <stmt>*
534, // <type>
388, // `int
161, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
495, // <stmt>
250, // <assign>
452, // `;
26, // <local var decl>
164, // `if
307, // <exp>
-1, // `else
239, // `for
61, // `while
512, // `break
-1, // `=
232, // `++
542, // `--
219, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
175, // <exp8>
366, // <exp7>
189, // <exp6>
372, // <exp5>
286, // <exp4>
468, // <exp3>
229, // <exp2>
134, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
503, // `+
321, // `-
-1, // `*
-1, // `/
-1, // `%
258, // `!
448, // INTLIT
136, // STRINGLIT
359, // CHARLIT
-1, // `.
274, // `this
19, // `true
275, // `false
76, // `new
-1, // <empty bracket pair>**
420, // letter
442, // "a"
442, // "p"
442, // "s"
442, // "v"
442, // "c"
442, // "f"
442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
442, // "i"
442, // "l"
442, // "o"
442, // "r"
442, // "u"
442, // "x"
442, // "b"
442, // "e"
442, // "h"
442, // "n"
442, // "t"
442, // "w"
450, // letter128
353, // {199..218 231..250}
353, // {193..198 225..230}
-1, // digit
265, // {"1".."9"}
324, // "0"
417, // digit128
58, // {176..185}
-1, // any
-1, // "["
303, // "-"
-1, // "<"
-1, // "|"
-1, // " "
436, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
192, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
461, // "{"
-1, // "%"
500, // "("
106, // "+"
-1, // "."
-1, // "_"
-1, // "="
272, // "@"
-1, // {10}
-1, // "}"
376, // "!"
338, // "'"
172, // '"'
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
{ // state 298
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 299
104,70, // "<"
105,597, // "|"
108,314, // "&"
121,69, // "="
125,77, // "!"
  }
,
{ // state 300
106,MIN_REDUCTION+208, // " "
123,MIN_REDUCTION+208, // {10}
132,MIN_REDUCTION+208, // ws
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 301
85,72, // "u"
  }
,
{ // state 302
2,367, // ws*
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 303
2,52, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 304
2,509, // ws*
24,MIN_REDUCTION+103, // `[
102,MIN_REDUCTION+103, // "["
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 305
24,MIN_REDUCTION+69, // `[
102,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 306
10,582, // `}
12,293, // <decl in class>
13,260, // <method decl>
14,491, // `public
107,112, // "#"
124,331, // "}"
  }
,
{ // state 307
36,325, // `=
121,205, // "="
  }
,
{ // state 308
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
295, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
419, // `void
465, // `(
-1, // `)
-1, // <stmt>*
534, // <type>
388, // `int
161, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
545, // <stmt>
140, // <assign>
95, // `;
548, // <local var decl>
532, // `if
307, // <exp>
-1, // `else
146, // `for
330, // `while
530, // `break
-1, // `=
232, // `++
542, // `--
598, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
175, // <exp8>
366, // <exp7>
189, // <exp6>
372, // <exp5>
286, // <exp4>
468, // <exp3>
229, // <exp2>
134, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
503, // `+
321, // `-
-1, // `*
-1, // `/
-1, // `%
258, // `!
448, // INTLIT
136, // STRINGLIT
359, // CHARLIT
-1, // `.
274, // `this
19, // `true
275, // `false
76, // `new
-1, // <empty bracket pair>**
420, // letter
442, // "a"
442, // "p"
442, // "s"
442, // "v"
442, // "c"
442, // "f"
442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
442, // "i"
442, // "l"
442, // "o"
442, // "r"
442, // "u"
442, // "x"
442, // "b"
442, // "e"
442, // "h"
442, // "n"
442, // "t"
442, // "w"
450, // letter128
353, // {199..218 231..250}
353, // {193..198 225..230}
-1, // digit
265, // {"1".."9"}
324, // "0"
417, // digit128
58, // {176..185}
-1, // any
-1, // "["
303, // "-"
-1, // "<"
-1, // "|"
-1, // " "
436, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
368, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
461, // "{"
-1, // "%"
500, // "("
106, // "+"
-1, // "."
-1, // "_"
-1, // "="
272, // "@"
-1, // {10}
-1, // "}"
376, // "!"
338, // "'"
172, // '"'
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
{ // state 309
3,535, // <program>
4,71, // <class decl>+
5,538, // <class decl>
6,426, // `class
106,101, // " "
107,591, // "#"
123,31, // {10}
132,49, // ws
  }
,
{ // state 310
7,460, // ID
16,465, // `(
22,5, // `null
31,18, // <exp>
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 311
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 312
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 313
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 314
2,373, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 315
2,73, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 316
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 317
82,361, // "l"
  }
,
{ // state 318
2,187, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 319
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 320
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 321
7,460, // ID
22,5, // `null
50,459, // <exp1>
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
107,40, // "#"
122,390, // "@"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 322
60,281, // `*
61,487, // `/
62,497, // `%
111,154, // "/"
116,269, // "%"
128,516, // "*"
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 323
7,460, // ID
16,465, // `(
22,5, // `null
31,616, // <exp>
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 324
74,381, // "a"
75,381, // "p"
76,381, // "s"
77,381, // "v"
78,381, // "c"
79,381, // "f"
80,381, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,381, // "i"
82,381, // "l"
83,381, // "o"
84,381, // "r"
85,381, // "u"
86,381, // "x"
87,381, // "b"
88,381, // "e"
89,381, // "h"
90,381, // "n"
91,381, // "t"
92,381, // "w"
95,444, // {193..198 225..230}
97,381, // {"1".."9"}
98,381, // "0"
100,444, // {176..185}
137,596, // hexDigit*
138,35, // $$2
143,526, // hexDigit
144,544, // hexDigit128
  }
,
{ // state 325
7,460, // ID
16,465, // `(
22,5, // `null
31,42, // <exp>
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 326
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
295, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
419, // `void
465, // `(
-1, // `)
-1, // <stmt>*
534, // <type>
388, // `int
161, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
29, // <stmt>
140, // <assign>
95, // `;
548, // <local var decl>
532, // `if
307, // <exp>
-1, // `else
146, // `for
330, // `while
530, // `break
-1, // `=
232, // `++
542, // `--
598, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
175, // <exp8>
366, // <exp7>
189, // <exp6>
372, // <exp5>
286, // <exp4>
468, // <exp3>
229, // <exp2>
134, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
503, // `+
321, // `-
-1, // `*
-1, // `/
-1, // `%
258, // `!
448, // INTLIT
136, // STRINGLIT
359, // CHARLIT
-1, // `.
274, // `this
19, // `true
275, // `false
76, // `new
-1, // <empty bracket pair>**
420, // letter
442, // "a"
442, // "p"
442, // "s"
442, // "v"
442, // "c"
442, // "f"
442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
442, // "i"
442, // "l"
442, // "o"
442, // "r"
442, // "u"
442, // "x"
442, // "b"
442, // "e"
442, // "h"
442, // "n"
442, // "t"
442, // "w"
450, // letter128
353, // {199..218 231..250}
353, // {193..198 225..230}
-1, // digit
265, // {"1".."9"}
324, // "0"
417, // digit128
58, // {176..185}
-1, // any
-1, // "["
303, // "-"
-1, // "<"
-1, // "|"
-1, // " "
436, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
368, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
461, // "{"
-1, // "%"
500, // "("
106, // "+"
-1, // "."
-1, // "_"
-1, // "="
272, // "@"
-1, // {10}
-1, // "}"
376, // "!"
338, // "'"
172, // '"'
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
{ // state 327
74,51, // "a"
75,51, // "p"
76,51, // "s"
77,51, // "v"
78,51, // "c"
79,51, // "f"
80,51, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,51, // "i"
82,51, // "l"
83,51, // "o"
84,51, // "r"
85,51, // "u"
86,51, // "x"
87,51, // "b"
88,51, // "e"
89,51, // "h"
90,51, // "n"
91,51, // "t"
92,51, // "w"
94,613, // {199..218 231..250}
95,613, // {193..198 225..230}
97,51, // {"1".."9"}
98,51, // "0"
100,613, // {176..185}
101,319, // any
102,51, // "["
103,51, // "-"
104,51, // "<"
105,51, // "|"
106,51, // " "
107,51, // "#"
108,51, // "&"
109,51, // ")"
110,51, // "]"
111,51, // "/"
112,51, // ";"
113,51, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
114,51, // ">"
115,51, // "{"
116,51, // "%"
117,51, // "("
118,51, // "+"
119,51, // "."
120,51, // "_"
121,51, // "="
122,51, // "@"
123,51, // {10}
124,51, // "}"
125,51, // "!"
126,51, // "'"
127,51, // '"'
128,51, // "*"
129,68, // any128
130,613, // {223}
131,613, // {128..175 186..192 219..222 224 251..255}
140,605, // $$3
  }
,
{ // state 328
52,507, // `&&
122,214, // "@"
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 329
24,511, // `[
67,270, // `.
102,33, // "["
119,2, // "."
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 330
16,585, // `(
117,500, // "("
  }
,
{ // state 331
2,208, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 332
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 333
74,81, // "a"
  }
,
{ // state 334
58,88, // `+
59,343, // `-
103,303, // "-"
118,106, // "+"
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 335
23,210, // <empty bracket pair>
24,277, // `[
72,581, // <empty bracket pair>**
102,33, // "["
145,10, // <empty bracket pair>*
  }
,
{ // state 336
7,460, // ID
16,465, // `(
22,5, // `null
31,142, // <exp>
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
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
{ // state 337
25,130, // `]
110,119, // "]"
  }
,
{ // state 338
74,109, // "a"
75,109, // "p"
76,109, // "s"
77,109, // "v"
78,109, // "c"
79,109, // "f"
80,109, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,109, // "i"
82,109, // "l"
83,109, // "o"
84,109, // "r"
85,109, // "u"
86,109, // "x"
87,109, // "b"
88,109, // "e"
89,109, // "h"
90,109, // "n"
91,109, // "t"
92,109, // "w"
97,109, // {"1".."9"}
98,109, // "0"
101,499, // any
102,109, // "["
103,109, // "-"
104,109, // "<"
105,109, // "|"
106,109, // " "
107,109, // "#"
108,109, // "&"
109,109, // ")"
110,109, // "]"
111,109, // "/"
112,109, // ";"
113,109, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
114,109, // ">"
115,109, // "{"
116,109, // "%"
117,109, // "("
118,109, // "+"
119,109, // "."
120,109, // "_"
121,109, // "="
122,109, // "@"
123,109, // {10}
124,109, // "}"
125,109, // "!"
126,109, // "'"
127,109, // '"'
128,109, // "*"
  }
,
{ // state 339
0x80000000|447, // match move
0x80000000|553, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 340
77,132, // "v"
  }
,
{ // state 341
2,367, // ws*
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 342
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 343
7,460, // ID
16,465, // `(
22,5, // `null
48,322, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 344
2,149, // ws*
  }
,
{ // state 345
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 346
2,611, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 347
8,536, // `{
115,461, // "{"
  }
,
{ // state 348
55,575, // `<
56,102, // `<=
57,74, // `>
104,400, // "<"
114,82, // ">"
122,299, // "@"
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 349
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 350
24,MIN_REDUCTION+78, // `[
102,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 351
0x80000000|577, // match move
0x80000000|38, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 352
107,111, // "#"
  }
,
{ // state 353
0x80000000|174, // match move
0x80000000|514, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 354
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 355
0x80000000|211, // match move
0x80000000|259, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 356
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 357
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 358
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 359
0x80000000|1, // match move
0x80000000|540, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 360
0x80000000|1, // match move
0x80000000|237, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 361
2,473, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 362
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 363
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 364
89,402, // "h"
  }
,
{ // state 365
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 366
52,507, // `&&
122,214, // "@"
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 367
0x80000000|505, // match move
0x80000000|117, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 368
2,162, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 369
10,202, // `}
40,501, // <case>*
41,455, // <case>
42,567, // `case
107,481, // "#"
124,375, // "}"
  }
,
{ // state 370
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 371
2,56, // ws*
24,MIN_REDUCTION+167, // `[
102,MIN_REDUCTION+167, // "["
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 372
55,575, // `<
56,102, // `<=
57,74, // `>
104,400, // "<"
114,82, // ">"
122,299, // "@"
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 373
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 374
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 375
0x80000000|594, // match move
0x80000000|510, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 376
2,521, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 377
0x80000000|564, // match move
0x80000000|17, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 378
9,506, // <decl in class>*
10,312, // `}
12,226, // <decl in class>
13,260, // <method decl>
14,491, // `public
107,112, // "#"
124,331, // "}"
  }
,
{ // state 379
10,97, // `}
41,482, // <case>
42,567, // `case
107,481, // "#"
124,331, // "}"
  }
,
{ // state 380
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 381
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 382
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 383
24,511, // `[
67,270, // `.
102,33, // "["
119,2, // "."
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 384
7,460, // ID
16,465, // `(
22,5, // `null
31,252, // <exp>
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 385
2,262, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 386
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 387
7,12, // ID
16,465, // `(
22,5, // `null
27,43, // <assign>
31,307, // <exp>
37,232, // `++
38,542, // `--
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,272, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 388
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 389
7,460, // ID
16,465, // `(
22,5, // `null
46,348, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 390
127,569, // '"'
  }
,
{ // state 391
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 392
0x80000000|276, // match move
0x80000000|116, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 393
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 394
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 395
2,360, // ws*
  }
,
{ // state 396
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 397
23,244, // <empty bracket pair>
24,277, // `[
102,33, // "["
  }
,
{ // state 398
83,355, // "o"
  }
,
{ // state 399
0x80000000|253, // match move
0x80000000|108, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 400
2,466, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 401
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 402
2,451, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 403
8,517, // `{
115,461, // "{"
  }
,
{ // state 404
0x80000000|302, // match move
0x80000000|341, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 405
2,11, // ws*
  }
,
{ // state 406
73,200, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,522, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
96,556, // digit
97,294, // {"1".."9"}
98,294, // "0"
99,188, // digit128
100,58, // {176..185}
120,13, // "_"
130,392, // {223}
134,176, // $$0
141,311, // idChar
142,529, // idChar128
  }
,
{ // state 407
85,72, // "u"
88,346, // "e"
  }
,
{ // state 408
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 409
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 410
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 411
74,81, // "a"
83,110, // "o"
  }
,
{ // state 412
24,MIN_REDUCTION+68, // `[
102,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 413
28,558, // `;
112,368, // ";"
  }
,
{ // state 414
24,MIN_REDUCTION+189, // `[
102,MIN_REDUCTION+189, // "["
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 415
58,88, // `+
59,343, // `-
103,303, // "-"
118,106, // "+"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 416
0x80000000|1, // match move
0x80000000|574, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 417
0x80000000|395, // match move
0x80000000|614, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 418
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
295, // `{
-1, // <decl in class>*
580, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
419, // `void
465, // `(
-1, // `)
-1, // <stmt>*
534, // <type>
388, // `int
161, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
105, // <stmt>
140, // <assign>
95, // `;
548, // <local var decl>
532, // `if
307, // <exp>
-1, // `else
146, // `for
330, // `while
530, // `break
-1, // `=
232, // `++
542, // `--
598, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
175, // <exp8>
366, // <exp7>
189, // <exp6>
372, // <exp5>
286, // <exp4>
468, // <exp3>
229, // <exp2>
134, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
503, // `+
321, // `-
-1, // `*
-1, // `/
-1, // `%
258, // `!
448, // INTLIT
136, // STRINGLIT
359, // CHARLIT
-1, // `.
274, // `this
19, // `true
275, // `false
76, // `new
-1, // <empty bracket pair>**
420, // letter
442, // "a"
442, // "p"
442, // "s"
442, // "v"
442, // "c"
442, // "f"
442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
442, // "i"
442, // "l"
442, // "o"
442, // "r"
442, // "u"
442, // "x"
442, // "b"
442, // "e"
442, // "h"
442, // "n"
442, // "t"
442, // "w"
450, // letter128
353, // {199..218 231..250}
353, // {193..198 225..230}
-1, // digit
265, // {"1".."9"}
324, // "0"
417, // digit128
58, // {176..185}
-1, // any
-1, // "["
303, // "-"
-1, // "<"
-1, // "|"
-1, // " "
436, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
368, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
461, // "{"
-1, // "%"
500, // "("
106, // "+"
-1, // "."
-1, // "_"
-1, // "="
272, // "@"
-1, // {10}
375, // "}"
376, // "!"
338, // "'"
172, // '"'
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
{ // state 419
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 420
73,200, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,522, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
96,556, // digit
97,294, // {"1".."9"}
98,294, // "0"
99,188, // digit128
100,58, // {176..185}
120,13, // "_"
130,392, // {223}
133,406, // idChar*
134,23, // $$0
141,531, // idChar
142,529, // idChar128
  }
,
{ // state 421
24,MIN_REDUCTION+186, // `[
102,MIN_REDUCTION+186, // "["
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 422
0x80000000|405, // match move
0x80000000|589, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 423
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 424
17,62, // `)
109,486, // ")"
  }
,
{ // state 425
24,MIN_REDUCTION+67, // `[
102,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 426
7,463, // ID
73,519, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,318, // letter128
94,183, // {199..218 231..250}
95,183, // {193..198 225..230}
  }
,
{ // state 427
0x80000000|1, // match move
0x80000000|99, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 428
147,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 429
2,56, // ws*
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 430
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 431
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 432
106,101, // " "
123,31, // {10}
132,49, // ws
147,MIN_REDUCTION+96, // $NT
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 433
24,MIN_REDUCTION+108, // `[
102,MIN_REDUCTION+108, // "["
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 434
73,200, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,227, // letter128
94,183, // {199..218 231..250}
95,183, // {193..198 225..230}
96,556, // digit
97,294, // {"1".."9"}
98,294, // "0"
99,125, // digit128
100,477, // {176..185}
120,13, // "_"
130,561, // {223}
134,92, // $$0
141,311, // idChar
142,480, // idChar128
  }
,
{ // state 435
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 436
76,609, // "s"
77,132, // "v"
79,411, // "f"
81,66, // "i"
87,601, // "b"
90,407, // "n"
91,83, // "t"
92,364, // "w"
118,75, // "+"
  }
,
{ // state 437
0x80000000|1, // match move
0x80000000|67, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 438
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
27, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
419, // `void
465, // `(
-1, // `)
-1, // <stmt>*
534, // <type>
388, // `int
161, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
339, // <stmt>
250, // <assign>
452, // `;
26, // <local var decl>
164, // `if
307, // <exp>
-1, // `else
239, // `for
61, // `while
512, // `break
-1, // `=
232, // `++
542, // `--
219, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
175, // <exp8>
366, // <exp7>
189, // <exp6>
372, // <exp5>
286, // <exp4>
468, // <exp3>
229, // <exp2>
134, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
503, // `+
321, // `-
-1, // `*
-1, // `/
-1, // `%
258, // `!
448, // INTLIT
136, // STRINGLIT
359, // CHARLIT
-1, // `.
274, // `this
19, // `true
275, // `false
76, // `new
-1, // <empty bracket pair>**
420, // letter
442, // "a"
442, // "p"
442, // "s"
442, // "v"
442, // "c"
442, // "f"
442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
442, // "i"
442, // "l"
442, // "o"
442, // "r"
442, // "u"
442, // "x"
442, // "b"
442, // "e"
442, // "h"
442, // "n"
442, // "t"
442, // "w"
450, // letter128
353, // {199..218 231..250}
353, // {193..198 225..230}
-1, // digit
265, // {"1".."9"}
324, // "0"
417, // digit128
58, // {176..185}
-1, // any
-1, // "["
303, // "-"
-1, // "<"
-1, // "|"
-1, // " "
436, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
192, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
461, // "{"
-1, // "%"
500, // "("
106, // "+"
-1, // "."
-1, // "_"
-1, // "="
272, // "@"
-1, // {10}
-1, // "}"
376, // "!"
338, // "'"
172, // '"'
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
{ // state 439
28,152, // `;
112,368, // ";"
  }
,
{ // state 440
7,12, // ID
16,465, // `(
22,5, // `null
27,115, // <assign>
31,307, // <exp>
37,232, // `++
38,542, // `--
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,272, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 441
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
27, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
419, // `void
465, // `(
-1, // `)
-1, // <stmt>*
534, // <type>
388, // `int
161, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
610, // <stmt>
250, // <assign>
452, // `;
26, // <local var decl>
164, // `if
307, // <exp>
-1, // `else
239, // `for
61, // `while
512, // `break
-1, // `=
232, // `++
542, // `--
219, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
175, // <exp8>
366, // <exp7>
189, // <exp6>
372, // <exp5>
286, // <exp4>
468, // <exp3>
229, // <exp2>
134, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
503, // `+
321, // `-
-1, // `*
-1, // `/
-1, // `%
258, // `!
448, // INTLIT
136, // STRINGLIT
359, // CHARLIT
-1, // `.
274, // `this
19, // `true
275, // `false
76, // `new
-1, // <empty bracket pair>**
420, // letter
442, // "a"
442, // "p"
442, // "s"
442, // "v"
442, // "c"
442, // "f"
442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
442, // "i"
442, // "l"
442, // "o"
442, // "r"
442, // "u"
442, // "x"
442, // "b"
442, // "e"
442, // "h"
442, // "n"
442, // "t"
442, // "w"
450, // letter128
353, // {199..218 231..250}
353, // {193..198 225..230}
-1, // digit
265, // {"1".."9"}
324, // "0"
417, // digit128
58, // {176..185}
-1, // any
-1, // "["
303, // "-"
-1, // "<"
-1, // "|"
-1, // " "
436, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
192, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
461, // "{"
-1, // "%"
500, // "("
106, // "+"
-1, // "."
-1, // "_"
-1, // "="
272, // "@"
-1, // {10}
-1, // "}"
376, // "!"
338, // "'"
172, // '"'
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
{ // state 442
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 443
83,485, // "o"
  }
,
{ // state 444
0x80000000|147, // match move
0x80000000|414, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 445
96,78, // digit
97,294, // {"1".."9"}
98,294, // "0"
99,422, // digit128
100,58, // {176..185}
136,114, // $$1
  }
,
{ // state 446
0x80000000|1, // match move
0x80000000|64, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 447
32,297, // `else
107,111, // "#"
  }
,
{ // state 448
0x80000000|1, // match move
0x80000000|291, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 449
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 450
0x80000000|429, // match move
0x80000000|371, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 451
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 452
0x80000000|257, // match move
0x80000000|393, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 453
2,267, // ws*
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 454
0x80000000|470, // match move
0x80000000|284, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 455
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 456
0x80000000|380, // match move
0x80000000|55, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 457
2,166, // ws*
  }
,
{ // state 458
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 459
0x80000000|1, // match move
0x80000000|383, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 460
0x80000000|1, // match move
0x80000000|280, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 461
2,298, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 462
7,139, // ID
73,519, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,318, // letter128
94,183, // {199..218 231..250}
95,183, // {193..198 225..230}
  }
,
{ // state 463
8,378, // `{
11,157, // `extends
107,193, // "#"
115,461, // "{"
  }
,
{ // state 464
82,502, // "l"
  }
,
{ // state 465
7,583, // ID
15,419, // `void
19,167, // <type>
20,388, // `int
21,161, // `boolean
22,313, // `null
73,519, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,318, // letter128
94,183, // {199..218 231..250}
95,183, // {193..198 225..230}
107,586, // "#"
  }
,
{ // state 466
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 467
24,337, // `[
102,33, // "["
  }
,
{ // state 468
60,281, // `*
61,487, // `/
62,497, // `%
111,154, // "/"
116,269, // "%"
128,516, // "*"
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 469
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 470
2,456, // ws*
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 471
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 472
7,460, // ID
16,465, // `(
22,5, // `null
46,90, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 473
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 474
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 475
17,231, // `)
109,46, // ")"
  }
,
{ // state 476
2,416, // ws*
24,MIN_REDUCTION+131, // `[
102,MIN_REDUCTION+131, // "["
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 477
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 478
0x80000000|590, // match move
0x80000000|304, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 479
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 480
2,612, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 481
78,185, // "c"
  }
,
{ // state 482
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 483
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 484
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 485
2,100, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 486
2,224, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 487
7,460, // ID
16,465, // `(
22,5, // `null
49,163, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 488
24,MIN_REDUCTION+207, // `[
102,MIN_REDUCTION+207, // "["
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 489
24,MIN_REDUCTION+166, // `[
102,MIN_REDUCTION+166, // "["
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 490
24,MIN_REDUCTION+168, // `[
102,MIN_REDUCTION+168, // "["
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 491
15,462, // `void
107,340, // "#"
  }
,
{ // state 492
103,578, // "-"
118,588, // "+"
  }
,
{ // state 493
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 494
24,MIN_REDUCTION+217, // `[
102,MIN_REDUCTION+217, // "["
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 495
0x80000000|382, // match move
0x80000000|332, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 496
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 497
7,460, // ID
16,465, // `(
22,5, // `null
49,199, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 498
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 499
0x80000000|524, // match move
0x80000000|155, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 500
2,271, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 501
10,128, // `}
41,482, // <case>
42,567, // `case
107,481, // "#"
124,375, // "}"
  }
,
{ // state 502
2,432, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
147,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 503
7,460, // ID
22,5, // `null
50,437, // <exp1>
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
107,40, // "#"
122,390, // "@"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 504
17,441, // `)
109,486, // ")"
  }
,
{ // state 505
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 506
10,345, // `}
12,293, // <decl in class>
13,260, // <method decl>
14,491, // `public
107,112, // "#"
124,331, // "}"
  }
,
{ // state 507
7,460, // ID
16,465, // `(
22,5, // `null
45,209, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 508
2,149, // ws*
24,MIN_REDUCTION+218, // `[
102,MIN_REDUCTION+218, // "["
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 509
0x80000000|1, // match move
0x80000000|201, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 510
2,171, // ws*
106,606, // " "
123,198, // {10}
132,249, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 511
7,460, // ID
16,465, // `(
22,5, // `null
31,251, // <exp>
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 512
28,141, // `;
112,192, // ";"
  }
,
{ // state 513
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 514
24,MIN_REDUCTION+75, // `[
102,MIN_REDUCTION+75, // "["
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 515
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 516
2,124, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 517
9,306, // <decl in class>*
10,363, // `}
12,226, // <decl in class>
13,260, // <method decl>
14,491, // `public
107,112, // "#"
124,331, // "}"
  }
,
{ // state 518
28,57, // `;
112,368, // ";"
  }
,
{ // state 519
73,200, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,227, // letter128
94,183, // {199..218 231..250}
95,183, // {193..198 225..230}
96,556, // digit
97,294, // {"1".."9"}
98,294, // "0"
99,125, // digit128
100,477, // {176..185}
120,13, // "_"
130,561, // {223}
133,434, // idChar*
134,423, // $$0
141,531, // idChar
142,480, // idChar128
  }
,
{ // state 520
85,539, // "u"
  }
,
{ // state 521
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 522
0x80000000|401, // match move
0x80000000|604, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 523
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
295, // `{
-1, // <decl in class>*
356, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
419, // `void
465, // `(
-1, // `)
602, // <stmt>*
534, // <type>
388, // `int
161, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
32, // <stmt>
140, // <assign>
95, // `;
548, // <local var decl>
532, // `if
307, // <exp>
-1, // `else
146, // `for
330, // `while
530, // `break
-1, // `=
232, // `++
542, // `--
598, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
175, // <exp8>
366, // <exp7>
189, // <exp6>
372, // <exp5>
286, // <exp4>
468, // <exp3>
229, // <exp2>
134, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
503, // `+
321, // `-
-1, // `*
-1, // `/
-1, // `%
258, // `!
448, // INTLIT
136, // STRINGLIT
359, // CHARLIT
-1, // `.
274, // `this
19, // `true
275, // `false
76, // `new
-1, // <empty bracket pair>**
420, // letter
442, // "a"
442, // "p"
442, // "s"
442, // "v"
442, // "c"
442, // "f"
442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
442, // "i"
442, // "l"
442, // "o"
442, // "r"
442, // "u"
442, // "x"
442, // "b"
442, // "e"
442, // "h"
442, // "n"
442, // "t"
442, // "w"
450, // letter128
353, // {199..218 231..250}
353, // {193..198 225..230}
-1, // digit
265, // {"1".."9"}
324, // "0"
417, // digit128
58, // {176..185}
-1, // any
-1, // "["
303, // "-"
-1, // "<"
-1, // "|"
-1, // " "
436, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
368, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
461, // "{"
-1, // "%"
500, // "("
106, // "+"
-1, // "."
-1, // "_"
-1, // "="
272, // "@"
-1, // {10}
331, // "}"
376, // "!"
338, // "'"
172, // '"'
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
{ // state 524
2,36, // ws*
  }
,
{ // state 525
0x80000000|248, // match move
0x80000000|228, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 526
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 527
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 528
24,MIN_REDUCTION+215, // `[
102,MIN_REDUCTION+215, // "["
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 529
0x80000000|254, // match move
0x80000000|54, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 530
28,165, // `;
112,368, // ";"
  }
,
{ // state 531
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 532
16,203, // `(
117,500, // "("
  }
,
{ // state 533
106,606, // " "
123,198, // {10}
132,122, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 534
7,184, // ID
23,245, // <empty bracket pair>
24,337, // `[
73,519, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,318, // letter128
94,183, // {199..218 231..250}
95,183, // {193..198 225..230}
102,33, // "["
  }
,
{ // state 535
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 536
10,570, // `}
40,379, // <case>*
41,455, // <case>
42,567, // `case
107,481, // "#"
124,331, // "}"
  }
,
{ // state 537
2,14, // ws*
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 538
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 539
2,212, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 540
24,MIN_REDUCTION+65, // `[
102,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 541
91,404, // "t"
  }
,
{ // state 542
7,218, // ID
73,519, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,318, // letter128
94,183, // {199..218 231..250}
95,183, // {193..198 225..230}
  }
,
{ // state 543
17,438, // `)
109,486, // ")"
  }
,
{ // state 544
0x80000000|457, // match move
0x80000000|566, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 545
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 546
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 547
0x80000000|484, // match move
0x80000000|410, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 548
28,296, // `;
112,368, // ";"
  }
,
{ // state 549
146,MIN_REDUCTION+0, // $
  }
,
{ // state 550
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 551
24,MIN_REDUCTION+174, // `[
102,MIN_REDUCTION+174, // "["
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 552
106,MIN_REDUCTION+81, // " "
123,MIN_REDUCTION+81, // {10}
132,MIN_REDUCTION+81, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 553
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 554
24,MIN_REDUCTION+171, // `[
102,MIN_REDUCTION+171, // "["
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 555
7,460, // ID
16,465, // `(
22,5, // `null
44,328, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 556
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 557
24,MIN_REDUCTION+213, // `[
102,MIN_REDUCTION+213, // "["
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 558
7,460, // ID
16,465, // `(
22,5, // `null
31,518, // <exp>
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 559
0x80000000|479, // match move
0x80000000|79, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 560
24,MIN_REDUCTION+72, // `[
102,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 561
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 562
2,190, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 563
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 564
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 565
105,597, // "|"
  }
,
{ // state 566
2,166, // ws*
24,MIN_REDUCTION+216, // `[
102,MIN_REDUCTION+216, // "["
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 567
7,460, // ID
16,465, // `(
22,5, // `null
31,439, // <exp>
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 568
16,475, // `(
117,500, // "("
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 569
0x80000000|595, // match move
0x80000000|287, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 570
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 571
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 572
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 573
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
27, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
419, // `void
465, // `(
-1, // `)
-1, // <stmt>*
534, // <type>
388, // `int
161, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
351, // <stmt>
250, // <assign>
452, // `;
26, // <local var decl>
164, // `if
307, // <exp>
-1, // `else
239, // `for
61, // `while
512, // `break
-1, // `=
232, // `++
542, // `--
219, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
175, // <exp8>
366, // <exp7>
189, // <exp6>
372, // <exp5>
286, // <exp4>
468, // <exp3>
229, // <exp2>
134, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
503, // `+
321, // `-
-1, // `*
-1, // `/
-1, // `%
258, // `!
448, // INTLIT
136, // STRINGLIT
359, // CHARLIT
-1, // `.
274, // `this
19, // `true
275, // `false
76, // `new
-1, // <empty bracket pair>**
420, // letter
442, // "a"
442, // "p"
442, // "s"
442, // "v"
442, // "c"
442, // "f"
442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
442, // "i"
442, // "l"
442, // "o"
442, // "r"
442, // "u"
442, // "x"
442, // "b"
442, // "e"
442, // "h"
442, // "n"
442, // "t"
442, // "w"
450, // letter128
353, // {199..218 231..250}
353, // {193..198 225..230}
-1, // digit
265, // {"1".."9"}
324, // "0"
417, // digit128
58, // {176..185}
-1, // any
-1, // "["
303, // "-"
-1, // "<"
-1, // "|"
-1, // " "
436, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
192, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
461, // "{"
-1, // "%"
500, // "("
106, // "+"
-1, // "."
-1, // "_"
-1, // "="
272, // "@"
-1, // {10}
-1, // "}"
376, // "!"
338, // "'"
172, // '"'
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
{ // state 574
24,MIN_REDUCTION+130, // `[
102,MIN_REDUCTION+130, // "["
106,377, // " "
123,255, // {10}
132,222, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 575
7,460, // ID
16,465, // `(
22,5, // `null
47,246, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 576
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 577
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 578
2,50, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 579
24,MIN_REDUCTION+79, // `[
102,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 580
0x80000000|196, // match move
0x80000000|354, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 581
0x80000000|1, // match move
0x80000000|560, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 582
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 583
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 584
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 585
7,460, // ID
16,465, // `(
22,5, // `null
31,131, // <exp>
43,175, // <exp8>
44,366, // <exp7>
45,189, // <exp6>
46,372, // <exp5>
47,286, // <exp4>
48,468, // <exp3>
49,229, // <exp2>
50,134, // <exp1>
58,503, // `+
59,321, // `-
63,258, // `!
64,448, // INTLIT
65,136, // STRINGLIT
66,359, // CHARLIT
68,274, // `this
69,19, // `true
70,275, // `false
71,76, // `new
73,420, // letter
74,442, // "a"
75,442, // "p"
76,442, // "s"
77,442, // "v"
78,442, // "c"
79,442, // "f"
80,442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,442, // "i"
82,442, // "l"
83,442, // "o"
84,442, // "r"
85,442, // "u"
86,442, // "x"
87,442, // "b"
88,442, // "e"
89,442, // "h"
90,442, // "n"
91,442, // "t"
92,442, // "w"
93,450, // letter128
94,353, // {199..218 231..250}
95,353, // {193..198 225..230}
97,265, // {"1".."9"}
98,324, // "0"
99,417, // digit128
100,58, // {176..185}
103,303, // "-"
107,40, // "#"
117,500, // "("
118,106, // "+"
122,390, // "@"
125,376, // "!"
126,338, // "'"
127,172, // '"'
  }
,
{ // state 586
77,132, // "v"
81,66, // "i"
87,443, // "b"
90,520, // "n"
  }
,
{ // state 587
106,MIN_REDUCTION+207, // " "
123,MIN_REDUCTION+207, // {10}
132,MIN_REDUCTION+207, // ws
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 588
2,513, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 589
2,11, // ws*
24,MIN_REDUCTION+214, // `[
102,MIN_REDUCTION+214, // "["
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 590
2,509, // ws*
  }
,
{ // state 591
78,317, // "c"
  }
,
{ // state 592
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 593
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 594
2,171, // ws*
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 595
2,118, // ws*
  }
,
{ // state 596
74,381, // "a"
75,381, // "p"
76,381, // "s"
77,381, // "v"
78,381, // "c"
79,381, // "f"
80,381, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
81,381, // "i"
82,381, // "l"
83,381, // "o"
84,381, // "r"
85,381, // "u"
86,381, // "x"
87,381, // "b"
88,381, // "e"
89,381, // "h"
90,381, // "n"
91,381, // "t"
92,381, // "w"
95,444, // {193..198 225..230}
97,381, // {"1".."9"}
98,381, // "0"
100,444, // {176..185}
138,234, // $$2
143,292, // hexDigit
144,544, // hexDigit128
  }
,
{ // state 597
2,370, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 598
16,310, // `(
117,500, // "("
  }
,
{ // state 599
0x80000000|365, // match move
0x80000000|177, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 600
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 601
83,485, // "o"
84,385, // "r"
  }
,
{ // state 602
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
295, // `{
-1, // <decl in class>*
563, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
419, // `void
465, // `(
-1, // `)
-1, // <stmt>*
534, // <type>
388, // `int
161, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
105, // <stmt>
140, // <assign>
95, // `;
548, // <local var decl>
532, // `if
307, // <exp>
-1, // `else
146, // `for
330, // `while
530, // `break
-1, // `=
232, // `++
542, // `--
598, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
175, // <exp8>
366, // <exp7>
189, // <exp6>
372, // <exp5>
286, // <exp4>
468, // <exp3>
229, // <exp2>
134, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
503, // `+
321, // `-
-1, // `*
-1, // `/
-1, // `%
258, // `!
448, // INTLIT
136, // STRINGLIT
359, // CHARLIT
-1, // `.
274, // `this
19, // `true
275, // `false
76, // `new
-1, // <empty bracket pair>**
420, // letter
442, // "a"
442, // "p"
442, // "s"
442, // "v"
442, // "c"
442, // "f"
442, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
442, // "i"
442, // "l"
442, // "o"
442, // "r"
442, // "u"
442, // "x"
442, // "b"
442, // "e"
442, // "h"
442, // "n"
442, // "t"
442, // "w"
450, // letter128
353, // {199..218 231..250}
353, // {193..198 225..230}
-1, // digit
265, // {"1".."9"}
324, // "0"
417, // digit128
58, // {176..185}
-1, // any
-1, // "["
303, // "-"
-1, // "<"
-1, // "|"
-1, // " "
436, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
368, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
461, // "{"
-1, // "%"
500, // "("
106, // "+"
-1, // "."
-1, // "_"
-1, // "="
272, // "@"
-1, // {10}
331, // "}"
376, // "!"
338, // "'"
172, // '"'
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
{ // state 603
0x80000000|238, // match move
0x80000000|25, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 604
24,MIN_REDUCTION+185, // `[
102,MIN_REDUCTION+185, // "["
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 605
0x80000000|1, // match move
0x80000000|221, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 606
0x80000000|168, // match move
0x80000000|247, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 607
2,358, // ws*
106,101, // " "
123,31, // {10}
132,428, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 608
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 609
92,562, // "w"
  }
,
{ // state 610
0x80000000|24, // match move
0x80000000|553, // no-match move
0x80000000|352, // NT-test-match state for `else
  }
,
{ // state 611
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 612
106,101, // " "
123,31, // {10}
132,49, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 613
0x80000000|409, // match move
0x80000000|579, // no-match move
0x80000000|467, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 614
2,360, // ws*
24,MIN_REDUCTION+173, // `[
102,MIN_REDUCTION+173, // "["
106,377, // " "
123,255, // {10}
132,599, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 615
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 616
MIN_REDUCTION+32, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[617][];
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
// <assign> ::= `++ ID
(27<<16)+2,
// <assign> ::= ID `--
(27<<16)+2,
// <assign> ::= `-- ID
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
(41<<16)+3,
// <exp> ::= <exp8>
(31<<16)+1,
// <exp8> ::= <exp7>
(43<<16)+1,
// <exp7> ::= <exp6>
(44<<16)+1,
// <exp6> ::= <exp5>
(45<<16)+1,
// <exp5> ::= <exp4>
(46<<16)+1,
// <exp4> ::= <exp3>
(47<<16)+1,
// <exp3> ::= <exp2>
(48<<16)+1,
// <exp2> ::= <exp1>
(49<<16)+1,
// <exp8> ::= <exp8> `|| <exp7>
(43<<16)+3,
// <exp7> ::= <exp7> `&& <exp6>
(44<<16)+3,
// <exp6> ::= <exp6> `== <exp5>
(45<<16)+3,
// <exp6> ::= <exp6> `!= <exp5>
(45<<16)+3,
// <exp5> ::= <exp5> `< <exp4>
(46<<16)+3,
// <exp5> ::= <exp5> `<= <exp4>
(46<<16)+3,
// <exp5> ::= <exp5> `> <exp4>
(46<<16)+3,
// <exp4> ::= <exp4> `+ <exp3>
(47<<16)+3,
// <exp4> ::= <exp4> `- <exp3>
(47<<16)+3,
// <exp3> ::= <exp3> `* <exp2>
(48<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(48<<16)+3,
// <exp3> ::= <exp3> `% <exp2>
(48<<16)+3,
// <exp2> ::= `( <type> `) <exp1>
(49<<16)+4,
// <exp2> ::= `+ <exp1>
(49<<16)+2,
// <exp2> ::= `- <exp1>
(49<<16)+2,
// <exp2> ::= `! <exp1>
(49<<16)+2,
// <exp1> ::= ID
(50<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(50<<16)+4,
// <exp1> ::= INTLIT
(50<<16)+1,
// <exp1> ::= STRINGLIT
(50<<16)+1,
// <exp1> ::= CHARLIT
(50<<16)+1,
// <exp1> ::= <exp1> `. ID
(50<<16)+3,
// <exp1> ::= `this
(50<<16)+1,
// <exp1> ::= `true
(50<<16)+1,
// <exp1> ::= `false
(50<<16)+1,
// <exp1> ::= `null
(50<<16)+1,
// <exp1> ::= `new ID `( `)
(50<<16)+4,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] <empty bracket pair>**
(50<<16)+6,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] !<empty bracket pair>
(50<<16)+5,
// letter ::= {"A".."Z" "a".."z"}
(73<<16)+1,
// letter128 ::= {193..218 225..250}
(93<<16)+1,
// digit ::= {"0".."9"}
(96<<16)+1,
// digit128 ::= {176..185}
(99<<16)+1,
// any ::= {0..127}
(101<<16)+1,
// any128 ::= {128..255}
(129<<16)+1,
// ws ::= " "
(132<<16)+1,
// ws ::= {10}
(132<<16)+1,
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
(68<<16)+4,
// `this ::= "#" "t" "h"
(68<<16)+3,
// `false ::= "#" "f" "a" ws*
(70<<16)+4,
// `false ::= "#" "f" "a"
(70<<16)+3,
// `true ::= "#" "t" "r" ws*
(69<<16)+4,
// `true ::= "#" "t" "r"
(69<<16)+3,
// `null ::= "#" "n" "u" ws*
(22<<16)+4,
// `null ::= "#" "n" "u"
(22<<16)+3,
// `new ::= "#" "n" "e" ws*
(71<<16)+4,
// `new ::= "#" "n" "e"
(71<<16)+3,
// `case ::= "#" "c" "e" ws*
(42<<16)+4,
// `case ::= "#" "c" "e"
(42<<16)+3,
// `public ::= "#" "p" "u" ws*
(14<<16)+4,
// `public ::= "#" "p" "u"
(14<<16)+3,
// `switch ::= "#" "s" "w" ws*
(39<<16)+4,
// `switch ::= "#" "s" "w"
(39<<16)+3,
// `! ::= "!" ws*
(63<<16)+2,
// `! ::= "!"
(63<<16)+1,
// `!= ::= "@" "!" ws*
(54<<16)+3,
// `!= ::= "@" "!"
(54<<16)+2,
// `% ::= "%" ws*
(62<<16)+2,
// `% ::= "%"
(62<<16)+1,
// `&& ::= "@" "&" ws*
(52<<16)+3,
// `&& ::= "@" "&"
(52<<16)+2,
// `* ::= "*" ws*
(60<<16)+2,
// `* ::= "*"
(60<<16)+1,
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
(59<<16)+2,
// `- ::= "-"
(59<<16)+1,
// `+ ::= "+" ws*
(58<<16)+2,
// `+ ::= "+"
(58<<16)+1,
// `= ::= "=" ws*
(36<<16)+2,
// `= ::= "="
(36<<16)+1,
// `== ::= "@" "=" ws*
(53<<16)+3,
// `== ::= "@" "="
(53<<16)+2,
// `[ ::= "[" ws*
(24<<16)+2,
// `[ ::= "["
(24<<16)+1,
// `] ::= "]" ws*
(25<<16)+2,
// `] ::= "]"
(25<<16)+1,
// `|| ::= "@" "|" ws*
(51<<16)+3,
// `|| ::= "@" "|"
(51<<16)+2,
// `< ::= "<" ws*
(55<<16)+2,
// `< ::= "<"
(55<<16)+1,
// `<= ::= "@" "<" ws*
(56<<16)+3,
// `<= ::= "@" "<"
(56<<16)+2,
// `> ::= ">" !"=" ws*
(57<<16)+2,
// `> ::= ">" !"="
(57<<16)+1,
// `. ::= "." ws*
(67<<16)+2,
// `. ::= "."
(67<<16)+1,
// `; ::= ";" ws*
(28<<16)+2,
// `; ::= ";"
(28<<16)+1,
// `++ ::= "@" "+" ws*
(37<<16)+3,
// `++ ::= "@" "+"
(37<<16)+2,
// `-- ::= "@" "-" ws*
(38<<16)+3,
// `-- ::= "@" "-"
(38<<16)+2,
// `/ ::= "/" ws*
(61<<16)+2,
// `/ ::= "/"
(61<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(64<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(64<<16)+2,
// INTLIT ::= digit128 ws*
(64<<16)+2,
// INTLIT ::= digit128
(64<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(64<<16)+3,
// INTLIT ::= "0" $$2
(64<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(65<<16)+3,
// STRINGLIT ::= "@" '"'
(65<<16)+2,
// STRINGLIT ::= '"' any* $$3
(65<<16)+3,
// STRINGLIT ::= '"' $$3
(65<<16)+2,
// CHARLIT ::= "'" any ws*
(66<<16)+3,
// CHARLIT ::= "'" any
(66<<16)+2,
// idChar ::= letter
(141<<16)+1,
// idChar ::= digit
(141<<16)+1,
// idChar ::= "_"
(141<<16)+1,
// idChar128 ::= letter128
(142<<16)+1,
// idChar128 ::= digit128
(142<<16)+1,
// idChar128 ::= {223}
(142<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(143<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(144<<16)+1,
// digit* ::= digit* digit
(135<<16)+2,
// digit* ::= digit
(135<<16)+1,
// any* ::= any* any
(139<<16)+2,
// any* ::= any
(139<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(137<<16)+2,
// hexDigit* ::= hexDigit
(137<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// <case>* ::= <case>* <case>
(40<<16)+2,
// <case>* ::= <case>
(40<<16)+1,
// idChar* ::= idChar* idChar
(133<<16)+2,
// idChar* ::= idChar
(133<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>
(72<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>
(145<<16)+2,
// <empty bracket pair>* ::= <empty bracket pair>
(145<<16)+1,
// $$0 ::= idChar128 ws*
(134<<16)+2,
// $$0 ::= idChar128
(134<<16)+1,
// $$1 ::= digit128 ws*
(136<<16)+2,
// $$1 ::= digit128
(136<<16)+1,
// $$2 ::= hexDigit128 ws*
(138<<16)+2,
// $$2 ::= hexDigit128
(138<<16)+1,
// $$3 ::= any128 ws*
(140<<16)+2,
// $$3 ::= any128
(140<<16)+1,
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
123, // 10
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
106, // " "
125, // "!"
127, // '"'
107, // "#"
113, // "$"
116, // "%"
108, // "&"
126, // "'"
117, // "("
109, // ")"
128, // "*"
118, // "+"
113, // ","
103, // "-"
119, // "."
111, // "/"
98, // "0"
97, // "1"
97, // "2"
97, // "3"
97, // "4"
97, // "5"
97, // "6"
97, // "7"
97, // "8"
97, // "9"
113, // ":"
112, // ";"
104, // "<"
121, // "="
114, // ">"
113, // "?"
122, // "@"
80, // "A"
80, // "B"
80, // "C"
80, // "D"
80, // "E"
80, // "F"
80, // "G"
80, // "H"
80, // "I"
80, // "J"
80, // "K"
80, // "L"
80, // "M"
80, // "N"
80, // "O"
80, // "P"
80, // "Q"
80, // "R"
80, // "S"
80, // "T"
80, // "U"
80, // "V"
80, // "W"
80, // "X"
80, // "Y"
80, // "Z"
102, // "["
113, // "\"
110, // "]"
113, // "^"
120, // "_"
113, // "`"
74, // "a"
87, // "b"
78, // "c"
80, // "d"
88, // "e"
79, // "f"
80, // "g"
89, // "h"
81, // "i"
80, // "j"
80, // "k"
82, // "l"
80, // "m"
90, // "n"
83, // "o"
75, // "p"
80, // "q"
84, // "r"
76, // "s"
91, // "t"
85, // "u"
77, // "v"
92, // "w"
86, // "x"
80, // "y"
80, // "z"
115, // "{"
105, // "|"
124, // "}"
113, // "~"
113, // 127
131, // 128
131, // 129
131, // 130
131, // 131
131, // 132
131, // 133
131, // 134
131, // 135
131, // 136
131, // 137
131, // 138
131, // 139
131, // 140
131, // 141
131, // 142
131, // 143
131, // 144
131, // 145
131, // 146
131, // 147
131, // 148
131, // 149
131, // 150
131, // 151
131, // 152
131, // 153
131, // 154
131, // 155
131, // 156
131, // 157
131, // 158
131, // 159
131, // 160
131, // 161
131, // 162
131, // 163
131, // 164
131, // 165
131, // 166
131, // 167
131, // 168
131, // 169
131, // 170
131, // 171
131, // 172
131, // 173
131, // 174
131, // 175
100, // 176
100, // 177
100, // 178
100, // 179
100, // 180
100, // 181
100, // 182
100, // 183
100, // 184
100, // 185
131, // 186
131, // 187
131, // 188
131, // 189
131, // 190
131, // 191
131, // 192
95, // 193
95, // 194
95, // 195
95, // 196
95, // 197
95, // 198
94, // 199
94, // 200
94, // 201
94, // 202
94, // 203
94, // 204
94, // 205
94, // 206
94, // 207
94, // 208
94, // 209
94, // 210
94, // 211
94, // 212
94, // 213
94, // 214
94, // 215
94, // 216
94, // 217
94, // 218
131, // 219
131, // 220
131, // 221
131, // 222
130, // 223
131, // 224
95, // 225
95, // 226
95, // 227
95, // 228
95, // 229
95, // 230
94, // 231
94, // 232
94, // 233
94, // 234
94, // 235
94, // 236
94, // 237
94, // 238
94, // 239
94, // 240
94, // 241
94, // 242
94, // 243
94, // 244
94, // 245
94, // 246
94, // 247
94, // 248
94, // 249
94, // 250
131, // 251
131, // 252
131, // 253
131, // 254
131, // 255
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
"<assign> ::= # `++ ID", // 29
"<assign> ::= # ID `--", // 30
"<assign> ::= # `-- ID", // 31
"<local var decl> ::= <type> # ID `= <exp>", // 32
"<stmt> ::= # `;", // 33
"<stmt> ::= # `switch `( <exp> `) `{ <case>* `}", // 34
"<stmt> ::= # `switch `( <exp> `) `{ <case>* `}", // 35
"<case> ::= `case # <exp> `;", // 36
"<exp> ::= <exp8>", // 37
"<exp8> ::= <exp7>", // 38
"<exp7> ::= <exp6>", // 39
"<exp6> ::= <exp5>", // 40
"<exp5> ::= <exp4>", // 41
"<exp4> ::= <exp3>", // 42
"<exp3> ::= <exp2>", // 43
"<exp2> ::= <exp1>", // 44
"<exp8> ::= <exp8> # `|| <exp7>", // 45
"<exp7> ::= <exp7> # `&& <exp6>", // 46
"<exp6> ::= <exp6> # `== <exp5>", // 47
"<exp6> ::= <exp6> # `!= <exp5>", // 48
"<exp5> ::= <exp5> # `< <exp4>", // 49
"<exp5> ::= <exp5> # `<= <exp4>", // 50
"<exp5> ::= <exp5> # `> <exp4>", // 51
"<exp4> ::= <exp4> # `+ <exp3>", // 52
"<exp4> ::= <exp4> # `- <exp3>", // 53
"<exp3> ::= <exp3> # `* <exp2>", // 54
"<exp3> ::= <exp3> # `/ <exp2>", // 55
"<exp3> ::= <exp3> # `% <exp2>", // 56
"<exp2> ::= # `( <type> `) <exp1>", // 57
"<exp2> ::= # `+ <exp1>", // 58
"<exp2> ::= # `- <exp1>", // 59
"<exp2> ::= # `! <exp1>", // 60
"<exp1> ::= # ID", // 61
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 62
"<exp1> ::= # INTLIT", // 63
"<exp1> ::= # STRINGLIT", // 64
"<exp1> ::= # CHARLIT", // 65
"<exp1> ::= <exp1> `. # ID", // 66
"<exp1> ::= # `this", // 67
"<exp1> ::= # `true", // 68
"<exp1> ::= # `false", // 69
"<exp1> ::= # `null", // 70
"<exp1> ::= # `new # ID `( `)", // 71
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 72
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 73
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 74
"letter128 ::= {193..218 225..250}", // 75
"digit ::= {\"0\"..\"9\"}", // 76
"digit128 ::= {176..185}", // 77
"any ::= {0..127}", // 78
"any128 ::= {128..255}", // 79
"ws ::= \" \"", // 80
"ws ::= {10} registerNewline", // 81
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 82
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 83
"`class ::= \"#\" \"c\" \"l\" ws*", // 84
"`class ::= \"#\" \"c\" \"l\" ws*", // 85
"`extends ::= \"#\" \"e\" \"x\" ws*", // 86
"`extends ::= \"#\" \"e\" \"x\" ws*", // 87
"`void ::= \"#\" \"v\" \"o\" ws*", // 88
"`void ::= \"#\" \"v\" \"o\" ws*", // 89
"`int ::= \"#\" \"i\" \"t\" ws*", // 90
"`int ::= \"#\" \"i\" \"t\" ws*", // 91
"`while ::= \"#\" \"w\" \"h\" ws*", // 92
"`while ::= \"#\" \"w\" \"h\" ws*", // 93
"`if ::= \"#\" \"+\" ws*", // 94
"`if ::= \"#\" \"+\" ws*", // 95
"`else ::= \"#\" \"e\" \"l\" ws*", // 96
"`else ::= \"#\" \"e\" \"l\" ws*", // 97
"`for ::= \"#\" \"f\" \"o\" ws*", // 98
"`for ::= \"#\" \"f\" \"o\" ws*", // 99
"`break ::= \"#\" \"b\" \"r\" ws*", // 100
"`break ::= \"#\" \"b\" \"r\" ws*", // 101
"`this ::= \"#\" \"t\" \"h\" ws*", // 102
"`this ::= \"#\" \"t\" \"h\" ws*", // 103
"`false ::= \"#\" \"f\" \"a\" ws*", // 104
"`false ::= \"#\" \"f\" \"a\" ws*", // 105
"`true ::= \"#\" \"t\" \"r\" ws*", // 106
"`true ::= \"#\" \"t\" \"r\" ws*", // 107
"`null ::= \"#\" \"n\" \"u\" ws*", // 108
"`null ::= \"#\" \"n\" \"u\" ws*", // 109
"`new ::= \"#\" \"n\" \"e\" ws*", // 110
"`new ::= \"#\" \"n\" \"e\" ws*", // 111
"`case ::= \"#\" \"c\" \"e\" ws*", // 112
"`case ::= \"#\" \"c\" \"e\" ws*", // 113
"`public ::= \"#\" \"p\" \"u\" ws*", // 114
"`public ::= \"#\" \"p\" \"u\" ws*", // 115
"`switch ::= \"#\" \"s\" \"w\" ws*", // 116
"`switch ::= \"#\" \"s\" \"w\" ws*", // 117
"`! ::= \"!\" ws*", // 118
"`! ::= \"!\" ws*", // 119
"`!= ::= \"@\" \"!\" ws*", // 120
"`!= ::= \"@\" \"!\" ws*", // 121
"`% ::= \"%\" ws*", // 122
"`% ::= \"%\" ws*", // 123
"`&& ::= \"@\" \"&\" ws*", // 124
"`&& ::= \"@\" \"&\" ws*", // 125
"`* ::= \"*\" ws*", // 126
"`* ::= \"*\" ws*", // 127
"`( ::= \"(\" ws*", // 128
"`( ::= \"(\" ws*", // 129
"`) ::= \")\" ws*", // 130
"`) ::= \")\" ws*", // 131
"`{ ::= \"{\" ws*", // 132
"`{ ::= \"{\" ws*", // 133
"`} ::= \"}\" ws*", // 134
"`} ::= \"}\" ws*", // 135
"`- ::= \"-\" ws*", // 136
"`- ::= \"-\" ws*", // 137
"`+ ::= \"+\" ws*", // 138
"`+ ::= \"+\" ws*", // 139
"`= ::= \"=\" ws*", // 140
"`= ::= \"=\" ws*", // 141
"`== ::= \"@\" \"=\" ws*", // 142
"`== ::= \"@\" \"=\" ws*", // 143
"`[ ::= \"[\" ws*", // 144
"`[ ::= \"[\" ws*", // 145
"`] ::= \"]\" ws*", // 146
"`] ::= \"]\" ws*", // 147
"`|| ::= \"@\" \"|\" ws*", // 148
"`|| ::= \"@\" \"|\" ws*", // 149
"`< ::= \"<\" ws*", // 150
"`< ::= \"<\" ws*", // 151
"`<= ::= \"@\" \"<\" ws*", // 152
"`<= ::= \"@\" \"<\" ws*", // 153
"`> ::= \">\" !\"=\" ws*", // 154
"`> ::= \">\" !\"=\" ws*", // 155
"`. ::= \".\" ws*", // 156
"`. ::= \".\" ws*", // 157
"`; ::= \";\" ws*", // 158
"`; ::= \";\" ws*", // 159
"`++ ::= \"@\" \"+\" ws*", // 160
"`++ ::= \"@\" \"+\" ws*", // 161
"`-- ::= \"@\" \"-\" ws*", // 162
"`-- ::= \"@\" \"-\" ws*", // 163
"`/ ::= \"/\" ws*", // 164
"`/ ::= \"/\" ws*", // 165
"ID ::= letter128 ws*", // 166
"ID ::= letter128 ws*", // 167
"ID ::= letter idChar* idChar128 ws*", // 168
"ID ::= letter idChar* idChar128 ws*", // 169
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 170
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 171
"INTLIT ::= digit128 ws*", // 172
"INTLIT ::= digit128 ws*", // 173
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 174
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 175
"STRINGLIT ::= \"@\" \'\"\' ws*", // 176
"STRINGLIT ::= \"@\" \'\"\' ws*", // 177
"STRINGLIT ::= \'\"\' any* any128 ws*", // 178
"STRINGLIT ::= \'\"\' any* any128 ws*", // 179
"CHARLIT ::= \"\'\" any ws*", // 180
"CHARLIT ::= \"\'\" any ws*", // 181
"idChar ::= letter", // 182
"idChar ::= digit", // 183
"idChar ::= \"_\"", // 184
"idChar128 ::= letter128", // 185
"idChar128 ::= digit128", // 186
"idChar128 ::= {223}", // 187
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 188
"hexDigit128 ::= {176..185 193..198 225..230}", // 189
"digit* ::= digit* digit", // 190
"digit* ::= digit* digit", // 191
"any* ::= any* any", // 192
"any* ::= any* any", // 193
"<decl in class>* ::= <decl in class>* <decl in class>", // 194
"<decl in class>* ::= <decl in class>* <decl in class>", // 195
"hexDigit* ::= hexDigit* hexDigit", // 196
"hexDigit* ::= hexDigit* hexDigit", // 197
"<stmt>* ::= <stmt>* <stmt>", // 198
"<stmt>* ::= <stmt>* <stmt>", // 199
"<case>* ::= <case>* <case>", // 200
"<case>* ::= <case>* <case>", // 201
"idChar* ::= idChar* idChar", // 202
"idChar* ::= idChar* idChar", // 203
"<class decl>+ ::= <class decl>", // 204
"<class decl>+ ::= <class decl>+ <class decl>", // 205
"<empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>", // 206
"ws* ::= ws* ws", // 207
"ws* ::= ws* ws", // 208
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 209
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 210
"", // 211
"", // 212
"", // 213
"", // 214
"", // 215
"", // 216
"", // 217
"", // 218
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
    { // 29: <assign> ::= [#] `++ ID @assignPlusPlusLeft(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 30: <assign> ::= [#] ID `-- @assignMinusMinus(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 31: <assign> ::= [#] `-- ID @assignMinusMinusLeft(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 32: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 33: <stmt> ::= [#] `; @newEmptyStmt(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 34: <stmt> ::= [#] `switch `( <exp> `) `{ <case>* `} @newSwitch(int,Exp,List<Statement>)=>Statement
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
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 35: <stmt> ::= [#] `switch `( <exp> `) `{ [<case>*] `} @newSwitch(int,Exp,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 36: <case> ::= `case [#] <exp> `; @newCase(int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 37: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 38: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 40: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 42: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 43: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 44: <exp2> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 45: <exp8> ::= <exp8> [#] `|| <exp7> @newOr(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 46: <exp7> ::= <exp7> [#] `&& <exp6> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 47: <exp6> ::= <exp6> [#] `== <exp5> @newDoubleEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 48: <exp6> ::= <exp6> [#] `!= <exp5> @newNotEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 49: <exp5> ::= <exp5> [#] `< <exp4> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 50: <exp5> ::= <exp5> [#] `<= <exp4> @newLessThanEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 51: <exp5> ::= <exp5> [#] `> <exp4> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 52: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 53: <exp4> ::= <exp4> [#] `- <exp3> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 54: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 55: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 56: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 57: <exp2> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 58: <exp2> ::= [#] `+ <exp1> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 59: <exp2> ::= [#] `- <exp1> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 60: <exp2> ::= [#] `! <exp1> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 61: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 62: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 63: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 64: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 65: <exp1> ::= [#] CHARLIT @newCharLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 66: <exp1> ::= <exp1> `. [#] ID @newInstVarAccess(Exp,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 67: <exp1> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 68: <exp1> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 69: <exp1> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 70: <exp1> ::= [#] `null @newNullExp(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 71: <exp1> ::= [#] `new [#] ID `( `) @newObject(int,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 72: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] <empty bracket pair>** @newArray(Type,int,Exp,List<Object>)=>Exp
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
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 73: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] !<empty bracket pair> [<empty bracket pair>**] @newArray(Type,int,Exp,List<Object>)=>Exp
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 74: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 75: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 76: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 77: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 78: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 79: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 80: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: ws ::= {10} [registerNewline] @void
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 83: `boolean ::= "#" "b" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 84: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 85: `class ::= "#" "c" "l" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 86: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 87: `extends ::= "#" "e" "x" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 88: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 89: `void ::= "#" "v" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 90: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 91: `int ::= "#" "i" "t" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 92: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 93: `while ::= "#" "w" "h" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 94: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 95: `if ::= "#" "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 96: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 97: `else ::= "#" "e" "l" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 98: `for ::= "#" "f" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 99: `for ::= "#" "f" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 100: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 101: `break ::= "#" "b" "r" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 102: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 103: `this ::= "#" "t" "h" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 104: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 105: `false ::= "#" "f" "a" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 106: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 107: `true ::= "#" "t" "r" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 108: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 109: `null ::= "#" "n" "u" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 110: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 111: `new ::= "#" "n" "e" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 112: `case ::= "#" "c" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 113: `case ::= "#" "c" "e" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 114: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 115: `public ::= "#" "p" "u" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 116: `switch ::= "#" "s" "w" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 117: `switch ::= "#" "s" "w" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 118: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 119: `! ::= "!" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 120: `!= ::= "@" "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 121: `!= ::= "@" "!" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 122: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `% ::= "%" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 125: `&& ::= "@" "&" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 126: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `* ::= "*" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `( ::= "(" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `) ::= ")" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `{ ::= "{" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `} ::= "}" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `- ::= "-" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `+ ::= "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `= ::= "=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 143: `== ::= "@" "=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 144: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `[ ::= "[" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `] ::= "]" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 149: `|| ::= "@" "|" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 150: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `< ::= "<" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 153: `<= ::= "@" "<" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 154: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `> ::= ">" !"=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `. ::= "." [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 159: `; ::= ";" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `++ ::= "@" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 161: `++ ::= "@" "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 162: `-- ::= "@" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 163: `-- ::= "@" "-" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 164: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `/ ::= "/" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 166: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 167: ID ::= letter128 [ws*] @text
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 168: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 169: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 170: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 171: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 172: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 173: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 174: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 175: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 176: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 177: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 178: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 179: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 180: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 181: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 182: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 183: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 184: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 185: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 186: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 187: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 188: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 189: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 190: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 191: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 192: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 193: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 194: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 195: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 196: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 197: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 198: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 199: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 200: <case>* ::= <case>* <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 201: <case>* ::= [<case>*] <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 202: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 203: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 204: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 205: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 206: <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 207: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 208: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 209: <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 210: <empty bracket pair>* ::= [<empty bracket pair>*] <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 211: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 212: $$0 ::= idChar128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 213: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 214: $$1 ::= digit128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 215: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 216: $$2 ::= hexDigit128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 217: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 218: $$3 ::= any128 [ws*] @pass
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
      ((62<<5)|0x5)/*methodCall:62*/,
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
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignPlusPlusLeft(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignMinusMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignMinusMinusLeft(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 22: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newEmptyStmt(parm0);
      si.pushPb(result);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Statement result = actionObject.newSwitch(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement result = actionObject.newCase(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 26: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newOr(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 27: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 28: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDoubleEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 29: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newNotEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 30: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 31: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThanEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 32: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 33: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 34: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 35: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 36: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 37: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 43: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 47: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstVarAccess(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNullExp(parm0);
      si.pushPb(result);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newObject(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 53: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      List<Object> parm3 = (List<Object>)si.popPb();
      Exp result = actionObject.newArray(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 54: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 55: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 56: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 57: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 58: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 59: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 60: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 61: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 62: {
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
"Statement assignPlusPlusLeft(int,String)",
"Statement assignMinusMinus(int,String)",
"Statement assignMinusMinusLeft(int,String)",
"Statement localVarDecl(Type,int,String,Exp)",
"Statement newEmptyStmt(int)",
"Statement newSwitch(int,Exp,List<Statement>)",
"Statement newCase(int,Exp)",
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
2,1,
2,1,
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
    0,
    1,
    1,
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
