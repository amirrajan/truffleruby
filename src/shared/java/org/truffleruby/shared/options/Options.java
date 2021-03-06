/*
 * Copyright (c) 2016, 2018 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0, or
 * GNU General Public License version 2, or
 * GNU Lesser General Public License version 2.1.
 */
package org.truffleruby.shared.options;

// This file is automatically generated by options.yml with 'jt build options'

import javax.annotation.Generated;

@Generated("tool/generate-options.rb")
public class Options {

    public final String HOME;
    public final boolean NO_HOME_PROVIDED;
    public final String LAUNCHER;
    public final boolean EMBEDDED;
    public final String[] LOAD_PATHS;
    public final String[] REQUIRED_LIBRARIES;
    public final boolean READ_RUBYOPT;
    public final boolean IGNORE_LINES_BEFORE_RUBY_SHEBANG;
    public final String WORKING_DIRECTORY;
    public final ExecutionAction EXECUTION_ACTION;
    public final String TO_EXECUTE;
    public final DefaultExecutionAction DEFAULT_EXECUTION_ACTION;
    public final boolean SYNTAX_CHECK;
    public final boolean SHOW_VERSION;
    public final boolean SHOW_COPYRIGHT;
    public final ShowHelp SHOW_HELP;
    public final boolean DEBUG;
    public final Verbosity VERBOSITY;
    public final boolean ARGV_GLOBALS;
    public final String[] ARGV_GLOBAL_VALUES;
    public final String[] ARGV_GLOBAL_FLAGS;
    public final boolean DEFAULT_LAZY;
    public final boolean HASHING_DETERMINISTIC;
    public final boolean SAFE;
    public final boolean FROZEN_STRING_LITERALS;
    public final boolean RUBYGEMS;
    public final boolean LAZY_RUBYGEMS;
    public final boolean PATCHING;
    public final boolean DID_YOU_MEAN;
    public final String SOURCE_ENCODING;
    public final String INTERNAL_ENCODING;
    public final String EXTERNAL_ENCODING;
    public final boolean NATIVE_PLATFORM;
    public final boolean NATIVE_INTERRUPT;
    public final boolean HANDLE_INTERRUPT;
    public final boolean SINGLE_THREADED;
    public final boolean POLYGLOT_STDIO;
    public final boolean CEXT_LOCK;
    public final boolean PREINITIALIZATION;
    public final boolean TRACE_CALLS;
    public final boolean COVERAGE_GLOBAL;
    public final String CORE_LOAD_PATH;
    public final boolean CORE_AS_INTERNAL;
    public final boolean STDLIB_AS_INTERNAL;
    public final boolean LAZY_BUILTINS;
    public final boolean LAZY_CORE_METHOD_NODES;
    public final boolean LAZY_TRANSLATION_CORE;
    public final boolean LAZY_TRANSLATION_USER;
    public final boolean LAZY_TRANSLATION_LOG;
    public final int ARRAY_UNINITIALIZED_SIZE;
    public final int ARRAY_SMALL;
    public final int HASH_PACKED_ARRAY_MAX;
    public final boolean ROPE_LAZY_SUBSTRINGS;
    public final boolean ROPE_PRINT_INTERN_STATS;
    public final int ROPE_DEPTH_THRESHOLD;
    public final int GLOBAL_VARIABLE_MAX_INVALIDATIONS;
    public final int DEFAULT_CACHE;
    public final int METHOD_LOOKUP_CACHE;
    public final int DISPATCH_CACHE;
    public final int YIELD_CACHE;
    public final int METHOD_TO_PROC_CACHE;
    public final int IS_A_CACHE;
    public final int BIND_CACHE;
    public final int CONSTANT_CACHE;
    public final int INSTANCE_VARIABLE_CACHE;
    public final int BINDING_LOCAL_VARIABLE_CACHE;
    public final int SYMBOL_TO_PROC_CACHE;
    public final int ALLOCATE_CLASS_CACHE;
    public final int PACK_CACHE;
    public final int UNPACK_CACHE;
    public final int EVAL_CACHE;
    public final int CLASS_CACHE;
    public final int ENCODING_COMPATIBLE_QUERY_CACHE;
    public final int ENCODING_LOADED_CLASSES_CACHE;
    public final int THREAD_CACHE;
    public final int ROPE_CLASS_CACHE;
    public final int INTEROP_CONVERT_CACHE;
    public final int INTEROP_EXECUTE_CACHE;
    public final int INTEROP_INVOKE_CACHE;
    public final int INTEROP_NEW_CACHE;
    public final int TIME_FORMAT_CACHE;
    public final int POW_CACHE;
    public final int ARRAY_DUP_CACHE;
    public final int FRAME_VARIABLE_ACCESS_CACHE;
    public final boolean CLONE_DEFAULT;
    public final boolean INLINE_DEFAULT;
    public final boolean CORE_ALWAYS_CLONE;
    public final boolean INLINE_NEEDS_CALLER_FRAME;
    public final boolean YIELD_ALWAYS_CLONE;
    public final boolean YIELD_ALWAYS_INLINE;
    public final boolean METHODMISSING_ALWAYS_CLONE;
    public final boolean METHODMISSING_ALWAYS_INLINE;
    public final boolean CALL_WITH_BLOCK_ALWAYS_CLONE;
    public final int PACK_UNROLL_LIMIT;
    public final int PACK_RECOVER_LOOP_MIN;
    public final boolean EXCEPTIONS_STORE_JAVA;
    public final boolean EXCEPTIONS_PRINT_JAVA;
    public final boolean EXCEPTIONS_PRINT_UNCAUGHT_JAVA;
    public final boolean EXCEPTIONS_PRINT_RUBY_FOR_JAVA;
    public final boolean EXCEPTIONS_TRANSLATE_ASSERT;
    public final boolean EXCEPTIONS_WARN_STACKOVERFLOW;
    public final boolean EXCEPTIONS_WARN_OUT_OF_MEMORY;
    public final boolean BACKTRACES_HIDE_CORE_FILES;
    public final boolean BACKTRACES_INTERLEAVE_JAVA;
    public final int BACKTRACES_LIMIT;
    public final boolean BACKTRACES_OMIT_UNUSED;
    public final boolean BACKTRACE_ON_INTERRUPT;
    public final boolean BACKTRACE_ON_SIGALRM;
    public final boolean BACKTRACE_ON_RAISE;
    public final boolean BASICOPS_INLINE;
    public final boolean REGEXP_INSTRUMENT_CREATION;
    public final boolean REGEXP_INSTRUMENT_MATCH;
    public final boolean RUN_FINALIZERS_ON_EXIT;
    public final boolean SHARED_OBJECTS_ENABLED;
    public final boolean SHARED_OBJECTS_DEBUG;
    public final boolean SHARED_OBJECTS_FORCE;
    public final boolean SHARED_OBJECTS_SHARE_ALL;
    public final boolean CEXTS;
    public final boolean CEXTS_LOG_LOAD;
    public final boolean CEXTS_LOG_WARNINGS;
    public final String[] CEXTS_LIBRARY_REMAP;
    public final boolean LOG_DYNAMIC_CONSTANT_LOOKUP;
    public final boolean OPTIONS_LOG;
    public final boolean LOG_LOAD;
    public final boolean LOG_FEATURE_LOCATION;
    public final boolean METRICS_TIME_PARSING_FILE;
    public final boolean METRICS_TIME_REQUIRE;
    
    Options(OptionsBuilder builder) {
        HOME = builder.getOrDefault(OptionsCatalog.HOME);
        NO_HOME_PROVIDED = builder.getOrDefault(OptionsCatalog.NO_HOME_PROVIDED);
        LAUNCHER = builder.getOrDefault(OptionsCatalog.LAUNCHER);
        EMBEDDED = builder.getOrDefault(OptionsCatalog.EMBEDDED);
        LOAD_PATHS = builder.getOrDefault(OptionsCatalog.LOAD_PATHS);
        REQUIRED_LIBRARIES = builder.getOrDefault(OptionsCatalog.REQUIRED_LIBRARIES);
        READ_RUBYOPT = builder.getOrDefault(OptionsCatalog.READ_RUBYOPT);
        IGNORE_LINES_BEFORE_RUBY_SHEBANG = builder.getOrDefault(OptionsCatalog.IGNORE_LINES_BEFORE_RUBY_SHEBANG);
        WORKING_DIRECTORY = builder.getOrDefault(OptionsCatalog.WORKING_DIRECTORY);
        EXECUTION_ACTION = builder.getOrDefault(OptionsCatalog.EXECUTION_ACTION);
        TO_EXECUTE = builder.getOrDefault(OptionsCatalog.TO_EXECUTE);
        DEFAULT_EXECUTION_ACTION = builder.getOrDefault(OptionsCatalog.DEFAULT_EXECUTION_ACTION);
        SYNTAX_CHECK = builder.getOrDefault(OptionsCatalog.SYNTAX_CHECK);
        SHOW_VERSION = builder.getOrDefault(OptionsCatalog.SHOW_VERSION);
        SHOW_COPYRIGHT = builder.getOrDefault(OptionsCatalog.SHOW_COPYRIGHT);
        SHOW_HELP = builder.getOrDefault(OptionsCatalog.SHOW_HELP);
        DEBUG = builder.getOrDefault(OptionsCatalog.DEBUG);
        VERBOSITY = builder.getOrDefault(OptionsCatalog.VERBOSITY);
        ARGV_GLOBALS = builder.getOrDefault(OptionsCatalog.ARGV_GLOBALS);
        ARGV_GLOBAL_VALUES = builder.getOrDefault(OptionsCatalog.ARGV_GLOBAL_VALUES);
        ARGV_GLOBAL_FLAGS = builder.getOrDefault(OptionsCatalog.ARGV_GLOBAL_FLAGS);
        DEFAULT_LAZY = builder.getOrDefault(OptionsCatalog.DEFAULT_LAZY);
        HASHING_DETERMINISTIC = builder.getOrDefault(OptionsCatalog.HASHING_DETERMINISTIC);
        SAFE = builder.getOrDefault(OptionsCatalog.SAFE);
        FROZEN_STRING_LITERALS = builder.getOrDefault(OptionsCatalog.FROZEN_STRING_LITERALS);
        RUBYGEMS = builder.getOrDefault(OptionsCatalog.RUBYGEMS);
        LAZY_RUBYGEMS = builder.getOrDefault(OptionsCatalog.LAZY_RUBYGEMS, DEFAULT_LAZY);
        PATCHING = builder.getOrDefault(OptionsCatalog.PATCHING);
        DID_YOU_MEAN = builder.getOrDefault(OptionsCatalog.DID_YOU_MEAN);
        SOURCE_ENCODING = builder.getOrDefault(OptionsCatalog.SOURCE_ENCODING);
        INTERNAL_ENCODING = builder.getOrDefault(OptionsCatalog.INTERNAL_ENCODING);
        EXTERNAL_ENCODING = builder.getOrDefault(OptionsCatalog.EXTERNAL_ENCODING);
        NATIVE_PLATFORM = builder.getOrDefault(OptionsCatalog.NATIVE_PLATFORM);
        NATIVE_INTERRUPT = builder.getOrDefault(OptionsCatalog.NATIVE_INTERRUPT, NATIVE_PLATFORM);
        HANDLE_INTERRUPT = builder.getOrDefault(OptionsCatalog.HANDLE_INTERRUPT, !EMBEDDED);
        SINGLE_THREADED = builder.getOrDefault(OptionsCatalog.SINGLE_THREADED, EMBEDDED);
        POLYGLOT_STDIO = builder.getOrDefault(OptionsCatalog.POLYGLOT_STDIO, EMBEDDED || !NATIVE_PLATFORM);
        CEXT_LOCK = builder.getOrDefault(OptionsCatalog.CEXT_LOCK);
        PREINITIALIZATION = builder.getOrDefault(OptionsCatalog.PREINITIALIZATION);
        TRACE_CALLS = builder.getOrDefault(OptionsCatalog.TRACE_CALLS);
        COVERAGE_GLOBAL = builder.getOrDefault(OptionsCatalog.COVERAGE_GLOBAL);
        CORE_LOAD_PATH = builder.getOrDefault(OptionsCatalog.CORE_LOAD_PATH);
        CORE_AS_INTERNAL = builder.getOrDefault(OptionsCatalog.CORE_AS_INTERNAL);
        STDLIB_AS_INTERNAL = builder.getOrDefault(OptionsCatalog.STDLIB_AS_INTERNAL);
        LAZY_BUILTINS = builder.getOrDefault(OptionsCatalog.LAZY_BUILTINS, DEFAULT_LAZY);
        LAZY_CORE_METHOD_NODES = builder.getOrDefault(OptionsCatalog.LAZY_CORE_METHOD_NODES, DEFAULT_LAZY);
        LAZY_TRANSLATION_CORE = builder.getOrDefault(OptionsCatalog.LAZY_TRANSLATION_CORE, DEFAULT_LAZY);
        LAZY_TRANSLATION_USER = builder.getOrDefault(OptionsCatalog.LAZY_TRANSLATION_USER);
        LAZY_TRANSLATION_LOG = builder.getOrDefault(OptionsCatalog.LAZY_TRANSLATION_LOG);
        ARRAY_UNINITIALIZED_SIZE = builder.getOrDefault(OptionsCatalog.ARRAY_UNINITIALIZED_SIZE);
        ARRAY_SMALL = builder.getOrDefault(OptionsCatalog.ARRAY_SMALL);
        HASH_PACKED_ARRAY_MAX = builder.getOrDefault(OptionsCatalog.HASH_PACKED_ARRAY_MAX);
        ROPE_LAZY_SUBSTRINGS = builder.getOrDefault(OptionsCatalog.ROPE_LAZY_SUBSTRINGS);
        ROPE_PRINT_INTERN_STATS = builder.getOrDefault(OptionsCatalog.ROPE_PRINT_INTERN_STATS);
        ROPE_DEPTH_THRESHOLD = builder.getOrDefault(OptionsCatalog.ROPE_DEPTH_THRESHOLD);
        GLOBAL_VARIABLE_MAX_INVALIDATIONS = builder.getOrDefault(OptionsCatalog.GLOBAL_VARIABLE_MAX_INVALIDATIONS);
        DEFAULT_CACHE = builder.getOrDefault(OptionsCatalog.DEFAULT_CACHE);
        METHOD_LOOKUP_CACHE = builder.getOrDefault(OptionsCatalog.METHOD_LOOKUP_CACHE, DEFAULT_CACHE);
        DISPATCH_CACHE = builder.getOrDefault(OptionsCatalog.DISPATCH_CACHE, DEFAULT_CACHE);
        YIELD_CACHE = builder.getOrDefault(OptionsCatalog.YIELD_CACHE, DEFAULT_CACHE);
        METHOD_TO_PROC_CACHE = builder.getOrDefault(OptionsCatalog.METHOD_TO_PROC_CACHE, DEFAULT_CACHE);
        IS_A_CACHE = builder.getOrDefault(OptionsCatalog.IS_A_CACHE, DEFAULT_CACHE);
        BIND_CACHE = builder.getOrDefault(OptionsCatalog.BIND_CACHE, DEFAULT_CACHE);
        CONSTANT_CACHE = builder.getOrDefault(OptionsCatalog.CONSTANT_CACHE, DEFAULT_CACHE);
        INSTANCE_VARIABLE_CACHE = builder.getOrDefault(OptionsCatalog.INSTANCE_VARIABLE_CACHE, DEFAULT_CACHE);
        BINDING_LOCAL_VARIABLE_CACHE = builder.getOrDefault(OptionsCatalog.BINDING_LOCAL_VARIABLE_CACHE, DEFAULT_CACHE);
        SYMBOL_TO_PROC_CACHE = builder.getOrDefault(OptionsCatalog.SYMBOL_TO_PROC_CACHE, DEFAULT_CACHE);
        ALLOCATE_CLASS_CACHE = builder.getOrDefault(OptionsCatalog.ALLOCATE_CLASS_CACHE, DEFAULT_CACHE);
        PACK_CACHE = builder.getOrDefault(OptionsCatalog.PACK_CACHE, DEFAULT_CACHE);
        UNPACK_CACHE = builder.getOrDefault(OptionsCatalog.UNPACK_CACHE, DEFAULT_CACHE);
        EVAL_CACHE = builder.getOrDefault(OptionsCatalog.EVAL_CACHE, DEFAULT_CACHE);
        CLASS_CACHE = builder.getOrDefault(OptionsCatalog.CLASS_CACHE, DEFAULT_CACHE);
        ENCODING_COMPATIBLE_QUERY_CACHE = builder.getOrDefault(OptionsCatalog.ENCODING_COMPATIBLE_QUERY_CACHE, DEFAULT_CACHE);
        ENCODING_LOADED_CLASSES_CACHE = builder.getOrDefault(OptionsCatalog.ENCODING_LOADED_CLASSES_CACHE, DEFAULT_CACHE);
        THREAD_CACHE = builder.getOrDefault(OptionsCatalog.THREAD_CACHE, DEFAULT_CACHE);
        ROPE_CLASS_CACHE = builder.getOrDefault(OptionsCatalog.ROPE_CLASS_CACHE);
        INTEROP_CONVERT_CACHE = builder.getOrDefault(OptionsCatalog.INTEROP_CONVERT_CACHE, DEFAULT_CACHE);
        INTEROP_EXECUTE_CACHE = builder.getOrDefault(OptionsCatalog.INTEROP_EXECUTE_CACHE, DEFAULT_CACHE);
        INTEROP_INVOKE_CACHE = builder.getOrDefault(OptionsCatalog.INTEROP_INVOKE_CACHE, DEFAULT_CACHE);
        INTEROP_NEW_CACHE = builder.getOrDefault(OptionsCatalog.INTEROP_NEW_CACHE, DEFAULT_CACHE);
        TIME_FORMAT_CACHE = builder.getOrDefault(OptionsCatalog.TIME_FORMAT_CACHE, DEFAULT_CACHE);
        POW_CACHE = builder.getOrDefault(OptionsCatalog.POW_CACHE, DEFAULT_CACHE);
        ARRAY_DUP_CACHE = builder.getOrDefault(OptionsCatalog.ARRAY_DUP_CACHE);
        FRAME_VARIABLE_ACCESS_CACHE = builder.getOrDefault(OptionsCatalog.FRAME_VARIABLE_ACCESS_CACHE);
        CLONE_DEFAULT = builder.getOrDefault(OptionsCatalog.CLONE_DEFAULT);
        INLINE_DEFAULT = builder.getOrDefault(OptionsCatalog.INLINE_DEFAULT);
        CORE_ALWAYS_CLONE = builder.getOrDefault(OptionsCatalog.CORE_ALWAYS_CLONE, CLONE_DEFAULT);
        INLINE_NEEDS_CALLER_FRAME = builder.getOrDefault(OptionsCatalog.INLINE_NEEDS_CALLER_FRAME, INLINE_DEFAULT);
        YIELD_ALWAYS_CLONE = builder.getOrDefault(OptionsCatalog.YIELD_ALWAYS_CLONE, CLONE_DEFAULT);
        YIELD_ALWAYS_INLINE = builder.getOrDefault(OptionsCatalog.YIELD_ALWAYS_INLINE, INLINE_DEFAULT);
        METHODMISSING_ALWAYS_CLONE = builder.getOrDefault(OptionsCatalog.METHODMISSING_ALWAYS_CLONE, CLONE_DEFAULT);
        METHODMISSING_ALWAYS_INLINE = builder.getOrDefault(OptionsCatalog.METHODMISSING_ALWAYS_INLINE, INLINE_DEFAULT);
        CALL_WITH_BLOCK_ALWAYS_CLONE = builder.getOrDefault(OptionsCatalog.CALL_WITH_BLOCK_ALWAYS_CLONE, CLONE_DEFAULT);
        PACK_UNROLL_LIMIT = builder.getOrDefault(OptionsCatalog.PACK_UNROLL_LIMIT);
        PACK_RECOVER_LOOP_MIN = builder.getOrDefault(OptionsCatalog.PACK_RECOVER_LOOP_MIN);
        EXCEPTIONS_STORE_JAVA = builder.getOrDefault(OptionsCatalog.EXCEPTIONS_STORE_JAVA);
        EXCEPTIONS_PRINT_JAVA = builder.getOrDefault(OptionsCatalog.EXCEPTIONS_PRINT_JAVA);
        EXCEPTIONS_PRINT_UNCAUGHT_JAVA = builder.getOrDefault(OptionsCatalog.EXCEPTIONS_PRINT_UNCAUGHT_JAVA);
        EXCEPTIONS_PRINT_RUBY_FOR_JAVA = builder.getOrDefault(OptionsCatalog.EXCEPTIONS_PRINT_RUBY_FOR_JAVA);
        EXCEPTIONS_TRANSLATE_ASSERT = builder.getOrDefault(OptionsCatalog.EXCEPTIONS_TRANSLATE_ASSERT);
        EXCEPTIONS_WARN_STACKOVERFLOW = builder.getOrDefault(OptionsCatalog.EXCEPTIONS_WARN_STACKOVERFLOW);
        EXCEPTIONS_WARN_OUT_OF_MEMORY = builder.getOrDefault(OptionsCatalog.EXCEPTIONS_WARN_OUT_OF_MEMORY);
        BACKTRACES_HIDE_CORE_FILES = builder.getOrDefault(OptionsCatalog.BACKTRACES_HIDE_CORE_FILES);
        BACKTRACES_INTERLEAVE_JAVA = builder.getOrDefault(OptionsCatalog.BACKTRACES_INTERLEAVE_JAVA);
        BACKTRACES_LIMIT = builder.getOrDefault(OptionsCatalog.BACKTRACES_LIMIT);
        BACKTRACES_OMIT_UNUSED = builder.getOrDefault(OptionsCatalog.BACKTRACES_OMIT_UNUSED);
        BACKTRACE_ON_INTERRUPT = builder.getOrDefault(OptionsCatalog.BACKTRACE_ON_INTERRUPT);
        BACKTRACE_ON_SIGALRM = builder.getOrDefault(OptionsCatalog.BACKTRACE_ON_SIGALRM, !EMBEDDED);
        BACKTRACE_ON_RAISE = builder.getOrDefault(OptionsCatalog.BACKTRACE_ON_RAISE);
        BASICOPS_INLINE = builder.getOrDefault(OptionsCatalog.BASICOPS_INLINE);
        REGEXP_INSTRUMENT_CREATION = builder.getOrDefault(OptionsCatalog.REGEXP_INSTRUMENT_CREATION);
        REGEXP_INSTRUMENT_MATCH = builder.getOrDefault(OptionsCatalog.REGEXP_INSTRUMENT_MATCH);
        RUN_FINALIZERS_ON_EXIT = builder.getOrDefault(OptionsCatalog.RUN_FINALIZERS_ON_EXIT);
        SHARED_OBJECTS_ENABLED = builder.getOrDefault(OptionsCatalog.SHARED_OBJECTS_ENABLED);
        SHARED_OBJECTS_DEBUG = builder.getOrDefault(OptionsCatalog.SHARED_OBJECTS_DEBUG);
        SHARED_OBJECTS_FORCE = builder.getOrDefault(OptionsCatalog.SHARED_OBJECTS_FORCE);
        SHARED_OBJECTS_SHARE_ALL = builder.getOrDefault(OptionsCatalog.SHARED_OBJECTS_SHARE_ALL);
        CEXTS = builder.getOrDefault(OptionsCatalog.CEXTS);
        CEXTS_LOG_LOAD = builder.getOrDefault(OptionsCatalog.CEXTS_LOG_LOAD);
        CEXTS_LOG_WARNINGS = builder.getOrDefault(OptionsCatalog.CEXTS_LOG_WARNINGS);
        CEXTS_LIBRARY_REMAP = builder.getOrDefault(OptionsCatalog.CEXTS_LIBRARY_REMAP);
        LOG_DYNAMIC_CONSTANT_LOOKUP = builder.getOrDefault(OptionsCatalog.LOG_DYNAMIC_CONSTANT_LOOKUP);
        OPTIONS_LOG = builder.getOrDefault(OptionsCatalog.OPTIONS_LOG);
        LOG_LOAD = builder.getOrDefault(OptionsCatalog.LOG_LOAD);
        LOG_FEATURE_LOCATION = builder.getOrDefault(OptionsCatalog.LOG_FEATURE_LOCATION);
        METRICS_TIME_PARSING_FILE = builder.getOrDefault(OptionsCatalog.METRICS_TIME_PARSING_FILE);
        METRICS_TIME_REQUIRE = builder.getOrDefault(OptionsCatalog.METRICS_TIME_REQUIRE);
    }

    public Object fromDescription(OptionDescription<?> description) {
        switch (description.getName()) {
            case "ruby.home":
                return HOME;
            case "ruby.no_home_provided":
                return NO_HOME_PROVIDED;
            case "ruby.launcher":
                return LAUNCHER;
            case "ruby.embedded":
                return EMBEDDED;
            case "ruby.load_paths":
                return LOAD_PATHS;
            case "ruby.required_libraries":
                return REQUIRED_LIBRARIES;
            case "ruby.read_rubyopt":
                return READ_RUBYOPT;
            case "ruby.ignore_lines_before_ruby_shebang":
                return IGNORE_LINES_BEFORE_RUBY_SHEBANG;
            case "ruby.working_directory":
                return WORKING_DIRECTORY;
            case "ruby.execution_action":
                return EXECUTION_ACTION;
            case "ruby.to_execute":
                return TO_EXECUTE;
            case "ruby.default_execution_action":
                return DEFAULT_EXECUTION_ACTION;
            case "ruby.syntax_check":
                return SYNTAX_CHECK;
            case "ruby.show_version":
                return SHOW_VERSION;
            case "ruby.show_copyright":
                return SHOW_COPYRIGHT;
            case "ruby.show_help":
                return SHOW_HELP;
            case "ruby.debug":
                return DEBUG;
            case "ruby.verbosity":
                return VERBOSITY;
            case "ruby.argv_globals":
                return ARGV_GLOBALS;
            case "ruby.argv_global_values":
                return ARGV_GLOBAL_VALUES;
            case "ruby.argv_global_flags":
                return ARGV_GLOBAL_FLAGS;
            case "ruby.lazy.default":
                return DEFAULT_LAZY;
            case "ruby.hashing.deterministic":
                return HASHING_DETERMINISTIC;
            case "ruby.safe":
                return SAFE;
            case "ruby.frozen_string_literals":
                return FROZEN_STRING_LITERALS;
            case "ruby.rubygems":
                return RUBYGEMS;
            case "ruby.rubygems.lazy":
                return LAZY_RUBYGEMS;
            case "ruby.patching":
                return PATCHING;
            case "ruby.did_you_mean":
                return DID_YOU_MEAN;
            case "ruby.source_encoding":
                return SOURCE_ENCODING;
            case "ruby.internal_encoding":
                return INTERNAL_ENCODING;
            case "ruby.external_encoding":
                return EXTERNAL_ENCODING;
            case "ruby.platform.native":
                return NATIVE_PLATFORM;
            case "ruby.platform.native_interrupt":
                return NATIVE_INTERRUPT;
            case "ruby.platform.handle_interrupt":
                return HANDLE_INTERRUPT;
            case "ruby.single_threaded":
                return SINGLE_THREADED;
            case "ruby.polyglot.stdio":
                return POLYGLOT_STDIO;
            case "ruby.cexts.lock":
                return CEXT_LOCK;
            case "ruby.preinit":
                return PREINITIALIZATION;
            case "ruby.trace.calls":
                return TRACE_CALLS;
            case "ruby.coverage.global":
                return COVERAGE_GLOBAL;
            case "ruby.core.load_path":
                return CORE_LOAD_PATH;
            case "ruby.core_as_internal":
                return CORE_AS_INTERNAL;
            case "ruby.stdlib_as_internal":
                return STDLIB_AS_INTERNAL;
            case "ruby.lazy_builtins":
                return LAZY_BUILTINS;
            case "ruby.lazy_core_method_nodes":
                return LAZY_CORE_METHOD_NODES;
            case "ruby.lazy_translation.core":
                return LAZY_TRANSLATION_CORE;
            case "ruby.lazy_translation.user":
                return LAZY_TRANSLATION_USER;
            case "ruby.lazy_translation.log":
                return LAZY_TRANSLATION_LOG;
            case "ruby.array.uninitialized_size":
                return ARRAY_UNINITIALIZED_SIZE;
            case "ruby.array.small":
                return ARRAY_SMALL;
            case "ruby.hash.packed_array.max":
                return HASH_PACKED_ARRAY_MAX;
            case "ruby.rope.lazy_substrings":
                return ROPE_LAZY_SUBSTRINGS;
            case "ruby.rope.print_intern_stats":
                return ROPE_PRINT_INTERN_STATS;
            case "ruby.rope.depth_threshold":
                return ROPE_DEPTH_THRESHOLD;
            case "ruby.global_variable.max_invalidations":
                return GLOBAL_VARIABLE_MAX_INVALIDATIONS;
            case "ruby.default_cache":
                return DEFAULT_CACHE;
            case "ruby.method_lookup.cache":
                return METHOD_LOOKUP_CACHE;
            case "ruby.dispatch.cache":
                return DISPATCH_CACHE;
            case "ruby.yield.cache":
                return YIELD_CACHE;
            case "ruby.to_proc.cache":
                return METHOD_TO_PROC_CACHE;
            case "ruby.is_a.cache":
                return IS_A_CACHE;
            case "ruby.bind.cache":
                return BIND_CACHE;
            case "ruby.constant.cache":
                return CONSTANT_CACHE;
            case "ruby.instance_variable.cache":
                return INSTANCE_VARIABLE_CACHE;
            case "ruby.binding_local_variable.cache":
                return BINDING_LOCAL_VARIABLE_CACHE;
            case "ruby.symbol_to_proc.cache":
                return SYMBOL_TO_PROC_CACHE;
            case "ruby.allocate_class.cache":
                return ALLOCATE_CLASS_CACHE;
            case "ruby.pack.cache":
                return PACK_CACHE;
            case "ruby.unpack.cache":
                return UNPACK_CACHE;
            case "ruby.eval.cache":
                return EVAL_CACHE;
            case "ruby.class.cache":
                return CLASS_CACHE;
            case "ruby.encoding_compatible_query.cache":
                return ENCODING_COMPATIBLE_QUERY_CACHE;
            case "ruby.encoding_loaded_classes.cache":
                return ENCODING_LOADED_CLASSES_CACHE;
            case "ruby.thread.cache":
                return THREAD_CACHE;
            case "ruby.rope_class.cache":
                return ROPE_CLASS_CACHE;
            case "ruby.interop.convert.cache":
                return INTEROP_CONVERT_CACHE;
            case "ruby.interop.execute.cache":
                return INTEROP_EXECUTE_CACHE;
            case "ruby.interop.invoke.cache":
                return INTEROP_INVOKE_CACHE;
            case "ruby.interop.new.cache":
                return INTEROP_NEW_CACHE;
            case "ruby.time.format.cache":
                return TIME_FORMAT_CACHE;
            case "ruby.integer.pow.cache":
                return POW_CACHE;
            case "ruby.array.dup.cache":
                return ARRAY_DUP_CACHE;
            case "ruby.frame.variable.access.cache":
                return FRAME_VARIABLE_ACCESS_CACHE;
            case "ruby.clone.default":
                return CLONE_DEFAULT;
            case "ruby.inline.default":
                return INLINE_DEFAULT;
            case "ruby.core.always_clone":
                return CORE_ALWAYS_CLONE;
            case "ruby.inline_needs_caller_frame":
                return INLINE_NEEDS_CALLER_FRAME;
            case "ruby.yield.always_clone":
                return YIELD_ALWAYS_CLONE;
            case "ruby.yield.always_inline":
                return YIELD_ALWAYS_INLINE;
            case "ruby.method_missing.always_clone":
                return METHODMISSING_ALWAYS_CLONE;
            case "ruby.method_missing.always_inline":
                return METHODMISSING_ALWAYS_INLINE;
            case "ruby.call_with_block.always_clone":
                return CALL_WITH_BLOCK_ALWAYS_CLONE;
            case "ruby.pack.unroll":
                return PACK_UNROLL_LIMIT;
            case "ruby.pack.recover":
                return PACK_RECOVER_LOOP_MIN;
            case "ruby.exceptions.store_java":
                return EXCEPTIONS_STORE_JAVA;
            case "ruby.exceptions.print_java":
                return EXCEPTIONS_PRINT_JAVA;
            case "ruby.exceptions.print_uncaught_java":
                return EXCEPTIONS_PRINT_UNCAUGHT_JAVA;
            case "ruby.exceptions.print_ruby_for_java":
                return EXCEPTIONS_PRINT_RUBY_FOR_JAVA;
            case "ruby.exceptions.translate_assert":
                return EXCEPTIONS_TRANSLATE_ASSERT;
            case "ruby.exceptions.warn_stackoverflow":
                return EXCEPTIONS_WARN_STACKOVERFLOW;
            case "ruby.exceptions.warn_out_of_memory":
                return EXCEPTIONS_WARN_OUT_OF_MEMORY;
            case "ruby.backtraces.hide_core_files":
                return BACKTRACES_HIDE_CORE_FILES;
            case "ruby.backtraces.interleave_java":
                return BACKTRACES_INTERLEAVE_JAVA;
            case "ruby.backtraces.limit":
                return BACKTRACES_LIMIT;
            case "ruby.backtraces.omit_unused":
                return BACKTRACES_OMIT_UNUSED;
            case "ruby.backtraces.on_interrupt":
                return BACKTRACE_ON_INTERRUPT;
            case "ruby.backtraces.sigalrm":
                return BACKTRACE_ON_SIGALRM;
            case "ruby.backtraces.raise":
                return BACKTRACE_ON_RAISE;
            case "ruby.basic_ops.inline":
                return BASICOPS_INLINE;
            case "ruby.regexp.instrument-creation":
                return REGEXP_INSTRUMENT_CREATION;
            case "ruby.regexp.instrument-match":
                return REGEXP_INSTRUMENT_MATCH;
            case "ruby.finalizers.run_on_exit":
                return RUN_FINALIZERS_ON_EXIT;
            case "ruby.shared.objects":
                return SHARED_OBJECTS_ENABLED;
            case "ruby.shared.objects.debug":
                return SHARED_OBJECTS_DEBUG;
            case "ruby.shared.objects.force":
                return SHARED_OBJECTS_FORCE;
            case "ruby.shared.objects.share_all":
                return SHARED_OBJECTS_SHARE_ALL;
            case "ruby.cexts":
                return CEXTS;
            case "ruby.cexts.log.load":
                return CEXTS_LOG_LOAD;
            case "ruby.cexts.log.warnings":
                return CEXTS_LOG_WARNINGS;
            case "ruby.cexts.remap":
                return CEXTS_LIBRARY_REMAP;
            case "ruby.constant.dynamic_lookup.log":
                return LOG_DYNAMIC_CONSTANT_LOOKUP;
            case "ruby.options.log":
                return OPTIONS_LOG;
            case "ruby.log.load":
                return LOG_LOAD;
            case "ruby.log.feature_location":
                return LOG_FEATURE_LOCATION;
            case "ruby.metrics.time.parsing.file":
                return METRICS_TIME_PARSING_FILE;
            case "ruby.metrics.time.require":
                return METRICS_TIME_REQUIRE;
            default:
                return null;
        }
    }
}
