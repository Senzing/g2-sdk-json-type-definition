// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Collections.Generic;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(FocusRecordsJsonConverter))]
    public class FocusRecords
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public IList<FocusRecord> Value { get; set; }
    }

    public class FocusRecordsJsonConverter : JsonConverter<FocusRecords>
    {
        public override FocusRecords Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new FocusRecords { Value = JsonSerializer.Deserialize<IList<FocusRecord>>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, FocusRecords value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<IList<FocusRecord>>(writer, value.Value, options);
        }
    }
}
