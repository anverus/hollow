/*
 *  Copyright 2016-2019 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.hollow.api.sampling;

public class SampleResult implements Comparable<SampleResult> {

    private final String identifier;
    private final long numSamples;

    public SampleResult(String identifier, long numSamples) {
        this.identifier = identifier;
        this.numSamples = numSamples;
    }

    public String getIdentifier() {
        return identifier;
    }

    public long getNumSamples() {
        return numSamples;
    }

    @Override
    public int compareTo(SampleResult o) {
        if(o.numSamples == numSamples)
            return identifier.compareTo(o.identifier);
        return Long.compare(o.numSamples, numSamples);
    }

    @Override
    public String toString() {
        return identifier + ": " + numSamples;
    }

}
