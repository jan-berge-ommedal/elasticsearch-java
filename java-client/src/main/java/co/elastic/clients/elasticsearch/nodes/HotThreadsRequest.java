/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: nodes.hot_threads.Request
public final class HotThreadsRequest extends RequestBase {
	@Nullable
	private final List<String> nodeId;

	@Nullable
	private final Boolean ignoreIdleThreads;

	@Nullable
	private final JsonValue interval;

	@Nullable
	private final Number snapshots;

	@Nullable
	private final Number threads;

	@Nullable
	private final JsonValue threadType;

	@Nullable
	private final JsonValue timeout;

	// ---------------------------------------------------------------------------------------------

	protected HotThreadsRequest(Builder builder) {

		this.nodeId = builder.nodeId;
		this.ignoreIdleThreads = builder.ignoreIdleThreads;
		this.interval = builder.interval;
		this.snapshots = builder.snapshots;
		this.threads = builder.threads;
		this.threadType = builder.threadType;
		this.timeout = builder.timeout;

	}

	/**
	 * A comma-separated list of node IDs or names to limit the returned
	 * information; use <code>_local</code> to return information from the node
	 * you're connecting to, leave empty to get information from all nodes
	 * <p>
	 * API name: {@code node_id}
	 */
	@Nullable
	public List<String> nodeId() {
		return this.nodeId;
	}

	/**
	 * Don't show threads that are in known-idle places, such as waiting on a socket
	 * select or pulling from an empty task queue (default: true)
	 * <p>
	 * API name: {@code ignore_idle_threads}
	 */
	@Nullable
	public Boolean ignoreIdleThreads() {
		return this.ignoreIdleThreads;
	}

	/**
	 * The interval for the second sampling of threads
	 * <p>
	 * API name: {@code interval}
	 */
	@Nullable
	public JsonValue interval() {
		return this.interval;
	}

	/**
	 * Number of samples of thread stacktrace (default: 10)
	 * <p>
	 * API name: {@code snapshots}
	 */
	@Nullable
	public Number snapshots() {
		return this.snapshots;
	}

	/**
	 * Specify the number of threads to provide information for (default: 3)
	 * <p>
	 * API name: {@code threads}
	 */
	@Nullable
	public Number threads() {
		return this.threads;
	}

	/**
	 * API name: {@code thread_type}
	 */
	@Nullable
	public JsonValue threadType() {
		return this.threadType;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HotThreadsRequest}.
	 */
	public static class Builder implements ObjectBuilder<HotThreadsRequest> {
		@Nullable
		private List<String> nodeId;

		@Nullable
		private Boolean ignoreIdleThreads;

		@Nullable
		private JsonValue interval;

		@Nullable
		private Number snapshots;

		@Nullable
		private Number threads;

		@Nullable
		private JsonValue threadType;

		@Nullable
		private JsonValue timeout;

		/**
		 * A comma-separated list of node IDs or names to limit the returned
		 * information; use <code>_local</code> to return information from the node
		 * you're connecting to, leave empty to get information from all nodes
		 * <p>
		 * API name: {@code node_id}
		 */
		public Builder nodeId(@Nullable List<String> value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * A comma-separated list of node IDs or names to limit the returned
		 * information; use <code>_local</code> to return information from the node
		 * you're connecting to, leave empty to get information from all nodes
		 * <p>
		 * API name: {@code node_id}
		 */
		public Builder nodeId(String... value) {
			this.nodeId = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #nodeId(List)}, creating the list if needed.
		 */
		public Builder addNodeId(String value) {
			if (this.nodeId == null) {
				this.nodeId = new ArrayList<>();
			}
			this.nodeId.add(value);
			return this;
		}

		/**
		 * Don't show threads that are in known-idle places, such as waiting on a socket
		 * select or pulling from an empty task queue (default: true)
		 * <p>
		 * API name: {@code ignore_idle_threads}
		 */
		public Builder ignoreIdleThreads(@Nullable Boolean value) {
			this.ignoreIdleThreads = value;
			return this;
		}

		/**
		 * The interval for the second sampling of threads
		 * <p>
		 * API name: {@code interval}
		 */
		public Builder interval(@Nullable JsonValue value) {
			this.interval = value;
			return this;
		}

		/**
		 * Number of samples of thread stacktrace (default: 10)
		 * <p>
		 * API name: {@code snapshots}
		 */
		public Builder snapshots(@Nullable Number value) {
			this.snapshots = value;
			return this;
		}

		/**
		 * Specify the number of threads to provide information for (default: 3)
		 * <p>
		 * API name: {@code threads}
		 */
		public Builder threads(@Nullable Number value) {
			this.threads = value;
			return this;
		}

		/**
		 * API name: {@code thread_type}
		 */
		public Builder threadType(@Nullable JsonValue value) {
			this.threadType = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link HotThreadsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HotThreadsRequest build() {

			return new HotThreadsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code nodes.hot_threads}".
	 */
	public static final Endpoint<HotThreadsRequest, HotThreadsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				if (request.nodeId() != null)
					propsSet |= _nodeId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/hot_threads");
					return buf.toString();
				}
				if (propsSet == (_nodeId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					buf.append(request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/hot_threads");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.ignoreIdleThreads != null) {
					params.put("ignore_idle_threads", String.valueOf(request.ignoreIdleThreads));
				}
				if (request.interval != null) {
					params.put("interval", request.interval.toString());
				}
				if (request.snapshots != null) {
					params.put("snapshots", request.snapshots.toString());
				}
				if (request.threads != null) {
					params.put("threads", request.threads.toString());
				}
				if (request.threadType != null) {
					params.put("thread_type", request.threadType.toString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, HotThreadsResponse.DESERIALIZER);
}
