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
public int getEofSym() { return 93; }
public int getNttSym() { return 94; }
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
"<exp>",
"`=",
"<exp4>",
"`+",
"<exp3>",
"`*",
"<exp2>",
"`/",
"`&&",
"<cast exp>",
"<unary exp>",
"<exp1>",
"`-",
"INTLIT",
"letter",
"\"p\"",
"\"v\"",
"{\"A\"..\"Z\" \"a\" \"d\"..\"h\" \"j\"..\"k\" \"m\" \"q\"..\"s\" \"w\"..\"z\"}",
"\"c\"",
"\"i\"",
"\"l\"",
"\"o\"",
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
"ws",
"\" \"",
"10",
"\"#\"",
"\"@\"",
"\"&\"",
"\"*\"",
"\"(\"",
"\")\"",
"\"{\"",
"\"}\"",
"\"-\"",
"\"+\"",
"\"=\"",
"\"[\"",
"\"]\"",
"\";\"",
"\"/\"",
"idChar*",
"$$0",
"digit*",
"$$1",
"hexDigit*",
"$$2",
"idChar",
"\"_\"",
"idChar128",
"223",
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
public int numSymbols() { return 95;}
private static final int MIN_REDUCTION = 248;
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
1,183, // <start>
2,240, // ws*
3,116, // <program>
4,44, // <class decl>+
5,173, // <class decl>
6,70, // `class
63,213, // ws
64,66, // " "
65,22, // {10}
66,150, // "#"
  }
,
{ // state 1
  }
,
{ // state 2
23,MIN_REDUCTION+43, // `[
77,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 3
63,30, // ws
64,66, // " "
65,22, // {10}
94,MIN_REDUCTION+76, // $NT
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 4
7,104, // ID
15,63, // `(
29,246, // <exp>
31,92, // <exp4>
33,96, // <exp3>
35,166, // <exp2>
38,13, // <cast exp>
39,160, // <unary exp>
40,71, // <exp1>
41,214, // `-
42,100, // INTLIT
43,53, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,201, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,167, // {"1".."9"}
60,20, // "0"
61,57, // digit128
62,35, // {176..185}
70,6, // "("
74,124, // "-"
  }
,
{ // state 5
45,153, // "v"
48,151, // "i"
52,21, // "b"
53,215, // "n"
  }
,
{ // state 6
2,205, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 7
0x80000000|1, // match move
0x80000000|191, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 8
7,104, // ID
15,63, // `(
29,27, // <exp>
31,92, // <exp4>
33,96, // <exp3>
35,166, // <exp2>
38,13, // <cast exp>
39,160, // <unary exp>
40,71, // <exp1>
41,214, // `-
42,100, // INTLIT
43,53, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,201, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,167, // {"1".."9"}
60,20, // "0"
61,57, // digit128
62,35, // {176..185}
70,6, // "("
74,124, // "-"
  }
,
{ // state 9
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 10
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 11
0x80000000|1, // match move
0x80000000|139, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
23,MIN_REDUCTION+42, // `[
77,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 13
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 14
24,85, // `]
78,242, // "]"
  }
,
{ // state 15
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 16
7,104, // ID
15,63, // `(
35,54, // <exp2>
38,13, // <cast exp>
39,160, // <unary exp>
40,71, // <exp1>
41,214, // `-
42,100, // INTLIT
43,53, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,201, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,167, // {"1".."9"}
60,20, // "0"
61,57, // digit128
62,35, // {176..185}
70,6, // "("
74,124, // "-"
  }
,
{ // state 17
23,MIN_REDUCTION+86, // `[
77,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 18
51,47, // "u"
  }
,
{ // state 19
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 20
44,41, // "p"
45,41, // "v"
46,41, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,41, // "c"
48,41, // "i"
49,41, // "l"
50,41, // "o"
51,41, // "u"
52,41, // "b"
53,41, // "n"
54,41, // "t"
57,97, // {193..198 225..230}
59,41, // {"1".."9"}
60,41, // "0"
62,97, // {176..185}
85,228, // hexDigit*
86,25, // $$2
91,112, // hexDigit
92,107, // hexDigit128
  }
,
{ // state 21
50,235, // "o"
  }
,
{ // state 22
94,MIN_REDUCTION+43, // $NT
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 23
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 24
2,244, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 25
0x80000000|1, // match move
0x80000000|64, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 26
2,34, // ws*
23,MIN_REDUCTION+83, // `[
63,140, // ws
64,38, // " "
65,189, // {10}
77,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 27
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 28
0x80000000|125, // match move
0x80000000|146, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 29
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 30
94,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 31
0x80000000|1, // match move
0x80000000|178, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 32
0x80000000|115, // match move
0x80000000|142, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 33
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 34
0x80000000|135, // match move
0x80000000|130, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 35
0x80000000|221, // match move
0x80000000|152, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 36
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 37
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 38
0x80000000|200, // match move
0x80000000|12, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 39
2,161, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 40
23,MIN_REDUCTION+36, // `[
77,MIN_REDUCTION+36, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 41
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 42
16,86, // `)
22,180, // <empty bracket pair>
23,14, // `[
71,39, // ")"
77,105, // "["
  }
,
{ // state 43
23,MIN_REDUCTION+113, // `[
77,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 44
5,217, // <class decl>
6,70, // `class
66,150, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 45
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 46
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 47
2,179, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 48
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 49
0x80000000|208, // match move
0x80000000|79, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 50
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 51
7,104, // ID
15,63, // `(
33,149, // <exp3>
35,166, // <exp2>
38,13, // <cast exp>
39,160, // <unary exp>
40,71, // <exp1>
41,214, // `-
42,100, // INTLIT
43,53, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,201, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,167, // {"1".."9"}
60,20, // "0"
61,57, // digit128
62,35, // {176..185}
70,6, // "("
74,124, // "-"
  }
,
{ // state 52
2,117, // ws*
23,MIN_REDUCTION+119, // `[
63,140, // ws
64,38, // " "
65,189, // {10}
77,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 53
43,147, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,155, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
58,190, // digit
59,227, // {"1".."9"}
60,227, // "0"
61,137, // digit128
62,35, // {176..185}
81,68, // idChar*
82,32, // $$0
87,73, // idChar
88,9, // "_"
89,192, // idChar128
90,49, // {223}
  }
,
{ // state 54
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 55
2,31, // ws*
  }
,
{ // state 56
23,MIN_REDUCTION+76, // `[
63,158, // ws
64,38, // " "
65,189, // {10}
77,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 57
0x80000000|55, // match move
0x80000000|129, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 58
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 59
0x80000000|187, // match move
0x80000000|72, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 60
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 61
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 62
2,50, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 63
7,216, // ID
14,80, // `void
18,42, // <type>
19,46, // `int
20,243, // `null
21,110, // `boolean
43,211, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,141, // letter128
56,131, // {199..218 231..250}
57,131, // {193..198 225..230}
66,5, // "#"
  }
,
{ // state 64
23,MIN_REDUCTION+91, // `[
77,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 65
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 66
94,MIN_REDUCTION+42, // $NT
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 67
2,7, // ws*
  }
,
{ // state 68
43,147, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,155, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
58,190, // digit
59,227, // {"1".."9"}
60,227, // "0"
61,137, // digit128
62,35, // {176..185}
82,126, // $$0
87,241, // idChar
88,9, // "_"
89,192, // idChar128
90,49, // {223}
  }
,
{ // state 69
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 70
7,87, // ID
43,211, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,141, // letter128
56,131, // {199..218 231..250}
57,131, // {193..198 225..230}
  }
,
{ // state 71
0x80000000|1, // match move
0x80000000|239, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 72
23,MIN_REDUCTION+114, // `[
63,158, // ws
64,38, // " "
65,189, // {10}
77,MIN_REDUCTION+114, // "["
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 73
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 75
0x80000000|1, // match move
0x80000000|17, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 76
2,37, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 77
7,101, // ID
8,77, // `{
10,15, // `}
14,80, // `void
15,63, // `(
17,84, // <stmt>*
18,168, // <type>
19,46, // `int
20,243, // `null
21,110, // `boolean
25,175, // <stmt>
26,94, // <assign>
28,182, // <local var decl>
29,237, // <exp>
31,92, // <exp4>
33,96, // <exp3>
35,166, // <exp2>
38,13, // <cast exp>
39,160, // <unary exp>
40,71, // <exp1>
41,214, // `-
42,100, // INTLIT
43,53, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,201, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,167, // {"1".."9"}
60,20, // "0"
61,57, // digit128
62,35, // {176..185}
66,5, // "#"
70,6, // "("
72,193, // "{"
73,120, // "}"
74,124, // "-"
  }
,
{ // state 78
23,MIN_REDUCTION+99, // `[
77,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 79
23,MIN_REDUCTION+97, // `[
77,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 80
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 81
23,MIN_REDUCTION+96, // `[
77,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 82
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 83
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 84
7,101, // ID
8,77, // `{
10,109, // `}
14,80, // `void
15,63, // `(
18,168, // <type>
19,46, // `int
20,243, // `null
21,110, // `boolean
25,69, // <stmt>
26,94, // <assign>
28,182, // <local var decl>
29,237, // <exp>
31,92, // <exp4>
33,96, // <exp3>
35,166, // <exp2>
38,13, // <cast exp>
39,160, // <unary exp>
40,71, // <exp1>
41,214, // `-
42,100, // INTLIT
43,53, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,201, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,167, // {"1".."9"}
60,20, // "0"
61,57, // digit128
62,35, // {176..185}
66,5, // "#"
70,6, // "("
72,193, // "{"
73,120, // "}"
74,124, // "-"
  }
,
{ // state 85
94,MIN_REDUCTION+15, // $NT
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 86
7,104, // ID
15,63, // `(
38,74, // <cast exp>
40,11, // <exp1>
42,100, // INTLIT
43,53, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,201, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,167, // {"1".."9"}
60,20, // "0"
61,57, // digit128
62,35, // {176..185}
70,6, // "("
  }
,
{ // state 87
8,123, // `{
72,193, // "{"
  }
,
{ // state 88
2,113, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 89
2,138, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 90
43,147, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,165, // letter128
56,131, // {199..218 231..250}
57,131, // {193..198 225..230}
58,190, // digit
59,227, // {"1".."9"}
60,227, // "0"
61,83, // digit128
62,119, // {176..185}
82,58, // $$0
87,241, // idChar
88,9, // "_"
89,24, // idChar128
90,196, // {223}
  }
,
{ // state 91
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 92
32,51, // `+
75,177, // "+"
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 93
2,34, // ws*
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 94
27,29, // `;
79,223, // ";"
  }
,
{ // state 95
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 96
34,209, // `*
36,127, // `/
37,16, // `&&
67,162, // "@"
69,220, // "*"
80,212, // "/"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 97
0x80000000|102, // match move
0x80000000|78, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 98
58,48, // digit
59,227, // {"1".."9"}
60,227, // "0"
61,234, // digit128
62,35, // {176..185}
84,75, // $$1
  }
,
{ // state 99
0x80000000|1, // match move
0x80000000|40, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 100
0x80000000|1, // match move
0x80000000|222, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 101
0x80000000|245, // match move
0x80000000|186, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 102
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 103
2,117, // ws*
  }
,
{ // state 104
0x80000000|1, // match move
0x80000000|210, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 105
2,36, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 106
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 107
0x80000000|103, // match move
0x80000000|52, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 108
23,14, // `[
77,105, // "["
  }
,
{ // state 109
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 111
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 112
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 113
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 116
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 117
0x80000000|1, // match move
0x80000000|159, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 118
49,88, // "l"
  }
,
{ // state 119
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 120
2,154, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 121
16,164, // `)
71,39, // ")"
  }
,
{ // state 122
2,7, // ws*
23,MIN_REDUCTION+117, // `[
63,140, // ws
64,38, // " "
65,189, // {10}
77,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 123
9,143, // <decl in class>*
10,60, // `}
11,203, // <decl in class>
12,194, // <method decl>
13,219, // `public
66,218, // "#"
73,120, // "}"
  }
,
{ // state 124
2,33, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 125
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 126
0x80000000|91, // match move
0x80000000|134, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 127
7,104, // ID
15,63, // `(
35,114, // <exp2>
38,13, // <cast exp>
39,160, // <unary exp>
40,71, // <exp1>
41,214, // `-
42,100, // INTLIT
43,53, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,201, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,167, // {"1".."9"}
60,20, // "0"
61,57, // digit128
62,35, // {176..185}
70,6, // "("
74,124, // "-"
  }
,
{ // state 128
23,MIN_REDUCTION+112, // `[
77,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 129
2,31, // ws*
23,MIN_REDUCTION+89, // `[
63,140, // ws
64,38, // " "
65,189, // {10}
77,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 130
23,MIN_REDUCTION+82, // `[
63,158, // ws
64,38, // " "
65,189, // {10}
77,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 131
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 132
2,202, // ws*
23,MIN_REDUCTION+77, // `[
63,140, // ws
64,38, // " "
65,189, // {10}
77,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 133
30,4, // `=
76,89, // "="
  }
,
{ // state 134
23,MIN_REDUCTION+84, // `[
77,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 136
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 137
0x80000000|45, // match move
0x80000000|81, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 138
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 139
23,145, // `[
77,105, // "["
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 140
0x80000000|19, // match move
0x80000000|43, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 141
2,136, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 142
23,MIN_REDUCTION+85, // `[
77,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 143
10,23, // `}
11,225, // <decl in class>
12,194, // <method decl>
13,219, // `public
66,218, // "#"
73,120, // "}"
  }
,
{ // state 144
15,121, // `(
70,6, // "("
  }
,
{ // state 145
7,104, // ID
15,63, // `(
29,185, // <exp>
31,92, // <exp4>
33,96, // <exp3>
35,166, // <exp2>
38,13, // <cast exp>
39,160, // <unary exp>
40,71, // <exp1>
41,214, // `-
42,100, // INTLIT
43,53, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,201, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,167, // {"1".."9"}
60,20, // "0"
61,57, // digit128
62,35, // {176..185}
70,6, // "("
74,124, // "-"
  }
,
{ // state 146
23,MIN_REDUCTION+39, // `[
77,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 147
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 148
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 149
34,209, // `*
36,127, // `/
37,16, // `&&
67,162, // "@"
69,220, // "*"
80,212, // "/"
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 150
47,118, // "c"
  }
,
{ // state 151
54,62, // "t"
  }
,
{ // state 152
23,MIN_REDUCTION+41, // `[
77,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 153
50,231, // "o"
  }
,
{ // state 154
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 155
0x80000000|61, // match move
0x80000000|236, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 156
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 157
0x80000000|176, // match move
0x80000000|132, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 158
0x80000000|199, // match move
0x80000000|128, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 159
23,MIN_REDUCTION+118, // `[
63,158, // ws
64,38, // " "
65,189, // {10}
77,MIN_REDUCTION+118, // "["
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 161
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 162
68,76, // "&"
  }
,
{ // state 163
2,156, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 164
8,207, // `{
72,193, // "{"
  }
,
{ // state 165
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 166
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 167
58,195, // digit
59,227, // {"1".."9"}
60,227, // "0"
61,234, // digit128
62,35, // {176..185}
83,98, // digit*
84,172, // $$1
  }
,
{ // state 168
7,133, // ID
22,180, // <empty bracket pair>
23,14, // `[
43,211, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,141, // letter128
56,131, // {199..218 231..250}
57,131, // {193..198 225..230}
77,105, // "["
  }
,
{ // state 169
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 170
23,MIN_REDUCTION+87, // `[
77,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 171
45,153, // "v"
  }
,
{ // state 172
0x80000000|1, // match move
0x80000000|170, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 173
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 174
0x80000000|1, // match move
0x80000000|184, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 175
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 176
2,202, // ws*
  }
,
{ // state 177
2,106, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 178
23,MIN_REDUCTION+88, // `[
63,158, // ws
64,38, // " "
65,189, // {10}
77,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 179
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 181
2,59, // ws*
23,MIN_REDUCTION+115, // `[
63,140, // ws
64,38, // " "
65,189, // {10}
77,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 182
27,229, // `;
79,223, // ";"
  }
,
{ // state 183
93,MIN_REDUCTION+0, // $
  }
,
{ // state 184
23,MIN_REDUCTION+90, // `[
77,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 185
24,99, // `]
78,157, // "]"
  }
,
{ // state 186
23,MIN_REDUCTION+35, // `[
30,MIN_REDUCTION+35, // `=
32,MIN_REDUCTION+35, // `+
34,MIN_REDUCTION+35, // `*
36,MIN_REDUCTION+35, // `/
37,MIN_REDUCTION+35, // `&&
67,MIN_REDUCTION+35, // "@"
69,MIN_REDUCTION+35, // "*"
75,MIN_REDUCTION+35, // "+"
76,MIN_REDUCTION+35, // "="
77,MIN_REDUCTION+35, // "["
80,MIN_REDUCTION+35, // "/"
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 188
7,144, // ID
43,211, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,141, // letter128
56,131, // {199..218 231..250}
57,131, // {193..198 225..230}
  }
,
{ // state 189
0x80000000|204, // match move
0x80000000|2, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 190
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 191
23,MIN_REDUCTION+116, // `[
63,158, // ws
64,38, // " "
65,189, // {10}
77,MIN_REDUCTION+116, // "["
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 192
0x80000000|206, // match move
0x80000000|181, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 193
2,230, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 194
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 196
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 197
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 198
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 199
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 200
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 201
0x80000000|93, // match move
0x80000000|26, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 202
0x80000000|1, // match move
0x80000000|56, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 203
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 204
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 205
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 206
2,59, // ws*
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 207
7,101, // ID
8,77, // `{
10,148, // `}
14,80, // `void
15,63, // `(
17,233, // <stmt>*
18,168, // <type>
19,46, // `int
20,243, // `null
21,110, // `boolean
25,175, // <stmt>
26,94, // <assign>
28,182, // <local var decl>
29,237, // <exp>
31,92, // <exp4>
33,96, // <exp3>
35,166, // <exp2>
38,13, // <cast exp>
39,160, // <unary exp>
40,71, // <exp1>
41,214, // `-
42,100, // INTLIT
43,53, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,201, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,167, // {"1".."9"}
60,20, // "0"
61,57, // digit128
62,35, // {176..185}
66,5, // "#"
70,6, // "("
72,193, // "{"
73,120, // "}"
74,124, // "-"
  }
,
{ // state 208
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 209
7,104, // ID
15,63, // `(
35,232, // <exp2>
38,13, // <cast exp>
39,160, // <unary exp>
40,71, // <exp1>
41,214, // `-
42,100, // INTLIT
43,53, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,201, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,167, // {"1".."9"}
60,20, // "0"
61,57, // digit128
62,35, // {176..185}
70,6, // "("
74,124, // "-"
  }
,
{ // state 210
23,MIN_REDUCTION+35, // `[
77,MIN_REDUCTION+35, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 211
43,147, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,165, // letter128
56,131, // {199..218 231..250}
57,131, // {193..198 225..230}
58,190, // digit
59,227, // {"1".."9"}
60,227, // "0"
61,83, // digit128
62,119, // {176..185}
81,90, // idChar*
82,238, // $$0
87,73, // idChar
88,9, // "_"
89,24, // idChar128
90,196, // {223}
  }
,
{ // state 212
2,10, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 213
94,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 214
7,104, // ID
39,197, // <unary exp>
40,71, // <exp1>
41,214, // `-
42,100, // INTLIT
43,53, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,201, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,167, // {"1".."9"}
60,20, // "0"
61,57, // digit128
62,35, // {176..185}
74,124, // "-"
  }
,
{ // state 215
51,163, // "u"
  }
,
{ // state 216
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 217
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 218
44,18, // "p"
  }
,
{ // state 219
14,188, // `void
66,171, // "#"
  }
,
{ // state 220
2,82, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 222
23,MIN_REDUCTION+37, // `[
77,MIN_REDUCTION+37, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 223
2,111, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 226
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 227
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 228
44,41, // "p"
45,41, // "v"
46,41, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,41, // "c"
48,41, // "i"
49,41, // "l"
50,41, // "o"
51,41, // "u"
52,41, // "b"
53,41, // "n"
54,41, // "t"
57,97, // {193..198 225..230}
59,41, // {"1".."9"}
60,41, // "0"
62,97, // {176..185}
86,174, // $$2
91,224, // hexDigit
92,107, // hexDigit128
  }
,
{ // state 229
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 230
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 231
2,226, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 232
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 233
7,101, // ID
8,77, // `{
10,198, // `}
14,80, // `void
15,63, // `(
18,168, // <type>
19,46, // `int
20,243, // `null
21,110, // `boolean
25,69, // <stmt>
26,94, // <assign>
28,182, // <local var decl>
29,237, // <exp>
31,92, // <exp4>
33,96, // <exp3>
35,166, // <exp2>
38,13, // <cast exp>
39,160, // <unary exp>
40,71, // <exp1>
41,214, // `-
42,100, // INTLIT
43,53, // letter
44,95, // "p"
45,95, // "v"
46,95, // {"A".."Z" "a" "d".."h" "j".."k" "m" "q".."s" "w".."z"}
47,95, // "c"
48,95, // "i"
49,95, // "l"
50,95, // "o"
51,95, // "u"
52,95, // "b"
53,95, // "n"
54,95, // "t"
55,201, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,167, // {"1".."9"}
60,20, // "0"
61,57, // digit128
62,35, // {176..185}
66,5, // "#"
70,6, // "("
72,193, // "{"
73,120, // "}"
74,124, // "-"
  }
,
{ // state 234
0x80000000|67, // match move
0x80000000|122, // no-match move
0x80000000|108, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 235
2,65, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 236
23,MIN_REDUCTION+95, // `[
77,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 237
30,8, // `=
76,89, // "="
  }
,
{ // state 238
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 239
23,145, // `[
77,105, // "["
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 240
3,169, // <program>
4,44, // <class decl>+
5,173, // <class decl>
6,70, // `class
63,30, // ws
64,66, // " "
65,22, // {10}
66,150, // "#"
  }
,
{ // state 241
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 242
2,3, // ws*
63,213, // ws
64,66, // " "
65,22, // {10}
94,MIN_REDUCTION+77, // $NT
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 243
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 244
63,30, // ws
64,66, // " "
65,22, // {10}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 245
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 246
MIN_REDUCTION+21, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[247][];
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
// <assign> ::= <exp> `= <exp>
(26<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(28<<16)+4,
// <exp> ::= <exp4>
(29<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(31<<16)+3,
// <exp4> ::= <exp3>
(31<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(33<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(33<<16)+3,
// <exp3> ::= <exp3> `&& <exp2>
(33<<16)+3,
// <exp3> ::= <exp2>
(33<<16)+1,
// <exp2> ::= <cast exp>
(35<<16)+1,
// <exp2> ::= <unary exp>
(35<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(38<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(38<<16)+4,
// <unary exp> ::= `- <unary exp>
(39<<16)+2,
// <unary exp> ::= <exp1>
(39<<16)+1,
// <exp1> ::= ID
(40<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(40<<16)+4,
// <exp1> ::= INTLIT
(40<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(43<<16)+1,
// letter128 ::= {193..218 225..250}
(55<<16)+1,
// digit ::= {"0".."9"}
(58<<16)+1,
// digit128 ::= {176..185}
(61<<16)+1,
// ws ::= " "
(63<<16)+1,
// ws ::= {10}
(63<<16)+1,
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
// `null ::= "#" "n" "u" ws*
(20<<16)+4,
// `null ::= "#" "n" "u"
(20<<16)+3,
// `public ::= "#" "p" "u" ws*
(13<<16)+4,
// `public ::= "#" "p" "u"
(13<<16)+3,
// `&& ::= "@" "&" ws*
(37<<16)+3,
// `&& ::= "@" "&"
(37<<16)+2,
// `* ::= "*" ws*
(34<<16)+2,
// `* ::= "*"
(34<<16)+1,
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
(41<<16)+2,
// `- ::= "-"
(41<<16)+1,
// `+ ::= "+" ws*
(32<<16)+2,
// `+ ::= "+"
(32<<16)+1,
// `= ::= "=" ws*
(30<<16)+2,
// `= ::= "="
(30<<16)+1,
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
(36<<16)+2,
// `/ ::= "/"
(36<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(42<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(42<<16)+2,
// INTLIT ::= digit128 ws*
(42<<16)+2,
// INTLIT ::= digit128
(42<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(42<<16)+3,
// INTLIT ::= "0" $$2
(42<<16)+2,
// idChar ::= letter
(87<<16)+1,
// idChar ::= digit
(87<<16)+1,
// idChar ::= "_"
(87<<16)+1,
// idChar128 ::= letter128
(89<<16)+1,
// idChar128 ::= digit128
(89<<16)+1,
// idChar128 ::= {223}
(89<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(91<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(92<<16)+1,
// digit* ::= digit* digit
(83<<16)+2,
// digit* ::= digit
(83<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(85<<16)+2,
// hexDigit* ::= hexDigit
(85<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(17<<16)+2,
// <stmt>* ::= <stmt>
(17<<16)+1,
// idChar* ::= idChar* idChar
(81<<16)+2,
// idChar* ::= idChar
(81<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(82<<16)+2,
// $$0 ::= idChar128
(82<<16)+1,
// $$1 ::= digit128 ws*
(84<<16)+2,
// $$1 ::= digit128
(84<<16)+1,
// $$2 ::= hexDigit128 ws*
(86<<16)+2,
// $$2 ::= hexDigit128
(86<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
-1, // 0
-1, // 1
-1, // 2
-1, // 3
-1, // 4
-1, // 5
-1, // 6
-1, // 7
-1, // 8
-1, // 9
65, // 10
-1, // 11
-1, // 12
-1, // 13
-1, // 14
-1, // 15
-1, // 16
-1, // 17
-1, // 18
-1, // 19
-1, // 20
-1, // 21
-1, // 22
-1, // 23
-1, // 24
-1, // 25
-1, // 26
-1, // 27
-1, // 28
-1, // 29
-1, // 30
-1, // 31
64, // " "
-1, // "!"
-1, // '"'
66, // "#"
-1, // "$"
-1, // "%"
68, // "&"
-1, // "'"
70, // "("
71, // ")"
69, // "*"
75, // "+"
-1, // ","
74, // "-"
-1, // "."
80, // "/"
60, // "0"
59, // "1"
59, // "2"
59, // "3"
59, // "4"
59, // "5"
59, // "6"
59, // "7"
59, // "8"
59, // "9"
-1, // ":"
79, // ";"
-1, // "<"
76, // "="
-1, // ">"
-1, // "?"
67, // "@"
46, // "A"
46, // "B"
46, // "C"
46, // "D"
46, // "E"
46, // "F"
46, // "G"
46, // "H"
46, // "I"
46, // "J"
46, // "K"
46, // "L"
46, // "M"
46, // "N"
46, // "O"
46, // "P"
46, // "Q"
46, // "R"
46, // "S"
46, // "T"
46, // "U"
46, // "V"
46, // "W"
46, // "X"
46, // "Y"
46, // "Z"
77, // "["
-1, // "\"
78, // "]"
-1, // "^"
88, // "_"
-1, // "`"
46, // "a"
52, // "b"
47, // "c"
46, // "d"
46, // "e"
46, // "f"
46, // "g"
46, // "h"
48, // "i"
46, // "j"
46, // "k"
49, // "l"
46, // "m"
53, // "n"
50, // "o"
44, // "p"
46, // "q"
46, // "r"
46, // "s"
54, // "t"
51, // "u"
45, // "v"
46, // "w"
46, // "x"
46, // "y"
46, // "z"
72, // "{"
-1, // "|"
73, // "}"
-1, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
-1, // 132
-1, // 133
-1, // 134
-1, // 135
-1, // 136
-1, // 137
-1, // 138
-1, // 139
-1, // 140
-1, // 141
-1, // 142
-1, // 143
-1, // 144
-1, // 145
-1, // 146
-1, // 147
-1, // 148
-1, // 149
-1, // 150
-1, // 151
-1, // 152
-1, // 153
-1, // 154
-1, // 155
-1, // 156
-1, // 157
-1, // 158
-1, // 159
-1, // 160
-1, // 161
-1, // 162
-1, // 163
-1, // 164
-1, // 165
-1, // 166
-1, // 167
-1, // 168
-1, // 169
-1, // 170
-1, // 171
-1, // 172
-1, // 173
-1, // 174
-1, // 175
62, // 176
62, // 177
62, // 178
62, // 179
62, // 180
62, // 181
62, // 182
62, // 183
62, // 184
62, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
57, // 193
57, // 194
57, // 195
57, // 196
57, // 197
57, // 198
56, // 199
56, // 200
56, // 201
56, // 202
56, // 203
56, // 204
56, // 205
56, // 206
56, // 207
56, // 208
56, // 209
56, // 210
56, // 211
56, // 212
56, // 213
56, // 214
56, // 215
56, // 216
56, // 217
56, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
90, // 223
-1, // 224
57, // 225
57, // 226
57, // 227
57, // 228
57, // 229
57, // 230
56, // 231
56, // 232
56, // 233
56, // 234
56, // 235
56, // 236
56, // 237
56, // 238
56, // 239
56, // 240
56, // 241
56, // 242
56, // 243
56, // 244
56, // 245
56, // 246
56, // 247
56, // 248
56, // 249
56, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
-1, // 255
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
"<assign> ::= <exp> # `= <exp>", // 20
"<local var decl> ::= <type> # ID `= <exp>", // 21
"<exp> ::= <exp4>", // 22
"<exp4> ::= <exp4> # `+ <exp3>", // 23
"<exp4> ::= <exp3>", // 24
"<exp3> ::= <exp3> # `* <exp2>", // 25
"<exp3> ::= <exp3> # `/ <exp2>", // 26
"<exp3> ::= <exp3> # `&& <exp2>", // 27
"<exp3> ::= <exp2>", // 28
"<exp2> ::= <cast exp>", // 29
"<exp2> ::= <unary exp>", // 30
"<cast exp> ::= # `( <type> `) <cast exp>", // 31
"<cast exp> ::= # `( <type> `) <exp1>", // 32
"<unary exp> ::= # `- <unary exp>", // 33
"<unary exp> ::= <exp1>", // 34
"<exp1> ::= # ID", // 35
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 36
"<exp1> ::= # INTLIT", // 37
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 38
"letter128 ::= {193..218 225..250}", // 39
"digit ::= {\"0\"..\"9\"}", // 40
"digit128 ::= {176..185}", // 41
"ws ::= \" \"", // 42
"ws ::= {10} registerNewline", // 43
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 44
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 45
"`class ::= \"#\" \"c\" \"l\" ws*", // 46
"`class ::= \"#\" \"c\" \"l\" ws*", // 47
"`void ::= \"#\" \"v\" \"o\" ws*", // 48
"`void ::= \"#\" \"v\" \"o\" ws*", // 49
"`int ::= \"#\" \"i\" \"t\" ws*", // 50
"`int ::= \"#\" \"i\" \"t\" ws*", // 51
"`null ::= \"#\" \"n\" \"u\" ws*", // 52
"`null ::= \"#\" \"n\" \"u\" ws*", // 53
"`public ::= \"#\" \"p\" \"u\" ws*", // 54
"`public ::= \"#\" \"p\" \"u\" ws*", // 55
"`&& ::= \"@\" \"&\" ws*", // 56
"`&& ::= \"@\" \"&\" ws*", // 57
"`* ::= \"*\" ws*", // 58
"`* ::= \"*\" ws*", // 59
"`( ::= \"(\" ws*", // 60
"`( ::= \"(\" ws*", // 61
"`) ::= \")\" ws*", // 62
"`) ::= \")\" ws*", // 63
"`{ ::= \"{\" ws*", // 64
"`{ ::= \"{\" ws*", // 65
"`} ::= \"}\" ws*", // 66
"`} ::= \"}\" ws*", // 67
"`- ::= \"-\" ws*", // 68
"`- ::= \"-\" ws*", // 69
"`+ ::= \"+\" ws*", // 70
"`+ ::= \"+\" ws*", // 71
"`= ::= \"=\" ws*", // 72
"`= ::= \"=\" ws*", // 73
"`[ ::= \"[\" ws*", // 74
"`[ ::= \"[\" ws*", // 75
"`] ::= \"]\" ws*", // 76
"`] ::= \"]\" ws*", // 77
"`; ::= \";\" ws*", // 78
"`; ::= \";\" ws*", // 79
"`/ ::= \"/\" ws*", // 80
"`/ ::= \"/\" ws*", // 81
"ID ::= letter128 ws*", // 82
"ID ::= letter128 ws*", // 83
"ID ::= letter idChar* idChar128 ws*", // 84
"ID ::= letter idChar* idChar128 ws*", // 85
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 86
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 87
"INTLIT ::= digit128 ws*", // 88
"INTLIT ::= digit128 ws*", // 89
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 90
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 91
"idChar ::= letter", // 92
"idChar ::= digit", // 93
"idChar ::= \"_\"", // 94
"idChar128 ::= letter128", // 95
"idChar128 ::= digit128", // 96
"idChar128 ::= {223}", // 97
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 98
"hexDigit128 ::= {176..185 193..198 225..230}", // 99
"digit* ::= digit* digit", // 100
"digit* ::= digit* digit", // 101
"<decl in class>* ::= <decl in class>* <decl in class>", // 102
"<decl in class>* ::= <decl in class>* <decl in class>", // 103
"hexDigit* ::= hexDigit* hexDigit", // 104
"hexDigit* ::= hexDigit* hexDigit", // 105
"<stmt>* ::= <stmt>* <stmt>", // 106
"<stmt>* ::= <stmt>* <stmt>", // 107
"idChar* ::= idChar* idChar", // 108
"idChar* ::= idChar* idChar", // 109
"<class decl>+ ::= <class decl>", // 110
"<class decl>+ ::= <class decl>+ <class decl>", // 111
"ws* ::= ws* ws", // 112
"ws* ::= ws* ws", // 113
"", // 114
"", // 115
"", // 116
"", // 117
"", // 118
"", // 119
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <type> ::= [#] `null @nullType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: <type> ::= [#] `void @voidType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 18: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 19: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 20: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 21: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 22: <exp> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 23: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 24: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 25: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 26: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 27: <exp3> ::= <exp3> [#] `&& <exp2> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 28: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 30: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 31: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 32: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 33: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 34: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 36: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 37: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 38: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 40: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 42: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 43: ws ::= {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 44: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 45: `boolean ::= "#" "b" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 46: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 47: `class ::= "#" "c" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 48: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 49: `void ::= "#" "v" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 50: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 51: `int ::= "#" "i" "t" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 52: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 53: `null ::= "#" "n" "u" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 55: `public ::= "#" "p" "u" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 56: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 57: `&& ::= "@" "&" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 58: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 59: `* ::= "*" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 60: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 61: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 62: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 63: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 64: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 65: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 66: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 67: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 68: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 69: `- ::= "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 70: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: `+ ::= "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `= ::= "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 77: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: `/ ::= "/" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 83: ID ::= letter128 [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 84: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 85: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 86: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 87: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 88: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 89: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 90: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 91: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 92: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 93: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 94: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 95: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 96: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 97: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 98: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 99: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 100: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 101: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 102: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 103: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 104: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 105: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 106: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 107: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 108: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 109: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 110: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 111: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 112: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 113: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 114: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 115: $$0 ::= idChar128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 116: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 117: $$1 ::= digit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 118: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 119: $$2 ::= hexDigit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((27<<5)|0x5)/*methodCall:27*/,
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
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 12: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 13: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 22: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 23: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 25: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 27: {
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
"Statement assign(Exp,int,Exp)",
"Statement localVarDecl(Type,int,String,Exp)",
"Exp newPlus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newDivide(Exp,int,Exp)",
"Exp newAnd(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newIntegerLiteral(int,int)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
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
3,1,
4,1,
3,1,
3,1,
3,1,
3,1,
3,1,
2,1,
2,1,
3,1,
2,1,
1,1,
3,1,
1,1,
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
    1,
    0,
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
    1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    0,
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
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    1,
    -1,
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
