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
public int getEofSym() { return 132; }
public int getNttSym() { return 133; }
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
"`this",
"`true",
"`false",
"`new",
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
"{0..9 11..31 \"$\" \"&\" \",\" \".\" \":\" \"?\" \"\\\" \"^\" \"`\" \"|\" \"~\"..127}",
"\"%\"",
"\"(\"",
"\"+\"",
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
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 134;}
private static final int MIN_REDUCTION = 521;
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
1,459, // <start>
2,255, // ws*
3,199, // <program>
4,59, // <class decl>+
5,448, // <class decl>
6,434, // `class
95,79, // " "
96,125, // "#"
110,28, // {10}
119,115, // ws
  }
,
{ // state 1
  }
,
{ // state 2
24,MIN_REDUCTION+68, // `[
92,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 3
95,79, // " "
110,28, // {10}
119,39, // ws
133,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 4
0x80000000|1, // match move
0x80000000|179, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 5
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 6
0x80000000|497, // match move
0x80000000|447, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 7
0x80000000|1, // match move
0x80000000|412, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 8
0x80000000|1, // match move
0x80000000|465, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 9
2,12, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 10
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 11
0x80000000|73, // match move
0x80000000|353, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 13
2,3, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
133,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 14
24,MIN_REDUCTION+67, // `[
92,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 15
0x80000000|1, // match move
0x80000000|334, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 16
0x80000000|234, // match move
0x80000000|281, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 17
32,85, // `else
96,247, // "#"
  }
,
{ // state 18
16,315, // `(
105,188, // "("
  }
,
{ // state 19
28,95, // `;
100,260, // ";"
  }
,
{ // state 20
94,49, // "<"
  }
,
{ // state 21
24,MIN_REDUCTION+145, // `[
92,MIN_REDUCTION+145, // "["
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 22
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 23
0x80000000|433, // match move
0x80000000|162, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 24
47,480, // `<
48,81, // `<=
49,62, // `>
94,478, // "<"
101,98, // ">"
109,20, // "@"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 25
81,106, // "t"
  }
,
{ // state 26
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 27
95,508, // " "
110,163, // {10}
119,96, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 28
133,MIN_REDUCTION+68, // $NT
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 29
0x80000000|1, // match move
0x80000000|201, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 30
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 31
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 32
0x80000000|197, // match move
0x80000000|235, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 33
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 34
0x80000000|194, // match move
0x80000000|513, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 35
28,275, // `;
100,320, // ";"
  }
,
{ // state 36
2,173, // ws*
  }
,
{ // state 37
24,MIN_REDUCTION+54, // `[
92,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 38
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 39
133,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 40
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 41
2,285, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 42
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 43
2,293, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 44
0x80000000|400, // match move
0x80000000|397, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 45
7,409, // ID
16,381, // `(
22,4, // `null
27,191, // <assign>
31,253, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 46
0x80000000|237, // match move
0x80000000|172, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 47
24,MIN_REDUCTION+60, // `[
92,MIN_REDUCTION+60, // "["
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 48
10,148, // `}
39,406, // <case>*
40,435, // <case>
41,472, // `case
96,93, // "#"
111,415, // "}"
  }
,
{ // state 49
2,31, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 50
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 51
16,309, // `(
105,188, // "("
  }
,
{ // state 52
0x80000000|375, // match move
0x80000000|474, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 53
2,50, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 54
24,MIN_REDUCTION+151, // `[
92,MIN_REDUCTION+151, // "["
95,301, // " "
110,211, // {10}
119,183, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 55
24,MIN_REDUCTION+52, // `[
92,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 56
0x80000000|502, // match move
0x80000000|438, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 57
0x80000000|205, // match move
0x80000000|512, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 58
16,296, // `(
105,188, // "("
  }
,
{ // state 59
5,494, // <class decl>
6,434, // `class
96,125, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 60
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 61
73,399, // "o"
74,333, // "r"
  }
,
{ // state 62
7,379, // ID
16,381, // `(
22,4, // `null
43,274, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 63
65,330, // "p"
  }
,
{ // state 64
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 65
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 66
2,340, // ws*
  }
,
{ // state 67
7,379, // ID
16,381, // `(
22,4, // `null
31,451, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 68
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 69
0x80000000|100, // match move
0x80000000|442, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 70
7,379, // ID
16,381, // `(
22,4, // `null
44,212, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 71
24,MIN_REDUCTION+127, // `[
92,MIN_REDUCTION+127, // "["
95,301, // " "
110,211, // {10}
119,183, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 72
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 73
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 75
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 76
2,144, // ws*
95,508, // " "
110,163, // {10}
119,305, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 77
24,MIN_REDUCTION+93, // `[
92,MIN_REDUCTION+93, // "["
95,301, // " "
110,211, // {10}
119,183, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 78
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 79
133,MIN_REDUCTION+67, // $NT
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 80
2,144, // ws*
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 81
7,379, // ID
16,381, // `(
22,4, // `null
43,339, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 82
2,42, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 83
63,165, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,430, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
86,464, // digit
87,243, // {"1".."9"}
88,243, // "0"
89,157, // digit128
90,46, // {176..185}
107,10, // "_"
117,316, // {223}
120,328, // idChar*
121,232, // $$0
128,335, // idChar
129,52, // idChar128
  }
,
{ // state 84
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 85
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
105, // ID
169, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
342, // `void
381, // `(
-1, // `)
-1, // <stmt>*
443, // <type>
312, // `int
132, // `boolean
32, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
349, // <stmt>
114, // <assign>
74, // `;
458, // <local var decl>
441, // `if
253, // <exp>
-1, // `else
118, // `for
271, // `while
439, // `break
-1, // `=
-1, // `++
58, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
24, // <exp5>
236, // <exp4>
385, // <exp3>
186, // <exp2>
113, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
408, // `+
262, // `-
-1, // `*
-1, // `/
-1, // `%
215, // `!
371, // INTLIT
111, // STRINGLIT
294, // CHARLIT
225, // `this
15, // `true
227, // `false
427, // `new
83, // letter
366, // "a"
366, // "p"
366, // "s"
366, // "v"
366, // "c"
366, // "f"
366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
366, // "i"
366, // "l"
366, // "o"
366, // "r"
366, // "u"
366, // "x"
366, // "b"
366, // "e"
366, // "h"
366, // "n"
366, // "t"
366, // "w"
120, // letter128
290, // {199..218 231..250}
290, // {193..198 225..230}
-1, // digit
445, // {"1".."9"}
241, // "0"
422, // digit128
46, // {176..185}
-1, // any
-1, // "["
82, // "-"
-1, // "<"
-1, // " "
302, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
320, // ";"
-1, // ">"
226, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
188, // "("
487, // "+"
-1, // "_"
-1, // "="
377, // "@"
-1, // {10}
-1, // "}"
323, // "!"
383, // "'"
424, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 86
0x80000000|190, // match move
0x80000000|490, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 87
24,MIN_REDUCTION+183, // `[
92,MIN_REDUCTION+183, // "["
95,301, // " "
110,211, // {10}
119,183, // ws
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 88
0x80000000|481, // match move
0x80000000|286, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 89
8,457, // `{
102,226, // "{"
  }
,
{ // state 90
0x80000000|1, // match move
0x80000000|21, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 91
17,176, // `)
97,380, // ")"
  }
,
{ // state 92
24,MIN_REDUCTION+162, // `[
92,MIN_REDUCTION+162, // "["
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 93
68,372, // "c"
  }
,
{ // state 94
0x80000000|1, // match move
0x80000000|54, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 95
0x80000000|436, // match move
0x80000000|351, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 96
0x80000000|38, // match move
0x80000000|496, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 97
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 98
0x80000000|1, // match move
0x80000000|43, // no-match move
// T-test match for "=":
108,
  }
,
{ // state 99
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 100
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 101
0x80000000|298, // match move
0x80000000|142, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 102
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
105, // ID
169, // `{
-1, // <decl in class>*
386, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
342, // `void
381, // `(
-1, // `)
-1, // <stmt>*
443, // <type>
312, // `int
132, // `boolean
32, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
84, // <stmt>
114, // <assign>
74, // `;
458, // <local var decl>
441, // `if
253, // <exp>
-1, // `else
118, // `for
271, // `while
439, // `break
-1, // `=
-1, // `++
58, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
24, // <exp5>
236, // <exp4>
385, // <exp3>
186, // <exp2>
113, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
408, // `+
262, // `-
-1, // `*
-1, // `/
-1, // `%
215, // `!
371, // INTLIT
111, // STRINGLIT
294, // CHARLIT
225, // `this
15, // `true
227, // `false
427, // `new
83, // letter
366, // "a"
366, // "p"
366, // "s"
366, // "v"
366, // "c"
366, // "f"
366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
366, // "i"
366, // "l"
366, // "o"
366, // "r"
366, // "u"
366, // "x"
366, // "b"
366, // "e"
366, // "h"
366, // "n"
366, // "t"
366, // "w"
120, // letter128
290, // {199..218 231..250}
290, // {193..198 225..230}
-1, // digit
445, // {"1".."9"}
241, // "0"
422, // digit128
46, // {176..185}
-1, // any
-1, // "["
82, // "-"
-1, // "<"
-1, // " "
302, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
320, // ";"
-1, // ">"
226, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
188, // "("
487, // "+"
-1, // "_"
-1, // "="
377, // "@"
-1, // {10}
336, // "}"
323, // "!"
383, // "'"
424, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 103
133,MIN_REDUCTION+17, // $NT
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 104
17,254, // `)
97,380, // ")"
  }
,
{ // state 105
0x80000000|518, // match move
0x80000000|277, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 106
2,68, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 107
0x80000000|1, // match move
0x80000000|476, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 108
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 109
2,138, // ws*
24,MIN_REDUCTION+188, // `[
92,MIN_REDUCTION+188, // "["
95,301, // " "
110,211, // {10}
119,86, // ws
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 110
2,60, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 111
0x80000000|1, // match move
0x80000000|37, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 112
7,379, // ID
22,4, // `null
46,454, // <exp1>
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
96,348, // "#"
109,377, // "@"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 113
0x80000000|1, // match move
0x80000000|493, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 114
28,292, // `;
100,320, // ";"
  }
,
{ // state 115
133,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 116
0x80000000|65, // match move
0x80000000|129, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 117
28,364, // `;
100,320, // ";"
  }
,
{ // state 118
16,193, // `(
105,188, // "("
  }
,
{ // state 119
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 120
0x80000000|514, // match move
0x80000000|242, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
2,122, // ws*
24,MIN_REDUCTION+190, // `[
92,MIN_REDUCTION+190, // "["
95,301, // " "
110,211, // {10}
119,86, // ws
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 122
0x80000000|1, // match move
0x80000000|401, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 123
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 125
68,354, // "c"
  }
,
{ // state 126
10,484, // `}
39,303, // <case>*
40,435, // <case>
41,472, // `case
96,93, // "#"
111,336, // "}"
  }
,
{ // state 127
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 128
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 129
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 130
17,356, // `)
97,380, // ")"
  }
,
{ // state 131
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
105, // ID
169, // `{
-1, // <decl in class>*
151, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
342, // `void
381, // `(
-1, // `)
341, // <stmt>*
443, // <type>
312, // `int
132, // `boolean
32, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
423, // <stmt>
114, // <assign>
74, // `;
458, // <local var decl>
441, // `if
253, // <exp>
-1, // `else
118, // `for
271, // `while
439, // `break
-1, // `=
-1, // `++
58, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
24, // <exp5>
236, // <exp4>
385, // <exp3>
186, // <exp2>
113, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
408, // `+
262, // `-
-1, // `*
-1, // `/
-1, // `%
215, // `!
371, // INTLIT
111, // STRINGLIT
294, // CHARLIT
225, // `this
15, // `true
227, // `false
427, // `new
83, // letter
366, // "a"
366, // "p"
366, // "s"
366, // "v"
366, // "c"
366, // "f"
366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
366, // "i"
366, // "l"
366, // "o"
366, // "r"
366, // "u"
366, // "x"
366, // "b"
366, // "e"
366, // "h"
366, // "n"
366, // "t"
366, // "w"
120, // letter128
290, // {199..218 231..250}
290, // {193..198 225..230}
-1, // digit
445, // {"1".."9"}
241, // "0"
422, // digit128
46, // {176..185}
-1, // any
-1, // "["
82, // "-"
-1, // "<"
-1, // " "
302, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
320, // ";"
-1, // ">"
226, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
188, // "("
487, // "+"
-1, // "_"
-1, // "="
377, // "@"
-1, // {10}
415, // "}"
323, // "!"
383, // "'"
424, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 132
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 133
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 134
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 135
16,67, // `(
105,188, // "("
  }
,
{ // state 136
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 137
2,295, // ws*
24,MIN_REDUCTION+148, // `[
92,MIN_REDUCTION+148, // "["
95,301, // " "
110,211, // {10}
119,86, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 138
0x80000000|1, // match move
0x80000000|437, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 139
17,112, // `)
23,202, // <empty bracket pair>
24,276, // `[
92,53, // "["
97,380, // ")"
  }
,
{ // state 140
75,143, // "u"
78,258, // "e"
  }
,
{ // state 141
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 143
0x80000000|289, // match move
0x80000000|468, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 144
0x80000000|5, // match move
0x80000000|27, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 145
94,49, // "<"
106,321, // "+"
  }
,
{ // state 146
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 147
2,200, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 148
0x80000000|26, // match move
0x80000000|187, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 149
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 150
0x80000000|358, // match move
0x80000000|398, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 151
0x80000000|419, // match move
0x80000000|376, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 152
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 153
36,265, // `=
108,313, // "="
  }
,
{ // state 154
16,390, // `(
105,188, // "("
  }
,
{ // state 155
0x80000000|259, // match move
0x80000000|426, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 156
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 157
0x80000000|310, // match move
0x80000000|343, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 158
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 159
24,MIN_REDUCTION+91, // `[
92,MIN_REDUCTION+91, // "["
95,301, // " "
110,211, // {10}
119,183, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 162
2,29, // ws*
24,MIN_REDUCTION+156, // `[
92,MIN_REDUCTION+156, // "["
95,301, // " "
110,211, // {10}
119,86, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 163
0x80000000|223, // match move
0x80000000|461, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 164
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 166
24,MIN_REDUCTION+89, // `[
92,MIN_REDUCTION+89, // "["
95,301, // " "
110,211, // {10}
119,183, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 167
24,418, // `[
92,53, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 168
7,379, // ID
16,381, // `(
22,4, // `null
31,411, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 169
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
105, // ID
169, // `{
-1, // <decl in class>*
407, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
342, // `void
381, // `(
-1, // `)
102, // <stmt>*
443, // <type>
312, // `int
132, // `boolean
32, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
423, // <stmt>
114, // <assign>
74, // `;
458, // <local var decl>
441, // `if
253, // <exp>
-1, // `else
118, // `for
271, // `while
439, // `break
-1, // `=
-1, // `++
58, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
24, // <exp5>
236, // <exp4>
385, // <exp3>
186, // <exp2>
113, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
408, // `+
262, // `-
-1, // `*
-1, // `/
-1, // `%
215, // `!
371, // INTLIT
111, // STRINGLIT
294, // CHARLIT
225, // `this
15, // `true
227, // `false
427, // `new
83, // letter
366, // "a"
366, // "p"
366, // "s"
366, // "v"
366, // "c"
366, // "f"
366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
366, // "i"
366, // "l"
366, // "o"
366, // "r"
366, // "u"
366, // "x"
366, // "b"
366, // "e"
366, // "h"
366, // "n"
366, // "t"
366, // "w"
120, // letter128
290, // {199..218 231..250}
290, // {193..198 225..230}
-1, // digit
445, // {"1".."9"}
241, // "0"
422, // digit128
46, // {176..185}
-1, // any
-1, // "["
82, // "-"
-1, // "<"
-1, // " "
302, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
320, // ";"
-1, // ">"
226, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
188, // "("
487, // "+"
-1, // "_"
-1, // "="
377, // "@"
-1, // {10}
336, // "}"
323, // "!"
383, // "'"
424, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 170
7,379, // ID
16,381, // `(
22,4, // `null
31,130, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 171
2,455, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 172
24,MIN_REDUCTION+64, // `[
92,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 173
0x80000000|1, // match move
0x80000000|159, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 174
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 175
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 176
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
105, // ID
131, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
342, // `void
381, // `(
-1, // `)
-1, // <stmt>*
443, // <type>
312, // `int
132, // `boolean
32, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
155, // <stmt>
207, // <assign>
374, // `;
19, // <local var decl>
135, // `if
253, // <exp>
-1, // `else
198, // `for
51, // `while
420, // `break
-1, // `=
-1, // `++
220, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
24, // <exp5>
236, // <exp4>
385, // <exp3>
186, // <exp2>
113, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
408, // `+
262, // `-
-1, // `*
-1, // `/
-1, // `%
215, // `!
371, // INTLIT
111, // STRINGLIT
294, // CHARLIT
225, // `this
15, // `true
227, // `false
427, // `new
83, // letter
366, // "a"
366, // "p"
366, // "s"
366, // "v"
366, // "c"
366, // "f"
366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
366, // "i"
366, // "l"
366, // "o"
366, // "r"
366, // "u"
366, // "x"
366, // "b"
366, // "e"
366, // "h"
366, // "n"
366, // "t"
366, // "w"
120, // letter128
290, // {199..218 231..250}
290, // {193..198 225..230}
-1, // digit
445, // {"1".."9"}
241, // "0"
422, // digit128
46, // {176..185}
-1, // any
-1, // "["
82, // "-"
-1, // "<"
-1, // " "
302, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
260, // ";"
-1, // ">"
226, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
188, // "("
487, // "+"
-1, // "_"
-1, // "="
377, // "@"
-1, // {10}
-1, // "}"
323, // "!"
383, // "'"
424, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 177
24,MIN_REDUCTION+144, // `[
92,MIN_REDUCTION+144, // "["
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 178
2,8, // ws*
24,MIN_REDUCTION+186, // `[
92,MIN_REDUCTION+186, // "["
95,301, // " "
110,211, // {10}
119,86, // ws
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 179
24,MIN_REDUCTION+59, // `[
92,MIN_REDUCTION+59, // "["
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 180
0x80000000|36, // match move
0x80000000|449, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 181
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 182
24,MIN_REDUCTION+153, // `[
92,MIN_REDUCTION+153, // "["
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 183
0x80000000|219, // match move
0x80000000|396, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 184
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 185
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 186
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 188
2,224, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 189
0x80000000|1, // match move
0x80000000|47, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 190
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 191
17,269, // `)
97,380, // ")"
  }
,
{ // state 192
0x80000000|1, // match move
0x80000000|460, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 193
7,409, // ID
16,381, // `(
22,4, // `null
27,337, // <assign>
31,253, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 194
2,221, // ws*
  }
,
{ // state 195
24,MIN_REDUCTION+154, // `[
92,MIN_REDUCTION+154, // "["
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 196
24,MIN_REDUCTION+147, // `[
92,MIN_REDUCTION+147, // "["
95,301, // " "
110,211, // {10}
119,183, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 197
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 198
16,311, // `(
105,188, // "("
  }
,
{ // state 199
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 200
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 201
24,MIN_REDUCTION+155, // `[
92,MIN_REDUCTION+155, // "["
95,301, // " "
110,211, // {10}
119,183, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 202
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 203
50,70, // `+
51,282, // `-
93,82, // "-"
106,487, // "+"
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 204
95,MIN_REDUCTION+67, // " "
110,MIN_REDUCTION+67, // {10}
119,MIN_REDUCTION+67, // ws
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 205
2,347, // ws*
  }
,
{ // state 206
63,165, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,185, // letter128
84,152, // {199..218 231..250}
85,152, // {193..198 225..230}
86,464, // digit
87,243, // {"1".."9"}
88,243, // "0"
89,99, // digit128
90,391, // {176..185}
107,10, // "_"
117,469, // {223}
120,357, // idChar*
121,446, // $$0
128,335, // idChar
129,248, // idChar128
  }
,
{ // state 207
28,16, // `;
100,260, // ";"
  }
,
{ // state 208
25,369, // `]
98,34, // "]"
  }
,
{ // state 209
17,477, // `)
97,380, // ")"
  }
,
{ // state 210
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 211
0x80000000|473, // match move
0x80000000|2, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 212
52,231, // `*
53,395, // `/
54,405, // `%
99,9, // "/"
104,360, // "%"
115,440, // "*"
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 213
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 214
2,500, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 215
7,379, // ID
22,4, // `null
46,467, // <exp1>
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
96,348, // "#"
109,377, // "@"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 216
8,126, // `{
102,226, // "{"
  }
,
{ // state 217
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 218
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 219
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 220
16,170, // `(
105,188, // "("
  }
,
{ // state 221
0x80000000|1, // match move
0x80000000|71, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 222
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 223
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 224
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 225
0x80000000|1, // match move
0x80000000|346, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 226
2,246, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 227
0x80000000|1, // match move
0x80000000|250, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 228
2,340, // ws*
24,MIN_REDUCTION+114, // `[
92,MIN_REDUCTION+114, // "["
95,301, // " "
110,211, // {10}
119,86, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 230
24,MIN_REDUCTION+51, // `[
92,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 231
7,379, // ID
16,381, // `(
22,4, // `null
45,503, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 232
0x80000000|160, // match move
0x80000000|177, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 233
7,505, // ID
63,206, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,300, // letter128
84,152, // {199..218 231..250}
85,152, // {193..198 225..230}
  }
,
{ // state 234
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 235
24,MIN_REDUCTION+59, // `[
36,MIN_REDUCTION+59, // `=
47,MIN_REDUCTION+59, // `<
48,MIN_REDUCTION+59, // `<=
49,MIN_REDUCTION+59, // `>
50,MIN_REDUCTION+59, // `+
51,MIN_REDUCTION+59, // `-
52,MIN_REDUCTION+59, // `*
53,MIN_REDUCTION+59, // `/
54,MIN_REDUCTION+59, // `%
92,MIN_REDUCTION+59, // "["
93,MIN_REDUCTION+59, // "-"
94,MIN_REDUCTION+59, // "<"
99,MIN_REDUCTION+59, // "/"
101,MIN_REDUCTION+59, // ">"
104,MIN_REDUCTION+59, // "%"
106,MIN_REDUCTION+59, // "+"
108,MIN_REDUCTION+59, // "="
109,MIN_REDUCTION+59, // "@"
115,MIN_REDUCTION+59, // "*"
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 236
50,70, // `+
51,282, // `-
93,82, // "-"
106,487, // "+"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 238
24,MIN_REDUCTION+53, // `[
92,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 239
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 240
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 241
64,306, // "a"
65,306, // "p"
66,306, // "s"
67,306, // "v"
68,306, // "c"
69,306, // "f"
70,306, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,306, // "i"
72,306, // "l"
73,306, // "o"
74,306, // "r"
75,306, // "u"
76,306, // "x"
77,306, // "b"
78,306, // "e"
79,306, // "h"
80,306, // "n"
81,306, // "t"
82,306, // "w"
85,367, // {193..198 225..230}
87,306, // {"1".."9"}
88,306, // "0"
90,367, // {176..185}
124,501, // hexDigit*
125,308, // $$2
130,127, // hexDigit
131,475, // hexDigit128
  }
,
{ // state 242
2,44, // ws*
24,MIN_REDUCTION+142, // `[
92,MIN_REDUCTION+142, // "["
95,301, // " "
110,211, // {10}
119,86, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 243
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 244
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 245
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
105, // ID
131, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
342, // `void
381, // `(
-1, // `)
-1, // <stmt>*
443, // <type>
312, // `int
132, // `boolean
32, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
403, // <stmt>
207, // <assign>
374, // `;
19, // <local var decl>
135, // `if
253, // <exp>
-1, // `else
198, // `for
51, // `while
420, // `break
-1, // `=
-1, // `++
220, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
24, // <exp5>
236, // <exp4>
385, // <exp3>
186, // <exp2>
113, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
408, // `+
262, // `-
-1, // `*
-1, // `/
-1, // `%
215, // `!
371, // INTLIT
111, // STRINGLIT
294, // CHARLIT
225, // `this
15, // `true
227, // `false
427, // `new
83, // letter
366, // "a"
366, // "p"
366, // "s"
366, // "v"
366, // "c"
366, // "f"
366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
366, // "i"
366, // "l"
366, // "o"
366, // "r"
366, // "u"
366, // "x"
366, // "b"
366, // "e"
366, // "h"
366, // "n"
366, // "t"
366, // "w"
120, // letter128
290, // {199..218 231..250}
290, // {193..198 225..230}
-1, // digit
445, // {"1".."9"}
241, // "0"
422, // digit128
46, // {176..185}
-1, // any
-1, // "["
82, // "-"
-1, // "<"
-1, // " "
302, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
260, // ";"
-1, // ">"
226, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
188, // "("
487, // "+"
-1, // "_"
-1, // "="
377, // "@"
-1, // {10}
-1, // "}"
323, // "!"
383, // "'"
424, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 246
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 247
78,489, // "e"
  }
,
{ // state 248
2,517, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 249
76,171, // "x"
  }
,
{ // state 250
24,MIN_REDUCTION+58, // `[
92,MIN_REDUCTION+58, // "["
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 251
10,491, // `}
12,240, // <decl in class>
13,217, // <method decl>
14,510, // `public
96,63, // "#"
111,336, // "}"
  }
,
{ // state 252
73,214, // "o"
  }
,
{ // state 253
36,268, // `=
108,313, // "="
  }
,
{ // state 254
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
105, // ID
169, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
342, // `void
381, // `(
-1, // `)
-1, // <stmt>*
443, // <type>
312, // `int
132, // `boolean
32, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
452, // <stmt>
114, // <assign>
74, // `;
458, // <local var decl>
441, // `if
253, // <exp>
-1, // `else
118, // `for
271, // `while
439, // `break
-1, // `=
-1, // `++
58, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
24, // <exp5>
236, // <exp4>
385, // <exp3>
186, // <exp2>
113, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
408, // `+
262, // `-
-1, // `*
-1, // `/
-1, // `%
215, // `!
371, // INTLIT
111, // STRINGLIT
294, // CHARLIT
225, // `this
15, // `true
227, // `false
427, // `new
83, // letter
366, // "a"
366, // "p"
366, // "s"
366, // "v"
366, // "c"
366, // "f"
366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
366, // "i"
366, // "l"
366, // "o"
366, // "r"
366, // "u"
366, // "x"
366, // "b"
366, // "e"
366, // "h"
366, // "n"
366, // "t"
366, // "w"
120, // letter128
290, // {199..218 231..250}
290, // {193..198 225..230}
-1, // digit
445, // {"1".."9"}
241, // "0"
422, // digit128
46, // {176..185}
-1, // any
-1, // "["
82, // "-"
-1, // "<"
-1, // " "
302, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
320, // ";"
-1, // ">"
226, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
188, // "("
487, // "+"
-1, // "_"
-1, // "="
377, // "@"
-1, // {10}
-1, // "}"
323, // "!"
383, // "'"
424, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 255
3,444, // <program>
4,59, // <class decl>+
5,448, // <class decl>
6,434, // `class
95,79, // " "
96,125, // "#"
110,28, // {10}
119,39, // ws
  }
,
{ // state 256
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 257
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 258
2,515, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 259
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 260
0x80000000|317, // match move
0x80000000|363, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 261
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 262
7,379, // ID
22,4, // `null
46,350, // <exp1>
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
96,348, // "#"
109,377, // "@"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 263
52,231, // `*
53,395, // `/
54,405, // `%
99,9, // "/"
104,360, // "%"
115,440, // "*"
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 264
79,499, // "h"
  }
,
{ // state 265
7,379, // ID
16,381, // `(
22,4, // `null
31,519, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 266
96,247, // "#"
  }
,
{ // state 267
2,389, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 268
7,379, // ID
16,381, // `(
22,4, // `null
31,33, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 269
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
105, // ID
169, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
342, // `void
381, // `(
-1, // `)
-1, // <stmt>*
443, // <type>
312, // `int
132, // `boolean
32, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
22, // <stmt>
114, // <assign>
74, // `;
458, // <local var decl>
441, // `if
253, // <exp>
-1, // `else
118, // `for
271, // `while
439, // `break
-1, // `=
-1, // `++
58, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
24, // <exp5>
236, // <exp4>
385, // <exp3>
186, // <exp2>
113, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
408, // `+
262, // `-
-1, // `*
-1, // `/
-1, // `%
215, // `!
371, // INTLIT
111, // STRINGLIT
294, // CHARLIT
225, // `this
15, // `true
227, // `false
427, // `new
83, // letter
366, // "a"
366, // "p"
366, // "s"
366, // "v"
366, // "c"
366, // "f"
366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
366, // "i"
366, // "l"
366, // "o"
366, // "r"
366, // "u"
366, // "x"
366, // "b"
366, // "e"
366, // "h"
366, // "n"
366, // "t"
366, // "w"
120, // letter128
290, // {199..218 231..250}
290, // {193..198 225..230}
-1, // digit
445, // {"1".."9"}
241, // "0"
422, // digit128
46, // {176..185}
-1, // any
-1, // "["
82, // "-"
-1, // "<"
-1, // " "
302, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
320, // ";"
-1, // ">"
226, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
188, // "("
487, // "+"
-1, // "_"
-1, // "="
377, // "@"
-1, // {10}
-1, // "}"
323, // "!"
383, // "'"
424, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 270
64,40, // "a"
65,40, // "p"
66,40, // "s"
67,40, // "v"
68,40, // "c"
69,40, // "f"
70,40, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,40, // "i"
72,40, // "l"
73,40, // "o"
74,40, // "r"
75,40, // "u"
76,40, // "x"
77,40, // "b"
78,40, // "e"
79,40, // "h"
80,40, // "n"
81,40, // "t"
82,40, // "w"
84,516, // {199..218 231..250}
85,516, // {193..198 225..230}
87,40, // {"1".."9"}
88,40, // "0"
90,516, // {176..185}
91,261, // any
92,40, // "["
93,40, // "-"
94,40, // "<"
95,40, // " "
96,40, // "#"
97,40, // ")"
98,40, // "]"
99,40, // "/"
100,40, // ";"
101,40, // ">"
102,40, // "{"
103,40, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
104,40, // "%"
105,40, // "("
106,40, // "+"
107,40, // "_"
108,40, // "="
109,40, // "@"
110,40, // {10}
111,40, // "}"
112,40, // "!"
113,40, // "'"
114,40, // '"'
115,40, // "*"
116,462, // any128
117,516, // {223}
118,516, // {128..175 186..192 219..222 224 251..255}
127,506, // $$3
  }
,
{ // state 271
16,495, // `(
105,188, // "("
  }
,
{ // state 272
67,252, // "v"
  }
,
{ // state 273
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 274
50,70, // `+
51,282, // `-
93,82, // "-"
106,487, // "+"
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 275
7,379, // ID
16,381, // `(
22,4, // `null
31,117, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 276
25,103, // `]
98,13, // "]"
  }
,
{ // state 277
24,MIN_REDUCTION+51, // `[
36,MIN_REDUCTION+51, // `=
37,498, // `++
47,MIN_REDUCTION+51, // `<
48,MIN_REDUCTION+51, // `<=
49,MIN_REDUCTION+51, // `>
50,MIN_REDUCTION+51, // `+
51,MIN_REDUCTION+51, // `-
52,MIN_REDUCTION+51, // `*
53,MIN_REDUCTION+51, // `/
54,MIN_REDUCTION+51, // `%
92,MIN_REDUCTION+51, // "["
93,MIN_REDUCTION+51, // "-"
94,MIN_REDUCTION+51, // "<"
99,MIN_REDUCTION+51, // "/"
101,MIN_REDUCTION+51, // ">"
104,MIN_REDUCTION+51, // "%"
106,MIN_REDUCTION+51, // "+"
108,MIN_REDUCTION+51, // "="
109,145, // "@"
115,MIN_REDUCTION+51, // "*"
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 278
0x80000000|370, // match move
0x80000000|463, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 279
7,18, // ID
63,206, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,300, // letter128
84,152, // {199..218 231..250}
85,152, // {193..198 225..230}
  }
,
{ // state 280
82,319, // "w"
  }
,
{ // state 281
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 282
7,379, // ID
16,381, // `(
22,4, // `null
44,263, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 283
2,122, // ws*
  }
,
{ // state 284
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 285
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 286
24,MIN_REDUCTION+65, // `[
92,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 287
0x80000000|482, // match move
0x80000000|30, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 288
9,414, // <decl in class>*
10,108, // `}
12,146, // <decl in class>
13,217, // <method decl>
14,510, // `public
96,63, // "#"
111,336, // "}"
  }
,
{ // state 289
2,11, // ws*
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 290
0x80000000|149, // match move
0x80000000|425, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 291
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 292
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 293
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 294
0x80000000|1, // match move
0x80000000|450, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 295
0x80000000|1, // match move
0x80000000|196, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 296
7,379, // ID
16,381, // `(
22,4, // `null
31,453, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 297
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 298
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 299
64,180, // "a"
73,456, // "o"
  }
,
{ // state 300
2,156, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 301
0x80000000|471, // match move
0x80000000|14, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 302
66,280, // "s"
67,252, // "v"
69,299, // "f"
71,25, // "i"
77,61, // "b"
80,140, // "n"
81,410, // "t"
82,264, // "w"
106,41, // "+"
  }
,
{ // state 303
10,75, // `}
40,394, // <case>
41,472, // `case
96,93, // "#"
111,336, // "}"
  }
,
{ // state 304
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 305
0x80000000|314, // match move
0x80000000|483, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 306
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 307
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 308
0x80000000|1, // match move
0x80000000|413, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 309
7,379, // ID
16,381, // `(
22,4, // `null
31,209, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 310
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 311
7,409, // ID
16,381, // `(
22,4, // `null
27,35, // <assign>
31,253, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 312
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 313
2,404, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 314
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 315
17,89, // `)
97,380, // ")"
  }
,
{ // state 316
0x80000000|229, // match move
0x80000000|92, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 317
2,69, // ws*
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 318
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 319
2,158, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 320
2,133, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 321
2,421, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 322
2,295, // ws*
  }
,
{ // state 323
2,429, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 324
0x80000000|210, // match move
0x80000000|87, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 325
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 326
24,418, // `[
92,53, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 327
2,8, // ws*
  }
,
{ // state 328
63,165, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,430, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
86,464, // digit
87,243, // {"1".."9"}
88,243, // "0"
89,157, // digit128
90,46, // {176..185}
107,10, // "_"
117,316, // {223}
121,150, // $$0
128,256, // idChar
129,52, // idChar128
  }
,
{ // state 329
24,418, // `[
92,53, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 330
75,147, // "u"
  }
,
{ // state 331
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 332
0x80000000|327, // match move
0x80000000|178, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 333
2,218, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 334
24,MIN_REDUCTION+57, // `[
92,MIN_REDUCTION+57, // "["
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 335
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 336
2,174, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 337
28,466, // `;
100,320, // ";"
  }
,
{ // state 338
24,MIN_REDUCTION+164, // `[
92,MIN_REDUCTION+164, // "["
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 339
50,70, // `+
51,282, // `-
93,82, // "-"
106,487, // "+"
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 340
0x80000000|1, // match move
0x80000000|479, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 341
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
105, // ID
169, // `{
-1, // <decl in class>*
488, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
342, // `void
381, // `(
-1, // `)
-1, // <stmt>*
443, // <type>
312, // `int
132, // `boolean
32, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
84, // <stmt>
114, // <assign>
74, // `;
458, // <local var decl>
441, // `if
253, // <exp>
-1, // `else
118, // `for
271, // `while
439, // `break
-1, // `=
-1, // `++
58, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
24, // <exp5>
236, // <exp4>
385, // <exp3>
186, // <exp2>
113, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
408, // `+
262, // `-
-1, // `*
-1, // `/
-1, // `%
215, // `!
371, // INTLIT
111, // STRINGLIT
294, // CHARLIT
225, // `this
15, // `true
227, // `false
427, // `new
83, // letter
366, // "a"
366, // "p"
366, // "s"
366, // "v"
366, // "c"
366, // "f"
366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
366, // "i"
366, // "l"
366, // "o"
366, // "r"
366, // "u"
366, // "x"
366, // "b"
366, // "e"
366, // "h"
366, // "n"
366, // "t"
366, // "w"
120, // letter128
290, // {199..218 231..250}
290, // {193..198 225..230}
-1, // digit
445, // {"1".."9"}
241, // "0"
422, // digit128
46, // {176..185}
-1, // any
-1, // "["
82, // "-"
-1, // "<"
-1, // " "
302, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
320, // ";"
-1, // ">"
226, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
188, // "("
487, // "+"
-1, // "_"
-1, // "="
377, // "@"
-1, // {10}
415, // "}"
323, // "!"
383, // "'"
424, // '"'
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
-1, // $
-1, // $NT
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
{ // state 342
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 343
24,MIN_REDUCTION+161, // `[
92,MIN_REDUCTION+161, // "["
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 344
64,180, // "a"
  }
,
{ // state 345
9,251, // <decl in class>*
10,297, // `}
12,146, // <decl in class>
13,217, // <method decl>
14,510, // `public
96,63, // "#"
111,336, // "}"
  }
,
{ // state 346
24,MIN_REDUCTION+56, // `[
92,MIN_REDUCTION+56, // "["
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 347
0x80000000|1, // match move
0x80000000|77, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 348
69,344, // "f"
80,140, // "n"
81,410, // "t"
  }
,
{ // state 349
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 350
0x80000000|1, // match move
0x80000000|167, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 351
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 352
95,79, // " "
110,28, // {10}
119,39, // ws
133,MIN_REDUCTION+83, // $NT
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 353
24,MIN_REDUCTION+95, // `[
92,MIN_REDUCTION+95, // "["
95,301, // " "
110,211, // {10}
119,183, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 354
72,267, // "l"
  }
,
{ // state 355
2,175, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 356
8,48, // `{
102,226, // "{"
  }
,
{ // state 357
63,165, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,185, // letter128
84,152, // {199..218 231..250}
85,152, // {193..198 225..230}
86,464, // digit
87,243, // {"1".."9"}
88,243, // "0"
89,99, // digit128
90,391, // {176..185}
107,10, // "_"
117,469, // {223}
121,72, // $$0
128,256, // idChar
129,248, // idChar128
  }
,
{ // state 358
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 359
8,288, // `{
11,233, // `extends
96,486, // "#"
102,226, // "{"
  }
,
{ // state 360
2,181, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 361
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
105, // ID
131, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
342, // `void
381, // `(
-1, // `)
-1, // <stmt>*
443, // <type>
312, // `int
132, // `boolean
32, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
278, // <stmt>
207, // <assign>
374, // `;
19, // <local var decl>
135, // `if
253, // <exp>
-1, // `else
198, // `for
51, // `while
420, // `break
-1, // `=
-1, // `++
220, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
24, // <exp5>
236, // <exp4>
385, // <exp3>
186, // <exp2>
113, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
408, // `+
262, // `-
-1, // `*
-1, // `/
-1, // `%
215, // `!
371, // INTLIT
111, // STRINGLIT
294, // CHARLIT
225, // `this
15, // `true
227, // `false
427, // `new
83, // letter
366, // "a"
366, // "p"
366, // "s"
366, // "v"
366, // "c"
366, // "f"
366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
366, // "i"
366, // "l"
366, // "o"
366, // "r"
366, // "u"
366, // "x"
366, // "b"
366, // "e"
366, // "h"
366, // "n"
366, // "t"
366, // "w"
120, // letter128
290, // {199..218 231..250}
290, // {193..198 225..230}
-1, // digit
445, // {"1".."9"}
241, // "0"
422, // digit128
46, // {176..185}
-1, // any
-1, // "["
82, // "-"
-1, // "<"
-1, // " "
302, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
260, // ";"
-1, // ">"
226, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
188, // "("
487, // "+"
-1, // "_"
-1, // "="
377, // "@"
-1, // {10}
-1, // "}"
323, // "!"
383, // "'"
424, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 362
28,124, // `;
100,320, // ";"
  }
,
{ // state 363
2,69, // ws*
95,508, // " "
110,163, // {10}
119,305, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 364
7,409, // ID
16,381, // `(
22,4, // `null
27,91, // <assign>
31,253, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 365
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
105, // ID
131, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
342, // `void
381, // `(
-1, // `)
-1, // <stmt>*
443, // <type>
312, // `int
132, // `boolean
32, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
511, // <stmt>
207, // <assign>
374, // `;
19, // <local var decl>
135, // `if
253, // <exp>
-1, // `else
198, // `for
51, // `while
420, // `break
-1, // `=
-1, // `++
220, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
24, // <exp5>
236, // <exp4>
385, // <exp3>
186, // <exp2>
113, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
408, // `+
262, // `-
-1, // `*
-1, // `/
-1, // `%
215, // `!
371, // INTLIT
111, // STRINGLIT
294, // CHARLIT
225, // `this
15, // `true
227, // `false
427, // `new
83, // letter
366, // "a"
366, // "p"
366, // "s"
366, // "v"
366, // "c"
366, // "f"
366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
366, // "i"
366, // "l"
366, // "o"
366, // "r"
366, // "u"
366, // "x"
366, // "b"
366, // "e"
366, // "h"
366, // "n"
366, // "t"
366, // "w"
120, // letter128
290, // {199..218 231..250}
290, // {193..198 225..230}
-1, // digit
445, // {"1".."9"}
241, // "0"
422, // digit128
46, // {176..185}
-1, // any
-1, // "["
82, // "-"
-1, // "<"
-1, // " "
302, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
260, // ";"
-1, // ">"
226, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
188, // "("
487, // "+"
-1, // "_"
-1, // "="
377, // "@"
-1, // {10}
-1, // "}"
323, // "!"
383, // "'"
424, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 366
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 367
0x80000000|119, // match move
0x80000000|338, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 368
86,64, // digit
87,243, // {"1".."9"}
88,243, // "0"
89,332, // digit128
90,46, // {176..185}
123,90, // $$1
  }
,
{ // state 369
0x80000000|1, // match move
0x80000000|55, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 370
32,245, // `else
96,247, // "#"
  }
,
{ // state 371
0x80000000|1, // match move
0x80000000|238, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 372
78,110, // "e"
  }
,
{ // state 373
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 374
0x80000000|213, // match move
0x80000000|318, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 375
2,324, // ws*
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 376
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 377
114,56, // '"'
  }
,
{ // state 378
2,138, // ws*
  }
,
{ // state 379
0x80000000|1, // match move
0x80000000|230, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 380
2,184, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 381
7,492, // ID
15,342, // `void
19,139, // <type>
20,312, // `int
21,132, // `boolean
22,257, // `null
63,206, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,300, // letter128
84,152, // {199..218 231..250}
85,152, // {193..198 225..230}
96,393, // "#"
  }
,
{ // state 382
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 383
64,88, // "a"
65,88, // "p"
66,88, // "s"
67,88, // "v"
68,88, // "c"
69,88, // "f"
70,88, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,88, // "i"
72,88, // "l"
73,88, // "o"
74,88, // "r"
75,88, // "u"
76,88, // "x"
77,88, // "b"
78,88, // "e"
79,88, // "h"
80,88, // "n"
81,88, // "t"
82,88, // "w"
87,88, // {"1".."9"}
88,88, // "0"
91,23, // any
92,88, // "["
93,88, // "-"
94,88, // "<"
95,88, // " "
96,88, // "#"
97,88, // ")"
98,88, // "]"
99,88, // "/"
100,88, // ";"
101,88, // ">"
102,88, // "{"
103,88, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
104,88, // "%"
105,88, // "("
106,88, // "+"
107,88, // "_"
108,88, // "="
109,88, // "@"
110,88, // {10}
111,88, // "}"
112,88, // "!"
113,88, // "'"
114,88, // '"'
115,88, // "*"
  }
,
{ // state 384
24,276, // `[
92,53, // "["
  }
,
{ // state 385
52,231, // `*
53,395, // `/
54,405, // `%
99,9, // "/"
104,360, // "%"
115,440, // "*"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 386
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 387
75,355, // "u"
  }
,
{ // state 388
0x80000000|66, // match move
0x80000000|228, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 389
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 390
17,189, // `)
97,388, // ")"
  }
,
{ // state 391
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 392
0x80000000|1, // match move
0x80000000|195, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 393
67,252, // "v"
71,25, // "i"
77,509, // "b"
80,387, // "n"
  }
,
{ // state 394
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 395
7,379, // ID
16,381, // `(
22,4, // `null
45,134, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 396
24,MIN_REDUCTION+181, // `[
92,MIN_REDUCTION+181, // "["
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 397
24,MIN_REDUCTION+141, // `[
92,MIN_REDUCTION+141, // "["
95,301, // " "
110,211, // {10}
119,183, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 398
24,MIN_REDUCTION+143, // `[
92,MIN_REDUCTION+143, // "["
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 399
2,78, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 400
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 401
24,MIN_REDUCTION+189, // `[
92,MIN_REDUCTION+189, // "["
95,301, // " "
110,211, // {10}
119,183, // ws
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 402
106,321, // "+"
  }
,
{ // state 403
0x80000000|307, // match move
0x80000000|273, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 404
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 405
7,379, // ID
16,381, // `(
22,4, // `null
45,164, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 406
10,101, // `}
40,394, // <case>
41,472, // `case
96,93, // "#"
111,415, // "}"
  }
,
{ // state 407
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 408
7,379, // ID
22,4, // `null
46,107, // <exp1>
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
96,348, // "#"
109,377, // "@"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 409
0x80000000|1, // match move
0x80000000|417, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 410
74,57, // "r"
79,6, // "h"
  }
,
{ // state 411
17,365, // `)
97,380, // ")"
  }
,
{ // state 412
24,MIN_REDUCTION+146, // `[
92,MIN_REDUCTION+146, // "["
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 413
24,MIN_REDUCTION+150, // `[
92,MIN_REDUCTION+150, // "["
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 414
10,284, // `}
12,240, // <decl in class>
13,217, // <method decl>
14,510, // `public
96,63, // "#"
111,336, // "}"
  }
,
{ // state 415
0x80000000|80, // match move
0x80000000|76, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 416
0x80000000|1, // match move
0x80000000|166, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 417
24,MIN_REDUCTION+51, // `[
37,498, // `++
92,MIN_REDUCTION+51, // "["
109,145, // "@"
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 418
7,379, // ID
16,381, // `(
22,4, // `null
31,208, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 419
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 420
28,116, // `;
100,260, // ";"
  }
,
{ // state 421
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 422
0x80000000|322, // match move
0x80000000|137, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 423
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 424
64,40, // "a"
65,40, // "p"
66,40, // "s"
67,40, // "v"
68,40, // "c"
69,40, // "f"
70,40, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,40, // "i"
72,40, // "l"
73,40, // "o"
74,40, // "r"
75,40, // "u"
76,40, // "x"
77,40, // "b"
78,40, // "e"
79,40, // "h"
80,40, // "n"
81,40, // "t"
82,40, // "w"
84,516, // {199..218 231..250}
85,516, // {193..198 225..230}
87,40, // {"1".."9"}
88,40, // "0"
90,516, // {176..185}
91,304, // any
92,40, // "["
93,40, // "-"
94,40, // "<"
95,40, // " "
96,40, // "#"
97,40, // ")"
98,40, // "]"
99,40, // "/"
100,40, // ";"
101,40, // ">"
102,40, // "{"
103,40, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
104,40, // "%"
105,40, // "("
106,40, // "+"
107,40, // "_"
108,40, // "="
109,40, // "@"
110,40, // {10}
111,40, // "}"
112,40, // "!"
113,40, // "'"
114,40, // '"'
115,40, // "*"
116,462, // any128
117,516, // {223}
118,516, // {128..175 186..192 219..222 224 251..255}
126,270, // any*
127,392, // $$3
  }
,
{ // state 425
24,MIN_REDUCTION+62, // `[
92,MIN_REDUCTION+62, // "["
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 426
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 427
7,154, // ID
63,206, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,300, // letter128
84,152, // {199..218 231..250}
85,152, // {193..198 225..230}
  }
,
{ // state 428
28,45, // `;
100,320, // ";"
  }
,
{ // state 429
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 430
0x80000000|325, // match move
0x80000000|507, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 431
2,352, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
133,MIN_REDUCTION+84, // $NT
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 432
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 433
2,29, // ws*
  }
,
{ // state 434
7,359, // ID
63,206, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,300, // letter128
84,152, // {199..218 231..250}
85,152, // {193..198 225..230}
  }
,
{ // state 435
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 436
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 437
24,MIN_REDUCTION+187, // `[
92,MIN_REDUCTION+187, // "["
95,301, // " "
110,211, // {10}
119,183, // ws
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 438
2,94, // ws*
24,MIN_REDUCTION+152, // `[
92,MIN_REDUCTION+152, // "["
95,301, // " "
110,211, // {10}
119,86, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 439
28,136, // `;
100,320, // ";"
  }
,
{ // state 440
2,97, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 441
16,168, // `(
105,188, // "("
  }
,
{ // state 442
95,508, // " "
110,163, // {10}
119,96, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 443
7,153, // ID
23,202, // <empty bracket pair>
24,276, // `[
63,206, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,300, // letter128
84,152, // {199..218 231..250}
85,152, // {193..198 225..230}
92,53, // "["
  }
,
{ // state 444
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 445
86,222, // digit
87,243, // {"1".."9"}
88,243, // "0"
89,332, // digit128
90,46, // {176..185}
122,368, // digit*
123,7, // $$1
  }
,
{ // state 446
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 447
2,416, // ws*
24,MIN_REDUCTION+90, // `[
92,MIN_REDUCTION+90, // "["
95,301, // " "
110,211, // {10}
119,86, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 448
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 449
2,173, // ws*
24,MIN_REDUCTION+92, // `[
92,MIN_REDUCTION+92, // "["
95,301, // " "
110,211, // {10}
119,86, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 450
24,MIN_REDUCTION+55, // `[
92,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 451
17,361, // `)
97,380, // ")"
  }
,
{ // state 452
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 453
17,216, // `)
97,380, // ")"
  }
,
{ // state 454
0x80000000|1, // match move
0x80000000|326, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 455
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 456
2,123, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 457
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
105, // ID
169, // `{
-1, // <decl in class>*
432, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
342, // `void
381, // `(
-1, // `)
504, // <stmt>*
443, // <type>
312, // `int
132, // `boolean
32, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
423, // <stmt>
114, // <assign>
74, // `;
458, // <local var decl>
441, // `if
253, // <exp>
-1, // `else
118, // `for
271, // `while
439, // `break
-1, // `=
-1, // `++
58, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
24, // <exp5>
236, // <exp4>
385, // <exp3>
186, // <exp2>
113, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
408, // `+
262, // `-
-1, // `*
-1, // `/
-1, // `%
215, // `!
371, // INTLIT
111, // STRINGLIT
294, // CHARLIT
225, // `this
15, // `true
227, // `false
427, // `new
83, // letter
366, // "a"
366, // "p"
366, // "s"
366, // "v"
366, // "c"
366, // "f"
366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
366, // "i"
366, // "l"
366, // "o"
366, // "r"
366, // "u"
366, // "x"
366, // "b"
366, // "e"
366, // "h"
366, // "n"
366, // "t"
366, // "w"
120, // letter128
290, // {199..218 231..250}
290, // {193..198 225..230}
-1, // digit
445, // {"1".."9"}
241, // "0"
422, // digit128
46, // {176..185}
-1, // any
-1, // "["
82, // "-"
-1, // "<"
-1, // " "
302, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
320, // ";"
-1, // ">"
226, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
188, // "("
487, // "+"
-1, // "_"
-1, // "="
377, // "@"
-1, // {10}
336, // "}"
323, // "!"
383, // "'"
424, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 458
28,244, // `;
100,320, // ";"
  }
,
{ // state 459
132,MIN_REDUCTION+0, // $
  }
,
{ // state 460
24,MIN_REDUCTION+149, // `[
92,MIN_REDUCTION+149, // "["
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 461
95,MIN_REDUCTION+68, // " "
110,MIN_REDUCTION+68, // {10}
119,MIN_REDUCTION+68, // ws
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 462
0x80000000|283, // match move
0x80000000|121, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 463
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 464
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 465
24,MIN_REDUCTION+185, // `[
92,MIN_REDUCTION+185, // "["
95,301, // " "
110,211, // {10}
119,183, // ws
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 466
7,379, // ID
16,381, // `(
22,4, // `null
31,428, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 467
0x80000000|1, // match move
0x80000000|329, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 468
2,11, // ws*
24,MIN_REDUCTION+96, // `[
92,MIN_REDUCTION+96, // "["
95,301, // " "
110,211, // {10}
119,86, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 469
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 470
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 471
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 472
7,379, // ID
16,381, // `(
22,4, // `null
31,362, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 473
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 474
2,324, // ws*
24,MIN_REDUCTION+184, // `[
92,MIN_REDUCTION+184, // "["
95,301, // " "
110,211, // {10}
119,86, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 475
0x80000000|378, // match move
0x80000000|109, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 476
24,418, // `[
92,53, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 477
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
105, // ID
131, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
342, // `void
381, // `(
-1, // `)
-1, // <stmt>*
443, // <type>
312, // `int
132, // `boolean
32, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
287, // <stmt>
207, // <assign>
374, // `;
19, // <local var decl>
135, // `if
253, // <exp>
-1, // `else
198, // `for
51, // `while
420, // `break
-1, // `=
-1, // `++
220, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
24, // <exp5>
236, // <exp4>
385, // <exp3>
186, // <exp2>
113, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
408, // `+
262, // `-
-1, // `*
-1, // `/
-1, // `%
215, // `!
371, // INTLIT
111, // STRINGLIT
294, // CHARLIT
225, // `this
15, // `true
227, // `false
427, // `new
83, // letter
366, // "a"
366, // "p"
366, // "s"
366, // "v"
366, // "c"
366, // "f"
366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
366, // "i"
366, // "l"
366, // "o"
366, // "r"
366, // "u"
366, // "x"
366, // "b"
366, // "e"
366, // "h"
366, // "n"
366, // "t"
366, // "w"
120, // letter128
290, // {199..218 231..250}
290, // {193..198 225..230}
-1, // digit
445, // {"1".."9"}
241, // "0"
422, // digit128
46, // {176..185}
-1, // any
-1, // "["
82, // "-"
-1, // "<"
-1, // " "
302, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
260, // ";"
-1, // ">"
226, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
188, // "("
487, // "+"
-1, // "_"
-1, // "="
377, // "@"
-1, // {10}
-1, // "}"
323, // "!"
383, // "'"
424, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 478
2,382, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 479
24,MIN_REDUCTION+113, // `[
92,MIN_REDUCTION+113, // "["
95,301, // " "
110,211, // {10}
119,183, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 480
7,379, // ID
16,381, // `(
22,4, // `null
43,203, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 481
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 482
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 483
95,MIN_REDUCTION+182, // " "
110,MIN_REDUCTION+182, // {10}
119,MIN_REDUCTION+182, // ws
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 484
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 485
24,MIN_REDUCTION+66, // `[
92,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 486
78,249, // "e"
  }
,
{ // state 487
2,128, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 488
0x80000000|161, // match move
0x80000000|291, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 489
72,431, // "l"
  }
,
{ // state 490
24,MIN_REDUCTION+182, // `[
92,MIN_REDUCTION+182, // "["
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 491
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 492
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 493
24,418, // `[
92,53, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 494
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 495
7,379, // ID
16,381, // `(
22,4, // `null
31,104, // <exp>
42,24, // <exp5>
43,236, // <exp4>
44,385, // <exp3>
45,186, // <exp2>
46,113, // <exp1>
50,408, // `+
51,262, // `-
55,215, // `!
56,371, // INTLIT
57,111, // STRINGLIT
58,294, // CHARLIT
59,225, // `this
60,15, // `true
61,227, // `false
62,427, // `new
63,83, // letter
64,366, // "a"
65,366, // "p"
66,366, // "s"
67,366, // "v"
68,366, // "c"
69,366, // "f"
70,366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,366, // "i"
72,366, // "l"
73,366, // "o"
74,366, // "r"
75,366, // "u"
76,366, // "x"
77,366, // "b"
78,366, // "e"
79,366, // "h"
80,366, // "n"
81,366, // "t"
82,366, // "w"
83,120, // letter128
84,290, // {199..218 231..250}
85,290, // {193..198 225..230}
87,445, // {"1".."9"}
88,241, // "0"
89,422, // digit128
90,46, // {176..185}
93,82, // "-"
96,348, // "#"
105,188, // "("
106,487, // "+"
109,377, // "@"
112,323, // "!"
113,383, // "'"
114,424, // '"'
  }
,
{ // state 496
95,MIN_REDUCTION+181, // " "
110,MIN_REDUCTION+181, // {10}
119,MIN_REDUCTION+181, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 497
2,416, // ws*
  }
,
{ // state 498
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 499
2,373, // ws*
95,79, // " "
110,28, // {10}
119,115, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 500
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 501
64,306, // "a"
65,306, // "p"
66,306, // "s"
67,306, // "v"
68,306, // "c"
69,306, // "f"
70,306, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
71,306, // "i"
72,306, // "l"
73,306, // "o"
74,306, // "r"
75,306, // "u"
76,306, // "x"
77,306, // "b"
78,306, // "e"
79,306, // "h"
80,306, // "n"
81,306, // "t"
82,306, // "w"
85,367, // {193..198 225..230}
87,306, // {"1".."9"}
88,306, // "0"
90,367, // {176..185}
125,192, // $$2
130,239, // hexDigit
131,475, // hexDigit128
  }
,
{ // state 502
2,94, // ws*
  }
,
{ // state 503
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 504
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
105, // ID
169, // `{
-1, // <decl in class>*
470, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
342, // `void
381, // `(
-1, // `)
-1, // <stmt>*
443, // <type>
312, // `int
132, // `boolean
32, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
84, // <stmt>
114, // <assign>
74, // `;
458, // <local var decl>
441, // `if
253, // <exp>
-1, // `else
118, // `for
271, // `while
439, // `break
-1, // `=
-1, // `++
58, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
24, // <exp5>
236, // <exp4>
385, // <exp3>
186, // <exp2>
113, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
408, // `+
262, // `-
-1, // `*
-1, // `/
-1, // `%
215, // `!
371, // INTLIT
111, // STRINGLIT
294, // CHARLIT
225, // `this
15, // `true
227, // `false
427, // `new
83, // letter
366, // "a"
366, // "p"
366, // "s"
366, // "v"
366, // "c"
366, // "f"
366, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
366, // "i"
366, // "l"
366, // "o"
366, // "r"
366, // "u"
366, // "x"
366, // "b"
366, // "e"
366, // "h"
366, // "n"
366, // "t"
366, // "w"
120, // letter128
290, // {199..218 231..250}
290, // {193..198 225..230}
-1, // digit
445, // {"1".."9"}
241, // "0"
422, // digit128
46, // {176..185}
-1, // any
-1, // "["
82, // "-"
-1, // "<"
-1, // " "
302, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
320, // ";"
-1, // ">"
226, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
188, // "("
487, // "+"
-1, // "_"
-1, // "="
377, // "@"
-1, // {10}
336, // "}"
323, // "!"
383, // "'"
424, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 505
8,345, // `{
102,226, // "{"
  }
,
{ // state 506
0x80000000|1, // match move
0x80000000|182, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 507
24,MIN_REDUCTION+160, // `[
92,MIN_REDUCTION+160, // "["
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 508
0x80000000|141, // match move
0x80000000|204, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 509
73,399, // "o"
  }
,
{ // state 510
15,279, // `void
96,272, // "#"
  }
,
{ // state 511
0x80000000|17, // match move
0x80000000|463, // no-match move
0x80000000|266, // NT-test-match state for `else
  }
,
{ // state 512
2,347, // ws*
24,MIN_REDUCTION+94, // `[
92,MIN_REDUCTION+94, // "["
95,301, // " "
110,211, // {10}
119,86, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 513
2,221, // ws*
24,MIN_REDUCTION+128, // `[
92,MIN_REDUCTION+128, // "["
95,301, // " "
110,211, // {10}
119,86, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 514
2,44, // ws*
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 515
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 516
0x80000000|331, // match move
0x80000000|485, // no-match move
0x80000000|384, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 517
95,79, // " "
110,28, // {10}
119,39, // ws
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 518
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 519
MIN_REDUCTION+29, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[520][];
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
// letter ::= {"A".."Z" "a".."z"}
(63<<16)+1,
// letter128 ::= {193..218 225..250}
(83<<16)+1,
// digit ::= {"0".."9"}
(86<<16)+1,
// digit128 ::= {176..185}
(89<<16)+1,
// any ::= {0..127}
(91<<16)+1,
// any128 ::= {128..255}
(116<<16)+1,
// ws ::= " "
(119<<16)+1,
// ws ::= {10}
(119<<16)+1,
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
(59<<16)+4,
// `this ::= "#" "t" "h"
(59<<16)+3,
// `false ::= "#" "f" "a" ws*
(61<<16)+4,
// `false ::= "#" "f" "a"
(61<<16)+3,
// `true ::= "#" "t" "r" ws*
(60<<16)+4,
// `true ::= "#" "t" "r"
(60<<16)+3,
// `null ::= "#" "n" "u" ws*
(22<<16)+4,
// `null ::= "#" "n" "u"
(22<<16)+3,
// `new ::= "#" "n" "e" ws*
(62<<16)+4,
// `new ::= "#" "n" "e"
(62<<16)+3,
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
(128<<16)+1,
// idChar ::= digit
(128<<16)+1,
// idChar ::= "_"
(128<<16)+1,
// idChar128 ::= letter128
(129<<16)+1,
// idChar128 ::= digit128
(129<<16)+1,
// idChar128 ::= {223}
(129<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(130<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(131<<16)+1,
// digit* ::= digit* digit
(122<<16)+2,
// digit* ::= digit
(122<<16)+1,
// any* ::= any* any
(126<<16)+2,
// any* ::= any
(126<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(124<<16)+2,
// hexDigit* ::= hexDigit
(124<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// <case>* ::= <case>* <case>
(39<<16)+2,
// <case>* ::= <case>
(39<<16)+1,
// idChar* ::= idChar* idChar
(120<<16)+2,
// idChar* ::= idChar
(120<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(121<<16)+2,
// $$0 ::= idChar128
(121<<16)+1,
// $$1 ::= digit128 ws*
(123<<16)+2,
// $$1 ::= digit128
(123<<16)+1,
// $$2 ::= hexDigit128 ws*
(125<<16)+2,
// $$2 ::= hexDigit128
(125<<16)+1,
// $$3 ::= any128 ws*
(127<<16)+2,
// $$3 ::= any128
(127<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
103, // 0
103, // 1
103, // 2
103, // 3
103, // 4
103, // 5
103, // 6
103, // 7
103, // 8
103, // 9
110, // 10
103, // 11
103, // 12
103, // 13
103, // 14
103, // 15
103, // 16
103, // 17
103, // 18
103, // 19
103, // 20
103, // 21
103, // 22
103, // 23
103, // 24
103, // 25
103, // 26
103, // 27
103, // 28
103, // 29
103, // 30
103, // 31
95, // " "
112, // "!"
114, // '"'
96, // "#"
103, // "$"
104, // "%"
103, // "&"
113, // "'"
105, // "("
97, // ")"
115, // "*"
106, // "+"
103, // ","
93, // "-"
103, // "."
99, // "/"
88, // "0"
87, // "1"
87, // "2"
87, // "3"
87, // "4"
87, // "5"
87, // "6"
87, // "7"
87, // "8"
87, // "9"
103, // ":"
100, // ";"
94, // "<"
108, // "="
101, // ">"
103, // "?"
109, // "@"
70, // "A"
70, // "B"
70, // "C"
70, // "D"
70, // "E"
70, // "F"
70, // "G"
70, // "H"
70, // "I"
70, // "J"
70, // "K"
70, // "L"
70, // "M"
70, // "N"
70, // "O"
70, // "P"
70, // "Q"
70, // "R"
70, // "S"
70, // "T"
70, // "U"
70, // "V"
70, // "W"
70, // "X"
70, // "Y"
70, // "Z"
92, // "["
103, // "\"
98, // "]"
103, // "^"
107, // "_"
103, // "`"
64, // "a"
77, // "b"
68, // "c"
70, // "d"
78, // "e"
69, // "f"
70, // "g"
79, // "h"
71, // "i"
70, // "j"
70, // "k"
72, // "l"
70, // "m"
80, // "n"
73, // "o"
65, // "p"
70, // "q"
74, // "r"
66, // "s"
81, // "t"
75, // "u"
67, // "v"
82, // "w"
76, // "x"
70, // "y"
70, // "z"
102, // "{"
103, // "|"
111, // "}"
103, // "~"
103, // 127
118, // 128
118, // 129
118, // 130
118, // 131
118, // 132
118, // 133
118, // 134
118, // 135
118, // 136
118, // 137
118, // 138
118, // 139
118, // 140
118, // 141
118, // 142
118, // 143
118, // 144
118, // 145
118, // 146
118, // 147
118, // 148
118, // 149
118, // 150
118, // 151
118, // 152
118, // 153
118, // 154
118, // 155
118, // 156
118, // 157
118, // 158
118, // 159
118, // 160
118, // 161
118, // 162
118, // 163
118, // 164
118, // 165
118, // 166
118, // 167
118, // 168
118, // 169
118, // 170
118, // 171
118, // 172
118, // 173
118, // 174
118, // 175
90, // 176
90, // 177
90, // 178
90, // 179
90, // 180
90, // 181
90, // 182
90, // 183
90, // 184
90, // 185
118, // 186
118, // 187
118, // 188
118, // 189
118, // 190
118, // 191
118, // 192
85, // 193
85, // 194
85, // 195
85, // 196
85, // 197
85, // 198
84, // 199
84, // 200
84, // 201
84, // 202
84, // 203
84, // 204
84, // 205
84, // 206
84, // 207
84, // 208
84, // 209
84, // 210
84, // 211
84, // 212
84, // 213
84, // 214
84, // 215
84, // 216
84, // 217
84, // 218
118, // 219
118, // 220
118, // 221
118, // 222
117, // 223
118, // 224
85, // 225
85, // 226
85, // 227
85, // 228
85, // 229
85, // 230
84, // 231
84, // 232
84, // 233
84, // 234
84, // 235
84, // 236
84, // 237
84, // 238
84, // 239
84, // 240
84, // 241
84, // 242
84, // 243
84, // 244
84, // 245
84, // 246
84, // 247
84, // 248
84, // 249
84, // 250
118, // 251
118, // 252
118, // 253
118, // 254
118, // 255
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
"<exp1> ::= # `this", // 56
"<exp1> ::= # `true", // 57
"<exp1> ::= # `false", // 58
"<exp1> ::= # `null", // 59
"<exp1> ::= # `new # ID `( `)", // 60
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 61
"letter128 ::= {193..218 225..250}", // 62
"digit ::= {\"0\"..\"9\"}", // 63
"digit128 ::= {176..185}", // 64
"any ::= {0..127}", // 65
"any128 ::= {128..255}", // 66
"ws ::= \" \"", // 67
"ws ::= {10} registerNewline", // 68
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 69
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 70
"`class ::= \"#\" \"c\" \"l\" ws*", // 71
"`class ::= \"#\" \"c\" \"l\" ws*", // 72
"`extends ::= \"#\" \"e\" \"x\" ws*", // 73
"`extends ::= \"#\" \"e\" \"x\" ws*", // 74
"`void ::= \"#\" \"v\" \"o\" ws*", // 75
"`void ::= \"#\" \"v\" \"o\" ws*", // 76
"`int ::= \"#\" \"i\" \"t\" ws*", // 77
"`int ::= \"#\" \"i\" \"t\" ws*", // 78
"`while ::= \"#\" \"w\" \"h\" ws*", // 79
"`while ::= \"#\" \"w\" \"h\" ws*", // 80
"`if ::= \"#\" \"+\" ws*", // 81
"`if ::= \"#\" \"+\" ws*", // 82
"`else ::= \"#\" \"e\" \"l\" ws*", // 83
"`else ::= \"#\" \"e\" \"l\" ws*", // 84
"`for ::= \"#\" \"f\" \"o\" ws*", // 85
"`for ::= \"#\" \"f\" \"o\" ws*", // 86
"`break ::= \"#\" \"b\" \"r\" ws*", // 87
"`break ::= \"#\" \"b\" \"r\" ws*", // 88
"`this ::= \"#\" \"t\" \"h\" ws*", // 89
"`this ::= \"#\" \"t\" \"h\" ws*", // 90
"`false ::= \"#\" \"f\" \"a\" ws*", // 91
"`false ::= \"#\" \"f\" \"a\" ws*", // 92
"`true ::= \"#\" \"t\" \"r\" ws*", // 93
"`true ::= \"#\" \"t\" \"r\" ws*", // 94
"`null ::= \"#\" \"n\" \"u\" ws*", // 95
"`null ::= \"#\" \"n\" \"u\" ws*", // 96
"`new ::= \"#\" \"n\" \"e\" ws*", // 97
"`new ::= \"#\" \"n\" \"e\" ws*", // 98
"`case ::= \"#\" \"c\" \"e\" ws*", // 99
"`case ::= \"#\" \"c\" \"e\" ws*", // 100
"`public ::= \"#\" \"p\" \"u\" ws*", // 101
"`public ::= \"#\" \"p\" \"u\" ws*", // 102
"`switch ::= \"#\" \"s\" \"w\" ws*", // 103
"`switch ::= \"#\" \"s\" \"w\" ws*", // 104
"`! ::= \"!\" ws*", // 105
"`! ::= \"!\" ws*", // 106
"`% ::= \"%\" ws*", // 107
"`% ::= \"%\" ws*", // 108
"`* ::= \"*\" ws*", // 109
"`* ::= \"*\" ws*", // 110
"`( ::= \"(\" ws*", // 111
"`( ::= \"(\" ws*", // 112
"`) ::= \")\" ws*", // 113
"`) ::= \")\" ws*", // 114
"`{ ::= \"{\" ws*", // 115
"`{ ::= \"{\" ws*", // 116
"`} ::= \"}\" ws*", // 117
"`} ::= \"}\" ws*", // 118
"`- ::= \"-\" ws*", // 119
"`- ::= \"-\" ws*", // 120
"`+ ::= \"+\" ws*", // 121
"`+ ::= \"+\" ws*", // 122
"`= ::= \"=\" ws*", // 123
"`= ::= \"=\" ws*", // 124
"`[ ::= \"[\" ws*", // 125
"`[ ::= \"[\" ws*", // 126
"`] ::= \"]\" ws*", // 127
"`] ::= \"]\" ws*", // 128
"`< ::= \"<\" ws*", // 129
"`< ::= \"<\" ws*", // 130
"`<= ::= \"@\" \"<\" ws*", // 131
"`<= ::= \"@\" \"<\" ws*", // 132
"`> ::= \">\" !\"=\" ws*", // 133
"`> ::= \">\" !\"=\" ws*", // 134
"`; ::= \";\" ws*", // 135
"`; ::= \";\" ws*", // 136
"`++ ::= \"@\" \"+\" ws*", // 137
"`++ ::= \"@\" \"+\" ws*", // 138
"`/ ::= \"/\" ws*", // 139
"`/ ::= \"/\" ws*", // 140
"ID ::= letter128 ws*", // 141
"ID ::= letter128 ws*", // 142
"ID ::= letter idChar* idChar128 ws*", // 143
"ID ::= letter idChar* idChar128 ws*", // 144
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 145
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 146
"INTLIT ::= digit128 ws*", // 147
"INTLIT ::= digit128 ws*", // 148
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 149
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 150
"STRINGLIT ::= \"@\" \'\"\' ws*", // 151
"STRINGLIT ::= \"@\" \'\"\' ws*", // 152
"STRINGLIT ::= \'\"\' any* any128 ws*", // 153
"STRINGLIT ::= \'\"\' any* any128 ws*", // 154
"CHARLIT ::= \"\'\" any ws*", // 155
"CHARLIT ::= \"\'\" any ws*", // 156
"idChar ::= letter", // 157
"idChar ::= digit", // 158
"idChar ::= \"_\"", // 159
"idChar128 ::= letter128", // 160
"idChar128 ::= digit128", // 161
"idChar128 ::= {223}", // 162
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 163
"hexDigit128 ::= {176..185 193..198 225..230}", // 164
"digit* ::= digit* digit", // 165
"digit* ::= digit* digit", // 166
"any* ::= any* any", // 167
"any* ::= any* any", // 168
"<decl in class>* ::= <decl in class>* <decl in class>", // 169
"<decl in class>* ::= <decl in class>* <decl in class>", // 170
"hexDigit* ::= hexDigit* hexDigit", // 171
"hexDigit* ::= hexDigit* hexDigit", // 172
"<stmt>* ::= <stmt>* <stmt>", // 173
"<stmt>* ::= <stmt>* <stmt>", // 174
"<case>* ::= <case>* <case>", // 175
"<case>* ::= <case>* <case>", // 176
"idChar* ::= idChar* idChar", // 177
"idChar* ::= idChar* idChar", // 178
"<class decl>+ ::= <class decl>", // 179
"<class decl>+ ::= <class decl>+ <class decl>", // 180
"ws* ::= ws* ws", // 181
"ws* ::= ws* ws", // 182
"", // 183
"", // 184
"", // 185
"", // 186
"", // 187
"", // 188
"", // 189
"", // 190
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 7: <class decl> ::= `class [#] ID `extends ID `{ [<decl in class>*] `} @createdExtendsClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 11: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 12: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 13: <type> ::= [#] `void @voidType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 14: <type> ::= [#] `null @nullType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 15: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 16: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 19: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 23: <stmt> ::= [#] `if `( <exp> `) <stmt> [#] `else <stmt> @newIfElseBlock(int,Exp,Statement,int,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 26: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 27: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 28: <assign> ::= [#] ID `++ @assignPlusPlus(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 29: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 30: <stmt> ::= [#] `; @newEmptyStmt(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 33: <case> ::= `case [#] <exp> `; @newCase(int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 40: <exp5> ::= <exp5> [#] `<= <exp4> @newLessThanEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 41: <exp5> ::= <exp5> [#] `> <exp4> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 42: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 43: <exp4> ::= <exp4> [#] `- <exp3> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 44: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 45: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 46: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 48: <exp2> ::= [#] `+ <exp1> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 49: <exp2> ::= [#] `- <exp1> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 50: <exp2> ::= [#] `! <exp1> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 51: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 52: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 53: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 54: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 55: <exp1> ::= [#] CHARLIT @newCharLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 56: <exp1> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 57: <exp1> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 58: <exp1> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 59: <exp1> ::= [#] `null @newNullExp(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 60: <exp1> ::= [#] `new [#] ID `( `) @newObject(int,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 61: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 62: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 63: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 64: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 65: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 66: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 67: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 68: ws ::= {10} [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 69: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 70: `boolean ::= "#" "b" "o" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 71: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 72: `class ::= "#" "c" "l" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 73: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 74: `extends ::= "#" "e" "x" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 75: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 76: `void ::= "#" "v" "o" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 77: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 78: `int ::= "#" "i" "t" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 79: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 80: `while ::= "#" "w" "h" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 81: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 82: `if ::= "#" "+" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 83: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 84: `else ::= "#" "e" "l" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 85: `for ::= "#" "f" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 86: `for ::= "#" "f" "o" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 87: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 88: `break ::= "#" "b" "r" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 89: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 90: `this ::= "#" "t" "h" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 91: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 92: `false ::= "#" "f" "a" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 93: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 94: `true ::= "#" "t" "r" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 95: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 96: `null ::= "#" "n" "u" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 97: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 98: `new ::= "#" "n" "e" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 99: `case ::= "#" "c" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 100: `case ::= "#" "c" "e" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 101: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 102: `public ::= "#" "p" "u" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 103: `switch ::= "#" "s" "w" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 104: `switch ::= "#" "s" "w" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 105: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 106: `! ::= "!" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 107: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 108: `% ::= "%" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 109: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 110: `* ::= "*" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 111: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 112: `( ::= "(" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 113: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 114: `) ::= ")" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 115: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `{ ::= "{" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 117: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 118: `} ::= "}" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 119: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 120: `- ::= "-" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 121: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `+ ::= "+" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `= ::= "=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 125: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: `[ ::= "[" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `] ::= "]" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `< ::= "<" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 132: `<= ::= "@" "<" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 133: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `> ::= ">" !"=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `; ::= ";" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `++ ::= "@" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 138: `++ ::= "@" "+" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 139: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `/ ::= "/" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 142: ID ::= letter128 [ws*] @text
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 143: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 144: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 145: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 146: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 147: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 148: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 149: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 150: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 151: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 152: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 153: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 154: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 155: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 156: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 157: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 158: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 159: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 160: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 161: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 162: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 163: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 164: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 165: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 166: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 167: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 168: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 169: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 170: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 171: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 172: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 173: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 174: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 175: <case>* ::= <case>* <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 176: <case>* ::= [<case>*] <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 177: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 178: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 179: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 180: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 181: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 182: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 183: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 184: $$0 ::= idChar128 [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 185: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 186: $$1 ::= digit128 [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 187: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 188: $$2 ::= hexDigit128 [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 189: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 190: $$3 ::= any128 [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "<case>* ::=", // <case>*
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
    { // <case>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((53<<5)|0x5)/*methodCall:53*/,
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
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNullExp(parm0);
      si.pushPb(result);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newObject(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 45: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 46: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 47: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 48: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 49: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 50: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 51: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 52: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 53: {
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
"Exp newThis(int)",
"Exp newTrue(int)",
"Exp newFalse(int)",
"Exp newNullExp(int)",
"Exp newObject(int,int,String)",
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
1,1,
1,1,
1,1,
1,1,
3,1,
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
