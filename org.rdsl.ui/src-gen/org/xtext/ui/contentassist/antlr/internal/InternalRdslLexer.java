package org.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRdslLexer extends Lexer {
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalRdslLexer() {;} 
    public InternalRdslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRdslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:11:7: ( '*' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:11:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:12:7: ( 'import' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:12:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:13:7: ( '.graph' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:13:9: '.graph'
            {
            match(".graph"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:14:7: ( ';' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:15:7: ( '{' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:16:7: ( '}' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:17:7: ( 'installer:' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:17:9: 'installer:'
            {
            match("installer:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:18:7: ( 'extends:' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:18:9: 'extends:'
            {
            match("extends:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:19:7: ( 'children:' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:19:9: 'children:'
            {
            match("children:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:20:7: ( ',' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:21:7: ( 'exports:' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:21:9: 'exports:'
            {
            match("exports:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:22:7: ( '=' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:23:7: ( 'imports:' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:23:9: 'imports:'
            {
            match("imports:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:24:7: ( 'external' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:24:9: 'external'
            {
            match("external"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:25:7: ( '.' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:25:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:26:7: ( 'facets:' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:26:9: 'facets:'
            {
            match("facets:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:27:7: ( 'facet' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:27:9: 'facet'
            {
            match("facet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:28:7: ( 'instance' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:28:9: 'instance'
            {
            match("instance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:29:7: ( 'of' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:29:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:30:7: ( 'name:' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:30:9: 'name:'
            {
            match("name:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:31:7: ( 'count:' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:31:9: 'count:'
            {
            match("count:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:32:7: ( ':' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:32:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:33:7: ( '(optional)' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:33:9: '(optional)'
            {
            match("(optional)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3945:14: ( ( 'true' | 'false' ) )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3945:16: ( 'true' | 'false' )
            {
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3945:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3945:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3945:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3947:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3947:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3947:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3949:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3949:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3949:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3949:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3949:39: ( ( '\\r' )? '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3949:40: ( '\\r' )? '\\n'
                    {
                    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3949:40: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3949:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3951:10: ( ( '0' .. '9' )+ )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3951:12: ( '0' .. '9' )+
            {
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3951:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3951:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3953:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3953:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3953:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3953:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3953:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3953:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3953:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3953:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3953:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3953:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3953:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3955:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3955:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3955:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3955:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3957:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3957:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3957:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3959:16: ( . )
            // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:3959:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_BOOLEAN | RULE_ID | RULE_SL_COMMENT | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=31;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:148: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 25 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:161: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:169: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:185: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:194: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:206: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:222: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // ../org.rdsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalRdsl.g:1:230: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\2\uffff\1\34\1\36\3\uffff\2\34\2\uffff\3\34\1\uffff\1\30\1\34\3\uffff\3\30\3\uffff\2\34\6\uffff\3\34\2\uffff\1\34\1\72\1\34\2\uffff\1\34\5\uffff\10\34\1\uffff\13\34\1\121\7\34\1\133\1\121\2\uffff\1\135\6\34\1\uffff\1\34\1\uffff\1\34\1\uffff\6\34\2\uffff\1\34\1\155\1\uffff\1\156\1\uffff\2\34\4\uffff";
    static final String DFA12_eofS =
        "\161\uffff";
    static final String DFA12_minS =
        "\1\0\1\uffff\1\155\1\147\3\uffff\1\170\1\150\2\uffff\1\141\1\146\1\141\1\uffff\1\157\1\162\3\uffff\2\0\1\52\3\uffff\1\160\1\163\6\uffff\1\160\1\151\1\165\2\uffff\1\143\1\55\1\155\2\uffff\1\165\5\uffff\1\157\1\164\1\145\1\157\1\154\1\156\1\145\1\163\1\uffff\2\145\1\162\1\141\1\156\1\162\1\144\2\164\1\145\1\72\1\55\1\164\1\154\1\144\1\156\1\164\1\162\1\72\2\55\2\uffff\1\55\1\154\1\143\1\163\1\141\1\163\1\145\1\uffff\1\72\1\uffff\1\72\1\uffff\2\145\1\72\1\154\1\72\1\156\2\uffff\1\162\1\55\1\uffff\1\55\1\uffff\2\72\4\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\uffff\1\156\1\147\3\uffff\1\170\1\157\2\uffff\1\141\1\146\1\141\1\uffff\1\157\1\162\3\uffff\2\uffff\1\52\3\uffff\1\160\1\163\6\uffff\1\164\1\151\1\165\2\uffff\1\154\1\172\1\155\2\uffff\1\165\5\uffff\1\157\1\164\1\145\1\157\1\154\1\156\1\145\1\163\1\uffff\2\145\1\162\1\141\2\162\1\144\2\164\1\145\1\72\1\172\1\164\1\156\1\144\1\156\1\164\1\162\1\72\2\172\2\uffff\1\172\1\154\1\143\1\163\1\141\1\163\1\145\1\uffff\1\72\1\uffff\1\72\1\uffff\2\145\1\72\1\154\1\72\1\156\2\uffff\1\162\1\172\1\uffff\1\172\1\uffff\2\72\4\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\2\uffff\1\12\1\14\3\uffff\1\26\2\uffff\1\31\1\32\1\33\3\uffff\1\36\1\37\1\1\2\uffff\1\31\1\3\1\17\1\4\1\5\1\6\3\uffff\1\12\1\14\3\uffff\1\26\1\27\1\uffff\1\32\1\33\1\34\1\35\1\36\10\uffff\1\23\25\uffff\1\24\1\30\7\uffff\1\25\1\uffff\1\21\1\uffff\1\2\6\uffff\1\20\1\15\2\uffff\1\10\1\uffff\1\13\2\uffff\1\22\1\16\1\11\1\7";
    static final String DFA12_specialS =
        "\1\2\23\uffff\1\1\1\0\133\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\24\1\22\3\30\1\25\1\17\1\30\1\1\1\30\1\11\1\30\1\3\1\26\12\23\1\16\1\4\1\30\1\12\3\30\32\21\4\30\1\21\1\30\2\21\1\10\1\21\1\7\1\13\2\21\1\2\4\21\1\15\1\14\4\21\1\20\6\21\1\5\1\30\1\6\uff82\30",
            "",
            "\1\32\1\33",
            "\1\35",
            "",
            "",
            "",
            "\1\42",
            "\1\43\6\uffff\1\44",
            "",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "\1\53",
            "\1\54",
            "",
            "",
            "",
            "\0\57",
            "\0\57",
            "\1\60",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65\3\uffff\1\64",
            "\1\66",
            "\1\67",
            "",
            "",
            "\1\70\10\uffff\1\71",
            "\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\73",
            "",
            "",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111\3\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\122",
            "\1\123\1\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\132\7\34",
            "\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\134\7\34",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "\1\154",
            "\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\157",
            "\1\160",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_BOOLEAN | RULE_ID | RULE_SL_COMMENT | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_21 = input.LA(1);

                        s = -1;
                        if ( ((LA12_21>='\u0000' && LA12_21<='\uFFFF')) ) {s = 47;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFF')) ) {s = 47;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='*') ) {s = 1;}

                        else if ( (LA12_0=='i') ) {s = 2;}

                        else if ( (LA12_0=='.') ) {s = 3;}

                        else if ( (LA12_0==';') ) {s = 4;}

                        else if ( (LA12_0=='{') ) {s = 5;}

                        else if ( (LA12_0=='}') ) {s = 6;}

                        else if ( (LA12_0=='e') ) {s = 7;}

                        else if ( (LA12_0=='c') ) {s = 8;}

                        else if ( (LA12_0==',') ) {s = 9;}

                        else if ( (LA12_0=='=') ) {s = 10;}

                        else if ( (LA12_0=='f') ) {s = 11;}

                        else if ( (LA12_0=='o') ) {s = 12;}

                        else if ( (LA12_0=='n') ) {s = 13;}

                        else if ( (LA12_0==':') ) {s = 14;}

                        else if ( (LA12_0=='(') ) {s = 15;}

                        else if ( (LA12_0=='t') ) {s = 16;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='b')||LA12_0=='d'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='m')||(LA12_0>='p' && LA12_0<='s')||(LA12_0>='u' && LA12_0<='z')) ) {s = 17;}

                        else if ( (LA12_0=='#') ) {s = 18;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 19;}

                        else if ( (LA12_0=='\"') ) {s = 20;}

                        else if ( (LA12_0=='\'') ) {s = 21;}

                        else if ( (LA12_0=='/') ) {s = 22;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 23;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||LA12_0==')'||LA12_0=='+'||LA12_0=='-'||LA12_0=='<'||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<='^')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}